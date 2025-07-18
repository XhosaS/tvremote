package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hvl extends hvp implements hvu {
    private Animatable d;

    public hvl(ImageView imageView) {
        super(imageView);
    }

    private final void o(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.d = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.d = animatable;
        animatable.start();
    }

    private final void p(Object obj) {
        i(obj);
        o(obj);
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final void a(Drawable drawable) {
        this.c.c();
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // defpackage.hvm
    public void b(Object obj, hvv hvvVar) {
        if (hvvVar == null || !hvvVar.a(obj, this)) {
            p(obj);
        } else {
            o(obj);
        }
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final void d(Drawable drawable) {
        p(null);
        n(drawable);
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final void e(Drawable drawable) {
        p(null);
        n(drawable);
    }

    protected abstract void i(Object obj);

    @Override // defpackage.hvu
    public final Drawable j() {
        return ((ImageView) this.b).getDrawable();
    }

    @Override // defpackage.hvf, defpackage.hud
    public final void l() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.hvf, defpackage.hud
    public final void m() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.hvu
    public final void n(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }
}
