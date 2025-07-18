package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxf extends sxp {
    public final TimeInterpolator c;
    public final swu d;
    public int e;
    public float f;
    public float g;
    gku h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = sns.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new sxd(Float.class);
    private static final Property m = new sxe(Float.class);

    public sxf(Context context, sxg sxgVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = sxgVar;
        this.c = sim.k(context, R.attr.motionEasingStandardInterpolator, i);
    }

    private final void h() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<sxf, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new sxb(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<sxf, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new sxc(this));
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
        this.h = gkuVar;
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
        this.e = 0;
        ((sxn) this.k.get(0)).c = this.d.e[0];
        this.g = 0.0f;
    }

    @Override // defpackage.sxp
    public final void e() {
        h();
        d();
        this.n.start();
    }

    @Override // defpackage.sxp
    public final void f() {
        this.h = null;
    }
}
