package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aij {
    private final int a;
    private float b;
    private final Interpolator c;
    private final long d;

    public aij(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float g() {
        return 1.0f;
    }

    public float h() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
    }

    public int i() {
        return this.a;
    }

    public long j() {
        return this.d;
    }

    public void k(float f) {
        this.b = f;
    }
}
