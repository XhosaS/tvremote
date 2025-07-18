package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qx extends yiz implements yka {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ qg c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(qv qvVar, yih yihVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = qvVar;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            long j = ((bmx) obj2).a;
            qx qxVar = new qx((qv) this.c, (yih) obj3, 1);
            qxVar.d = (uz) obj;
            qxVar.b = j;
            return qxVar.invokeSuspend(ygi.a);
        }
        long j2 = ((bmx) obj2).a;
        qx qxVar2 = new qx((qz) this.c, (yih) obj3, 0);
        qxVar2.d = (uz) obj;
        qxVar2.b = j2;
        return qxVar2.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.e != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i == 0) {
                Object obj2 = this.d;
                long j = this.b;
                qg qgVar = this.c;
                if (qgVar.a) {
                    this.a = 1;
                    if (qgVar.v((uz) obj2, j, this) == yioVar) {
                        return yioVar;
                    }
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            Object obj3 = this.d;
            long j2 = this.b;
            qg qgVar2 = this.c;
            if (qgVar2.a) {
                this.a = 1;
                if (qgVar2.v((uz) obj3, j2, this) == yioVar2) {
                    return yioVar2;
                }
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(qz qzVar, yih yihVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = qzVar;
    }
}
