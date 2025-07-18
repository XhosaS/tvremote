package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lay extends wt {
    final /* synthetic */ lbb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lay(lbb lbbVar) {
        super(20);
        this.a = lbbVar;
    }

    @Override // defpackage.wt
    protected final /* synthetic */ Object d(Object obj) throws Throwable {
        String str = (String) obj;
        kkk.h(str);
        lbb lbbVar = this.a;
        lbbVar.ag();
        kkk.h(str);
        kub kubVarJ = lbbVar.ad().j(str);
        if (kubVarJ == null) {
            return null;
        }
        lbk lbkVar = lbbVar.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.k.b("Populate EES config from database on cache miss. appId", str);
        lbbVar.j(str, lbbVar.f(str, kubVarJ.a));
        return (epl) lbbVar.g.h().get(str);
    }
}
