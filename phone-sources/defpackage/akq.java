package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akq extends yiz implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akq(ajq ajqVar, bte bteVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = ajqVar;
        this.b = bteVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((akq) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((akq) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((akq) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 3) {
            return ((akq) create((iax) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 4) {
            return ((akq) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((akq) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bte, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.d;
        if (i == 0) {
            akq akqVar = new akq((alg) this.a, (bte) this.b, yihVar, 0);
            akqVar.c = obj;
            return akqVar;
        }
        if (i == 1) {
            akq akqVar2 = new akq((ajq) this.a, (bte) this.b, yihVar, 1);
            akqVar2.c = obj;
            return akqVar2;
        }
        if (i == 2) {
            akq akqVar3 = new akq((ayh) this.b, (aeh) this.a, yihVar, 2);
            akqVar3.c = obj;
            return akqVar3;
        }
        if (i == 3) {
            akq akqVar4 = new akq((iom) this.b, (iaq) this.a, yihVar, 3);
            akqVar4.c = obj;
            return akqVar4;
        }
        if (i != 4) {
            akq akqVar5 = new akq((qji) this.b, (qjb) this.a, yihVar, 5);
            akqVar5.c = obj;
            return akqVar5;
        }
        akq akqVar6 = new akq((yyh) this.a, (qen) this.b, yihVar, 4);
        akqVar6.c = obj;
        return akqVar6;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, qbr] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [bte, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object objC;
        iab iabVar;
        Object objE;
        Object objE2;
        qjc qjcVarI;
        int i = this.d;
        byte[] bArr = null;
        if (i == 0) {
            ybn.f(obj);
            yow yowVar = (yow) this.c;
            ?? r6 = this.b;
            alg algVar = (alg) this.a;
            ykr.q(yowVar, null, 4, new qd(algVar, (bte) r6, (yih) null, 17, (byte[]) null), 1);
            ykr.q(yowVar, null, 4, new qd(algVar, (bte) r6, (yih) null, 18, (char[]) null), 1);
            return ykr.q(yowVar, null, 4, new qd((bte) r6, algVar, (yih) null, 19), 1);
        }
        if (i == 1) {
            ybn.f(obj);
            yow yowVar2 = (yow) this.c;
            Object obj2 = this.a;
            ajq ajqVar = (ajq) obj2;
            alg algVar2 = ajqVar.b;
            qm qmVar = new qm(algVar2, obj2, 13, bArr);
            ?? r7 = this.b;
            ykr.q(yowVar2, null, 4, new qd(algVar2, (bte) r7, (yih) null, 15), 1);
            ykr.q(yowVar2, null, 4, new ajo(ajqVar, algVar2, (bte) r7, qmVar, (yih) null, 0), 1);
            ykr.q(yowVar2, null, 4, new th(algVar2, (bte) r7, qmVar, (yih) null, 7), 1);
            return ygi.a;
        }
        if (i == 2) {
            ybn.f(obj);
            yow yowVar3 = (yow) this.c;
            Object obj3 = this.a;
            ayh ayhVar = (ayh) this.b;
            aeh aehVar = (aeh) obj3;
            ykr.q(yowVar3, null, 0, new aoa(ayhVar, aehVar, (yih) null, 12, (byte[]) null), 3);
            ykr.q(yowVar3, null, 0, new aoa(ayhVar, aehVar, (yih) null, 13, (char[]) null), 3);
            ykr.q(yowVar3, null, 0, new aoa(ayhVar, aehVar, (yih) null, 14, (short[]) null), 3);
            return ykr.q(yowVar3, null, 0, new aoa(ayhVar, aehVar, (yih) null, 15, (int[]) null), 3);
        }
        if (i != 3) {
            if (i == 4) {
                ybn.f(obj);
                try {
                    ((yyh) this.a).c.d((qen) this.b);
                    objE = ygi.a;
                } catch (Throwable th) {
                    objE = ybn.e(th);
                }
                return osk.am(objE, 38);
            }
            ybn.f(obj);
            Object obj4 = this.a;
            Object obj5 = this.b;
            try {
                try {
                    synchronized (((qji) obj5).d) {
                        ((qji) obj5).m(((qji) obj5).j((qjb) obj4));
                        qjcVarI = ((qji) obj5).i((qjb) obj4);
                        qji.a.l().E("Refreshed oauth token for [%s, %s] expiration %s", ((qjb) obj4).a, ((qjb) obj4).b, qjcVarI.c);
                    }
                    Map map = ((qji) obj5).e;
                    synchronized (map) {
                    }
                    objE2 = qjcVarI;
                } catch (Throwable th2) {
                    Map map2 = ((qji) obj5).e;
                    synchronized (map2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                objE2 = ybn.e(th3);
            }
            return new yfy(objE2);
        }
        ybn.f(obj);
        iax iaxVar = (iax) this.c;
        if (iaxVar.a() != 1 && (objC = iaxVar.c()) != null) {
            Object obj6 = this.b;
            Object obj7 = this.a;
            Object obj8 = ((iom) obj6).d;
            if (obj8 != null) {
                Object obj9 = ((iaq) obj7).b;
                obj9.getClass();
                long jNanoTime = System.nanoTime();
                iac iacVar = (iac) obj8;
                iacVar.c(jNanoTime);
                Map map3 = iacVar.b;
                iab iabVar2 = (iab) map3.get(obj9);
                if (iabVar2 != null) {
                    iacVar.d(iabVar2, jNanoTime);
                    iabVar2.b = objC;
                } else {
                    iab iabVar3 = new iab(obj9, objC);
                    iacVar.d(iabVar3, jNanoTime);
                    map3.put(obj9, iabVar3);
                }
                if (iacVar.e) {
                    Set set = iacVar.d;
                    if (set == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    iacVar.b();
                    while (map3.size() > iacVar.a) {
                        synchronized (set) {
                            iabVar = (iab) yfm.T(set);
                        }
                        if (iabVar != null) {
                            map3.remove(iabVar.a);
                            Set set2 = iacVar.c;
                            if (set2 != null) {
                                set2.remove(iabVar);
                            }
                            set.remove(iabVar);
                        }
                    }
                }
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akq(alg algVar, bte bteVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = algVar;
        this.b = bteVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akq(ayh ayhVar, aeh aehVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = ayhVar;
        this.a = aehVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akq(iom iomVar, iaq iaqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = iomVar;
        this.a = iaqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akq(qji qjiVar, qjb qjbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qjiVar;
        this.a = qjbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akq(yyh yyhVar, qen qenVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = yyhVar;
        this.b = qenVar;
    }
}
