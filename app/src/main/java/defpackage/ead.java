package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class ead implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        if ((obj instanceof elr) && (obj instanceof emi)) {
            return ((elr) obj).getY();
        }
        if (obj instanceof View) {
            return eae.a((View) obj, false);
        }
        if (!(obj instanceof Drawable)) {
            throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(obj.toString()));
        }
        return eae.a(eae.c((Drawable) obj), false) + r3.getBounds().top;
    }

    @Override // defpackage.eaf
    public final String b() {
        return "y";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        }
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if ((obj instanceof elr) && (obj instanceof emi)) {
            ((View) obj).setY(f);
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            view.setY(f - eae.a((View) view.getParent(), false));
        } else {
            if (!(obj instanceof Drawable)) {
                throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
            }
            Drawable drawable = (Drawable) obj;
            ena.c(drawable, drawable.getBounds().left, (int) (f - eae.a(eae.c(drawable), false)));
        }
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        return dviVar.b.top;
    }
}
