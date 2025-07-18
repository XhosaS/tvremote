package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcy extends baw {
    public static final yvc k = yvd.a(bhj.a);
    private static final AtomicReference s = new AtomicReference(false);
    public long a;
    public final bah b;
    public final Object c;
    public yqe d;
    public Throwable e;
    public final bfz f;
    public final List g;
    public Set h;
    public yoe i;
    public boolean j;
    public final yvc l;
    public kk m;
    public final ki n;
    public final ki o;
    public final ki p;
    public final bhi q;
    public final bdi r;
    private final List t;
    private List u;
    private final List v;
    private List w;
    private final yil x;
    private final yqg y;
    private cb z;

    public bcy(yil yilVar) {
        bah bahVar = new bah(new awa(this, 12));
        this.b = bahVar;
        this.c = new Object();
        this.t = new ArrayList();
        this.m = new kk((byte[]) null);
        this.f = new bfz(new baz[16], 0);
        this.v = new ArrayList();
        this.g = new ArrayList();
        this.n = new ki((byte[]) null);
        this.q = new bhi((byte[]) null);
        long[] jArr = kj.a;
        this.o = new ki((byte[]) null);
        this.p = new ki((byte[]) null);
        this.l = yvd.a(bcu.c);
        new ivx();
        yqg yqgVar = new yqg((yqe) yilVar.get(yqe.c));
        yqgVar.r(new bap(this, 5));
        this.y = yqgVar;
        this.x = yilVar.plus(bahVar).plus(yqgVar);
        this.r = new bdi();
    }

    public static final void E(bin binVar) {
        try {
            if (binVar.c() instanceof biv) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            binVar.d();
        }
    }

    private static final void G(bcy bcyVar, bca bcaVar, bca bcaVar2) {
        List list = bcaVar2.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bca bcaVar3 = (bca) list.get(i);
                bhi bhiVar = bcyVar.q;
                bbz bbzVar = bcaVar3.a;
                bhi bhiVar2 = new bhi(bcaVar3, bcaVar);
                bfv.b((ki) bhiVar.a, bbzVar, bhiVar2);
                bfv.b((ki) bhiVar.b, bhiVar2.b, bbzVar);
                G(bcyVar, bcaVar, bcaVar3);
            }
        }
    }

    private final boolean H() {
        return this.f.b != 0 || y() || this.n.d();
    }

    private static final void I(List list, bcy bcyVar, baz bazVar) {
        list.clear();
        synchronized (bcyVar.c) {
            Iterator it = bcyVar.g.iterator();
            while (it.hasNext()) {
                bca bcaVar = (bca) it.next();
                if (yks.e(bcaVar.g, bazVar)) {
                    list.add(bcaVar);
                    it.remove();
                }
            }
        }
    }

    private final void J(baz bazVar) {
        if (this.t.remove(bazVar)) {
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Throwable th, baz bazVar) throws Throwable {
        if (!((Boolean) s.get()).booleanValue() || (th instanceof bal)) {
            synchronized (this.c) {
                cb cbVar = this.z;
                if (cbVar != null) {
                    throw ((Throwable) cbVar.a);
                }
                this.z = new cb(th, (byte[]) null);
            }
            throw th;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.v.clear();
            this.f.h();
            this.m = new kk((byte[]) null);
            this.g.clear();
            this.n.i();
            this.o.i();
            this.z = new cb(th, (byte[]) null);
            if (bazVar != null) {
                B(bazVar);
            }
            v();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object[]] */
    public final boolean A() {
        boolean zH;
        AtomicReference atomicReference;
        Object obj;
        bgb bgbVarAI;
        synchronized (this.c) {
            if (this.m.b()) {
                return H();
            }
            List listU = u();
            bgb bgbVar = new bgb(this.m);
            this.m = new kk((byte[]) null);
            try {
                int size = listU.size();
                for (int i = 0; i < size; i++) {
                    baz bazVar = (baz) listU.get(i);
                    do {
                        atomicReference = bazVar.a;
                        obj = atomicReference.get();
                        if (obj == null || yks.e(obj, bba.a)) {
                            bgbVarAI = bgbVar;
                        } else if (obj instanceof Set) {
                            bgbVarAI = new Set[]{obj, bgbVar};
                        } else {
                            if (!(obj instanceof Object[])) {
                                AtomicReference atomicReference2 = bazVar.a;
                                Objects.toString(atomicReference2);
                                throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference2.toString()));
                            }
                            bgbVarAI = yfm.aI((Set[]) obj, bgbVar);
                        }
                    } while (!a.t(atomicReference, obj, bgbVarAI));
                    if (obj == null) {
                        synchronized (bazVar.b) {
                            bazVar.m();
                        }
                    }
                    if (((bcu) this.l.d()).compareTo(bcu.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (v() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zH = H();
                }
                return zH;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.m.k(bgbVar);
                    throw th;
                }
            }
        }
    }

    public final void B(baz bazVar) {
        List arrayList = this.w;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.w = arrayList;
        }
        if (!arrayList.contains(bazVar)) {
            arrayList.add(bazVar);
        }
        J(bazVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:126|(1:128)(1:129)|(11:(36:131|(1:133)|134|(1:136)|137|(1:139)(1:140)|(1:142)|145|295|146|147|(4:149|(1:151)|152|(1:154))|155|283|156|271|157|265|158|159|261|160|161|259|162|163|257|164|165|263|166|269|167|279|168|169)(1:143)|257|164|165|263|166|269|167|279|168|169)|144|145|295|146|147|(0)|155|283|156|271|157|265|158|159|261|160|161|259|162|163) */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0428, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x042a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x042b, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a7, code lost:
    
        r0 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ac, code lost:
    
        if (r2 >= r0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b6, code lost:
    
        if (((defpackage.yfw) r10.get(r2)).b == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bb, code lost:
    
        r0 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
    
        if (r4 >= r2) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cb, code lost:
    
        r11 = (defpackage.yfw) r10.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d3, code lost:
    
        if (r11.b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d5, code lost:
    
        r11 = (defpackage.bca) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01db, code lost:
    
        if (r11 == null) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01dd, code lost:
    
        r0.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e0, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e3, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e4, code lost:
    
        defpackage.yfm.I(r1.g, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e9, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ea, code lost:
    
        r0 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f8, code lost:
    
        if (r4 >= r2) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fa, code lost:
    
        r9 = r10.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0203, code lost:
    
        if (((defpackage.yfw) r9).b == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0205, code lost:
    
        r0.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0208, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020b, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0358 A[Catch: all -> 0x047d, TryCatch #9 {all -> 0x047d, blocks: (B:115:0x02bd, B:170:0x0410, B:124:0x02d3, B:125:0x02d6, B:126:0x02d7, B:128:0x02e0, B:131:0x02e7, B:133:0x02f2, B:134:0x02f7, B:136:0x02fe, B:137:0x0303, B:139:0x0315, B:144:0x0335, B:145:0x0337, B:147:0x034f, B:149:0x0358, B:151:0x0360, B:152:0x036c, B:154:0x0374, B:155:0x0384, B:169:0x040d, B:196:0x0449, B:197:0x044c, B:199:0x044e, B:200:0x0451, B:140:0x0323, B:129:0x02e3, B:205:0x0458, B:146:0x0344), top: B:274:0x02bd, inners: #21 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List C(java.util.List r29, defpackage.kk r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcy.C(java.util.List, kk):java.util.List");
    }

    @Override // defpackage.baw
    public final long a() {
        return 1000L;
    }

    @Override // defpackage.baw
    public final bav b() {
        return null;
    }

    @Override // defpackage.baw
    public final yil c() {
        return this.x;
    }

    @Override // defpackage.baw
    public final void d(bca bcaVar) {
        yoe yoeVarV;
        synchronized (this.c) {
            bfv.b(this.n, bcaVar.a, bcaVar);
            if (bcaVar.f != null) {
                G(this, bcaVar, bcaVar);
            }
            yoeVarV = v();
        }
        if (yoeVarV != null) {
            yoeVarV.resumeWith(ygi.a);
        }
    }

    public final Object e(yih yihVar) throws Throwable {
        Object objL = ykr.l(this.b, new bcv(this, new bcx(this, null), bcm.c(yihVar.getContext()), null), yihVar);
        yio yioVar = yio.a;
        if (objL != yioVar) {
            objL = ygi.a;
        }
        return objL == yioVar ? objL : ygi.a;
    }

    @Override // defpackage.baw
    public final boolean k() {
        return ((Boolean) s.get()).booleanValue();
    }

    @Override // defpackage.baw
    public final boolean l() {
        return false;
    }

    @Override // defpackage.baw
    public final boolean m() {
        return false;
    }

    @Override // defpackage.baw
    public final void o(baz bazVar, yjz yjzVar) throws Throwable {
        boolean zO = bazVar.o();
        try {
            int i = 0;
            bin binVarB = bcm.B(new bap(bazVar, 4), new bct(bazVar, (Object) null, i));
            try {
                bit bitVarW = binVarB.w();
                try {
                    synchronized (bazVar.b) {
                        bazVar.l();
                        ki kiVarP = bazVar.p();
                        try {
                            bas basVar = bazVar.h;
                            if (!basVar.d.cD()) {
                                bau.i("Expected applyChanges() to have been called");
                            }
                            try {
                                basVar.al(kiVarP, yjzVar);
                            } finally {
                                basVar.B = null;
                            }
                        } catch (Throwable th) {
                            bazVar.l = kiVarP;
                            throw th;
                        }
                    }
                    if (!zO) {
                        bcm.v();
                    }
                    synchronized (this.c) {
                        if (((bcu) this.l.d()).compareTo(bcu.b) > 0 && !u().contains(bazVar)) {
                            this.t.add(bazVar);
                            this.u = null;
                        }
                    }
                    try {
                        synchronized (this.c) {
                            List list = this.g;
                            int size = list.size();
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (yks.e(((bca) list.get(i)).g, bazVar)) {
                                    ArrayList arrayList = new ArrayList();
                                    I(arrayList, this, bazVar);
                                    while (!arrayList.isEmpty()) {
                                        C(arrayList, null);
                                        I(arrayList, this, bazVar);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        try {
                            bazVar.g();
                            bazVar.h();
                            if (zO) {
                                return;
                            }
                            bcm.v();
                        } catch (Throwable th2) {
                            K(th2, null);
                        }
                    } catch (Throwable th3) {
                        K(th3, bazVar);
                    }
                } catch (Throwable th4) {
                    try {
                        Set set = bazVar.c;
                        if (!set.isEmpty()) {
                            bhx bhxVar = bazVar.g;
                            try {
                                bhxVar.g(set, bazVar.h.R());
                                bhxVar.b();
                                bhxVar.a();
                            } catch (Throwable th5) {
                                bhxVar.a();
                                throw th5;
                            }
                        }
                        throw th4;
                    } finally {
                    }
                }
            } finally {
                E(binVarB);
            }
        } catch (Throwable th6) {
            K(th6, bazVar);
        }
    }

    @Override // defpackage.baw
    public final void p(baz bazVar) {
        yoe yoeVarV;
        synchronized (this.c) {
            bfz bfzVar = this.f;
            if (bfzVar.m(bazVar)) {
                yoeVarV = null;
            } else {
                bfzVar.o(bazVar);
                yoeVarV = v();
            }
        }
        if (yoeVarV != null) {
            yoeVarV.resumeWith(ygi.a);
        }
    }

    @Override // defpackage.baw
    public final void q(baz bazVar) {
        synchronized (this.c) {
            Set linkedHashSet = this.h;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.h = linkedHashSet;
            }
            linkedHashSet.add(bazVar);
        }
    }

    @Override // defpackage.baw
    public final void r(baz bazVar) {
        synchronized (this.c) {
            J(bazVar);
            this.f.n(bazVar);
            this.v.remove(bazVar);
        }
    }

    @Override // defpackage.baw
    public final cb s(bca bcaVar) {
        cb cbVar;
        synchronized (this.c) {
            cbVar = (cb) this.o.g(bcaVar);
        }
        return cbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Comparable] */
    @Override // defpackage.baw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.bca r19, defpackage.cb r20, defpackage.bad r21) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcy.t(bca, cb, bad):void");
    }

    public final List u() {
        List list = this.u;
        if (list != null) {
            return list;
        }
        List list2 = this.t;
        List arrayList = list2.isEmpty() ? yhb.a : new ArrayList(list2);
        this.u = arrayList;
        return arrayList;
    }

    public final yoe v() {
        bcu bcuVar;
        yvc yvcVar = this.l;
        if (((bcu) yvcVar.d()).compareTo(bcu.b) <= 0) {
            this.t.clear();
            this.u = yhb.a;
            this.m = new kk((byte[]) null);
            this.f.h();
            this.v.clear();
            this.g.clear();
            this.w = null;
            yoe yoeVar = this.i;
            if (yoeVar != null) {
                yoeVar.e(null);
            }
            this.i = null;
            this.z = null;
            return null;
        }
        if (this.z != null) {
            bcuVar = bcu.c;
        } else if (this.d == null) {
            this.m = new kk((byte[]) null);
            this.f.h();
            bcuVar = y() ? bcu.d : bcu.c;
        } else {
            bcuVar = (this.f.b == 0 && !this.m.c() && this.v.isEmpty() && this.g.isEmpty() && !y() && !this.n.d()) ? bcu.e : bcu.f;
        }
        yvcVar.e(bcuVar);
        if (bcuVar != bcu.f) {
            return null;
        }
        yoe yoeVar2 = this.i;
        this.i = null;
        return yoeVar2;
    }

    public final void w() {
        synchronized (this.c) {
            yvc yvcVar = this.l;
            if (((bcu) yvcVar.d()).compareTo(bcu.e) >= 0) {
                yvcVar.e(bcu.b);
            }
        }
        this.y.t(null);
    }

    public final void x() {
        synchronized (this.c) {
            this.j = true;
        }
    }

    public final boolean y() {
        return !this.j && (this.b.a.get() & 134217727) > 0;
    }

    public final boolean z() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.m.c() && this.f.b == 0) {
                if (!y()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.baw
    public final void g(Set set) {
    }
}
