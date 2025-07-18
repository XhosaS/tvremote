package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amm extends agtu implements agvb {
    /* synthetic */ Object a;

    public amm(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amm) c((apk) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return Boolean.valueOf(!(((apk) this.a) instanceof aoe));
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        amm ammVar = new amm(agswVar);
        ammVar.a = obj;
        return ammVar;
    }
}
