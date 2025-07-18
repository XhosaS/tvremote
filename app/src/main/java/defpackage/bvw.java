package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvw extends bvv {
    @Override // defpackage.bvs
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.bvu, defpackage.bvs
    public final void b(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.bvs
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.bvv, defpackage.bvs
    public final void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.bvt, defpackage.bvs
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.bvt, defpackage.bvs
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
