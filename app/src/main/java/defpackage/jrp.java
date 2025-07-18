package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jrp {
    public Paint.Cap a;
    public float c;
    public float g;
    public final Path b = new Path();
    protected final Matrix d = new Matrix();
    public final RectF e = new RectF();
    public final Path f = new Path();

    public final void f() {
        this.b.reset();
        this.f.reset();
        this.c = 0.0f;
        this.g = 0.0f;
        this.a = Paint.Cap.ROUND;
    }

    public final void g(float f, float f2, float f3) {
        Matrix matrix = this.d;
        matrix.reset();
        matrix.preScale(f3, f3);
        matrix.preTranslate(f, f2);
        this.b.transform(matrix);
        this.f.transform(matrix);
        this.c *= f3;
        this.g *= f3;
    }
}
