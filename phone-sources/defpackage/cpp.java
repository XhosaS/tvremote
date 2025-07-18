package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpp {
    public final cpe a;
    public final cpe d;
    final ArrayList f;
    public cqf g;
    private final cpm h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public cpp(cpe cpeVar) {
        new ArrayList();
        this.g = null;
        this.h = new cpm();
        this.f = new ArrayList();
        this.a = cpeVar;
        this.d = cpeVar;
    }

    private final void e(cpz cpzVar, int i, ArrayList arrayList) {
        cpq cpqVar = cpzVar.i;
        for (cpo cpoVar : cpqVar.j) {
            if (cpoVar instanceof cpq) {
                g((cpq) cpoVar, i, cpzVar.j, arrayList, null);
            } else if (cpoVar instanceof cpz) {
                g(((cpz) cpoVar).i, i, cpzVar.j, arrayList, null);
            }
        }
        for (cpo cpoVar2 : cpzVar.j.j) {
            if (cpoVar2 instanceof cpq) {
                g((cpq) cpoVar2, i, cpqVar, arrayList, null);
            } else if (cpoVar2 instanceof cpz) {
                g(((cpz) cpoVar2).j, i, cpqVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (cpo cpoVar3 : ((cpx) cpzVar).a.j) {
                if (cpoVar3 instanceof cpq) {
                    g((cpq) cpoVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(cpd cpdVar, int i, int i2, int i3, int i4) {
        cpm cpmVar = this.h;
        cpmVar.i = i;
        cpmVar.j = i3;
        cpmVar.a = i2;
        cpmVar.b = i4;
        this.g.a(cpdVar, cpmVar);
        cpdVar.E(cpmVar.c);
        cpdVar.z(cpmVar.d);
        cpdVar.G = cpmVar.f;
        cpdVar.w(cpmVar.e);
    }

    private final void g(cpq cpqVar, int i, cpq cpqVar2, ArrayList arrayList, cpw cpwVar) {
        cpz cpzVar = cpqVar.d;
        if (cpzVar.e == null) {
            cpe cpeVar = this.a;
            if (cpzVar == cpeVar.h || cpzVar == cpeVar.i) {
                return;
            }
            if (cpwVar == null) {
                cpwVar = new cpw(cpzVar);
                arrayList.add(cpwVar);
            }
            cpw cpwVar2 = cpwVar;
            cpzVar.e = cpwVar2;
            ((ArrayList) cpwVar2.c).add(cpzVar);
            cpq cpqVar3 = cpzVar.i;
            for (cpo cpoVar : cpqVar3.j) {
                if (cpoVar instanceof cpq) {
                    g((cpq) cpoVar, i, cpqVar2, arrayList, cpwVar2);
                }
            }
            cpq cpqVar4 = cpzVar.j;
            for (cpo cpoVar2 : cpqVar4.j) {
                if (cpoVar2 instanceof cpq) {
                    g((cpq) cpoVar2, i, cpqVar2, arrayList, cpwVar2);
                }
            }
            if (i == 1 && (cpzVar instanceof cpx)) {
                for (cpo cpoVar3 : ((cpx) cpzVar).a.j) {
                    if (cpoVar3 instanceof cpq) {
                        g((cpq) cpoVar3, 1, cpqVar2, arrayList, cpwVar2);
                    }
                }
            }
            Iterator it = cpqVar3.k.iterator();
            while (it.hasNext()) {
                g((cpq) it.next(), i, cpqVar2, arrayList, cpwVar2);
            }
            Iterator it2 = cpqVar4.k.iterator();
            while (it2.hasNext()) {
                g((cpq) it2.next(), i, cpqVar2, arrayList, cpwVar2);
            }
            if (i == 1 && (cpzVar instanceof cpx)) {
                Iterator it3 = ((cpx) cpzVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((cpq) it3.next(), 1, cpqVar2, arrayList, cpwVar2);
                }
            }
        }
    }

    public final int a(cpe cpeVar, int i) {
        ArrayList arrayList;
        long jA;
        cpe cpeVar2 = cpeVar;
        int i2 = i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i3 = 0;
        long j = 0;
        long jMax = 0;
        while (i3 < size) {
            cpw cpwVar = (cpw) arrayList2.get(i3);
            Object obj = cpwVar.b;
            if (!(obj instanceof cpn) ? !(i2 != 0 ? (obj instanceof cpx) : (obj instanceof cpv)) : ((cpn) obj).g != i2) {
                cpq cpqVar = i2 == 0 ? cpeVar2.h.i : cpeVar2.i.i;
                cpq cpqVar2 = i2 == 0 ? cpeVar2.h.j : cpeVar2.i.j;
                boolean zContains = ((cpz) obj).i.k.contains(cpqVar);
                boolean zContains2 = ((cpz) cpwVar.b).j.k.contains(cpqVar2);
                long jA2 = ((cpz) cpwVar.b).a();
                if (zContains && zContains2) {
                    long jB = cpwVar.b(((cpz) cpwVar.b).i, j);
                    long jA3 = cpwVar.a(((cpz) cpwVar.b).j, j);
                    long j2 = jB - jA2;
                    cpz cpzVar = (cpz) cpwVar.b;
                    long j3 = cpzVar.j.e;
                    arrayList = arrayList2;
                    if (j2 >= (-r15)) {
                        j2 += j3;
                    }
                    long j4 = cpzVar.i.e;
                    long j5 = ((-jA3) - jA2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    cpd cpdVar = cpzVar.d;
                    float f = i == 0 ? cpdVar.af : cpdVar.ag;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j5 / f) + (j2 / f2)) : 0L;
                    jA = (j4 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    if (zContains) {
                        jA = Math.max(cpwVar.b(((cpz) cpwVar.b).i, r0.e), ((cpz) cpwVar.b).i.e + jA2);
                    } else if (zContains2) {
                        jA = Math.max(-cpwVar.a(((cpz) cpwVar.b).j, r0.e), (-((cpz) cpwVar.b).j.e) + jA2);
                    } else {
                        jA = (r0.i.e + ((cpz) cpwVar.b).a()) - ((cpz) cpwVar.b).j.e;
                    }
                }
            } else {
                arrayList = arrayList2;
                jA = j;
            }
            jMax = Math.max(jMax, jA);
            i3++;
            cpeVar2 = cpeVar;
            i2 = i;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        cpe cpeVar = this.d;
        cpeVar.h.d();
        cpeVar.i.d();
        arrayList.add(cpeVar.h);
        arrayList.add(cpeVar.i);
        ArrayList arrayList2 = cpeVar.aJ;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            cpd cpdVar = (cpd) arrayList2.get(i);
            if (cpdVar instanceof cph) {
                arrayList.add(new cpt(cpdVar));
            } else {
                if (cpdVar.J()) {
                    if (cpdVar.f == null) {
                        cpdVar.f = new cpn(cpdVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(cpdVar.f);
                } else {
                    arrayList.add(cpdVar.h);
                }
                if (cpdVar.K()) {
                    if (cpdVar.g == null) {
                        cpdVar.g = new cpn(cpdVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(cpdVar.g);
                } else {
                    arrayList.add(cpdVar.i);
                }
                if (cpdVar instanceof cpi) {
                    arrayList.add(new cpu(cpdVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cpz) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cpz cpzVar = (cpz) arrayList.get(i3);
            if (cpzVar.d != cpeVar) {
                cpzVar.b();
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        cpw.a = 0;
        cpe cpeVar2 = this.a;
        e(cpeVar2.h, 0, arrayList3);
        e(cpeVar2.i, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        cpr cprVar;
        ArrayList arrayList = this.a.aJ;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cpd cpdVar = (cpd) arrayList.get(i2);
            if (!cpdVar.e) {
                int[] iArr = cpdVar.ar;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = cpdVar.t;
                int i6 = cpdVar.u;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                cpr cprVar2 = cpdVar.h.f;
                boolean z3 = cprVar2.i;
                cpr cprVar3 = cpdVar.i.f;
                boolean z4 = cprVar3.i;
                if (z3 && z4) {
                    f(cpdVar, 1, cprVar2.f, 1, cprVar3.f);
                    cpdVar.e = true;
                } else if (z3 && z2) {
                    f(cpdVar, 1, cprVar2.f, 2, cprVar3.f);
                    if (i4 == 3) {
                        cpdVar.i.f.m = cpdVar.h();
                    } else {
                        cpdVar.i.f.c(cpdVar.h());
                        cpdVar.e = true;
                    }
                } else if (z4 && z) {
                    f(cpdVar, 2, cprVar2.f, 1, cprVar3.f);
                    if (i == 3) {
                        cpdVar.h.f.m = cpdVar.j();
                    } else {
                        cpdVar.h.f.c(cpdVar.j());
                        cpdVar.e = true;
                    }
                }
                if (cpdVar.e && (cprVar = cpdVar.i.b) != null) {
                    cprVar.c(cpdVar.ac);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.cpe r21) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpp.d(cpe):void");
    }
}
