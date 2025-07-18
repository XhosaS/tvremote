package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pfe extends yiz implements yjz {
    int a;
    final /* synthetic */ pfh b;
    final /* synthetic */ uwj c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfe(pfh pfhVar, uwj uwjVar, String str, yih yihVar) {
        super(2, yihVar);
        this.b = pfhVar;
        this.c = uwjVar;
        this.d = str;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pfe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new pfe(this.b, this.c, this.d, yihVar);
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        byte b;
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                pfh pfhVar = this.b;
                uwj uwjVar = this.c;
                String str = this.d;
                vun vunVar = uwjVar.b;
                vunVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = vunVar.iterator();
                while (true) {
                    uhp uhpVarA = null;
                    b = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    uwi uwiVar = (uwi) it.next();
                    uyr uyrVar = uwiVar.f;
                    if (uyrVar == null) {
                        uyrVar = uyr.a;
                    }
                    uyq uyqVarB = uyq.b(uyrVar.e);
                    if (uyqVarB == null) {
                        uyqVarB = uyq.UITYPE_NONE;
                    }
                    if (uyqVarB != uyq.UITYPE_GNP_CUSTOM_UI) {
                        uwiVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Map map = pfhVar.d;
                        uyr uyrVar2 = uwiVar.f;
                        if (uyrVar2 == null) {
                            uyrVar2 = uyr.a;
                        }
                        uyq uyqVarB2 = uyq.b(uyrVar2.e);
                        if (uyqVarB2 == null) {
                            uyqVarB2 = uyq.UITYPE_NONE;
                        }
                        yfo yfoVar = (yfo) map.get(uyqVarB2);
                        if (yfoVar != null) {
                            pkg pkgVar = (pkg) yfoVar.b();
                            uyr uyrVar3 = uwiVar.f;
                            if (uyrVar3 == null) {
                                uyrVar3 = uyr.a;
                            }
                            arrayList2.addAll(pkgVar.g(uyrVar3.c == 2 ? (uyc) uyrVar3.d : uyc.a));
                            pkg pkgVar2 = (pkg) yfoVar.b();
                            uyr uyrVar4 = uwiVar.f;
                            if (uyrVar4 == null) {
                                uyrVar4 = uyr.a;
                            }
                            uyc uycVar = (uyrVar4.c == 6 ? (uyo) uyrVar4.d : uyo.a).d;
                            if (uycVar == null) {
                                uycVar = uyc.a;
                            }
                            arrayList2.addAll(pkgVar2.g(uycVar));
                        }
                        uhpVarA = sfy.O(arrayList2).a(new eet(uwiVar, 14), ugk.a);
                    } else {
                        tst tstVar = pfhVar.h;
                        if (tstVar.g()) {
                            uwiVar.getClass();
                            qpv qpvVarT = qtl.t(str);
                            uyr uyrVar5 = uwiVar.f;
                            if (uyrVar5 == null) {
                                uyrVar5 = uyr.a;
                            }
                            uyd uydVar = uyrVar5.c == 11 ? (uyd) uyrVar5.d : uyd.a;
                            uydVar.getClass();
                            pkg pkgVar3 = (pkg) tstVar.c();
                            String str2 = uydVar.c;
                            str2.getClass();
                            vsl vslVar = uydVar.d;
                            if (vslVar == null) {
                                vslVar = vsl.a;
                            }
                            vslVar.getClass();
                            uhpVarA = sfy.P(wae.W(pkgVar3.b, new pfo(pkgVar3, qpvVarT, new piy(str2, vslVar), (yih) null, 6))).a(new eet(uwiVar, 15), ugk.a);
                        }
                    }
                    if (uhpVarA != null) {
                        arrayList.add(uhpVarA);
                    }
                }
                uhp uhpVarJ = ufn.j(sfy.H(arrayList), new pap(pfhVar, str, 3, b == true ? 1 : 0), ugk.a);
                this.a = 1;
                if (wae.U(uhpVarJ, this) == yioVar) {
                    return yioVar;
                }
            }
            return new qdn(ygi.a);
        } catch (Exception e) {
            return new qdk(e, 40);
        }
    }
}
