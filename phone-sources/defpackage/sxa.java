package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxa extends sxp {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new swy(Float.class);
    private static final Property m = new swz(Float.class);
    public final dup d;
    public final swu e;
    public int f;
    public float g;
    public float h;
    gku i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public sxa(sxg sxgVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = sxgVar;
        this.d = new dup();
    }

    private final void h() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<sxa, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new sww(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<sxa, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new swx(this));
        }
    }

    @Override // defpackage.sxp
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.sxp
    public final void b(gku gkuVar) {
        this.i = gkuVar;
    }

    @Override // defpackage.sxp
    public final void c() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    final void d() {
        this.f = 0;
        ((sxn) this.k.get(0)).c = this.e.e[0];
        this.h = 0.0f;
    }

    @Override // defpackage.sxp
    public final void e() {
        h();
        d();
        this.n.start();
    }

    @Override // defpackage.sxp
    public final void f() {
        this.i = null;
    }
}
