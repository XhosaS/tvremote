package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnv extends ese {
    final /* synthetic */ jnw a;

    public jnv(jnw jnwVar) {
        this.a = jnwVar;
    }

    @Override // defpackage.esf
    public final void H(esd esdVar) {
        esdVar.getClass();
        this.a.i("com.google.android.katniss.search.serviceapi.IKeyboardService");
    }

    @Override // defpackage.esf
    public final esh c(esd esdVar) {
        esdVar.getClass();
        Object obj = jnw.a;
        jnw jnwVar = this.a;
        synchronized (obj) {
            jnwVar.f = esdVar;
        }
        return new jnu(this.a);
    }
}
