package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzl implements qxs {
    public final int a;
    public final ysx b;
    private final vrs c;
    private final qxj d;
    private final boolean e;
    private final qxc f;
    private final vqu g;
    private final ysx h;
    private final qyn i;
    private yvc j;
    private final rdd k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList, java.util.Collection] */
    public qzl(qyn qynVar, vrs vrsVar, rdd rddVar, qxj qxjVar, boolean z, qxc qxcVar) {
        yhb yhbVar;
        this.i = qynVar;
        this.c = vrsVar;
        this.k = rddVar;
        this.d = qxjVar;
        this.e = z;
        this.f = qxcVar;
        vqu vquVar = new vqu((List) null, 3);
        this.g = vquVar;
        this.j = yvd.a(vquVar);
        if (qxjVar != null) {
            vrn vrnVar = qxjVar.a.a;
            qwn qwnVar = qynVar.a;
            if (rdd.h(qwnVar, vrnVar) != null) {
                qwnVar.e.f.c();
            }
        }
        isv isvVar = new isv(null, 6);
        this.h = isvVar;
        int i = vqy.a;
        this.a = vqy.a();
        qxcVar.d(qxjVar != null ? qxjVar.a.a : null, this);
        yvc yvcVar = this.j;
        Ordering ordering = qzo.a;
        int iA = vqy.a();
        int iA2 = vqy.a();
        int iA3 = vqy.a();
        ImmutableList immutableListB = qynVar.a.e.f.b();
        ArrayList arrayList = new ArrayList(yfm.z(immutableListB, 10));
        Iterator it = immutableListB.iterator();
        while (it.hasNext()) {
            arrayList.add(new rdh(((rfm) it.next()).a()));
        }
        qwn qwnVar2 = qynVar.a;
        if (qwnVar2.b.a() == null) {
            yhbVar = yhb.a;
        } else {
            qwnVar2.e.f.d();
            yhbVar = yhb.a;
        }
        rzy rzyVar = new rzy(rddVar, vrsVar, (short[]) null);
        ysx[] ysxVarArr = new ysx[3];
        ysxVarArr[0] = qzo.a(yhbVar, iA3, rzyVar, z);
        ysxVarArr[1] = qzo.a(arrayList, iA, rzyVar, z);
        ImmutableList immutableList = qynVar.a.e.i;
        if (qxjVar == null) {
            ?? arrayList2 = new ArrayList();
            for (Object obj : immutableList) {
                if (((rfc) obj).i != rez.PRIVACY_ADVISOR) {
                    arrayList2.add(obj);
                }
            }
            immutableList = arrayList2;
        }
        Ordering ordering2 = qzo.a;
        immutableList.getClass();
        ordering2.getClass();
        ImmutableList immutableListImmutableSortedCopy = new qzn(ordering2).immutableSortedCopy(immutableList);
        immutableListImmutableSortedCopy.getClass();
        ArrayList arrayList3 = new ArrayList(yfm.z(immutableListImmutableSortedCopy, 10));
        Iterator it2 = immutableListImmutableSortedCopy.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new rdh((rfc) it2.next()));
        }
        ysxVarArr[2] = new qzm(arrayList3, iA2, rzyVar);
        this.b = new ipi(new ysx[]{isvVar, yvcVar, new isv(ysxVarArr, 4)}, new qzk(this, null), 20);
    }

    @Override // defpackage.qxs
    public final void a(vrk vrkVar) {
        vrkVar.getClass();
        this.j.e(vrkVar.d ? this.g : new vqu((List) null, 3));
    }
}
