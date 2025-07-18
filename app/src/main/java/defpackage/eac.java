package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class eac implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        if ((obj instanceof elr) && (obj instanceof emi)) {
            return ((elr) obj).getX();
        }
        if (obj instanceof View) {
            return eae.a((View) obj, true);
        }
        if (!(obj instanceof Drawable)) {
            throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(obj.toString()));
        }
        return eae.a(eae.c((Drawable) obj), true) + r3.getBounds().left;
    }

    @Override // defpackage.eaf
    public final String b() {
        return "x";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
        }
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if ((obj instanceof elr) && (obj instanceof emi)) {
            ((View) obj).setX(f);
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            view.setX(f - eae.a((View) view.getParent(), true));
        } else {
            if (!(obj instanceof Drawable)) {
                throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
            }
            Drawable drawable = (Drawable) obj;
            ena.c(drawable, (int) (f - eae.a(eae.c(drawable), true)), drawable.getBounds().top);
        }
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        return dviVar.b.left;
    }
}
