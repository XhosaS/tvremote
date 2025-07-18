package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdz {
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public hdz(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public final void a(float f, float f2) {
        this.a.set(f, f2);
    }

    public final void b(float f, float f2) {
        this.b.set(f, f2);
    }

    public final void c(float f, float f2) {
        this.c.set(f, f2);
    }

    public final String toString() {
        PointF pointF = this.c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public hdz() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }
}
