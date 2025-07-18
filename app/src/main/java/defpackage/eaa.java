package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class eaa implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        if (obj instanceof View) {
            return ((View) obj).getTranslationY();
        }
        throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(obj.toString()));
    }

    @Override // defpackage.eaf
    public final String b() {
        return "translation_y";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        }
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if (!(obj instanceof View)) {
            throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
        ((View) obj).setTranslationY(f);
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        dww dwwVar = dviVar.d;
        if (dwwVar != null) {
            return dwwVar.p;
        }
        return 0.0f;
    }
}
