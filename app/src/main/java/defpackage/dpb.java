package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dpb extends dpi implements dpl {
    private Animatable c;

    public dpb(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.dov, defpackage.dpf
    public void a(Drawable drawable) {
        i(null);
        j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpf
    public void b(Object obj, dpm dpmVar) {
        if (dpmVar != null) {
            dpmVar.a(this);
        }
        i(obj);
        j(obj);
    }

    @Override // defpackage.dov, defpackage.dpf
    public void c(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dov, defpackage.dpf
    public void e(Drawable drawable) {
        i(null);
        j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    protected abstract void i(Object obj);

    public final void j(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.dov, defpackage.dne
    public final void m() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.dov, defpackage.dne
    public final void n() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
