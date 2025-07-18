package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idc extends agtu implements agvb {
    final /* synthetic */ idg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idc(idg idgVar, agsw agswVar) {
        super(2, agswVar);
        this.a = idgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return new Integer(icw.a.a(this.a.b));
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new idc(this.a, agswVar);
    }
}
