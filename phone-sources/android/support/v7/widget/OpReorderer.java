package android.support.v7.widget;

import android.support.v7.widget.AdapterHelper;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class OpReorderer {
    final Callback mCallback;

    /* compiled from: PG */
    interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i2, AdapterHelper.UpdateOp updateOp2) {
        int i3 = updateOp.itemCount;
        int i4 = updateOp2.positionStart;
        int i5 = updateOp.positionStart;
        int i6 = i3 < i4 ? -1 : 0;
        if (i5 < i4) {
            i6++;
        }
        if (i4 <= i5) {
            updateOp.positionStart = i5 + updateOp2.itemCount;
        }
        int i7 = updateOp2.positionStart;
        if (i7 <= i3) {
            updateOp.itemCount = i3 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i7 + i6;
        list.set(i, updateOp2);
        list.set(i2, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i, int i2) {
        AdapterHelper.UpdateOp updateOp = list.get(i);
        AdapterHelper.UpdateOp updateOp2 = list.get(i2);
        int i3 = updateOp2.cmd;
        if (i3 == 1) {
            swapMoveAdd(list, i, updateOp, i2, updateOp2);
        } else if (i3 == 2) {
            swapMoveRemove(list, i, updateOp, i2, updateOp2);
        } else {
            if (i3 != 4) {
                return;
            }
            swapMoveUpdate(list, i, updateOp, i2, updateOp2);
        }
    }

    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            } else {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void swapMoveRemove(java.util.List<android.support.v7.widget.AdapterHelper.UpdateOp> r9, int r10, android.support.v7.widget.AdapterHelper.UpdateOp r11, int r12, android.support.v7.widget.AdapterHelper.UpdateOp r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.OpReorderer.swapMoveRemove(java.util.List, int, android.support.v7.widget.AdapterHelper$UpdateOp, int, android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void swapMoveUpdate(java.util.List<android.support.v7.widget.AdapterHelper.UpdateOp> r8, int r9, android.support.v7.widget.AdapterHelper.UpdateOp r10, int r11, android.support.v7.widget.AdapterHelper.UpdateOp r12) {
        /*
            r7 = this;
            int r0 = r10.itemCount
            int r1 = r12.positionStart
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Lf
            int r1 = r1 + (-1)
            r12.positionStart = r1
        Ld:
            r0 = r4
            goto L22
        Lf:
            int r5 = r12.itemCount
            int r1 = r1 + r5
            if (r0 >= r1) goto Ld
            int r5 = r5 + (-1)
            r12.itemCount = r5
            android.support.v7.widget.OpReorderer$Callback r0 = r7.mCallback
            int r1 = r10.positionStart
            java.lang.Object r5 = r12.payload
            android.support.v7.widget.AdapterHelper$UpdateOp r0 = r0.obtainUpdateOp(r2, r1, r3, r5)
        L22:
            int r1 = r10.positionStart
            int r5 = r12.positionStart
            if (r1 > r5) goto L2c
            int r5 = r5 + r3
            r12.positionStart = r5
            goto L41
        L2c:
            int r3 = r12.itemCount
            int r5 = r5 + r3
            if (r1 >= r5) goto L41
            android.support.v7.widget.OpReorderer$Callback r3 = r7.mCallback
            int r4 = r1 + 1
            java.lang.Object r6 = r12.payload
            int r5 = r5 - r1
            android.support.v7.widget.AdapterHelper$UpdateOp r4 = r3.obtainUpdateOp(r2, r4, r5, r6)
            int r1 = r12.itemCount
            int r1 = r1 - r5
            r12.itemCount = r1
        L41:
            r8.set(r11, r10)
            int r10 = r12.itemCount
            if (r10 <= 0) goto L4c
            r8.set(r9, r12)
            goto L54
        L4c:
            r8.remove(r9)
            android.support.v7.widget.OpReorderer$Callback r10 = r7.mCallback
            r10.recycleUpdateOp(r12)
        L54:
            if (r0 == 0) goto L59
            r8.add(r9, r0)
        L59:
            if (r4 == 0) goto L5e
            r8.add(r9, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.OpReorderer.swapMoveUpdate(java.util.List, int, android.support.v7.widget.AdapterHelper$UpdateOp, int, android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }
}
