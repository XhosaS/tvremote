package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chq extends agtu implements agvb {
    int a;
    final /* synthetic */ chs b;
    final /* synthetic */ ahge c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chq(chs chsVar, ahge ahgeVar, agsw agswVar) {
        super(2, agswVar);
        this.b = chsVar;
        this.c = ahgeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (ahce.b(1000L, this) == agtgVar) {
                return agtgVar;
            }
        }
        cbx.c().a(cif.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        this.c.i(new chk(7));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new chq(this.b, this.c, agswVar);
    }
}
