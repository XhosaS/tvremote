package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afno {
    final /* synthetic */ afnp a;

    public afno(afnp afnpVar) {
        this.a = afnpVar;
    }

    public final void a() {
        afnp afnpVar = this.a;
        if (afnpVar.c.decrementAndGet() == 0) {
            afnpVar.h();
        }
    }
}
