package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beu extends bet {
    public beu() {
        throw null;
    }

    @Override // defpackage.bet
    public final Object a(bes besVar) {
        return this.b.get(besVar);
    }

    public final void b(bes besVar, Object obj) {
        this.b.put(besVar, obj);
    }

    public beu(bet betVar) {
        betVar.getClass();
        this.b.putAll(betVar.b);
    }
}
