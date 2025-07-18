package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mkp implements nwt {
    final /* synthetic */ mkr a;

    public mkp(mkr mkrVar) {
        this.a = mkrVar;
    }

    @Override // defpackage.nzw
    public final void aC(nve nveVar) {
        krd.f("Cannot connect to GMS, error code: " + nveVar.c);
        this.a.C(false);
    }
}
