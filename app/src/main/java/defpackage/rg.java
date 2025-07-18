package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class rg extends or {
    final /* synthetic */ rh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(rh rhVar, Context context) {
        super(context);
        this.f = rhVar;
    }

    @Override // defpackage.or
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.or, defpackage.qr
    protected final void i(View view, qp qpVar) {
        rh rhVar = this.f;
        RecyclerView recyclerView = rhVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrC = rhVar.c(recyclerView.getLayoutManager(), view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iC = c(Math.max(Math.abs(i), Math.abs(i2)));
        if (iC > 0) {
            qpVar.b(i, i2, iC, this.b);
        }
    }
}
