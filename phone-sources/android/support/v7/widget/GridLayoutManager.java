package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.cxe;
import defpackage.cyp;
import defpackage.cyq;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final int INVALID_POSITION = -1;
    private static final String TAG = "GridLayoutManager";
    private static final Set<Integer> sSupportedDirectionsForActionScrollInDirection = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    int[] mCachedBorders;
    int mColumnWithAccessibilityFocus;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    private int mPositionTargetedByScrollInDirection;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    int mRowWithAccessibilityFocus;
    View[] mSet;
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    /* compiled from: PG */
    class Api21Impl {
        private Api21Impl() {
        }

        static boolean isAccessibilityFocused(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* compiled from: PG */
    public final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return 1;
        }
    }

    /* compiled from: PG */
    public class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }
    }

    /* compiled from: PG */
    public abstract class SpanSizeLookup {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = GridLayoutManager.DEBUG;
        private boolean mCacheSpanGroupIndices = GridLayoutManager.DEBUG;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int i3;
            int i4;
            int cachedSpanIndex;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) == -1) {
                i3 = 0;
                i4 = 0;
                cachedSpanIndex = 0;
            } else {
                i4 = iFindFirstKeyLessThan + 1;
                i3 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                cachedSpanIndex = getCachedSpanIndex(iFindFirstKeyLessThan, i2) + getSpanSize(iFindFirstKeyLessThan);
                if (cachedSpanIndex == i2) {
                    i3++;
                    cachedSpanIndex = 0;
                }
            }
            int spanSize = getSpanSize(i);
            while (i4 < i) {
                int spanSize2 = getSpanSize(i4);
                cachedSpanIndex += spanSize2;
                if (cachedSpanIndex == i2) {
                    i3++;
                    cachedSpanIndex = 0;
                } else if (cachedSpanIndex > i2) {
                    i3++;
                    cachedSpanIndex = spanSize2;
                }
                i4++;
            }
            return cachedSpanIndex + spanSize > i2 ? i3 + 1 : i3;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:10:0x001f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L22
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L22
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
            L1f:
                int r2 = r2 + 1
                goto L24
            L22:
                r2 = r1
                r3 = r2
            L24:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2f
                r3 = r1
                goto L1f
            L2f:
                if (r3 <= r7) goto L1f
                r3 = r4
                goto L1f
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.mPendingSpanCountChange = DEBUG;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(i);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.mSet[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanSize = spanSize;
            layoutParams.mSpanIndex = i5;
            i5 += spanSize;
            i2 += i4;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            boolean z = !zIsSmoothScrollbarEnabled;
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(z, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(z, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1) - Math.max(r5, r6)) - 1) : Math.max(0, Math.min(this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount), this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount)));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
        View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
        if (viewFindFirstVisibleChildClosestToStart == null || viewFindFirstVisibleChildClosestToEnd == null) {
            return 0;
        }
        if (!isSmoothScrollbarEnabled()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
        }
        int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart);
        int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
        return (int) ((decoratedEnd / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - cachedSpanGroupIndex) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1));
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (i == 1) {
            while (spanIndex > 0) {
                int i2 = anchorInfo.mPosition;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                anchorInfo.mPosition = i3;
                spanIndex = getSpanIndex(recycler, state, i3);
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i4 = anchorInfo.mPosition;
        while (i4 < itemCount) {
            int i5 = i4 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i5);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i4 = i5;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i4;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr != null) {
            if (viewArr.length == this.mSpanCount) {
                return;
            }
        }
        this.mSet = new View[this.mSpanCount];
    }

    private View findChildWithAccessibilityFocus() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            childAt.getClass();
            if (Api21Impl.isAccessibilityFocused(childAt)) {
                return getChildAt(i);
            }
        }
        return null;
    }

    private int findScrollTargetPositionAbove(int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            int rowIndex = getRowIndex(i4);
            int columnIndex = getColumnIndex(i4);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (rowIndex < i && getColumnIndices(i4).contains(Integer.valueOf(i2))) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    return i4;
                }
            } else if (rowIndex < i && columnIndex == i2) {
                this.mRowWithAccessibilityFocus = ((Integer) Collections.max(getRowIndices(i4))).intValue();
                return i4;
            }
        }
        return -1;
    }

    private int findScrollTargetPositionBelow(int i, int i2, int i3) {
        for (int i4 = i3 + 1; i4 < getItemCount(); i4++) {
            int rowIndex = getRowIndex(i4);
            int columnIndex = getColumnIndex(i4);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (rowIndex > i && (columnIndex == i2 || getColumnIndices(i4).contains(Integer.valueOf(i2)))) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    return i4;
                }
            } else if (rowIndex > i && columnIndex == i2) {
                this.mRowWithAccessibilityFocus = getRowIndex(i4);
                return i4;
            }
        }
        return -1;
    }

    private int findScrollTargetPositionOnTheLeft(int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            int rowIndex = getRowIndex(i4);
            int columnIndex = getColumnIndex(i4);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((rowIndex == i && columnIndex < i2) || rowIndex < i) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    this.mColumnWithAccessibilityFocus = columnIndex;
                    return i4;
                }
            } else if (getRowIndices(i4).contains(Integer.valueOf(i)) && columnIndex < i2) {
                this.mColumnWithAccessibilityFocus = columnIndex;
                return i4;
            }
        }
        return -1;
    }

    private int findScrollTargetPositionOnTheRight(int i, int i2, int i3) {
        for (int i4 = i3 + 1; i4 < getItemCount(); i4++) {
            int rowIndex = getRowIndex(i4);
            int columnIndex = getColumnIndex(i4);
            if (rowIndex < 0 || columnIndex < 0) {
                return -1;
            }
            if (this.mOrientation == 1) {
                if ((rowIndex == i && columnIndex > i2) || rowIndex > i) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    this.mColumnWithAccessibilityFocus = columnIndex;
                    return i4;
                }
            } else if (columnIndex > i2 && getRowIndices(i4).contains(Integer.valueOf(i))) {
                this.mColumnWithAccessibilityFocus = columnIndex;
                return i4;
            }
        }
        return -1;
    }

    private int getColumnIndex(int i) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return getSpanGroupIndex(recyclerView.mRecycler, recyclerView.mState, i);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return getSpanIndex(recyclerView2.mRecycler, recyclerView2.mState, i);
    }

    private Set<Integer> getColumnIndices(int i) {
        return getRowOrColumnIndices(getColumnIndex(i), i);
    }

    private int getRowIndex(int i) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return getSpanGroupIndex(recyclerView.mRecycler, recyclerView.mState, i);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return getSpanIndex(recyclerView2.mRecycler, recyclerView2.mState, i);
    }

    private Set<Integer> getRowIndices(int i) {
        return getRowOrColumnIndices(getRowIndex(i), i);
    }

    private Set<Integer> getRowOrColumnIndices(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int spanSize = getSpanSize(recyclerView.mRecycler, recyclerView.mState, i2);
        for (int i3 = i; i3 < i + spanSize; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i, this.mSpanCount);
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, a.cf(i, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int i2 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, a.cf(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanSize(iConvertPreLayoutPositionToPostLayout);
        }
        Log.w(TAG, a.cf(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 1;
    }

    private void guessMeasurement(float f, int i) {
        calculateItemBorders(Math.max(Math.round(f * this.mSpanCount), i));
    }

    private boolean hasAccessibilityFocusChanged(int i) {
        if (getRowIndices(i).contains(Integer.valueOf(this.mRowWithAccessibilityFocus)) && getColumnIndices(i).contains(Integer.valueOf(this.mColumnWithAccessibilityFocus))) {
            return DEBUG;
        }
        return true;
    }

    private void measureChild(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i2 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i3 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = getChildMeasureSpec(spaceForSpanRange, i, i3, layoutParams.width, DEBUG);
            childMeasureSpec = getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i2, layoutParams.height, true);
        } else {
            int childMeasureSpec3 = getChildMeasureSpec(spaceForSpanRange, i, i2, layoutParams.height, DEBUG);
            int childMeasureSpec4 = getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i3, layoutParams.width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        measureChildWithDecorationsAndMargin(view, childMeasureSpec2, childMeasureSpec, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int spanSize = this.mSpanCount;
        for (int i = 0; i < this.mSpanCount && layoutState.hasMore(state) && spanSize > 0; i++) {
            int i2 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i2, Math.max(0, layoutState.mScrollingOffset));
            spanSize -= this.mSpanSizeLookup.getSpanSize(i2);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeHorizontalScrollOffset(state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeHorizontalScrollRange(state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeVerticalScrollOffset(state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeVerticalScrollRange(state);
    }

    public int findPositionOfFirstItemOnARowBelowForHorizontalGrid(int i) {
        if (i < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            for (Integer num : getRowIndices(i2)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i2));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.mRowWithAccessibilityFocus = iIntValue;
                this.mColumnWithAccessibilityFocus = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    public int findPositionOfLastItemOnARowAboveForHorizontalGrid(int i) {
        if (i < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            for (Integer num : getRowIndices(i2)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i2));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.mRowWithAccessibilityFocus = iIntValue;
                this.mColumnWithAccessibilityFocus = getColumnIndex(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        int childCount2 = getChildCount();
        if (z2) {
            i = -1;
            childCount = getChildCount() - 1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && getSpanIndex(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return Math.min(this.mSpanCount, getItemCount());
        }
        if (state.getItemCount() <= 0) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return Math.min(this.mSpanCount, getItemCount());
        }
        if (state.getItemCount() <= 0) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.mCachedBorders;
        int i3 = this.mSpanCount - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int paddingLeft;
        int paddingTop;
        int decoratedMeasurementInOther;
        int decoratedMeasurementInOther2;
        int i3;
        int childMeasureSpec;
        int childMeasureSpec2;
        View next;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        int i4 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        boolean z = modeInOther != 1073741824;
        if (z) {
            updateMeasurements();
        }
        boolean z2 = layoutState.mItemDirection == 1;
        int spanIndex = this.mSpanCount;
        if (!z2) {
            spanIndex = getSpanIndex(recycler, state, layoutState.mCurrentPosition) + getSpanSize(recycler, state, layoutState.mCurrentPosition);
        }
        int i5 = 0;
        while (i5 < this.mSpanCount && layoutState.hasMore(state) && spanIndex > 0) {
            int i6 = layoutState.mCurrentPosition;
            int spanSize = getSpanSize(recycler, state, i6);
            if (spanSize > this.mSpanCount) {
                throw new IllegalArgumentException("Item at position " + i6 + " requires " + spanSize + " spans but GridLayoutManager has only " + this.mSpanCount + " spans.");
            }
            spanIndex -= spanSize;
            if (spanIndex < 0 || (next = layoutState.next(recycler)) == null) {
                break;
            }
            this.mSet[i5] = next;
            i5++;
        }
        if (i5 == 0) {
            layoutChunkResult.mFinished = true;
            return;
        }
        assignSpans(recycler, state, i5, z2);
        float f = 0.0f;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            View view = this.mSet[i8];
            if (layoutState.mScrapList == null) {
                if (z2) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z2) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, modeInOther, DEBUG);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (decoratedMeasurement > i7) {
                i7 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther3 = this.mOrientationHelper.getDecoratedMeasurementInOther(view) / ((LayoutParams) view.getLayoutParams()).mSpanSize;
            if (decoratedMeasurementInOther3 > f) {
                f = decoratedMeasurementInOther3;
            }
        }
        if (z) {
            guessMeasurement(f, i4);
            i7 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                View view2 = this.mSet[i9];
                measureChild(view2, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view2);
                if (decoratedMeasurement2 > i7) {
                    i7 = decoratedMeasurement2;
                }
            }
        }
        for (int i10 = 0; i10 < i5; i10++) {
            View view3 = this.mSet[i10];
            if (this.mOrientationHelper.getDecoratedMeasurement(view3) != i7) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                int i11 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i12 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = getChildMeasureSpec(spaceForSpanRange, 1073741824, i12, layoutParams.width, DEBUG);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - i11, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - i12, 1073741824);
                    childMeasureSpec = getChildMeasureSpec(spaceForSpanRange, 1073741824, i11, layoutParams.height, DEBUG);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                measureChildWithDecorationsAndMargin(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        layoutChunkResult.mConsumed = i7;
        if (this.mOrientation == 1) {
            if (layoutState.mLayoutDirection == -1) {
                decoratedMeasurementInOther2 = layoutState.mOffset;
                i3 = decoratedMeasurementInOther2 - i7;
            } else {
                i3 = layoutState.mOffset;
                decoratedMeasurementInOther2 = i3 + i7;
            }
            paddingTop = i3;
            decoratedMeasurementInOther = 0;
            paddingLeft = 0;
        } else {
            if (layoutState.mLayoutDirection == -1) {
                i2 = layoutState.mOffset;
                i = i2 - i7;
            } else {
                i = layoutState.mOffset;
                i2 = i + i7;
            }
            paddingLeft = i;
            paddingTop = 0;
            decoratedMeasurementInOther = i2;
            decoratedMeasurementInOther2 = 0;
        }
        for (int i13 = 0; i13 < i5; i13++) {
            View view4 = this.mSet[i13];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = this.mCachedBorders[layoutParams2.mSpanIndex] + getPaddingTop();
                decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingTop;
            } else if (isLayoutRTL()) {
                decoratedMeasurementInOther = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams2.mSpanIndex];
                paddingLeft = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(view4);
            } else {
                paddingLeft = this.mCachedBorders[layoutParams2.mSpanIndex] + getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingLeft;
            }
            int i14 = decoratedMeasurementInOther2;
            int i15 = paddingLeft;
            int i16 = decoratedMeasurementInOther;
            layoutDecoratedWithMargins(view4, i15, paddingTop, i16, i14);
            decoratedMeasurementInOther2 = i14;
            paddingLeft = i15;
            decoratedMeasurementInOther = i16;
            if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable = view4.hasFocusable() | layoutChunkResult.mFocusable;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r13 == (r1 <= r11 ? android.support.v7.widget.GridLayoutManager.DEBUG : true)) goto L48;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, android.support.v7.widget.RecyclerView.Recycler r26, android.support.v7.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, cyqVar);
        cyqVar.t(GridView.class.getName());
        RecyclerView.Adapter adapter = this.mRecyclerView.mAdapter;
        if (adapter == null || adapter.getItemCount() <= 1) {
            return;
        }
        cyqVar.j(cyp.m);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, cyq cyqVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cyqVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            cyqVar.w(cxe.j(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), spanGroupIndex, 1, DEBUG));
        } else {
            cyqVar.w(cxe.j(spanGroupIndex, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), DEBUG));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = DEBUG;
        int i = this.mPositionTargetedByScrollInDirection;
        if (i == -1 || (viewFindViewByPosition = findViewByPosition(i)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.mPositionTargetedByScrollInDirection = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = chooseSize(i, this.mCachedBorders[r7.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = chooseSize(i2, this.mCachedBorders[r5.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i) {
        if (i == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i <= 0) {
            throw new IllegalArgumentException(a.cf(i, "Span count should be at least 1. Provided "));
        }
        this.mSpanCount = i;
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        requestLayout();
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(DEBUG);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.mUsingSpansToEstimateScrollBarDimensions = z;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState != null || this.mPendingSpanCountChange) {
            return DEBUG;
        }
        return true;
    }

    static int[] calculateItemBorders(int[] iArr, int i, int i2) {
        int i3;
        int length;
        int i4 = i + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i2) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i;
        int i7 = i2 % i;
        int i8 = 0;
        for (int i9 = 1; i9 <= i; i9++) {
            i5 += i7;
            if (i5 <= 0 || i - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        return iArr;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.mPendingSpanCountChange = DEBUG;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mPendingSpanCountChange = DEBUG;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(getProperties(context, attributeSet, i, i2).spanCount);
    }
}
