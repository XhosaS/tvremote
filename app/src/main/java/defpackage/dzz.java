package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class dzz implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        if (obj instanceof View) {
            return ((View) obj).getTranslationX();
        }
        throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(obj.toString()));
    }

    @Override // defpackage.eaf
    public final String b() {
        return "translation_x";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
        }
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if (!(obj instanceof View)) {
            throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
        ((View) obj).setTranslationX(f);
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        dww dwwVar = dviVar.d;
        if (dwwVar != null) {
            return dwwVar.o;
        }
        return 0.0f;
    }
}
