package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aon extends agtu implements agvb {
    final /* synthetic */ aor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aon(aor aorVar, agsw agswVar) {
        super(2, agswVar);
        this.a = aorVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aon) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return new Integer(this.a.f().a());
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new aon(this.a, agswVar);
    }
}
