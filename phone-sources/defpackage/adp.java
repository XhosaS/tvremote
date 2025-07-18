package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adp extends bko implements cae {
    public yjk a;
    public ado b;
    public uv c;
    public boolean d;
    private cfa e;
    private final yjv f = new zn(this, 8);
    private yjv g;

    public adp(yjk yjkVar, ado adoVar, uv uvVar, boolean z) {
        this.a = yjkVar;
        this.b = adoVar;
        this.c = uvVar;
        this.d = z;
        b();
    }

    public final void b() {
        this.e = new cfa(new sw(this, 9), new sw(this, 10));
        this.g = this.d ? new zn(this, 9) : null;
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        cfk.y(cfcVar);
        cfcVar.e(cfi.L, this.f);
        if (this.c == uv.a) {
            cfa cfaVar = this.e;
            if (cfaVar == null) {
                yks.c("scrollAxisRange");
                cfaVar = null;
            }
            cfk.q(cfcVar, cfaVar);
        } else {
            cfa cfaVar2 = this.e;
            if (cfaVar2 == null) {
                yks.c("scrollAxisRange");
                cfaVar2 = null;
            }
            cfk.h(cfcVar, cfaVar2);
        }
        yjv yjvVar = this.g;
        if (yjvVar != null) {
            cfcVar.e(cfb.f, new ces(null, yjvVar));
        }
        cfcVar.e(cfb.B, new ces(null, new cbq(new sw(this, 11), 9)));
        cfk.f(cfcVar, this.b.e());
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }
}
