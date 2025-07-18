package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzm extends agtu implements agvb {
    /* synthetic */ Object a;

    public fzm(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fzm) c((owt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return Boolean.valueOf(((owt) this.a) instanceof owp);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        fzm fzmVar = new fzm(agswVar);
        fzmVar.a = obj;
        return fzmVar;
    }
}
