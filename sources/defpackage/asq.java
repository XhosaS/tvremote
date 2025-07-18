package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asq {
    public ass a;
    public ask b;
    public final asp c = new asp();

    public asq(asv asvVar, asz aszVar, crv crvVar, crv crvVar2) {
        crvVar.getClass();
        int i = 2;
        byo byoVarK = bit.k(new asf(crvVar, i));
        crvVar2.getClass();
        byo byoVarK2 = bit.k(new asf(crvVar2, i));
        if (!((Boolean) byoVarK2.aL()).booleanValue()) {
            d(asvVar, byoVarK, byoVarK2);
            c(aszVar, byoVarK, byoVarK2);
        } else if (((Boolean) byoVarK.aL()).booleanValue()) {
            c(aszVar, byoVarK, byoVarK2);
        } else {
            d(asvVar, byoVarK, byoVarK2);
        }
    }

    private final void c(asz aszVar, byo byoVar, byo byoVar2) {
        this.b = new ask(new aso(this, byoVar2, byoVar, aszVar, 0));
        aszVar.g.add(this.b);
    }

    private final void d(asv asvVar, byo byoVar, byo byoVar2) {
        ass assVar = new ass(new aso(this, byoVar2, byoVar, asvVar, 1));
        this.a = assVar;
        asvVar.a(assVar);
    }

    public final void a(asm asmVar) {
        this.c.b.add(asmVar);
    }

    public final void b(asm asmVar) {
        this.c.b.remove(asmVar);
    }
}
