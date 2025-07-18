package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daz extends yiz implements yjz {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(Throwable th, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = th;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((daz) create((dbg) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((daz) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((daz) create((ddf) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((daz) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((daz) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((daz) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((daz) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((daz) create((gfz) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((daz) create((gfz) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((daz) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((daz) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((daz) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((daz) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((daz) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((daz) create(obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yva] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.d) {
            case 0:
                daz dazVar = new daz((List) this.c, yihVar, 0);
                dazVar.b = obj;
                return dazVar;
            case 1:
                daz dazVar2 = new daz((yrz) this.c, yihVar, 1);
                dazVar2.b = obj;
                return dazVar2;
            case 2:
                daz dazVar3 = new daz((yjz) this.c, yihVar, 2);
                dazVar3.b = obj;
                return dazVar3;
            case 3:
                daz dazVar4 = new daz((yjz) this.c, yihVar, 3, (byte[]) null);
                dazVar4.b = obj;
                return dazVar4;
            case 4:
                daz dazVar5 = new daz((yjz) this.c, yihVar, 4, (char[]) null);
                dazVar5.b = obj;
                return dazVar5;
            case 5:
                daz dazVar6 = new daz((yjz) this.c, yihVar, 5, (short[]) null);
                dazVar6.b = obj;
                return dazVar6;
            case 6:
                daz dazVar7 = new daz((yjv) this.c, yihVar, 6);
                dazVar7.b = obj;
                return dazVar7;
            case 7:
                daz dazVar8 = new daz(yihVar, (yjv) this.c, 7);
                dazVar8.b = obj;
                return dazVar8;
            case 8:
                daz dazVar9 = new daz(yihVar, (yjv) this.c, 8, (byte[]) null);
                dazVar9.b = obj;
                return dazVar9;
            case 9:
                daz dazVar10 = new daz((Throwable) this.c, yihVar, 9);
                dazVar10.b = obj;
                return dazVar10;
            case 10:
                daz dazVar11 = new daz((ysx) this.c, yihVar, 10);
                dazVar11.b = obj;
                return dazVar11;
            case 11:
                daz dazVar12 = new daz((yva) this.c, yihVar, 11);
                dazVar12.b = obj;
                return dazVar12;
            case 12:
                daz dazVar13 = new daz((yvl) this.c, yihVar, 12);
                dazVar13.b = obj;
                return dazVar13;
            case 13:
                daz dazVar14 = new daz((yvm) this.c, yihVar, 13);
                dazVar14.b = obj;
                return dazVar14;
            default:
                daz dazVar15 = new daz((ysy) this.c, yihVar, 14);
                dazVar15.b = obj;
                return dazVar15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        yqe yqeVar;
        Throwable th;
        switch (this.d) {
            case 0:
                yio yioVar = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    dbg dbgVar = (dbg) this.b;
                    ?? r1 = this.c;
                    cwo cwoVar = dbc.a;
                    this.a = 1;
                    if (cwoVar.e(r1, dbgVar, this) == yioVar) {
                        return yioVar;
                    }
                }
                return ygi.a;
            case 1:
                yio yioVar2 = yio.a;
                if (this.a != 0) {
                    yqeVar = (yqe) this.b;
                    try {
                        ybn.f(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        yqeVar.t(null);
                        throw th;
                    }
                } else {
                    ybn.f(obj);
                    yqe yqeVarQ = ykr.q((yow) this.b, null, 0, new gad((yih) null, 1, (byte[]) null), 3);
                    try {
                        ?? r12 = this.c;
                        this.b = yqeVarQ;
                        this.a = 1;
                        Object objI = r12.i(this);
                        if (objI == yioVar2) {
                            return yioVar2;
                        }
                        yqeVar = yqeVarQ;
                        obj = objI;
                    } catch (Throwable th3) {
                        yqeVar = yqeVarQ;
                        th = th3;
                        yqeVar.t(null);
                        throw th;
                    }
                }
                un unVar = (un) obj;
                yqeVar.t(null);
                return unVar;
            case 2:
                yio yioVar3 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ddf ddfVar = (ddf) this.b;
                    ?? r13 = this.c;
                    this.a = 1;
                    obj = r13.a(ddfVar, this);
                    if (obj == yioVar3) {
                        return yioVar3;
                    }
                }
                ddf ddfVar2 = (ddf) obj;
                ddfVar2.getClass();
                ((AtomicBoolean) ddfVar2.a.a).set(true);
                return ddfVar2;
            case 3:
                yio yioVar4 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    yow yowVar = (yow) this.b;
                    ?? r14 = this.c;
                    this.a = 1;
                    if (r14.a(yowVar, this) == yioVar4) {
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
                    yow yowVar2 = (yow) this.b;
                    ?? r15 = this.c;
                    this.a = 1;
                    if (r15.a(yowVar2, this) == yioVar5) {
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
                    gbs gbsVar = new gbs((ysy) this.b, (yjz) this.c, (yih) null, 0);
                    this.a = 1;
                    if (yoz.k(gbsVar, this) == yioVar6) {
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
                if (((yow) this.b).c().get(gfi.b) == null) {
                    throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                ?? r8 = this.c;
                this.a = 1;
                Object objA = r8.a(this);
                return objA == yioVar7 ? yioVar7 : objA;
            case 7:
                yio yioVar8 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                ?? r82 = this.c;
                this.a = 1;
                Object objA2 = r82.a(this);
                return objA2 == yioVar8 ? yioVar8 : objA2;
            case 8:
                yio yioVar9 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                ?? r83 = this.c;
                this.a = 1;
                Object objA3 = r83.a(this);
                return objA3 == yioVar9 ? yioVar9 : objA3;
            case 9:
                yio yioVar10 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysy ysyVar = (ysy) this.b;
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        ias iasVar = new ias((Throwable) obj2, 2);
                        this.a = 1;
                        if (ysyVar.emit(iasVar, this) == yioVar10) {
                            return yioVar10;
                        }
                    }
                }
                return ygi.a;
            case 10:
                yio yioVar11 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysy ysyVar2 = (ysy) this.b;
                    ?? r16 = this.c;
                    bdu bduVar = new bdu(ysyVar2, 12);
                    this.a = 1;
                    if (r16.a(bduVar, this) == yioVar11) {
                        return yioVar11;
                    }
                }
                return ygi.a;
            case 11:
                yio yioVar12 = yio.a;
                if (this.a == 0) {
                    ybn.f(obj);
                    ysy ysyVar3 = (ysy) this.b;
                    ylb ylbVar = new ylb();
                    Object obj3 = this.c;
                    yuw yuwVar = new yuw(ylbVar, ysyVar3);
                    this.a = 1;
                    if (yup.f((yup) obj3, yuwVar, this) == yioVar12) {
                        return yioVar12;
                    }
                } else {
                    ybn.f(obj);
                }
                throw new yfs();
            case 12:
                yio yioVar13 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysk yskVar = (ysk) this.b;
                    Object obj4 = this.c;
                    this.a = 1;
                    if (((yvl) obj4).b(yskVar, this) == yioVar13) {
                        return yioVar13;
                    }
                }
                return ygi.a;
            case 13:
                yio yioVar14 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysy ysyVar4 = (ysy) this.b;
                    Object obj5 = this.c;
                    this.a = 1;
                    if (((yvm) obj5).g(ysyVar4, this) == yioVar14) {
                        return yioVar14;
                    }
                }
                return ygi.a;
            default:
                yio yioVar15 = yio.a;
                int i = this.a;
                ybn.f(obj);
                if (i == 0) {
                    Object obj6 = this.b;
                    ?? r17 = this.c;
                    this.a = 1;
                    if (r17.emit(obj6, this) == yioVar15) {
                        return yioVar15;
                    }
                }
                return ygi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(List list, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yih yihVar, yjv yjvVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yih yihVar, yjv yjvVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.c = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yjz yjzVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.c = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yjz yjzVar, yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.d = i;
        this.c = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yjz yjzVar, yih yihVar, int i, short[] sArr) {
        super(2, yihVar);
        this.d = i;
        this.c = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yrz yrzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yrzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(ysx ysxVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = ysxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(ysy ysyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = ysyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yva yvaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yvaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yvl yvlVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yvlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daz(yvm yvmVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yvmVar;
    }
}
