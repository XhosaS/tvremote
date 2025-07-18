package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hg extends ii {
    final /* synthetic */ hi a;

    public hg(hi hiVar) {
        this.a = hiVar;
    }

    @Override // defpackage.ii
    public final void c(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        hi hiVar = this.a;
        int iComputeVerticalScrollRange = hiVar.l.computeVerticalScrollRange();
        int i = hiVar.k;
        hiVar.m = iComputeVerticalScrollRange - i > 0 && i >= hiVar.a;
        int iComputeHorizontalScrollRange = hiVar.l.computeHorizontalScrollRange();
        int i2 = hiVar.j;
        boolean z = iComputeHorizontalScrollRange - i2 > 0 && i2 >= hiVar.a;
        hiVar.n = z;
        if (hiVar.m) {
            float f = i;
            hiVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            hiVar.d = Math.min(i, (i * i) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (hiVar.o != 0) {
                hiVar.e(0);
                return;
            }
            return;
        }
        if (hiVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i2;
            hiVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            hiVar.g = Math.min(i2, (i2 * i2) / iComputeHorizontalScrollRange);
        }
        int i3 = hiVar.o;
        if (i3 == 0 || i3 == 1) {
            hiVar.e(1);
        }
    }
}
