package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggn extends yiz implements yjz {
    int a;
    final /* synthetic */ gex b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ yjv e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggn(gex gexVar, boolean z, boolean z2, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = gexVar;
        this.d = z;
        this.c = z2;
        this.e = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((ggn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ggn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        return this.f != 0 ? new ggn(this.b, this.d, this.c, this.e, yihVar, 1) : new ggn(yihVar, this.b, this.c, this.d, this.e, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.f != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i != 0) {
                return obj;
            }
            gex gexVar = this.b;
            ggp ggpVar = new ggp(!(gexVar.s() && gexVar.t()) && this.d, this.c, gexVar, null, this.e, 1, null);
            this.a = 1;
            Object objX = gexVar.x(ggpVar, this);
            return objX == yioVar ? yioVar : objX;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
            return obj;
        }
        ybn.f(obj);
        gex gexVar2 = this.b;
        ggp ggpVar2 = new ggp(this.d, this.c, gexVar2, null, this.e, 0);
        this.a = 1;
        Object objX2 = gexVar2.x(ggpVar2, this);
        return objX2 == yioVar2 ? yioVar2 : objX2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggn(yih yihVar, gex gexVar, boolean z, boolean z2, yjv yjvVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = gexVar;
        this.c = z;
        this.d = z2;
        this.e = yjvVar;
    }
}
