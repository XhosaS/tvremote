package android.support.v7.util;

import android.support.v7.util.ThreadUtil;
import android.support.v7.util.TileList;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final Class<T> mTClass;
    final TileList<T> mTileList;
    final int mTileSize;
    final ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = 0;
    final SparseIntArray mMissingPositions = new SparseIntArray();

    /* compiled from: PG */
    public abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        public void extendRangeInto(int[] iArr, int[] iArr2, int i) {
            int i2 = iArr[1];
            int i3 = iArr[0];
            int i4 = (i2 - i3) + 1;
            int i5 = i4 / 2;
            iArr2[0] = i3 - (i == 1 ? i4 : i5);
            if (i != 2) {
                i4 = i5;
            }
            iArr2[1] = i2 + i4;
        }

        public abstract void getItemRangeInto(int[] iArr);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int i);
    }

    public AsyncListUtil(Class<T> cls, int i, DataCallback<T> dataCallback, ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: android.support.v7.util.AsyncListUtil.1
            private boolean isRequestedGeneration(int i2) {
                if (i2 == AsyncListUtil.this.mRequestedGeneration) {
                    return true;
                }
                return AsyncListUtil.DEBUG;
            }

            private void recycleAllTiles() {
                for (int i2 = 0; i2 < AsyncListUtil.this.mTileList.size(); i2++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i2));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // android.support.v7.util.ThreadUtil.MainThreadCallback
            public void addTile(int i2, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i2)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> tileAddOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (tileAddOrReplace != null) {
                    Log.e(AsyncListUtil.TAG, "duplicate tile @" + tileAddOrReplace.mStartPosition);
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tileAddOrReplace);
                }
                int i3 = tile.mStartPosition + tile.mItemCount;
                int i4 = 0;
                while (i4 < AsyncListUtil.this.mMissingPositions.size()) {
                    int iKeyAt = AsyncListUtil.this.mMissingPositions.keyAt(i4);
                    if (tile.mStartPosition > iKeyAt || iKeyAt >= i3) {
                        i4++;
                    } else {
                        AsyncListUtil.this.mMissingPositions.removeAt(i4);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(iKeyAt);
                    }
                }
            }

            @Override // android.support.v7.util.ThreadUtil.MainThreadCallback
            public void removeTile(int i2, int i3) {
                if (isRequestedGeneration(i2)) {
                    TileList.Tile<T> tileRemoveAtPos = AsyncListUtil.this.mTileList.removeAtPos(i3);
                    if (tileRemoveAtPos == null) {
                        Log.e(AsyncListUtil.TAG, a.cf(i3, "tile not found @"));
                    } else {
                        AsyncListUtil.this.mBackgroundProxy.recycleTile(tileRemoveAtPos);
                    }
                }
            }

            @Override // android.support.v7.util.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i2, int i3) {
                if (isRequestedGeneration(i2)) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mItemCount = i3;
                    asyncListUtil.mViewCallback.onDataRefresh();
                    AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                    asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                    recycleAllTiles();
                    AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                    asyncListUtil3.mAllowScrollHints = AsyncListUtil.DEBUG;
                    asyncListUtil3.updateRange();
                }
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: android.support.v7.util.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i2) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int iKeyAt = sparseBooleanArray.keyAt(0);
                    int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i3 = this.mFirstRequiredTileStart - iKeyAt;
                    int i4 = iKeyAt2 - this.mLastRequiredTileStart;
                    if (i3 > 0 && (i3 >= i4 || i2 == 2)) {
                        removeTile(iKeyAt);
                    } else {
                        if (i4 <= 0) {
                            return;
                        }
                        if (i3 >= i4 && i2 != 1) {
                            return;
                        } else {
                            removeTile(iKeyAt2);
                        }
                    }
                }
            }

            private int getTileStart(int i2) {
                return i2 - (i2 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i2) {
                return this.mLoadedTiles.get(i2);
            }

            private void log(String str, Object... objArr) {
                String.format(str, objArr);
            }

            private void removeTile(int i2) {
                this.mLoadedTiles.delete(i2);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i2);
            }

            private void requestTiles(int i2, int i3, int i4, boolean z) {
                int i5 = i2;
                while (i5 <= i3) {
                    AsyncListUtil.this.mBackgroundProxy.loadTile(z ? (i3 + i2) - i5 : i5, i4);
                    i5 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // android.support.v7.util.ThreadUtil.BackgroundCallback
            public void loadTile(int i2, int i3) {
                if (isTileLoaded(i2)) {
                    return;
                }
                TileList.Tile<T> tileAcquireTile = acquireTile();
                tileAcquireTile.mStartPosition = i2;
                int iMin = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i2);
                tileAcquireTile.mItemCount = iMin;
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                asyncListUtil.mDataCallback.fillData(tileAcquireTile.mItems, tileAcquireTile.mStartPosition, iMin);
                flushTileCache(i3);
                addTile(tileAcquireTile);
            }

            @Override // android.support.v7.util.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // android.support.v7.util.ThreadUtil.BackgroundCallback
            public void refresh(int i2) {
                this.mGeneration = i2;
                this.mLoadedTiles.clear();
                int iRefreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = iRefreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, iRefreshData);
            }

            @Override // android.support.v7.util.ThreadUtil.BackgroundCallback
            public void updateRange(int i2, int i3, int i4, int i5, int i6) {
                if (i2 > i3) {
                    return;
                }
                int tileStart = getTileStart(i2);
                int tileStart2 = getTileStart(i3);
                this.mFirstRequiredTileStart = getTileStart(i4);
                int tileStart3 = getTileStart(i5);
                this.mLastRequiredTileStart = tileStart3;
                if (i6 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, 1, true);
                    requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, 1, AsyncListUtil.DEBUG);
                } else {
                    requestTiles(tileStart, tileStart3, i6, AsyncListUtil.DEBUG);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i6, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        if (this.mRequestedGeneration != this.mDisplayedGeneration) {
            return true;
        }
        return DEBUG;
    }

    public T getItem(int i) {
        if (i < 0 || i >= this.mItemCount) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i);
        if (itemAt != null || isRefreshPending()) {
            return itemAt;
        }
        this.mMissingPositions.put(i, 0);
        return null;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    void log(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        int i = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i;
        this.mBackgroundProxy.refresh(i);
    }

    public void updateRange() {
        int i;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.mItemCount) {
            return;
        }
        if (this.mAllowScrollHints) {
            int[] iArr2 = this.mPrevRange;
            if (i2 > iArr2[1] || (i = iArr2[0]) > i3) {
                this.mScrollHint = 0;
            } else if (i2 < i) {
                this.mScrollHint = 1;
            } else if (i2 > i) {
                this.mScrollHint = 2;
            }
        } else {
            this.mScrollHint = 0;
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i2;
        iArr3[1] = i3;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i4 = iArr6[0];
        int i5 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.mScrollHint);
    }

    /* compiled from: PG */
    public abstract class DataCallback<T> {
        public abstract void fillData(T[] tArr, int i, int i2);

        public int getMaxCachedTiles() {
            return 10;
        }

        public abstract int refreshData();

        public void recycleData(T[] tArr, int i) {
        }
    }
}
