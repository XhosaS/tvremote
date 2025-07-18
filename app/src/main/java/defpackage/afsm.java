package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsm extends afrc {
    final /* synthetic */ afoe a;
    final /* synthetic */ afsn b;

    public afsm(afsn afsnVar, afoe afoeVar) {
        this.a = afoeVar;
        this.b = afsnVar;
    }

    @Override // defpackage.afrc
    protected final afoe b() {
        return this.a;
    }

    @Override // defpackage.afrc, defpackage.afoe
    public final void u(afog afogVar) {
        this.b.a.b();
        b().u(new afsl(this, afogVar));
    }
}
