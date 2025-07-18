package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxy extends sxp {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new sxx(Float.class);
    public final Interpolator[] c;
    public final swu d;
    public int e;
    public boolean f;
    public float g;
    gku h;
    private ObjectAnimator l;
    private ObjectAnimator m;

    public sxy(Context context, sxz sxzVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = sxzVar;
        this.c = new Interpolator[]{gli.g(context, R.anim.linear_indeterminate_line1_head_interpolator), gli.g(context, R.anim.linear_indeterminate_line1_tail_interpolator), gli.g(context, R.anim.linear_indeterminate_line2_head_interpolator), gli.g(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    private final void h() {
        if (this.l == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<sxy, Float>) i, 0.0f, 1.0f);
            this.l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new sxv(this));
        }
        if (this.m == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<sxy, Float>) i, 1.0f);
            this.m = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new sxw(this));
        }
    }

    @Override // defpackage.sxp
    public final void a() {
        ObjectAnimator objectAnimator = this.l;
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
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.m.setFloatValues(this.g, 1.0f);
            this.m.setDuration((long) ((1.0f - this.g) * 1800.0f));
            this.m.start();
        }
    }

    final void d() {
        this.e = 0;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((sxn) it.next()).c = this.d.e[0];
        }
    }

    @Override // defpackage.sxp
    public final void e() {
        h();
        d();
        this.l.start();
    }

    @Override // defpackage.sxp
    public final void f() {
        this.h = null;
    }
}
