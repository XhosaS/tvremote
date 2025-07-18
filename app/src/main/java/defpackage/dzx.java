package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dzx implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        return eae.b(obj, this).getRotation();
    }

    @Override // defpackage.eaf
    public final String b() {
        return "rotation";
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
        eae.b(obj, this).setRotation(0.0f);
    }

    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        eae.b(obj, this).setRotation(f);
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        dww dwwVar = dviVar.d;
        if (dwwVar == null || !dwwVar.J()) {
            return 0.0f;
        }
        return dwwVar.n;
    }
}
