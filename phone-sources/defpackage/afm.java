package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afm extends yiz implements yjv {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(ajk ajkVar, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = ajkVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v4, types: [day, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        switch (this.c) {
            case 0:
                return new afm((alg) this.b, (yih) obj, 0).invokeSuspend(ygi.a);
            case 1:
                return new afm((yjv) this.b, (yih) obj, 1).invokeSuspend(ygi.a);
            case 2:
                return new afm((ajk) this.b, (yih) obj, 2).invokeSuspend(ygi.a);
            case 3:
                return new afm((alg) this.b, (yih) obj, 3, (byte[]) null).invokeSuspend(ygi.a);
            case 4:
                return new afm((alg) this.b, (yih) obj, 4, (char[]) null).invokeSuspend(ygi.a);
            case 5:
                return new afm((alg) this.b, (yih) obj, 5, (short[]) null).invokeSuspend(ygi.a);
            case 6:
                return new afm((yjv) this.b, (yih) obj, 6, (byte[]) null).invokeSuspend(ygi.a);
            case 7:
                return new afm((day) this.b, (yih) obj, 7).invokeSuspend(ygi.a);
            case 8:
                return new afm((yjv) this.b, (yih) obj, 8, (char[]) null).invokeSuspend(ygi.a);
            case 9:
                return new afm((oxj) this.b, (yih) obj, 9).invokeSuspend(ygi.a);
            default:
                return new afm((qdd) this.b, (yih) obj, 10).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v4, types: [day, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final yih create(yih yihVar) {
        switch (this.c) {
            case 0:
                return new afm((alg) this.b, yihVar, 0);
            case 1:
                return new afm((yjv) this.b, yihVar, 1);
            case 2:
                return new afm((ajk) this.b, yihVar, 2);
            case 3:
                return new afm((alg) this.b, yihVar, 3, (byte[]) null);
            case 4:
                return new afm((alg) this.b, yihVar, 4, (char[]) null);
            case 5:
                return new afm((alg) this.b, yihVar, 5, (short[]) null);
            case 6:
                return new afm((yjv) this.b, yihVar, 6, (byte[]) null);
            case 7:
                return new afm((day) this.b, yihVar, 7);
            case 8:
                return new afm((yjv) this.b, yihVar, 8, (char[]) null);
            case 9:
                return new afm((oxj) this.b, yihVar, 9);
            default:
                return new afm((qdd) this.b, yihVar, 10);
        }
    }

    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v29, types: [day, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        switch (this.c) {
            case 0:
                yio yioVar = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj2 = this.b;
                    this.a = 1;
                    if (((alg) obj2).t(this) == yioVar) {
                        return yioVar;
                    }
                }
                return ygi.a;
            case 1:
                yio yioVar2 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                ?? r4 = this.b;
                this.a = 1;
                Object objE = bcm.e(r4, this);
                return objE == yioVar2 ? yioVar2 : objE;
            case 2:
                yio yioVar3 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    alg algVar = ((ajk) this.b).d;
                    this.a = 1;
                    if (algVar.t(this) == yioVar3) {
                        return yioVar3;
                    }
                }
                ((ajk) this.b).d.D(true);
                return ygi.a;
            case 3:
                yio yioVar4 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj3 = this.b;
                    this.a = 1;
                    if (((alg) obj3).l(this) == yioVar4) {
                        return yioVar4;
                    }
                }
                return ygi.a;
            case 4:
                yio yioVar5 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    alg algVar2 = (alg) this.b;
                    boolean zH = algVar2.H();
                    this.a = 1;
                    if (algVar2.k(zH, this) == yioVar5) {
                        return yioVar5;
                    }
                }
                return ygi.a;
            case 5:
                yio yioVar6 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj4 = this.b;
                    this.a = 1;
                    if (((alg) obj4).p(this) == yioVar6) {
                        return yioVar6;
                    }
                }
                return ygi.a;
            case 6:
                yio yioVar7 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                ?? r42 = this.b;
                this.a = 1;
                Object objE2 = bcm.e(r42, this);
                return objE2 == yioVar7 ? yioVar7 : objE2;
            case 7:
                yio yioVar8 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ?? r43 = this.b;
                    this.a = 1;
                    if (r43.a() == yioVar8) {
                        return yioVar8;
                    }
                }
                return ygi.a;
            case 8:
                yio yioVar9 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                ?? r44 = this.b;
                this.a = 1;
                Object objA = r44.a(this);
                return objA == yioVar9 ? yioVar9 : objA;
            case 9:
                yio yioVar10 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                Object obj5 = this.b;
                this.a = 1;
                Object objD = ((oxj) obj5).d(this);
                return objD == yioVar10 ? yioVar10 : objD;
            default:
                yio yioVar11 = yio.a;
                int i = this.a;
                ybn.f(obj);
                if (i == 0) {
                    Object obj6 = this.b;
                    this.a = 1;
                    obj = ((qdd) obj6).b.c(this);
                    if (obj == yioVar11) {
                        return yioVar11;
                    }
                }
                qdl qdlVar = (qdl) obj;
                if (qdlVar instanceof qdn) {
                    return ((qdn) qdlVar).a;
                }
                if (!(qdlVar instanceof qdi)) {
                    throw new yfu();
                }
                ((tvk) ((tvk) qdd.a.g()).i(((qdi) qdlVar).a())).s("Failed to fetch accounts from storage.");
                return yhb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(alg algVar, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = algVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(alg algVar, yih yihVar, int i, byte[] bArr) {
        super(1, yihVar);
        this.c = i;
        this.b = algVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(alg algVar, yih yihVar, int i, char[] cArr) {
        super(1, yihVar);
        this.c = i;
        this.b = algVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(alg algVar, yih yihVar, int i, short[] sArr) {
        super(1, yihVar);
        this.c = i;
        this.b = algVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(day dayVar, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = dayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(oxj oxjVar, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = oxjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(qdd qddVar, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = qddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(yjv yjvVar, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(yjv yjvVar, yih yihVar, int i, byte[] bArr) {
        super(1, yihVar);
        this.c = i;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(yjv yjvVar, yih yihVar, int i, char[] cArr) {
        super(1, yihVar);
        this.c = i;
        this.b = yjvVar;
    }
}
