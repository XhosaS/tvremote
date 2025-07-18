package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkn extends gkm {
    @Override // defpackage.gkj
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.gkl, defpackage.gkj
    public final void b(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.gkj
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.gkm, defpackage.gkj
    public final void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.gkk, defpackage.gkj
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.gkk, defpackage.gkj
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
