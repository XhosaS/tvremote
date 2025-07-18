package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zb {
    public final yo a;
    public final yo d;
    final ArrayList f;
    public zs g;
    private final yx h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public zb(yo yoVar) {
        new ArrayList();
        this.g = null;
        this.h = new yx();
        this.f = new ArrayList();
        this.a = yoVar;
        this.d = yoVar;
    }

    private final void f(zn znVar, int i, ArrayList arrayList) {
        zc zcVar = znVar.i;
        for (za zaVar : zcVar.j) {
            if (zaVar instanceof zc) {
                h((zc) zaVar, i, znVar.j, arrayList, null);
            } else if (zaVar instanceof zn) {
                h(((zn) zaVar).i, i, znVar.j, arrayList, null);
            }
        }
        for (za zaVar2 : znVar.j.j) {
            if (zaVar2 instanceof zc) {
                h((zc) zaVar2, i, zcVar, arrayList, null);
            } else if (zaVar2 instanceof zn) {
                h(((zn) zaVar2).j, i, zcVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (za zaVar3 : ((zk) znVar).a.j) {
                if (zaVar3 instanceof zc) {
                    h((zc) zaVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void g(yn ynVar, int i, int i2, int i3, int i4) {
        yx yxVar = this.h;
        yxVar.i = i;
        yxVar.j = i3;
        yxVar.a = i2;
        yxVar.b = i4;
        this.g.a(ynVar, yxVar);
        ynVar.B(yxVar.c);
        ynVar.x(yxVar.d);
        ynVar.G = yxVar.f;
        ynVar.u(yxVar.e);
    }

    private final void h(zc zcVar, int i, zc zcVar2, ArrayList arrayList, zj zjVar) {
        zn znVar = zcVar.d;
        if (znVar.e == null) {
            yo yoVar = this.a;
            if (znVar == yoVar.h || znVar == yoVar.i) {
                return;
            }
            if (zjVar == null) {
                zjVar = new zj(znVar);
                arrayList.add(zjVar);
            }
            zj zjVar2 = zjVar;
            znVar.e = zjVar2;
            zjVar2.c.add(znVar);
            zc zcVar3 = znVar.i;
            for (za zaVar : zcVar3.j) {
                if (zaVar instanceof zc) {
                    h((zc) zaVar, i, zcVar2, arrayList, zjVar2);
                }
            }
            zc zcVar4 = znVar.j;
            for (za zaVar2 : zcVar4.j) {
                if (zaVar2 instanceof zc) {
                    h((zc) zaVar2, i, zcVar2, arrayList, zjVar2);
                }
            }
            if (i == 1 && (znVar instanceof zk)) {
                for (za zaVar3 : ((zk) znVar).a.j) {
                    if (zaVar3 instanceof zc) {
                        h((zc) zaVar3, 1, zcVar2, arrayList, zjVar2);
                    }
                }
            }
            Iterator it = zcVar3.k.iterator();
            while (it.hasNext()) {
                h((zc) it.next(), i, zcVar2, arrayList, zjVar2);
            }
            Iterator it2 = zcVar4.k.iterator();
            while (it2.hasNext()) {
                h((zc) it2.next(), i, zcVar2, arrayList, zjVar2);
            }
            if (i == 1 && (znVar instanceof zk)) {
                Iterator it3 = ((zk) znVar).a.k.iterator();
                while (it3.hasNext()) {
                    h((zc) it3.next(), 1, zcVar2, arrayList, zjVar2);
                }
            }
        }
    }

    public final int a(yo yoVar, int i) {
        ArrayList arrayList;
        long jA;
        yo yoVar2 = yoVar;
        int i2 = i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i3 = 0;
        long j = 0;
        long jMax = 0;
        while (i3 < size) {
            zj zjVar = (zj) arrayList2.get(i3);
            zn znVar = zjVar.b;
            if (!(znVar instanceof yz) ? !(i2 != 0 ? (znVar instanceof zk) : (znVar instanceof zi)) : ((yz) znVar).g != i2) {
                zc zcVar = i2 == 0 ? yoVar2.h.i : yoVar2.i.i;
                zc zcVar2 = i2 == 0 ? yoVar2.h.j : yoVar2.i.j;
                boolean zContains = znVar.i.k.contains(zcVar);
                boolean zContains2 = zjVar.b.j.k.contains(zcVar2);
                long jA2 = zjVar.b.a();
                if (zContains && zContains2) {
                    long jB = zjVar.b(zjVar.b.i, j);
                    long jA3 = zjVar.a(zjVar.b.j, j);
                    long j2 = jB - jA2;
                    zn znVar2 = zjVar.b;
                    long j3 = znVar2.j.e;
                    arrayList = arrayList2;
                    if (j2 >= (-r15)) {
                        j2 += j3;
                    }
                    long j4 = znVar2.i.e;
                    long j5 = ((-jA3) - jA2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    yn ynVar = znVar2.d;
                    float f = i == 0 ? ynVar.af : ynVar.ag;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j5 / f) + (j2 / f2)) : 0L;
                    jA = (j4 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    if (zContains) {
                        jA = Math.max(zjVar.b(zjVar.b.i, r0.e), zjVar.b.i.e + jA2);
                    } else if (zContains2) {
                        jA = Math.max(-zjVar.a(zjVar.b.j, r0.e), (-zjVar.b.j.e) + jA2);
                    } else {
                        jA = (r0.i.e + zjVar.b.a()) - zjVar.b.j.e;
                    }
                }
            } else {
                arrayList = arrayList2;
                jA = j;
            }
            jMax = Math.max(jMax, jA);
            i3++;
            yoVar2 = yoVar;
            i2 = i;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        yo yoVar = this.d;
        yoVar.h.d();
        yoVar.i.d();
        arrayList.add(yoVar.h);
        arrayList.add(yoVar.i);
        ArrayList arrayList2 = yoVar.aJ;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            yn ynVar = (yn) arrayList2.get(i);
            if (ynVar instanceof yr) {
                arrayList.add(new zg(ynVar));
            } else {
                if (ynVar.H()) {
                    if (ynVar.f == null) {
                        ynVar.f = new yz(ynVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ynVar.f);
                } else {
                    arrayList.add(ynVar.h);
                }
                if (ynVar.I()) {
                    if (ynVar.g == null) {
                        ynVar.g = new yz(ynVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ynVar.g);
                } else {
                    arrayList.add(ynVar.i);
                }
                if (ynVar instanceof ys) {
                    arrayList.add(new zh(ynVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zn) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zn znVar = (zn) arrayList.get(i3);
            if (znVar.d != yoVar) {
                znVar.b();
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        zj.a = 0;
        yo yoVar2 = this.a;
        f(yoVar2.h, 0, arrayList3);
        f(yoVar2.i, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        zd zdVar;
        ArrayList arrayList = this.a.aJ;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yn ynVar = (yn) arrayList.get(i2);
            if (!ynVar.e) {
                int[] iArr = ynVar.ar;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = ynVar.t;
                int i6 = ynVar.u;
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
                zd zdVar2 = ynVar.h.f;
                boolean z3 = zdVar2.i;
                zd zdVar3 = ynVar.i.f;
                boolean z4 = zdVar3.i;
                if (z3 && z4) {
                    g(ynVar, 1, zdVar2.f, 1, zdVar3.f);
                    ynVar.e = true;
                } else if (z3 && z2) {
                    g(ynVar, 1, zdVar2.f, 2, zdVar3.f);
                    if (i4 == 3) {
                        ynVar.i.f.m = ynVar.g();
                    } else {
                        ynVar.i.f.c(ynVar.g());
                        ynVar.e = true;
                    }
                } else if (z4 && z) {
                    g(ynVar, 2, zdVar2.f, 1, zdVar3.f);
                    if (i == 3) {
                        ynVar.h.f.m = ynVar.h();
                    } else {
                        ynVar.h.f.c(ynVar.h());
                        ynVar.e = true;
                    }
                }
                if (ynVar.e && (zdVar = ynVar.i.b) != null) {
                    zdVar.c(ynVar.ac);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb.d(boolean, int):boolean");
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
    public final void e(defpackage.yo r21) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb.e(yo):void");
    }
}
