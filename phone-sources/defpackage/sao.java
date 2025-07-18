package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sao implements say, san {
    private final /* synthetic */ sba a;

    public sao(sba sbaVar) {
        this.a = sbaVar;
    }

    @Override // defpackage.rzz
    public final Object a(rzy rzyVar, sbh sbhVar) {
        return this.a.a(rzyVar, sbhVar);
    }

    @Override // defpackage.rzz
    public final Object b(rzy rzyVar, sbh sbhVar) {
        return this.a.b(rzyVar, sbhVar);
    }

    @Override // defpackage.rzz
    public final Object c(rzt rztVar, sbh sbhVar) {
        return this.a.c(rztVar, sbhVar);
    }

    @Override // defpackage.rzz
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.rzz
    public final void e(rzy rzyVar) {
        rzyVar.getClass();
        this.a.e(rzyVar);
    }

    @Override // defpackage.say
    public final sac f(rzy rzyVar) {
        rzyVar.getClass();
        return (sac) this.a.a(rzyVar, new saz(2));
    }

    @Override // defpackage.say
    public final sap g(rzy rzyVar) {
        rzyVar.getClass();
        return (sap) this.a.b(rzyVar, new saz(1));
    }

    @Override // defpackage.say
    public final sap h(rzy rzyVar) {
        rzyVar.getClass();
        return (sap) this.a.b(rzyVar, new saz(0));
    }

    @Override // defpackage.say
    public final sap i(rzy rzyVar) {
        rzyVar.getClass();
        return (sap) this.a.b(rzyVar, new saz(4));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sap] */
    @Override // defpackage.say
    public final sap j(rzt rztVar) {
        rztVar.getClass();
        return this.a.c(rztVar, new saz(5));
    }

    @Override // defpackage.say
    public final sap k(rzy rzyVar) {
        rzyVar.getClass();
        return (sap) this.a.b(rzyVar, new saz(3));
    }
}
