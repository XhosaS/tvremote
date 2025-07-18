package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rx extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ yjv e;
    final /* synthetic */ Enum f;
    final /* synthetic */ Object g;
    private /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(oe oeVar, bhi bhiVar, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.i = i;
        this.f = oeVar;
        this.g = bhiVar;
        this.e = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.i;
        if (i == 0) {
            return ((rx) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((rx) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((rx) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.i;
        if (i == 0) {
            Enum r12 = this.f;
            rv rvVar = (rv) r12;
            rx rxVar = new rx(rvVar, (bhi) this.g, this.e, yihVar, 0, null);
            rxVar.h = obj;
            return rxVar;
        }
        if (i != 1) {
            Enum r0 = this.f;
            rv rvVar2 = (rv) r0;
            rx rxVar2 = new rx(rvVar2, (bhi) this.g, this.e, yihVar, 2);
            rxVar2.h = obj;
            return rxVar2;
        }
        Enum r122 = this.f;
        oe oeVar = (oe) r122;
        rx rxVar3 = new rx(oeVar, (bhi) this.g, this.e, yihVar, 1);
        rxVar3.h = obj;
        return rxVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, yqe] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        bhi bhiVar;
        Object obj2;
        yjv yjvVar;
        Object obj3;
        Object obj4;
        Throwable th;
        bhi bhiVar2;
        Object obj5;
        bhi bhiVar3;
        bhi bhiVar4;
        AtomicReference atomicReference;
        bhi bhiVar5;
        Object obj6;
        yjv yjvVar2;
        Object obj7;
        Throwable th2;
        Object obj8;
        bhi bhiVar6;
        Object obj9;
        bhi bhiVar7;
        bhi bhiVar8;
        AtomicReference atomicReference2;
        bhi bhiVar9;
        Object obj10;
        yjv yjvVar3;
        Object obj11;
        Throwable th3;
        Object obj12;
        bhi bhiVar10;
        Object obj13;
        int i = this.i;
        if (i == 0) {
            yio yioVar = yio.a;
            int i2 = this.d;
            try {
                try {
                    if (i2 == 0) {
                        ybn.f(obj);
                        yow yowVar = (yow) this.h;
                        Enum r4 = this.f;
                        yij yijVar = yowVar.c().get(yqe.c);
                        yijVar.getClass();
                        bhiVar = new bhi(r4, (yqe) yijVar, (byte[]) null);
                        obj2 = this.g;
                        bhi bhiVar11 = (bhi) obj2;
                        bhiVar11.H(bhiVar);
                        yjvVar = this.e;
                        this.h = bhiVar;
                        obj3 = bhiVar11.a;
                        this.a = obj3;
                        this.b = yjvVar;
                        this.c = obj2;
                        this.d = 1;
                        if (((yyk) obj3).b(this) != yioVar) {
                        }
                        return yioVar;
                    }
                    if (i2 != 1) {
                        obj4 = (bhi) this.b;
                        obj5 = this.a;
                        bhiVar2 = (bhi) this.h;
                        try {
                            ybn.f(obj);
                            a.u((AtomicReference) ((bhi) obj4).b, bhiVar2);
                            ((yyk) obj5).d();
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            a.u((AtomicReference) ((bhi) obj4).b, bhiVar2);
                            throw th;
                        }
                    }
                    Object obj14 = this.c;
                    yjv yjvVar4 = (yjv) this.b;
                    Object obj15 = this.a;
                    bhi bhiVar12 = (bhi) this.h;
                    ybn.f(obj);
                    yjvVar = yjvVar4;
                    obj3 = obj15;
                    bhiVar = bhiVar12;
                    obj2 = obj14;
                    this.h = bhiVar;
                    this.a = obj3;
                    this.b = obj2;
                    this.c = null;
                    this.d = 2;
                    Object objA = yjvVar.a(this);
                    if (objA != yioVar) {
                        obj4 = obj2;
                        obj = objA;
                        obj5 = obj3;
                        bhiVar2 = bhiVar;
                        a.u((AtomicReference) ((bhi) obj4).b, bhiVar2);
                        ((yyk) obj5).d();
                        return obj;
                    }
                    return yioVar;
                } catch (Throwable th5) {
                    obj4 = obj2;
                    th = th5;
                    bhiVar2 = bhiVar;
                    a.u((AtomicReference) ((bhi) obj4).b, bhiVar2);
                    throw th;
                }
            } finally {
            }
        }
        if (i != 1) {
            yio yioVar2 = yio.a;
            int i3 = this.d;
            try {
                try {
                    if (i3 == 0) {
                        ybn.f(obj);
                        yow yowVar2 = (yow) this.h;
                        Enum r5 = this.f;
                        yij yijVar2 = yowVar2.c().get(yqe.c);
                        yijVar2.getClass();
                        bhiVar7 = new bhi(r5, (yqe) yijVar2);
                        Object obj16 = this.g;
                        do {
                            bhiVar8 = (bhi) obj16;
                            atomicReference2 = (AtomicReference) bhiVar8.b;
                            bhiVar9 = (bhi) atomicReference2.get();
                            if (bhiVar9 != null) {
                                if (((rv) bhiVar7.a).compareTo((rv) bhiVar9.a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                            }
                        } while (!a.t(atomicReference2, bhiVar9, bhiVar7));
                        if (bhiVar9 != null) {
                            bhiVar9.b.t(null);
                        }
                        obj10 = bhiVar8.a;
                        yjvVar3 = this.e;
                        this.h = bhiVar7;
                        this.a = obj10;
                        this.b = yjvVar3;
                        this.c = obj16;
                        this.d = 1;
                        if (((yyk) obj10).b(this) != yioVar2) {
                            obj11 = obj16;
                        }
                        return yioVar2;
                    }
                    if (i3 != 1) {
                        obj12 = (bhi) this.b;
                        obj13 = this.a;
                        bhiVar10 = (bhi) this.h;
                        try {
                            ybn.f(obj);
                            a.u((AtomicReference) ((bhi) obj12).b, bhiVar10);
                            ((yyk) obj13).d();
                            return obj;
                        } catch (Throwable th6) {
                            th3 = th6;
                            a.u((AtomicReference) ((bhi) obj12).b, bhiVar10);
                            throw th3;
                        }
                    }
                    obj11 = this.c;
                    yjvVar3 = (yjv) this.b;
                    Object obj17 = this.a;
                    bhiVar7 = (bhi) this.h;
                    ybn.f(obj);
                    obj10 = obj17;
                    this.h = bhiVar7;
                    this.a = obj10;
                    this.b = obj11;
                    this.c = null;
                    this.d = 2;
                    Object objA2 = yjvVar3.a(this);
                    if (objA2 != yioVar2) {
                        obj13 = obj10;
                        obj = objA2;
                        obj12 = obj11;
                        bhiVar10 = bhiVar7;
                        a.u((AtomicReference) ((bhi) obj12).b, bhiVar10);
                        ((yyk) obj13).d();
                        return obj;
                    }
                    return yioVar2;
                } catch (Throwable th7) {
                    th3 = th7;
                    obj12 = obj11;
                    bhiVar10 = bhiVar7;
                    a.u((AtomicReference) ((bhi) obj12).b, bhiVar10);
                    throw th3;
                }
            } finally {
            }
        }
        yio yioVar3 = yio.a;
        int i4 = this.d;
        try {
            try {
                if (i4 == 0) {
                    ybn.f(obj);
                    yow yowVar3 = (yow) this.h;
                    Enum r52 = this.f;
                    yij yijVar3 = yowVar3.c().get(yqe.c);
                    yijVar3.getClass();
                    bhiVar3 = new bhi(r52, (yqe) yijVar3);
                    Object obj18 = this.g;
                    do {
                        bhiVar4 = (bhi) obj18;
                        atomicReference = (AtomicReference) bhiVar4.b;
                        bhiVar5 = (bhi) atomicReference.get();
                        if (bhiVar5 != null) {
                            if (((oe) bhiVar3.a).compareTo((oe) bhiVar5.a) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!a.t(atomicReference, bhiVar5, bhiVar3));
                    if (bhiVar5 != null) {
                        bhiVar5.b.t(new of());
                    }
                    obj6 = bhiVar4.a;
                    yjvVar2 = this.e;
                    this.h = bhiVar3;
                    this.a = obj6;
                    this.b = yjvVar2;
                    this.c = obj18;
                    this.d = 1;
                    if (((yyk) obj6).b(this) != yioVar3) {
                        obj7 = obj18;
                    }
                    return yioVar3;
                }
                if (i4 != 1) {
                    obj8 = (bhi) this.b;
                    obj9 = this.a;
                    bhiVar6 = (bhi) this.h;
                    try {
                        ybn.f(obj);
                        a.u((AtomicReference) ((bhi) obj8).b, bhiVar6);
                        ((yyk) obj9).d();
                        return obj;
                    } catch (Throwable th8) {
                        th2 = th8;
                        a.u((AtomicReference) ((bhi) obj8).b, bhiVar6);
                        throw th2;
                    }
                }
                obj7 = this.c;
                yjvVar2 = (yjv) this.b;
                Object obj19 = this.a;
                bhiVar3 = (bhi) this.h;
                ybn.f(obj);
                obj6 = obj19;
                this.h = bhiVar3;
                this.a = obj6;
                this.b = obj7;
                this.c = null;
                this.d = 2;
                Object objA3 = yjvVar2.a(this);
                if (objA3 != yioVar3) {
                    obj9 = obj6;
                    obj = objA3;
                    obj8 = obj7;
                    bhiVar6 = bhiVar3;
                    a.u((AtomicReference) ((bhi) obj8).b, bhiVar6);
                    ((yyk) obj9).d();
                    return obj;
                }
                return yioVar3;
            } catch (Throwable th9) {
                th2 = th9;
                obj8 = obj7;
                bhiVar6 = bhiVar3;
                a.u((AtomicReference) ((bhi) obj8).b, bhiVar6);
                throw th2;
            }
        } finally {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(rv rvVar, bhi bhiVar, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.i = i;
        this.f = rvVar;
        this.g = bhiVar;
        this.e = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(rv rvVar, bhi bhiVar, yjv yjvVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.i = i;
        this.f = rvVar;
        this.g = bhiVar;
        this.e = yjvVar;
    }
}
