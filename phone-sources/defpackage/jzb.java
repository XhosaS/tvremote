package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzb implements ysx {
    final /* synthetic */ ysx a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public jzb(ysx ysxVar, ieg iegVar, jzc jzcVar, int i) {
        this.d = i;
        this.a = ysxVar;
        this.b = iegVar;
        this.c = jzcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yka] */
    @Override // defpackage.ysx
    public final Object a(ysy ysyVar, yih yihVar) {
        int i = this.d;
        if (i == 0) {
            Object objA = this.a.a(new fzk(ysyVar, (ieg) this.b, (jzc) this.c, 4), yihVar);
            return objA == yio.a ? objA : ygi.a;
        }
        if (i != 1) {
            Object objZ = wae.Z(ysyVar, new ysx[]{this.a, this.c}, anw.e, new yui((yka) this.b, (yih) null, 2), yihVar);
            return objZ == yio.a ? objZ : ygi.a;
        }
        Object objA2 = this.a.a(new fzk(ysyVar, (ieg) this.b, (jzc) this.c, 3), yihVar);
        return objA2 == yio.a ? objA2 : ygi.a;
    }

    public jzb(ysx ysxVar, ysx ysxVar2, yka ykaVar, int i) {
        this.d = i;
        this.a = ysxVar;
        this.c = ysxVar2;
        this.b = ykaVar;
    }
}
