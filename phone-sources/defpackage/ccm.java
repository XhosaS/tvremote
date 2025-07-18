package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccm implements cck {
    private final Matrix a = new Matrix();
    private final int[] b = new int[2];

    @Override // defpackage.cck
    public void a(View view, float[] fArr) {
        Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        bnj.h(fArr, matrix);
    }
}
