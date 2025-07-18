package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afsn extends afre {
    public final afns a;
    private final afot b;

    public afsn(afot afotVar, afns afnsVar) {
        this.b = afotVar;
        this.a = afnsVar;
    }

    @Override // defpackage.afre, defpackage.afoh
    public final afoe b(afil afilVar, afih afihVar, afem afemVar, afev[] afevVarArr) {
        return new afsm(this, this.b.b(afilVar, afihVar, afemVar, afevVarArr));
    }

    @Override // defpackage.afre
    protected final afot e() {
        return this.b;
    }
}
