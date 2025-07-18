package android.support.v7.util;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: android.support.v7.util.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.x - diagonal2.x;
        }
    };

    /* compiled from: PG */
    public abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: PG */
    class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i) {
            int[] iArr = new int[i];
            this.mData = iArr;
            this.mMid = iArr.length >> 1;
        }

        public int[] backingData() {
            return this.mData;
        }

        public void fill(int i) {
            Arrays.fill(this.mData, i);
        }

        public int get(int i) {
            return this.mData[i + this.mMid];
        }

        public void set(int i, int i2) {
            this.mData[i + this.mMid] = i2;
        }
    }

    /* compiled from: PG */
    class Diagonal {
        public final int size;
        public final int x;
        public final int y;

        public Diagonal(int i, int i2, int i3) {
            this.x = i;
            this.y = i2;
            this.size = i3;
        }

        public int endX() {
            return this.x + this.size;
        }

        public int endY() {
            return this.y + this.size;
        }
    }

    /* compiled from: PG */
    public abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* compiled from: PG */
    class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.posInOwnerList = i;
            this.currentPos = i2;
            this.removal = z;
        }
    }

    /* compiled from: PG */
    class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public int newSize() {
            return this.newListEnd - this.newListStart;
        }

        public int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i, int i2, int i3, int i4) {
            this.oldListStart = i;
            this.oldListEnd = i2;
            this.newListStart = i3;
            this.newListEnd = i4;
        }
    }

    /* compiled from: PG */
    class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        public boolean hasAdditionOrRemoval() {
            return this.endY - this.startY != this.endX - this.startX;
        }

        public boolean isAddition() {
            return this.endY - this.startY > this.endX - this.startX;
        }

        public Diagonal toDiagonal() {
            if (hasAdditionOrRemoval()) {
                return this.reverse ? new Diagonal(this.startX, this.startY, diagonalSize()) : isAddition() ? new Diagonal(this.startX, this.startY + 1, diagonalSize()) : new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
            int i = this.startX;
            return new Diagonal(i, this.startY, this.endX - i);
        }
    }

    private DiffUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.support.v7.util.DiffUtil.Snake backward(android.support.v7.util.DiffUtil.Range r11, android.support.v7.util.DiffUtil.Callback r12, android.support.v7.util.DiffUtil.CenteredArray r13, android.support.v7.util.DiffUtil.CenteredArray r14, int r15) {
        /*
            int r0 = r11.oldSize()
            int r1 = r11.newSize()
            int r0 = r0 - r1
            int r1 = r11.oldSize()
            int r2 = r11.newSize()
            int r1 = r1 - r2
            int r2 = -r15
            r3 = r2
        L14:
            if (r3 > r15) goto L84
            if (r3 == r2) goto L30
            int r4 = r3 + (-1)
            if (r3 == r15) goto L29
            int r5 = r3 + 1
            int r5 = r14.get(r5)
            int r6 = r14.get(r4)
            if (r5 >= r6) goto L29
            goto L30
        L29:
            int r4 = r14.get(r4)
            int r5 = r4 + (-1)
            goto L37
        L30:
            int r4 = r3 + 1
            int r4 = r14.get(r4)
            r5 = r4
        L37:
            int r6 = r11.newListEnd
            int r7 = r11.oldListEnd
            int r7 = r7 - r5
            int r7 = r7 - r3
            int r6 = r6 - r7
            if (r15 == 0) goto L46
            if (r5 == r4) goto L43
            goto L46
        L43:
            int r7 = r6 + 1
            goto L47
        L46:
            r7 = r6
        L47:
            int r8 = r11.oldListStart
            if (r5 <= r8) goto L5c
            int r8 = r11.newListStart
            if (r6 <= r8) goto L5c
            int r8 = r5 + (-1)
            int r9 = r6 + (-1)
            boolean r10 = r12.areItemsTheSame(r8, r9)
            if (r10 == 0) goto L5c
            r5 = r8
            r6 = r9
            goto L47
        L5c:
            int r8 = r0 % 2
            r14.set(r3, r5)
            if (r8 != 0) goto L81
            int r8 = r1 - r3
            if (r8 < r2) goto L81
            if (r8 > r15) goto L81
            int r8 = r13.get(r8)
            if (r8 >= r5) goto L70
            goto L81
        L70:
            android.support.v7.util.DiffUtil$Snake r11 = new android.support.v7.util.DiffUtil$Snake
            r11.<init>()
            r11.startX = r5
            r11.startY = r6
            r11.endX = r4
            r11.endY = r7
            r12 = 1
            r11.reverse = r12
            return r11
        L81:
            int r3 = r3 + 2
            goto L14
        L84:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.util.DiffUtil.backward(android.support.v7.util.DiffUtil$Range, android.support.v7.util.DiffUtil$Callback, android.support.v7.util.DiffUtil$CenteredArray, android.support.v7.util.DiffUtil$CenteredArray, int):android.support.v7.util.DiffUtil$Snake");
    }

    public static DiffResult calculateDiff(Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.support.v7.util.DiffUtil.Snake forward(android.support.v7.util.DiffUtil.Range r10, android.support.v7.util.DiffUtil.Callback r11, android.support.v7.util.DiffUtil.CenteredArray r12, android.support.v7.util.DiffUtil.CenteredArray r13, int r14) {
        /*
            int r0 = r10.oldSize()
            int r1 = r10.newSize()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 % 2
            int r1 = r10.oldSize()
            int r2 = r10.newSize()
            int r1 = r1 - r2
            int r2 = -r14
            r3 = r2
        L1a:
            if (r3 > r14) goto L8c
            if (r3 == r2) goto L36
            int r4 = r3 + (-1)
            if (r3 == r14) goto L2f
            int r5 = r3 + 1
            int r5 = r12.get(r5)
            int r6 = r12.get(r4)
            if (r5 <= r6) goto L2f
            goto L36
        L2f:
            int r4 = r12.get(r4)
            int r5 = r4 + 1
            goto L3d
        L36:
            int r4 = r3 + 1
            int r4 = r12.get(r4)
            r5 = r4
        L3d:
            int r6 = r10.newListStart
            int r7 = r10.oldListStart
            int r7 = r5 - r7
            int r6 = r6 + r7
            int r6 = r6 - r3
            if (r14 == 0) goto L4d
            if (r5 == r4) goto L4a
            goto L4d
        L4a:
            int r7 = r6 + (-1)
            goto L4e
        L4d:
            r7 = r6
        L4e:
            int r8 = r10.oldListEnd
            if (r5 >= r8) goto L61
            int r8 = r10.newListEnd
            if (r6 >= r8) goto L61
            boolean r8 = r11.areItemsTheSame(r5, r6)
            if (r8 == 0) goto L61
            int r5 = r5 + 1
            int r6 = r6 + 1
            goto L4e
        L61:
            r12.set(r3, r5)
            r8 = 1
            if (r0 != r8) goto L89
            int r8 = r1 - r3
            int r9 = r2 + 1
            if (r8 < r9) goto L89
            int r9 = r14 + (-1)
            if (r8 > r9) goto L89
            int r8 = r13.get(r8)
            if (r8 <= r5) goto L78
            goto L89
        L78:
            android.support.v7.util.DiffUtil$Snake r10 = new android.support.v7.util.DiffUtil$Snake
            r10.<init>()
            r10.startX = r4
            r10.startY = r7
            r10.endX = r5
            r10.endY = r6
            r11 = 0
            r10.reverse = r11
            return r10
        L89:
            int r3 = r3 + 2
            goto L1a
        L8c:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.util.DiffUtil.forward(android.support.v7.util.DiffUtil$Range, android.support.v7.util.DiffUtil$Callback, android.support.v7.util.DiffUtil$CenteredArray, android.support.v7.util.DiffUtil$CenteredArray, int):android.support.v7.util.DiffUtil$Snake");
    }

    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.oldSize() <= 0 || range.newSize() <= 0) {
            return null;
        }
        int iOldSize = range.oldSize() + range.newSize();
        centeredArray.set(1, range.oldListStart);
        centeredArray2.set(1, range.oldListEnd);
        for (int i = 0; i < (iOldSize + 1) / 2; i++) {
            Snake snakeForward = forward(range, callback, centeredArray, centeredArray2, i);
            if (snakeForward != null) {
                return snakeForward;
            }
            Snake snakeBackward = backward(range, callback, centeredArray, centeredArray2, i);
            if (snakeBackward != null) {
                return snakeBackward;
            }
        }
        return null;
    }

    public static DiffResult calculateDiff(Callback callback, boolean z) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i = ((oldListSize + newListSize) + 1) / 2;
        int i2 = i + i + 1;
        CenteredArray centeredArray = new CenteredArray(i2);
        CenteredArray centeredArray2 = new CenteredArray(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake snakeMidPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (snakeMidPoint != null) {
                if (snakeMidPoint.diagonalSize() > 0) {
                    arrayList.add(snakeMidPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = snakeMidPoint.startX;
                range2.newListEnd = snakeMidPoint.startY;
                arrayList2.add(range2);
                int i3 = range.oldListEnd;
                int i4 = range.newListEnd;
                range.oldListStart = snakeMidPoint.endX;
                range.newListStart = snakeMidPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z);
    }

    /* compiled from: PG */
    public class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (diagonal == null || diagonal.x != 0 || diagonal.y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i) {
            int size = this.mDiagonals.size();
            int iEndY = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Diagonal diagonal = this.mDiagonals.get(i2);
                while (iEndY < diagonal.y) {
                    if (this.mNewItemStatuses[iEndY] == 0 && this.mCallback.areItemsTheSame(i, iEndY)) {
                        int i3 = true != this.mCallback.areContentsTheSame(i, iEndY) ? 4 : 8;
                        this.mOldItemStatuses[i] = (iEndY << 4) | i3;
                        this.mNewItemStatuses[iEndY] = (i << 4) | i3;
                        return;
                    }
                    iEndY++;
                }
                iEndY = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i = 0; i < diagonal.size; i++) {
                    int i2 = diagonal.x + i;
                    int i3 = diagonal.y + i;
                    int i4 = 1;
                    if (true != this.mCallback.areContentsTheSame(i2, i3)) {
                        i4 = 2;
                    }
                    this.mOldItemStatuses[i2] = (i3 << 4) | i4;
                    this.mNewItemStatuses[i3] = (i2 << 4) | i4;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int iEndX = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (iEndX < diagonal.x) {
                    if (this.mOldItemStatuses[iEndX] == 0) {
                        findMatchingAddition(iEndX);
                    }
                    iEndX++;
                }
                iEndX = diagonal.endX();
            }
        }

        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i, boolean z) {
            PostponedUpdate next;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.posInOwnerList == i && next.removal == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next2 = it.next();
                if (z) {
                    next2.currentPos--;
                } else {
                    next2.currentPos++;
                }
            }
            return next;
        }

        public int convertNewPositionToOld(int i) {
            if (i >= 0 && i < this.mNewListSize) {
                int i2 = this.mNewItemStatuses[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(int i) {
            if (i >= 0 && i < this.mOldListSize) {
                int i2 = this.mOldItemStatuses[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(ListUpdateCallback listUpdateCallback) {
            int i;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i2 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.mOldListSize;
            int i4 = this.mNewListSize;
            int size = this.mDiagonals.size();
            while (true) {
                size--;
                if (size < 0) {
                    batchingListUpdateCallback.dispatchLastEvent();
                    return;
                }
                Diagonal diagonal = this.mDiagonals.get(size);
                int iEndX = diagonal.endX();
                int iEndY = diagonal.endY();
                while (true) {
                    if (i3 <= iEndX) {
                        break;
                    }
                    i3--;
                    int i5 = this.mOldItemStatuses[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i6, false);
                        if (postponedUpdate != null) {
                            int i7 = (i2 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i7, 1, this.mCallback.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iEndY) {
                    i4--;
                    int i8 = this.mNewItemStatuses[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        if (getPostponedUpdate(arrayDeque, i9, true) == null) {
                            arrayDeque.add(new PostponedUpdate(i4, i2 - i3, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i2 - r11.currentPos) - 1, i3);
                            if ((i8 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i3, 1, this.mCallback.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = diagonal.x;
                int i11 = diagonal.y;
                for (i = 0; i < diagonal.size; i++) {
                    if ((this.mOldItemStatuses[i10] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i10, 1, this.mCallback.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = diagonal.x;
                i4 = diagonal.y;
            }
        }

        public void dispatchUpdatesTo(RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }
    }
}
