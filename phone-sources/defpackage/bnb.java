package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnb implements bnp {
    public Canvas a = bnc.a;
    private Rect b;
    private Rect c;

    public static final Region.Op j(int i) {
        return a.r(i, 0) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // defpackage.bnp
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, j(i));
    }

    @Override // defpackage.bnp
    public final void b(float[] fArr) {
        if (bnj.z(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        bnj.g(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.bnp
    public final void c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bny.o(this.a, false);
    }

    @Override // defpackage.bnp
    public final void d() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bny.o(this.a, true);
    }

    @Override // defpackage.bnp
    public final void e() {
        this.a.restore();
    }

    @Override // defpackage.bnp
    public final void f(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.bnp
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.bnp
    public final void h(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.bnp
    public final void i(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.bnp
    public final void k(bni bniVar) {
        this.a.clipPath(bniVar.a, j(1));
    }

    @Override // defpackage.bnp
    public final /* synthetic */ void l(bmy bmyVar) {
        bny.r(this, bmyVar);
    }

    @Override // defpackage.bnp
    public final void m(long j, float f, tac tacVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void n(long j, long j2, tac tacVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void o(float f, float f2, float f3, float f4, tac tacVar) {
        this.a.drawRect(f, f2, f3, f4, (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, tac tacVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void q(float f, float f2, float f3, float f4, float f5, float f6, tac tacVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void r(bni bniVar, tac tacVar) {
        boolean z = bniVar instanceof bni;
        Canvas canvas = this.a;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(bniVar.a, (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void s(bng bngVar, tac tacVar) {
        this.a.drawBitmap(bnj.j(bngVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) tacVar.d);
    }

    @Override // defpackage.bnp
    public final void t(bng bngVar, long j, long j2, tac tacVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapJ = bnj.j(bngVar);
        Rect rect = this.b;
        rect.getClass();
        rect.left = cmf.a(0L);
        rect.top = cmf.b(0L);
        rect.right = cmf.a(0L) + ((int) (j >> 32));
        rect.bottom = cmf.b(0L) + ((int) (j & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = cmf.a(0L);
        rect2.top = cmf.b(0L);
        rect2.right = cmf.a(0L) + ((int) (j2 >> 32));
        rect2.bottom = cmf.b(0L) + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(bitmapJ, rect, rect2, (Paint) tacVar.d);
    }
}
