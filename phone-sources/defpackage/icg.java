package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icg extends yiz implements yka {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icg(ayc aycVar, yjz yjzVar, yih yihVar, int i) {
        super(3, yihVar);
        this.d = i;
        this.b = aycVar;
        this.c = yjzVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, yjz] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.d != 0) {
            Object obj4 = this.b;
            return new icg((ayc) obj4, (yjz) this.c, (yih) obj3, 1).invokeSuspend(ygi.a);
        }
        Object obj5 = this.b;
        return new icg((ity) obj5, (yrz) this.c, (yih) obj3, 0).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ysn] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.d != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i == 0) {
                Object obj2 = this.b;
                ?? r2 = this.c;
                this.a = 1;
                if (r2.a(((ayc) obj2).a, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ity ityVarA = ((ity) this.b).a();
                ?? r22 = this.c;
                this.a = 1;
                Object objG = ((icl) ityVarA.b).g(new ice(r22), this);
                if (objG != yioVar2) {
                    objG = ygi.a;
                }
                if (objG == yioVar2) {
                    return yioVar2;
                }
            }
        } catch (ysg unused) {
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icg(ity ityVar, yrz yrzVar, yih yihVar, int i) {
        super(3, yihVar);
        this.d = i;
        this.b = ityVar;
        this.c = yrzVar;
    }
}
