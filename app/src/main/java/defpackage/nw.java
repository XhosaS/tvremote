package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
class nw extends qi {
    final /* synthetic */ nz a;

    public nw(nz nzVar) {
        this.a = nzVar;
    }

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        nz nzVar = this.a;
        int iComputeVerticalScrollRange = nzVar.l.computeVerticalScrollRange();
        int i3 = nzVar.k;
        nzVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= nzVar.a;
        int iComputeHorizontalScrollRange = nzVar.l.computeHorizontalScrollRange();
        int i4 = nzVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= nzVar.a;
        nzVar.n = z;
        if (nzVar.m) {
            float f = i3;
            nzVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            nzVar.d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (nzVar.o != 0) {
                nzVar.b(0);
                return;
            }
            return;
        }
        if (nzVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            nzVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            nzVar.g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = nzVar.o;
        if (i5 == 0 || i5 == 1) {
            nzVar.b(1);
        }
    }
}
