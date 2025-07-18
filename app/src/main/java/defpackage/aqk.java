package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aqk implements apv {
    public static final aqj a = new aqd();
    public static final aqj b = new aqe();
    public static final aqj c = new aqf();
    public static final aqj d = new aqg();
    public static final aqj e = new aqh();
    public static final aqj f = new aqb();
    public float g;
    public float h;
    public boolean i;
    final Object j;
    final aql k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public final ArrayList p;
    public final ArrayList q;
    private long r;

    public aqk(aqm aqmVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = null;
        this.k = new aqc(aqmVar);
        this.o = 1.0f;
    }

    private static void d(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.apv
    public final void a(long j) {
        long j2 = this.r;
        if (j2 == 0) {
            this.r = j;
            b(this.h);
            return;
        }
        long j3 = j - j2;
        this.r = j;
        float f2 = aqa.a().f;
        boolean zC = c(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float fMin = Math.min(this.h, this.m);
        this.h = fMin;
        float fMax = Math.max(fMin, this.n);
        this.h = fMax;
        b(fMax);
        if (!zC) {
            return;
        }
        this.l = false;
        aqa aqaVarA = aqa.a();
        aqaVarA.a.remove(this);
        ArrayList arrayList = aqaVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            aqaVarA.e = true;
        }
        this.r = 0L;
        this.i = false;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p;
            if (i >= arrayList2.size()) {
                d(arrayList2);
                return;
            }
            if (arrayList2.get(i) != null) {
                but butVar = (but) arrayList2.get(i);
                float f3 = this.h;
                buu buuVar = butVar.a;
                if (f3 < 1.0f) {
                    bvc bvcVar = buuVar.h;
                    long j4 = bvcVar.r;
                    bvc bvcVarF = ((bvk) bvcVar).f(0);
                    bvc bvcVar2 = bvcVarF.n;
                    bvcVarF.n = null;
                    bvcVar.y(-1L, buuVar.a);
                    bvcVar.y(j4, -1L);
                    buuVar.a = j4;
                    Runnable runnable = buuVar.g;
                    if (runnable != null) {
                        runnable.run();
                    }
                    bvcVar.o.clear();
                    if (bvcVar2 != null) {
                        bvcVar2.t(bvcVar2, bvb.b, true);
                    }
                } else {
                    bvc bvcVar3 = buuVar.h;
                    bvcVar3.t(bvcVar3, bvb.b, false);
                }
            }
            i++;
        }
    }

    final void b(float f2) {
        this.k.b(this.j, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.q;
            if (i >= arrayList.size()) {
                d(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((buu) arrayList.get(i)).j(this.h);
                }
                i++;
            }
        }
    }

    public abstract boolean c(long j);

    public aqk(Object obj, aql aqlVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = obj;
        this.k = aqlVar;
        float f2 = 0.1f;
        if (aqlVar != c && aqlVar != d && aqlVar != e) {
            if (aqlVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (aqlVar != a && aqlVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
    }
}
