package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class dzy implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        View viewB = eae.b(obj, this);
        float scaleX = viewB.getScaleX();
        if (scaleX == viewB.getScaleY()) {
            return scaleX;
        }
        throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
    }

    @Override // defpackage.eaf
    public final String b() {
        return "scale";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        View viewB = eae.b(obj, this);
        viewB.setScaleX(1.0f);
        viewB.setScaleY(1.0f);
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        View viewB = eae.b(obj, this);
        viewB.setScaleX(f);
        viewB.setScaleY(f);
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        dww dwwVar = dviVar.d;
        if (dwwVar == null || (dwwVar.H & 524288) == 0) {
            return 1.0f;
        }
        return dwwVar.b();
    }
}
