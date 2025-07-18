package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szs {
    private final taa[] a = new taa[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final taa g = new taa();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public szs() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new taa();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    static final sze b(int i, szq szqVar) {
        return i != 1 ? i != 2 ? i != 3 ? szqVar.c : szqVar.b : szqVar.e : szqVar.d;
    }

    private final boolean d(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float e(int i) {
        return ((i + 1) % 4) * 90;
    }

    public final void a(szq szqVar, RectF rectF, Path path) {
        c(szqVar, null, 1.0f, rectF, null, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(szq szqVar, float[] fArr, float f, RectF rectF, zft zftVar, Path path) {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        szg szgVar;
        int i4;
        char c3;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i5 >= 4) {
                break;
            }
            sze szeVarB = fArr == null ? b(i5, szqVar) : new szd(fArr[i5]);
            sin sinVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? szqVar.k : szqVar.j : szqVar.m : szqVar.l;
            taa[] taaVarArr = this.a;
            sinVar.c(taaVarArr[i5], f, szeVarB.a(rectF));
            float fE = e(i5);
            Matrix[] matrixArr = this.b;
            matrixArr[i5].reset();
            PointF pointF = this.d;
            if (i5 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr[i5].setTranslate(pointF.x, pointF.y);
            matrixArr[i5].preRotate(fE);
            float[] fArr2 = this.h;
            taa taaVar = taaVarArr[i5];
            fArr2[0] = taaVar.c;
            fArr2[1] = taaVar.d;
            matrixArr[i5].mapPoints(fArr2);
            float fE2 = e(i5);
            Matrix[] matrixArr2 = this.c;
            matrixArr2[i5].reset();
            matrixArr2[i5].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i5].preRotate(fE2);
            i5++;
        }
        char c4 = 0;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            float[] fArr3 = this.h;
            taa[] taaVarArr2 = this.a;
            taa taaVar2 = taaVarArr2[i6];
            fArr3[c4] = taaVar2.a;
            fArr3[i2] = taaVar2.b;
            Matrix[] matrixArr3 = this.b;
            matrixArr3[i6].mapPoints(fArr3);
            if (i6 == 0) {
                path.moveTo(fArr3[c4], fArr3[i2]);
            } else {
                path.lineTo(fArr3[c4], fArr3[i2]);
            }
            taaVarArr2[i6].c(matrixArr3[i6], path);
            if (zftVar != null) {
                taa taaVar3 = taaVarArr2[i6];
                Matrix matrix = matrixArr3[i6];
                szk szkVar = (szk) zftVar.a;
                i3 = i2;
                boolean z = c4;
                szkVar.v.set(i6, z);
                szkVar.t[i6] = taaVar3.a(matrix);
                c = z;
            } else {
                i3 = i2;
                c = c4;
            }
            int i7 = i6 + 1;
            taa taaVar4 = taaVarArr2[i6];
            fArr3[c] = taaVar4.c;
            fArr3[i3] = taaVar4.d;
            matrixArr3[i6].mapPoints(fArr3);
            float[] fArr4 = this.i;
            int i8 = i7 % 4;
            taa taaVar5 = taaVarArr2[i8];
            fArr4[c] = taaVar5.a;
            fArr4[i3] = taaVar5.b;
            matrixArr3[i8].mapPoints(fArr4);
            float fMax = Math.max(((float) Math.hypot(fArr3[r16] - fArr4[r16], fArr3[i3] - fArr4[i3])) - 0.001f, 0.0f);
            taa taaVar6 = taaVarArr2[i6];
            fArr3[0] = taaVar6.c;
            fArr3[i3] = taaVar6.d;
            matrixArr3[i6].mapPoints(fArr3);
            int i9 = i3;
            float fAbs = (i6 == i9 || i6 == 3) ? Math.abs(rectF.centerX() - fArr3[0]) : Math.abs(rectF.centerY() - fArr3[i9]);
            taa taaVar7 = this.g;
            taaVar7.e(0.0f, 0.0f);
            if (i6 == 1) {
                c2 = 3;
                szgVar = szqVar.h;
            } else if (i6 != 2) {
                c2 = 3;
                szgVar = i6 != 3 ? szqVar.g : szqVar.f;
            } else {
                c2 = 3;
                szgVar = szqVar.i;
            }
            szgVar.a(fMax, fAbs, f, taaVar7);
            Path path4 = this.j;
            path4.reset();
            Matrix[] matrixArr4 = this.c;
            taaVar7.c(matrixArr4[i6], path4);
            if (this.l && (szgVar.c() || d(path4, i6) || d(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr3[0] = taaVar7.a;
                i4 = 1;
                fArr3[1] = taaVar7.b;
                matrixArr4[i6].mapPoints(fArr3);
                path2.moveTo(fArr3[0], fArr3[1]);
                taaVar7.c(matrixArr4[i6], path2);
            } else {
                i4 = 1;
                taaVar7.c(matrixArr4[i6], path);
            }
            if (zftVar != null) {
                Matrix matrix2 = matrixArr4[i6];
                szk szkVar2 = (szk) zftVar.a;
                c3 = 0;
                szkVar2.v.set(i6 + 4, false);
                szkVar2.u[i6] = taaVar7.a(matrix2);
            } else {
                c3 = 0;
            }
            i6 = i7;
            c4 = c3;
            i2 = i4;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
