package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bni {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public bni() {
        this((byte[]) null);
    }

    public final int a() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final bmy b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new bmy(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void c() {
        this.a.close();
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void i(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    public final void j(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    public final void k() {
        this.a.reset();
    }

    public final void l() {
        this.a.rewind();
    }

    public final void m(int i) {
        this.a.setFillType(a.r(i, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void n(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Path path = this.a;
        Matrix matrix3 = this.d;
        matrix3.getClass();
        path.transform(matrix3);
    }

    public final void o(bni bniVar, bni bniVar2, int i) {
        this.a.op(bniVar.a, bniVar2.a, a.r(i, 0) ? Path.Op.DIFFERENCE : a.r(i, 1) ? Path.Op.INTERSECT : a.r(i, 4) ? Path.Op.REVERSE_DIFFERENCE : a.r(i, 2) ? Path.Op.UNION : Path.Op.XOR);
    }

    public final void p(bni bniVar) {
        this.a.addPath(bniVar.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public bni(Path path) {
        this.a = path;
    }

    public /* synthetic */ bni(byte[] bArr) {
        this(new Path());
    }
}
