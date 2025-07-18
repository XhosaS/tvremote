package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swv extends sxo {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final RectF p;
    private final Pair q;

    public swv(sxg sxgVar) {
        super(sxgVar);
        this.p = new RectF();
        this.q = new Pair(new xrk((byte[]) null), new xrk((byte[]) null));
    }

    private final int j() {
        sxg sxgVar = (sxg) this.a;
        int i = sxgVar.p;
        int i2 = sxgVar.q;
        return i + i2 + i2;
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                k(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f9 = (-0.99f) + f6;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float f11 = this.o;
        float fD = sil.d(1.0f - f11, 1.0f, f7);
        float fD2 = sil.d(0.0f, f11, f6);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((fD2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        if (degrees3 <= 0.0f) {
            return;
        }
        sxg sxgVar = (sxg) this.a;
        boolean z2 = false;
        if (sxgVar.c(this.n) && z && f3 > 0.0f) {
            z2 = true;
        }
        float f12 = (fD * 360.0f) + degrees2;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f13 = this.g;
        float f14 = f13 + f13;
        float f15 = degrees + degrees;
        if (degrees3 < f15) {
            float f16 = degrees3 / f15;
            float f17 = f12 + (degrees * f16);
            xrk xrkVar = new xrk((byte[]) null);
            if (z2) {
                PathMeasure pathMeasure = this.d;
                float length = ((f17 / 360.0f) * pathMeasure.getLength()) / 2.0f;
                float f18 = this.h * f3;
                float f19 = this.i;
                if (f19 != this.m || f18 != this.k) {
                    this.k = f18;
                    this.m = f19;
                    g();
                }
                pathMeasure.getPosTan(length, (float[]) xrkVar.a, (float[]) xrkVar.b);
            } else {
                xrkVar.g(f17 + 90.0f);
                xrkVar.d(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            m(canvas, paint, xrkVar, f14, this.f, f16);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(sxgVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f20 = f12 + degrees;
        float f21 = degrees3 - f15;
        Pair pair = this.q;
        ((xrk) pair.first).f();
        ((xrk) pair.second).f();
        if (z2) {
            PathMeasure pathMeasure2 = this.d;
            Path path = this.c;
            float f22 = f20 / 360.0f;
            float f23 = f21 / 360.0f;
            float f24 = this.h * f3;
            int i4 = this.n ? sxgVar.j : sxgVar.k;
            float f25 = this.i;
            if (f25 != this.m || f24 != this.k || i4 != this.l) {
                this.k = f24;
                this.l = i4;
                this.m = f25;
                g();
            }
            path.rewind();
            float fK = cmq.k(f23, 0.0f, 1.0f);
            if (sxgVar.c(this.n)) {
                float f26 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f22 += f26;
                f5 = -(f26 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f27 = f22 % 1.0f;
            float length2 = (pathMeasure2.getLength() * f27) / 2.0f;
            float length3 = ((f27 + fK) * pathMeasure2.getLength()) / 2.0f;
            pathMeasure2.getSegment(length2, length3, path, true);
            xrk xrkVar2 = (xrk) pair.first;
            xrkVar2.f();
            pathMeasure2.getPosTan(length2, (float[]) xrkVar2.a, (float[]) xrkVar2.b);
            xrk xrkVar3 = (xrk) pair.second;
            xrkVar3.f();
            pathMeasure2.getPosTan(length3, (float[]) xrkVar3.a, (float[]) xrkVar3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f5);
            xrkVar2.g(f5);
            xrkVar3.g(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((xrk) pair.first).g(f20 + 90.0f);
            ((xrk) pair.first).d(-this.i);
            ((xrk) pair.second).g(f20 + f21 + 90.0f);
            ((xrk) pair.second).d(-this.i);
            RectF rectF = this.p;
            float f28 = this.i;
            float f29 = -f28;
            rectF.set(f29, f29, f28, f28);
            canvas.drawArc(rectF, f20, f21, false, paint);
            canvas2 = canvas;
        }
        if (sxgVar.f() || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        l(canvas2, paint, (xrk) pair.first, f14, this.f);
        l(canvas, paint, (xrk) pair.second, f14, this.f);
    }

    private final void l(Canvas canvas, Paint paint, xrk xrkVar, float f, float f2) {
        m(canvas, paint, xrkVar, f, f2, 1.0f);
    }

    private final void m(Canvas canvas, Paint paint, xrk xrkVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f);
        float f4 = -f;
        float f5 = f / 2.0f;
        float fMin2 = Math.min(f5, (this.g * fMin) / this.f);
        RectF rectF = new RectF(f4 / 2.0f, (-fMin) / 2.0f, f5, fMin / 2.0f);
        canvas.save();
        float[] fArr = (float[]) xrkVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) xrkVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // defpackage.sxo
    public final int a() {
        return j();
    }

    @Override // defpackage.sxo
    public final int b() {
        return j();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // defpackage.sxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r11, android.graphics.Rect r12, float r13, boolean r14, boolean r15) {
        /*
            r10 = this;
            int r0 = r12.width()
            float r0 = (float) r0
            int r1 = r10.j()
            float r1 = (float) r1
            int r2 = r12.height()
            float r2 = (float) r2
            int r3 = r10.j()
            float r3 = (float) r3
            swu r4 = r10.a
            sxg r4 = (defpackage.sxg) r4
            int r5 = r4.p
            float r6 = (float) r5
            int r7 = r4.q
            float r7 = (float) r7
            int r8 = r12.left
            float r8 = (float) r8
            int r12 = r12.top
            float r12 = (float) r12
            r9 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r9
            float r6 = r6 + r7
            float r0 = r0 / r1
            float r2 = r2 / r3
            float r1 = r6 * r2
            float r3 = r6 * r0
            float r3 = r3 + r8
            float r1 = r1 + r12
            r11.translate(r3, r1)
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r11.rotate(r12)
            r11.scale(r0, r2)
            int r12 = r4.r
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L52
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r0, r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r12 != r1) goto L52
            r12 = 1036831949(0x3dcccccd, float:0.1)
            r11.rotate(r12)
        L52:
            float r12 = -r6
            r11.clipRect(r12, r12, r6, r6)
            int r11 = r4.a
            float r12 = (float) r11
            float r1 = r12 * r13
            r10.f = r1
            int r1 = r11 / 2
            int r2 = r4.a()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            float r1 = r1 * r13
            r10.g = r1
            int r1 = r4.l
            float r1 = (float) r1
            float r1 = r1 * r13
            r10.h = r1
            int r5 = r5 - r11
            float r11 = (float) r5
            float r11 = r11 / r9
            r10.i = r11
            r1 = 1
            if (r14 != 0) goto L7f
            if (r15 == 0) goto L7d
            r15 = r1
            goto L7f
        L7d:
            r13 = r0
            goto Laf
        L7f:
            float r2 = r0 - r13
            float r2 = r2 * r12
            float r2 = r2 / r9
            r12 = 2
            if (r14 == 0) goto L8a
            int r3 = r4.g
            if (r3 == r12) goto L90
        L8a:
            if (r15 == 0) goto L94
            int r3 = r4.h
            if (r3 != r1) goto L94
        L90:
            float r11 = r11 + r2
            r10.i = r11
            goto La7
        L94:
            if (r14 == 0) goto L9d
            int r14 = r4.g
            if (r14 == r1) goto L9b
            goto L9d
        L9b:
            r1 = r15
            goto La3
        L9d:
            if (r15 == 0) goto La7
            int r14 = r4.h
            if (r14 != r12) goto La7
        La3:
            float r11 = r11 - r2
            r10.i = r11
            r15 = r1
        La7:
            if (r15 == 0) goto L7d
            int r11 = r4.h
            r12 = 3
            if (r11 == r12) goto Laf
            goto L7d
        Laf:
            r10.o = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swv.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.sxo
    public final void e(Canvas canvas, Paint paint, sxn sxnVar, int i) {
        int iB = sip.b(sxnVar.c, i);
        canvas.save();
        canvas.rotate(sxnVar.g);
        this.n = sxnVar.h;
        float f = sxnVar.a;
        float f2 = sxnVar.b;
        int i2 = sxnVar.d;
        k(canvas, paint, f, f2, iB, i2, i2, sxnVar.e, sxnVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.sxo
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iB = sip.b(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, iB, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.sxo
    public final void g() {
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        if (((sxg) this.a).c(this.n)) {
            PathMeasure pathMeasure = this.d;
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int iMax = Math.max(3, (int) ((length / (this.n ? r1.j : r1.k)) / 2.0f));
            int i2 = iMax + iMax;
            this.j = length / i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                xrk xrkVar = new xrk((byte[]) null);
                float f3 = i3;
                pathMeasure.getPosTan(this.j * f3, (float[]) xrkVar.a, (float[]) xrkVar.b);
                xrk xrkVar2 = new xrk((byte[]) null);
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) xrkVar2.a, (float[]) xrkVar2.b);
                arrayList.add(xrkVar);
                xrkVar2.d(f2 + f2);
                arrayList.add(xrkVar2);
            }
            arrayList.add((xrk) arrayList.get(0));
            xrk xrkVar3 = (xrk) arrayList.get(0);
            float[] fArr = (float[]) xrkVar3.a;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                xrk xrkVar4 = (xrk) arrayList.get(i4);
                float f5 = this.j / 2.0f;
                xrk xrkVar5 = new xrk(xrkVar3);
                xrk xrkVar6 = new xrk(xrkVar4);
                float f6 = f5 * 0.48f;
                xrkVar5.e(f6);
                xrkVar6.e(-f6);
                float[] fArr2 = (float[]) xrkVar5.a;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) xrkVar6.a;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) xrkVar4.a;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i4++;
                xrkVar3 = xrkVar4;
            }
        }
        this.d.setPath(path, false);
    }

    @Override // defpackage.sxo
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}
