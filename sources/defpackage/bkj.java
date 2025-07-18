package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkj {
    private final bkr[] a = new bkr[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final bkr g = new bkr();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public bkj() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new bkr();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    static final bjx a(int i, bkh bkhVar) {
        return i != 1 ? i != 2 ? i != 3 ? bkhVar.b : bkhVar.a : bkhVar.d : bkhVar.c;
    }

    private final boolean c(Path path, int i) {
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

    private static final float d(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(bkh bkhVar, float[] fArr, float f, RectF rectF, byj byjVar, Path path) {
        int i;
        int i2;
        int i3;
        float f2;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
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
            bjx bjxVarA = fArr == null ? a(i5, bkhVar) : new bjw(fArr[i5]);
            xo xoVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? bkhVar.j : bkhVar.i : bkhVar.l : bkhVar.k;
            bkr[] bkrVarArr = this.a;
            xoVar.e(bkrVarArr[i5], f, bjxVarA.a(rectF));
            float fD = d(i5);
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
            matrixArr[i5].preRotate(fD);
            float[] fArr2 = this.h;
            bkr bkrVar = bkrVarArr[i5];
            fArr2[0] = bkrVar.b;
            fArr2[1] = bkrVar.c;
            matrixArr[i5].mapPoints(fArr2);
            float fD2 = d(i5);
            Matrix[] matrixArr2 = this.c;
            matrixArr2[i5].reset();
            matrixArr2[i5].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i5].preRotate(fD2);
            i5++;
        }
        char c5 = 0;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            float[] fArr3 = this.h;
            bkr[] bkrVarArr2 = this.a;
            bkr bkrVar2 = bkrVarArr2[i6];
            fArr3[c5] = 0.0f;
            fArr3[i2] = bkrVar2.a;
            Matrix[] matrixArr3 = this.b;
            matrixArr3[i6].mapPoints(fArr3);
            if (i6 == 0) {
                path.moveTo(fArr3[c5], fArr3[i2]);
            } else {
                path.lineTo(fArr3[c5], fArr3[i2]);
            }
            bkrVarArr2[i6].c(matrixArr3[i6], path);
            if (byjVar != null) {
                bkr bkrVar3 = bkrVarArr2[i6];
                Matrix matrix = matrixArr3[i6];
                bkc bkcVar = (bkc) byjVar.a;
                i3 = i2;
                f2 = 0.0f;
                boolean z = c5;
                bkcVar.d.set(i6, z);
                bkcVar.b[i6] = bkrVar3.a(matrix);
                c = z;
            } else {
                i3 = i2;
                f2 = 0.0f;
                c = c5;
            }
            int i7 = i6 + 1;
            bkr bkrVar4 = bkrVarArr2[i6];
            fArr3[c] = bkrVar4.b;
            fArr3[i3] = bkrVar4.c;
            matrixArr3[i6].mapPoints(fArr3);
            float[] fArr4 = this.i;
            int i8 = i7 % 4;
            bkr bkrVar5 = bkrVarArr2[i8];
            fArr4[c] = f2;
            fArr4[i3] = bkrVar5.a;
            matrixArr3[i8].mapPoints(fArr4);
            float fMax = Math.max(((float) Math.hypot(fArr3[c] - fArr4[c], fArr3[i3] - fArr4[i3])) - 0.001f, f2);
            bkr bkrVar6 = bkrVarArr2[i6];
            fArr3[0] = bkrVar6.b;
            fArr3[i3] = bkrVar6.c;
            matrixArr3[i6].mapPoints(fArr3);
            int i9 = i3;
            if (i6 == i9 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr3[0]);
            } else {
                Math.abs(rectF.centerY() - fArr3[i9]);
            }
            bkr bkrVar7 = this.g;
            bkrVar7.e();
            if (i6 != 1) {
                c2 = 2;
                if (i6 != 2) {
                    c3 = 3;
                    if (i6 != 3) {
                        bjz bjzVar = bkhVar.f;
                    } else {
                        bjz bjzVar2 = bkhVar.e;
                    }
                } else {
                    c3 = 3;
                    bjz bjzVar3 = bkhVar.h;
                }
            } else {
                c2 = 2;
                c3 = 3;
                bjz bjzVar4 = bkhVar.g;
            }
            bkrVar7.d(fMax, 0.0f);
            Path path4 = this.j;
            path4.reset();
            Matrix[] matrixArr4 = this.c;
            bkrVar7.c(matrixArr4[i6], path4);
            if (this.l && (c(path4, i6) || c(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr3[0] = 0.0f;
                i4 = 1;
                fArr3[1] = bkrVar7.a;
                matrixArr4[i6].mapPoints(fArr3);
                path2.moveTo(fArr3[0], fArr3[1]);
                bkrVar7.c(matrixArr4[i6], path2);
            } else {
                i4 = 1;
                bkrVar7.c(matrixArr4[i6], path);
            }
            if (byjVar != null) {
                Matrix matrix2 = matrixArr4[i6];
                bkc bkcVar2 = (bkc) byjVar.a;
                c4 = 0;
                bkcVar2.d.set(i6 + 4, false);
                bkcVar2.c[i6] = bkrVar7.a(matrix2);
            } else {
                c4 = 0;
            }
            i6 = i7;
            c5 = c4;
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
