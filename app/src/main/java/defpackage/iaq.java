package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iaq extends agtu implements agvb {
    int a;
    final /* synthetic */ iar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaq(iar iarVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iarVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iaq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iar iarVar = this.b;
            yzq yzqVar = iar.a;
            yzqVar.getClass();
            zyd zydVarA = iarVar.b.a(yzqVar, 30, new zyu());
            this.a = 1;
            if (ahkr.b(zydVarA, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.b.c.edit().putBoolean("interactor_settings_initialized", true).apply();
        return null;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iaq(this.b, agswVar);
    }
}
