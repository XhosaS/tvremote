package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipw implements ysx {
    final /* synthetic */ ysx a;
    final /* synthetic */ iqo b;
    final /* synthetic */ Object c;
    final /* synthetic */ vuc d;
    private final /* synthetic */ int e;

    public ipw(ysx ysxVar, iqo iqoVar, wmd wmdVar, wod wodVar, int i) {
        this.e = i;
        this.a = ysxVar;
        this.b = iqoVar;
        this.d = wmdVar;
        this.c = wodVar;
    }

    @Override // defpackage.ysx
    public final Object a(ysy ysyVar, yih yihVar) {
        if (this.e != 0) {
            Object objA = this.a.a(new ipt(ysyVar, this.b, (wmd) this.d, (wod) this.c), yihVar);
            return objA == yio.a ? objA : ygi.a;
        }
        Object objA2 = this.a.a(new ipv(ysyVar, (String) this.c, this.b, (wod) this.d), yihVar);
        return objA2 == yio.a ? objA2 : ygi.a;
    }

    public ipw(ysx ysxVar, String str, iqo iqoVar, wod wodVar, int i) {
        this.e = i;
        this.a = ysxVar;
        this.c = str;
        this.b = iqoVar;
        this.d = wodVar;
    }
}
