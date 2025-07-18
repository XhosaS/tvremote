package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgn extends agtu implements agvb {
    final /* synthetic */ icg a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(icg icgVar, jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.a = icgVar;
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        int iOrdinal;
        agpl.b(obj);
        zdy zdyVar = jhh.a;
        jhh jhhVar = this.b;
        if ((jhhVar.ai == jid.c || jhhVar.ai == jid.d) && ((iOrdinal = this.a.ordinal()) == 14 || iOrdinal == 15)) {
            jhhVar.aw();
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jgn(this.a, this.b, agswVar);
    }
}
