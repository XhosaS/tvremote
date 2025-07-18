package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class viv extends vhb {
    public final viw a;
    public final zyg b;
    private final yrp c;

    public viv(agow agowVar, viw viwVar, final vjb vjbVar, zyg zygVar) {
        this.a = viwVar;
        this.b = zygVar;
        final vis visVar = new vis(agowVar);
        this.c = yru.a(new yrp() { // from class: vix
            @Override // defpackage.yrp
            public final Object eV() {
                return viv.g(((vis) visVar).a);
            }
        });
    }

    static /* synthetic */ vhe g(agow agowVar) {
        return (vhe) agowVar.a();
    }

    @Override // defpackage.vhb
    public final vxo a() {
        return new viu(this, ((vhe) this.c.eV()).a());
    }

    @Override // defpackage.vhb
    public final zyd b(AccountId accountId) {
        return ((vhe) this.c.eV()).b(accountId);
    }

    @Override // defpackage.vhb
    public final zyd c() {
        return ((vhe) this.c.eV()).a.f();
    }

    @Override // defpackage.vhb
    public final zyd d() {
        return ((vhe) this.c.eV()).b.a();
    }

    @Override // defpackage.vhb
    public final zyd e(AccountId accountId) {
        return ((vhe) this.c.eV()).e(accountId);
    }

    @Override // defpackage.vhb
    public final vha f(AccountId accountId) {
        return ((vhe) this.c.eV()).a.i(accountId);
    }
}
