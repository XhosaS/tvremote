package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyc extends yiz implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(ith ithVar, yjk yjkVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = ithVar;
        this.b = yjkVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((iyc) create(bool, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((iyc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yjk] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.c) {
            case 0:
                return new iyc((iyd) this.a, (wlr) this.b, yihVar, 0);
            case 1:
                return new iyc((List) this.b, (String) this.a, yihVar, 1);
            case 2:
                return new iyc((iyd) this.a, (woa) this.b, yihVar, 2);
            case 3:
                return new iyc((kbc) this.a, (yjv) this.b, yihVar, 3);
            case 4:
                return new iyc((ith) this.a, (yjk) this.b, yihVar, 4);
            case 5:
                return new iyc((kiq) this.a, (yjv) this.b, yihVar, 5);
            case 6:
                return new iyc((kgm) this.a, (kiq) this.b, yihVar, 6);
            case 7:
                return new iyc((kiq) this.b, (kgv) this.a, yihVar, 7);
            case 8:
                return new iyc((ovq) this.b, (ewb) this.a, yihVar, 8);
            default:
                return new iyc((qji) this.a, (String) this.b, yihVar, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r11v17, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v11, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ksf ksfVarA;
        Object obj2;
        yvc yvcVar;
        Object objD;
        switch (this.c) {
            case 0:
                ybn.f(obj);
                iyd iydVar = (iyd) this.a;
                ixk ixkVarE = iydVar.e();
                ixkVarE.getClass();
                vul vulVar = new vul(((wlr) this.b).c, wlr.a);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = vulVar.iterator();
                while (it.hasNext()) {
                    ixg ixgVar = (ixg) iydVar.m.a.get((wlq) it.next());
                    ids idsVarA = ixgVar != null ? ixgVar.a() : null;
                    if (idsVarA != null) {
                        arrayList.add(idsVarA);
                    }
                }
                ixkVarE.a(arrayList);
                break;
            case 1:
                ybn.f(obj);
                break;
            case 2:
                ybn.f(obj);
                iyd iydVar2 = (iyd) this.a;
                ixk ixkVarF = iydVar2.f();
                ixkVarF.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vun vunVar = ((woa) this.b).b;
                vunVar.getClass();
                Iterator<E> it2 = vunVar.iterator();
                while (true) {
                    irc ircVar = iydVar2.l;
                    if (!it2.hasNext()) {
                        if (arrayList3.isEmpty()) {
                            ((WeakHashMap) ircVar.b).remove(ixkVarF);
                        } else {
                            ircVar.b.put(ixkVarF, 0);
                        }
                        ixkVarF.g = arrayList3;
                        ixkVarF.a(arrayList2);
                        break;
                    } else {
                        wnz wnzVar = (wnz) it2.next();
                        int i = wnzVar.b;
                        if (i == 1) {
                            wnw wnwVar = (wnw) wnzVar.c;
                            int i2 = wnwVar.b;
                            if (i2 == 1) {
                                ?? r6 = ircVar.a;
                                wnx wnxVarB = wnx.b(((Integer) wnwVar.c).intValue());
                                if (wnxVarB == null) {
                                    wnxVarB = wnx.UNRECOGNIZED;
                                }
                                ids idsVar = (ids) r6.get(wnxVarB);
                                if (idsVar != null) {
                                    arrayList2.add(idsVar);
                                }
                            } else if (i2 == 2) {
                                String str = (String) wnwVar.c;
                                str.getClass();
                                arrayList3.add(str);
                            }
                        } else if (i == 2) {
                            wny wnyVar = (wny) wnzVar.c;
                            wnyVar.getClass();
                            vtl vtlVar = wnyVar.c;
                            if (vtlVar == null) {
                                vtlVar = vtl.a;
                            }
                            long jB = vxd.b(vtlVar);
                            if (jB > 0) {
                                ksfVarA = ksf.a();
                                ksfVarA.c(jB);
                            } else {
                                ksfVarA = null;
                            }
                            if (ksfVarA != null) {
                                arrayList2.add(ksfVarA);
                            }
                        }
                    }
                }
            case 3:
                ybn.f(obj);
                kbc kbcVar = (kbc) this.a;
                List list = (List) kbcVar.i.d();
                if (!list.isEmpty()) {
                    yld yldVar = new yld();
                    yvc yvcVar2 = kbcVar.j;
                    yldVar.a = ((Number) yvcVar2.d()).intValue() + 1;
                    while (yldVar.a < list.size()) {
                        wkx wkxVar = (wkx) this.b.a(new Integer(((Number) list.get(yldVar.a)).intValue()));
                        if (wkxVar != null) {
                            vvd vvdVar = wsu.l;
                            wkxVar.i(vvdVar);
                            Object objK = wkxVar.l.k((vub) vvdVar.c);
                            if (objK == null) {
                                objK = vvdVar.b;
                            } else {
                                vvdVar.c(objK);
                            }
                            wni wniVar = ((wsu) objK).i;
                            if (wniVar == null) {
                                wniVar = wni.a;
                            }
                            String str2 = wniVar.b;
                            str2.getClass();
                            if (str2.length() > 0) {
                                yvcVar2.e(new Integer(yldVar.a));
                                break;
                            }
                        }
                        yldVar.a++;
                    }
                }
                break;
            case 4:
                ybn.f(obj);
                if (this.a.o()) {
                    this.b.a();
                }
                break;
            case 5:
                ybn.f(obj);
                ith ithVarE = ((kiq) this.a).b.e();
                if (ithVarE != null) {
                    this.b.a(ithVarE);
                }
                break;
            case 6:
                ybn.f(obj);
                new iul(((kgm) this.a).a, ((kiq) this.b).b, new kil(7)).h();
                break;
            case 7:
                ybn.f(obj);
                do {
                    Object obj3 = this.b;
                    obj2 = this.a;
                    yvcVar = ((kiq) obj3).g;
                    objD = yvcVar.d();
                } while (!yvcVar.f(objD, obj2));
            case 8:
                ybn.f(obj);
                ovq ovqVar = (ovq) this.b;
                ExoPlayer exoPlayer = ovqVar.a;
                if (exoPlayer != 0) {
                    exoPlayer.as(this.a);
                }
                yjk yjkVar = ovqVar.c;
                if (yjkVar != null) {
                    yjkVar.a();
                }
                ovqVar.c = null;
                break;
            default:
                ybn.f(obj);
                try {
                    break;
                } catch (Exception e) {
                    return qji.n(e, 61);
                }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(iyd iydVar, wlr wlrVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = iydVar;
        this.b = wlrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(iyd iydVar, woa woaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = iydVar;
        this.b = woaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(List list, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = list;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(kbc kbcVar, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = kbcVar;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(kgm kgmVar, kiq kiqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = kgmVar;
        this.b = kiqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(kiq kiqVar, kgv kgvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = kiqVar;
        this.a = kgvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(kiq kiqVar, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = kiqVar;
        this.b = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(ovq ovqVar, ewb ewbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = ovqVar;
        this.a = ewbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(qji qjiVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = qjiVar;
        this.b = str;
    }
}
