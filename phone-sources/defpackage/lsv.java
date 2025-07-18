package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lsv implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vtw vtwVarM = lcb.a.m();
        tsl tslVar = ltf.a;
        int i = ((vda) obj).b;
        vcz vczVar = i != 0 ? i != 1 ? i != 2 ? null : vcz.LIGHT_THEME : vcz.DARK_THEME : vcz.THEME_UNSPECIFIED;
        if (vczVar == null) {
            vczVar = vcz.UNRECOGNIZED;
        }
        Object objApply = tslVar.apply(vczVar);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lcb) vtwVarM.b).b = ((lca) objApply).a();
        return (lcb) vtwVarM.r();
    }
}
