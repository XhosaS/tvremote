package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class viu implements vxo {
    final /* synthetic */ vxo a;
    final /* synthetic */ viv b;

    public viu(viv vivVar, vxo vxoVar) {
        this.a = vxoVar;
        this.b = vivVar;
    }

    @Override // defpackage.vxo
    public final zwc a() {
        return this.a.a();
    }

    @Override // defpackage.vxo
    public final zyd b() {
        zyd zydVarA = ((vhp) this.a).a.a();
        zxn.p(zydVarA, wyo.f(new vit(this)), this.b.b);
        return zydVarA;
    }

    @Override // defpackage.vxo
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
