package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxu extends sxp {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new sxt(Float.class);
    public final dup a;
    public final swu b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public sxu(sxz sxzVar) {
        super(3);
        this.c = 1;
        this.b = sxzVar;
        this.a = new dup();
    }

    private final void h() {
        if (this.h == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<sxu, Float>) g, 0.0f, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new sxs(this));
        }
    }

    @Override // defpackage.sxp
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    final void d() {
        this.d = true;
        this.c = 1;
        for (sxn sxnVar : this.k) {
            swu swuVar = this.b;
            sxnVar.c = swuVar.e[0];
            sxnVar.d = swuVar.i / 2;
        }
    }

    @Override // defpackage.sxp
    public final void e() {
        h();
        d();
        this.h.start();
    }

    @Override // defpackage.sxp
    public final void c() {
    }

    @Override // defpackage.sxp
    public final void f() {
    }

    @Override // defpackage.sxp
    public final void b(gku gkuVar) {
    }
}
