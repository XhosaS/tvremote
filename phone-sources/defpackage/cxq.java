package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxq {
    private final int a;
    private float b;
    private final Interpolator c;
    private final long d;

    public cxq(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public void g(float f) {
        this.b = f;
    }

    public float h() {
        return 1.0f;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
    }

    public int k() {
        return this.a;
    }

    public long l() {
        return this.d;
    }

    public Interpolator m() {
        return this.c;
    }
}
