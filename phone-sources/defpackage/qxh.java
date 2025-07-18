package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxh {
    public final qyc a;
    public qyf b;
    public Map c = yhc.a;
    public List d;
    public vqs e;
    public yqe f;
    public final qzl g;
    public List h;
    public final yvc i;
    private final qyf j;
    private final qzp k;
    private final qzj l;
    private final yvc m;
    private final rdd n;

    public qxh(qyc qycVar, yvc yvcVar, qyf qyfVar, yvc yvcVar2) {
        this.a = qycVar;
        this.m = yvcVar;
        this.j = qyfVar;
        this.i = yvcVar2;
        this.b = qyfVar;
        yhb yhbVar = yhb.a;
        this.d = yhbVar;
        this.k = new qzp(qycVar.a.c, qycVar.d);
        qyk qykVar = qycVar.a;
        rdd rddVar = new rdd();
        this.n = rddVar;
        vrs vrsVar = qykVar.c;
        qyn qynVar = qycVar.d;
        qxj qxjVarB = qyfVar.b();
        vrn vrnVar = qxjVarB != null ? qxjVarB.a.a : null;
        this.l = new qzj(vrsVar, qynVar, vrnVar, qykVar.b);
        qyn qynVar2 = qycVar.d;
        qyk qykVar2 = qycVar.a;
        this.g = new qzl(qynVar2, qykVar2.c, rddVar, qyfVar.b(), qyfVar instanceof qyd, qykVar2.b);
        this.h = yhbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [vpi] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, tsv] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [vou] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [vqg] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5, types: [vov] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [vou] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List, vpi] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    public static /* synthetic */ void a(qxh qxhVar, qyf qyfVar, vrm vrmVar, vqp vqpVar, List list, vqs vqsVar, Map map, List list2, int i) {
        int i2;
        int i3;
        vqj vqjVarA;
        boolean z;
        vrn vrnVar;
        vqs vqsVar2;
        vpf vqrVar;
        int i4;
        vpd vptVar;
        qxj qxjVar;
        vql vqlVar;
        vqs vqsVar3;
        ?? r6;
        List list3;
        vqe vqeVar;
        qyf qyfVar2 = (i & 1) != 0 ? qxhVar.b : qyfVar;
        vrm vrmVar2 = (i & 2) != 0 ? qxhVar.a.a.b.a : vrmVar;
        vqp vqpVar2 = (i & 4) != 0 ? (vqp) qxhVar.i.d() : vqpVar;
        List list4 = (i & 8) != 0 ? qxhVar.d : list;
        vqs vqsVar4 = (i & 32) != 0 ? qxhVar.e : vqsVar;
        Map map2 = (i & 64) != 0 ? qxhVar.c : map;
        List list5 = (i & 128) != 0 ? qxhVar.h : list2;
        if (yks.e(qyfVar2.a(), qxhVar.j.a())) {
            qxj qxjVarB = qyfVar2.b();
            boolean zBooleanValue = false;
            if (qxjVarB != null) {
                vou vouVar = qxjVarB.a;
                String strB = vouVar.b();
                vpi vpiVarA = vouVar.a();
                vqe[] vqeVarArr = new vqe[2];
                if (strB != null) {
                    i2 = 2;
                    i3 = 1;
                    vqeVar = new vqe(vpz.a, strB);
                } else {
                    i2 = 2;
                    i3 = 1;
                    vqeVar = new vqe(vpy.a);
                }
                vrn vrnVar2 = vouVar.a;
                vqeVarArr[0] = vqeVar;
                vqeVarArr[i3 == true ? 1 : 0] = new vqe(vpy.g);
                List listS = yfm.s(vqeVarArr);
                vqe[] vqeVarArr2 = new vqe[3];
                vqeVarArr2[0] = new vqe(vpy.d);
                vqeVarArr2[i3 == true ? 1 : 0] = new vqe(vpy.e);
                vqeVarArr2[i2] = new vqe(vpy.f);
                vqjVarA = new vqj(vrnVar2, vpiVarA, listS, yfm.s(vqeVarArr2), null);
            } else {
                i2 = 2;
                i3 = 1;
                vqjVarA = null;
            }
            List listC = qyfVar2.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(listC, 10)), 16));
            for (Object obj : listC) {
                qyc qycVar = qxhVar.a;
                linkedHashMap.put(obj, ((qza) qycVar.a.m.a).a(((qxj) obj).a, false, map2, qycVar.d));
            }
            boolean zIsEmpty = yfm.ac(linkedHashMap.values()).isEmpty();
            Boolean bool = vqpVar2.b;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (!qxhVar.a.d.f || !zIsEmpty) {
                zBooleanValue = i3 == true ? 1 : 0;
            }
            ArrayList arrayList = new ArrayList(yfm.z(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(((vou) it.next()).c);
            }
            List listC2 = qyfVar2.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listC2) {
                if (!arrayList.contains(((qxj) obj2).a.c)) {
                    arrayList2.add(obj2);
                }
            }
            List<qxj> listAj = yfm.aj(arrayList2, new acs(linkedHashMap, 18));
            ArrayList arrayList3 = new ArrayList(yfm.z(listAj, 10));
            for (qxj qxjVar2 : listAj) {
                qyc qycVar2 = qxhVar.a;
                vqs vqsVar5 = (vqs) linkedHashMap.get(qxjVar2);
                vou vouVar2 = qxjVar2.a;
                vrn vrnVar3 = vouVar2.a;
                qyn qynVar = qycVar2.d;
                qynVar.k.b.apply(vrnVar3);
                qynVar.d.a(vrnVar3);
                vpg vpgVarC = vouVar2.c(i3, vrmVar2);
                if (vqsVar5 != null) {
                    list3 = list5;
                    vpgVarC = new vpg(vpgVarC.a, vpgVarC.b, vpgVarC.c, vpgVarC.d, vpgVarC.g, null, vqsVar5);
                } else {
                    list3 = list5;
                }
                arrayList3.add(vpgVarC);
                list5 = list3;
                i3 = 1;
            }
            List list6 = list5;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list6) {
                String str = ((vou) obj3).c;
                qxj qxjVarB2 = qyfVar2.b();
                if (!str.equals(qxjVarB2 != null ? qxjVarB2.a.c : null)) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(yfm.z(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((vou) it2.next()).c(3, vrmVar2));
            }
            List listAf = yfm.af(arrayList3, arrayList5);
            boolean z2 = qyfVar2 instanceof qxk;
            if (z2) {
                qyc qycVar3 = qxhVar.a;
                qxj qxjVar3 = ((qxk) qyfVar2).a;
                vou vouVar3 = qxjVar3 != null ? qxjVar3.a : null;
                qyk qykVar = qycVar3.a;
                qyn qynVar2 = qycVar3.d;
                qzd qzdVar = qykVar.d;
                if (yks.e(qzdVar.c, vouVar3)) {
                    z = z2;
                } else {
                    qzdVar.c = vouVar3;
                    if (vouVar3 != null) {
                        z = z2;
                        qzdVar.d = qzdVar.b.a(new qaz(qzdVar, qynVar2, 13));
                        qzdVar.e = qzd.a;
                    } else {
                        z = z2;
                        qzdVar.d = null;
                        qzdVar.e = null;
                    }
                }
                vpj vpjVar = qzdVar.e;
                if (vqjVarA == null || vpjVar == null) {
                    vqsVar3 = vqsVar4;
                    r6 = 0;
                } else {
                    vpi vpiVar = vqjVarA.b;
                    vqsVar3 = vqsVar4;
                    r6 = 0;
                    vqjVarA = vqj.a(vqjVarA, new vpi(vpiVar.a, vpiVar.b, vpjVar), null, null, 29);
                }
                vrp vrpVar = qzdVar.d;
                if (vrpVar != null) {
                    vqjVarA = vqjVarA != null ? vqj.a(vqjVarA, r6, r6, vrpVar, 15) : null;
                }
                vqs vqsVarA = qxjVar3 != null ? ((qza) qykVar.m.a).a(qxjVar3.a, true, qxhVar.c, qynVar2) : null;
                vqs vqsVar6 = (vqsVarA == null && vqsVar3 != null && yfm.ac(linkedHashMap.values()).isEmpty()) ? vqsVar3 : vqsVarA;
                if (vqsVarA != null) {
                    yhb yhbVar = vqjVarA != null ? vqjVarA.c : yhb.a;
                    if (vqjVarA != null) {
                        vou vouVar4 = qxjVar3 != null ? qxjVar3.a : null;
                        String strB2 = vouVar4 != null ? vouVar4.b() : null;
                        ArrayList arrayList6 = new ArrayList();
                        if (strB2 != null) {
                            arrayList6.add(new vqe(vpz.c, strB2));
                        }
                        arrayList6.add(new vqe(vpy.o));
                        arrayList6.addAll(yhbVar);
                        vrnVar = null;
                        vqjVarA = vqj.a(vqjVarA, null, arrayList6, null, 27);
                    } else {
                        vrnVar = null;
                        vqsVar2 = vqsVar6;
                        vqjVarA = null;
                    }
                } else {
                    vrnVar = null;
                }
                vqsVar2 = vqsVar6;
            } else {
                z = z2;
                vrnVar = null;
                vqsVar2 = null;
            }
            if (qyfVar2.d()) {
                qzj qzjVar = qxhVar.l;
                ArrayList arrayList7 = new ArrayList();
                vqs vqsVar7 = qzjVar.c;
                if (vqsVar7 != null) {
                    arrayList7.add(vqsVar7);
                }
                vqs vqsVar8 = qzjVar.d;
                if (vqsVar8 != null) {
                    arrayList7.add(vqsVar8);
                }
                ArrayList arrayList8 = new ArrayList(yfm.z(arrayList7, 10));
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(new vqw((vqs) it3.next()));
                }
                vqu vquVar = new vqu(arrayList8, i2);
                vqrVar = new vqq(vqjVarA, (listAf.isEmpty() && vquVar.a.isEmpty()) ? vrnVar : new vov(listAf, vqjVarA == null ? 2 : zBooleanValue ? 4 : 3, zBooleanValue ? new vqe(vpy.q) : new vqe(vpy.p), zBooleanValue ? new vqe(vpy.r) : new vqe(vpy.s), vquVar), vqsVar2, null, qzjVar.f);
            } else {
                vqrVar = new vqr(qyfVar2 instanceof qyd ? qxhVar.k.b : qxhVar.k.c);
            }
            if (qyfVar2.d()) {
                qxj qxjVarB3 = qyfVar2.b();
                ?? r62 = qxjVarB3 != null ? qxjVarB3.a : vrnVar;
                vrmVar2.getClass();
                if (r62 != 0) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(new vqe(vpz.b, vxr.aq(r62)));
                    if (r62.d) {
                        arrayList9.add(new vqe(vpy.m));
                    }
                    if (vxr.ae(vrmVar2, r62.a)) {
                        vqlVar = new vql(new vqe(vxr.aq(r62)), vro.ON_SURFACE, 2, 1, arrayList9);
                        i4 = 2;
                    } else {
                        i4 = 2;
                        vqlVar = new vql(new vqe(vpy.C), vro.ON_SURFACE_VARIANT, 4, 2);
                    }
                } else {
                    i4 = 2;
                    vqlVar = new vql(new vqe(vpy.b), vro.ON_SURFACE, 1, 2);
                }
                vptVar = new vqm(vqlVar);
            } else {
                i4 = 2;
                vptVar = new vpt(new vpv(13));
            }
            vpd vpdVar = vptVar;
            vrn vrnVar4 = vqjVarA != null ? vqjVarA.a : vrnVar;
            vqe vqeVar2 = new vqe(vpy.h);
            vqe vqeVar3 = new vqe(vpy.i);
            qyc qycVar4 = qxhVar.a;
            vox voxVar = new vox(vrnVar4, vqeVar2, vqeVar3);
            ?? vqgVar = !list4.isEmpty() ? new vqg(new vqe(vpz.d, (String) ((ttd) qycVar4.a.e).a), list4) : vrnVar;
            ?? r1 = (!z || (qxjVar = ((qxk) qyfVar2).a) == null) ? vrnVar : qxjVar.a;
            vqpVar2.getClass();
            vrn vrnVar5 = r1 != 0 ? r1.a : vrnVar;
            ?? A = r1 != 0 ? r1.a() : vrnVar;
            qyn qynVar3 = qycVar4.d;
            vpe vpeVar = new vpe(vrnVar5, A, vqpVar2.a);
            qwn qwnVar = qynVar3.a;
            Context context = qwnVar.a;
            context.getClass();
            qxhVar.m.e(new vpb(vqrVar, vpdVar, voxVar, vqgVar, vpeVar, !rdd.f(context) ? 1 : qwnVar.e.p == 1 ? 3 : i4, z ? ((qxk) qyfVar2).a != null ? new vqe(vpy.t) : qyfVar2.d() ? new vqe(vpy.b) : new vqe(vpy.u) : new vqe(vpy.A), vqpVar2.c));
        }
    }
}
