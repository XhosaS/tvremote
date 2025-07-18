package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class eke extends or {
    final /* synthetic */ ekf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eke(ekf ekfVar, Context context) {
        super(context);
        this.f = ekfVar;
    }

    @Override // defpackage.or
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.or
    protected final int d(int i) {
        return Math.min(100, super.d(i));
    }

    @Override // defpackage.or, defpackage.qr
    protected final void i(View view, qp qpVar) {
        ekf ekfVar = this.f;
        int[] iArrC = ekfVar.c(ekfVar.b.getLayoutManager(), view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iC = c(Math.max(Math.abs(i), Math.abs(i2)));
        if (iC > 0) {
            qpVar.b(i, i2, iC, this.b);
        }
    }
}
