package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class dzv implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(obj.toString()));
    }

    @Override // defpackage.eaf
    public final String b() {
        return "alpha";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        d(obj, 1.0f);
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if (!(obj instanceof View)) {
            throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
        ((View) obj).setAlpha(f);
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        dww dwwVar = dviVar.d;
        if (dwwVar == null || !dwwVar.H()) {
            return 1.0f;
        }
        return dwwVar.m;
    }
}
