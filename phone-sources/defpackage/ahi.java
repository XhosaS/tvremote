package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahi extends bxw implements bxu, ahn {
    public final yjv a;
    public final yjv b;
    public yqe c;
    private final yjv d;
    private final bdy e;
    private bmy f;
    private final nxb g;

    public ahi(nxb nxbVar, yjv yjvVar, yjv yjvVar2, yjv yjvVar3) {
        this.g = nxbVar;
        this.a = yjvVar;
        this.b = yjvVar2;
        this.d = yjvVar3;
        afi afiVar = new afi(this, 9);
        ivx ivxVar = bdt.a;
        this.e = new bbh(afiVar, null);
        this.f = bmy.a;
    }

    @Override // defpackage.ahn
    public final long a(bvc bvcVar) {
        return c(bvcVar).f();
    }

    @Override // defpackage.ahn
    public final agk b() {
        return (agk) this.e.a();
    }

    @Override // defpackage.ahn
    public final bmy c(bvc bvcVar) {
        if (!this.A) {
            return this.f;
        }
        bmy bmyVar = (bmy) this.d.a(bvcVar);
        this.f = bmyVar;
        return bmyVar;
    }

    @Override // defpackage.bko
    public final void cd() {
        this.g.a = this;
    }

    @Override // defpackage.bko
    public final void ch() {
        this.g.a = null;
    }
}
