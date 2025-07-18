package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yug extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final Logger a = Logger.getLogger(yug.class.getName());
    static final ytv b = new ysn();
    static final Queue c = new yso();
    public static final /* synthetic */ int x = 0;
    final int d;
    final int e;
    final ytm[] f;
    final int g;
    final yqg h;
    final yqg i;
    final yto j;
    final yto k;
    final long l;
    final long m;
    final long n;
    final Queue o;
    final yrx p;
    final yta q;
    public final ysk r;
    Set s;
    Collection t;
    Set u;
    final ysg v;
    final ysf w;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, yug] */
    public yug(ysh yshVar, ysk yskVar) {
        ?? abstractMap = new AbstractMap();
        int i = yshVar.d;
        abstractMap.g = Math.min(i == -1 ? 4 : i, 65536);
        yto ytoVarB = yshVar.b();
        abstractMap.j = ytoVarB;
        abstractMap.k = yshVar.c();
        abstractMap.h = (yqg) yqr.c(yshVar.k, yshVar.b().a());
        abstractMap.i = (yqg) yqr.c(yshVar.l, yshVar.c().a());
        long j = (yshVar.i == 0 || yshVar.j == 0) ? 0L : yshVar.o == null ? yshVar.e : yshVar.f;
        abstractMap.l = j;
        abstractMap.v = (ysg) yqr.c(yshVar.o, ysg.a);
        long j2 = yshVar.j;
        abstractMap.m = j2 == -1 ? 0L : j2;
        long j3 = yshVar.i;
        abstractMap.n = j3 != -1 ? j3 : 0L;
        ysf ysfVar = yshVar.p;
        ysf ysfVar2 = ysf.a;
        ysf ysfVar3 = (ysf) yqr.c(ysfVar, ysfVar2);
        abstractMap.w = ysfVar3;
        abstractMap.o = ysfVar3 == ysfVar2 ? c : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.n() || abstractMap.k();
        yrx yrxVar = yshVar.m;
        abstractMap.p = yrxVar == null ? z ? yrx.b : ysh.b : yrxVar;
        char c2 = (abstractMap.o() || abstractMap.k()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.l() || abstractMap.n();
        yta ytaVar = yta.a;
        abstractMap.q = yta.i[(ytoVarB != yto.WEAK ? (char) 0 : (char) 4) | c2 | (true != z2 ? 0 : 2)];
        abstractMap.r = yskVar;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.j() && !abstractMap.i()) {
            iMin = (int) Math.min(iMin, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.j() || i5 * 20 <= abstractMap.l)) {
            i4++;
            i5 += i5;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new ytm[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (abstractMap.j()) {
            long j4 = i5;
            long j5 = abstractMap.l;
            long j6 = (j5 / j4) + 1;
            long j7 = j5 % j4;
            while (true) {
                ytm[] ytmVarArr = abstractMap.f;
                if (i2 >= ytmVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                ytmVarArr[i2] = new ytm(abstractMap, i3, j8, (ysc) ((yrt) yshVar.n).a);
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            yug yugVar = abstractMap;
            while (true) {
                ytm[] ytmVarArr2 = yugVar.f;
                if (i2 >= ytmVarArr2.length) {
                    return;
                }
                ytmVarArr2[i2] = new ytm(yugVar, i7, -1L, (ysc) ((yrt) yshVar.n).a);
                i2++;
                yugVar = this;
            }
        }
    }

    static void e(yuh yuhVar, yuh yuhVar2) {
        yuhVar.l(yuhVar2);
        yuhVar2.n(yuhVar);
    }

    static void f(yuh yuhVar, yuh yuhVar2) {
        yuhVar.m(yuhVar2);
        yuhVar2.o(yuhVar);
    }

    static void g(yuh yuhVar) {
        ytl ytlVar = ytl.a;
        yuhVar.l(ytlVar);
        yuhVar.n(ytlVar);
    }

    static void h(yuh yuhVar) {
        ytl ytlVar = ytl.a;
        yuhVar.m(ytlVar);
        yuhVar.o(ytlVar);
    }

    final int a(Object obj) {
        int iA = this.h.a(obj);
        int i = iA + ((iA << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final long b() {
        long jMax = 0;
        for (int i = 0; i < this.f.length; i++) {
            jMax += Math.max(0, r0[i].b);
        }
        return jMax;
    }

    final ytm c(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ytm[] ytmVarArr = this.f;
        int length = ytmVarArr.length;
        for (int i = 0; i < length; i++) {
            ytm ytmVar = ytmVarArr[i];
            if (ytmVar.b != 0) {
                ytmVar.lock();
                try {
                    yug yugVar = ytmVar.a;
                    ytmVar.r(yugVar.p.a());
                    AtomicReferenceArray atomicReferenceArray = ytmVar.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (yuh yuhVarE = (yuh) atomicReferenceArray.get(i2); yuhVarE != null; yuhVarE = yuhVarE.e()) {
                            if (yuhVarE.d().f()) {
                                Object objJ = yuhVarE.j();
                                Object obj = yuhVarE.d().get();
                                yui yuiVar = (objJ == null || obj == null) ? yui.COLLECTED : yui.EXPLICIT;
                                yuhVarE.a();
                                ytmVar.w(objJ, obj, yuhVarE.d().a(), yuiVar);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (yugVar.p()) {
                        while (ytmVar.h.poll() != null) {
                        }
                    }
                    if (yugVar.q()) {
                        while (ytmVar.i.poll() != null) {
                        }
                    }
                    ytmVar.l.clear();
                    ytmVar.m.clear();
                    ytmVar.k.set(0);
                    ytmVar.d++;
                    ytmVar.b = 0;
                } finally {
                    ytmVar.unlock();
                    ytmVar.s();
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        ytm ytmVarC = c(iA);
        try {
            if (ytmVarC.b == 0) {
                return false;
            }
            yuh yuhVarC = ytmVarC.c(obj, iA, ytmVarC.a.p.a());
            if (yuhVarC == null) {
                return false;
            }
            return yuhVarC.d().get() != null;
        } finally {
            ytmVarC.n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            yrx r3 = r0.p
            ytm[] r4 = r0.f
            long r5 = r3.a()
            r7 = -1
            r3 = r2
        L13:
            r9 = 3
            if (r3 >= r9) goto L6e
            int r9 = r4.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L5f
            r13 = r4[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L52
            java.lang.Object r2 = r14.get(r15)
            yuh r2 = (defpackage.yuh) r2
        L31:
            r17 = r3
            if (r2 == 0) goto L4f
            java.lang.Object r3 = r13.f(r2, r5)
            r18 = r2
            if (r3 == 0) goto L48
            yqg r2 = r0.i
            boolean r2 = r2.c(r1, r3)
            if (r2 != 0) goto L46
            goto L48
        L46:
            r1 = 1
            return r1
        L48:
            yuh r2 = r18.e()
            r3 = r17
            goto L31
        L4f:
            int r15 = r15 + 1
            goto L25
        L52:
            r17 = r3
            int r2 = r13.d
            long r2 = (long) r2
            long r10 = r10 + r2
            int r12 = r12 + 1
            r2 = r16
            r3 = r17
            goto L1a
        L5f:
            r16 = r2
            r17 = r3
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L68
            goto L70
        L68:
            int r3 = r17 + 1
            r7 = r10
            r2 = r16
            goto L13
        L6e:
            r16 = r2
        L70:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yug.containsValue(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x021b, code lost:
    
        if (r8.d() != r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021d, code lost:
    
        r5.f();
        r3.set(r6, r4.e(r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022e, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[Catch: all -> 0x025b, ExecutionException -> 0x025d, TRY_LEAVE, TryCatch #5 {ExecutionException -> 0x025d, blocks: (B:3:0x0012, B:5:0x0016, B:7:0x001c, B:9:0x002a, B:10:0x0031, B:12:0x003b, B:13:0x0041, B:45:0x00e8, B:92:0x01c7, B:131:0x024b, B:129:0x0248, B:130:0x024a, B:33:0x00b9, B:135:0x0254, B:136:0x025a), top: B:157:0x0012, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01d3, blocks: (B:62:0x012a, B:80:0x0189, B:81:0x018c, B:84:0x01a1, B:89:0x01c2, B:95:0x01cc, B:96:0x01d2, B:99:0x01d6, B:100:0x01e3, B:63:0x0132, B:65:0x0145, B:66:0x014c, B:68:0x015e, B:71:0x016a, B:73:0x0172, B:76:0x017e, B:79:0x0183, B:83:0x0190, B:87:0x01a6, B:88:0x01ad), top: B:151:0x0128, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d6 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:62:0x012a, B:80:0x0189, B:81:0x018c, B:84:0x01a1, B:89:0x01c2, B:95:0x01cc, B:96:0x01d2, B:99:0x01d6, B:100:0x01e3, B:63:0x0132, B:65:0x0145, B:66:0x014c, B:68:0x015e, B:71:0x016a, B:73:0x0172, B:76:0x017e, B:79:0x0183, B:83:0x0190, B:87:0x01a6, B:88:0x01ad), top: B:151:0x0128, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r19, defpackage.ysk r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yug.d(java.lang.Object, ysk):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.u;
        if (set != null) {
            return set;
        }
        ytc ytcVar = new ytc(this);
        this.u = ytcVar;
        return ytcVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        ytm ytmVarC = c(iA);
        try {
            if (ytmVarC.b != 0) {
                yug yugVar = ytmVarC.a;
                long jA = yugVar.p.a();
                yuh yuhVarC = ytmVarC.c(obj, iA, jA);
                if (yuhVarC != null) {
                    Object obj3 = yuhVarC.d().get();
                    if (obj3 != null) {
                        ytmVarC.p(yuhVarC, jA);
                        yuhVarC.j();
                        ysk yskVar = yugVar.r;
                        obj2 = obj3;
                    } else {
                        ytmVarC.t();
                    }
                }
            }
            return obj2;
        } finally {
            ytmVarC.n();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    final boolean i() {
        return this.v != ysg.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        ytm[] ytmVarArr = this.f;
        long j = 0;
        for (ytm ytmVar : ytmVarArr) {
            if (ytmVar.b != 0) {
                return false;
            }
            j += r8.d;
        }
        if (j == 0) {
            return true;
        }
        for (ytm ytmVar2 : ytmVarArr) {
            if (ytmVar2.b != 0) {
                return false;
            }
            j -= r9.d;
        }
        return j == 0;
    }

    final boolean j() {
        return this.l >= 0;
    }

    final boolean k() {
        return this.m > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.s;
        if (set != null) {
            return set;
        }
        ytf ytfVar = new ytf(this);
        this.s = ytfVar;
        return ytfVar;
    }

    final boolean l() {
        return this.n > 0;
    }

    final boolean m(yuh yuhVar, long j) {
        yuhVar.getClass();
        if (!k() || j - yuhVar.b() < this.m) {
            return l() && j - yuhVar.c() >= this.n;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return l();
    }

    final boolean o() {
        return k() || j();
    }

    final boolean p() {
        return this.j != yto.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).g(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).g(obj, iA, obj2, true);
    }

    final boolean q() {
        return this.k != yto.STRONG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r7 = r4.d();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r12 = defpackage.yui.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7.f() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r12 = defpackage.yui.COLLECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r2.d++;
        r12 = r2.x(r4, r4, r5, r6, r7, r8);
        r0 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r0;
        r0 = r6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r11.a(r12)
            ytm r2 = r11.c(r1)
            r2.lock()
            yug r3 = r2.a     // Catch: java.lang.Throwable -> L7e
            yrx r4 = r3.p     // Catch: java.lang.Throwable -> L7e
            long r4 = r4.a()     // Catch: java.lang.Throwable -> L7e
            r2.r(r4)     // Catch: java.lang.Throwable -> L7e
            int r4 = r2.b     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L7e
            int r4 = r9.length()     // Catch: java.lang.Throwable -> L7e
            int r4 = r4 + (-1)
            r10 = r1 & r4
            java.lang.Object r4 = r9.get(r10)     // Catch: java.lang.Throwable -> L7e
            yuh r4 = (defpackage.yuh) r4     // Catch: java.lang.Throwable -> L7e
            r5 = r3
            r3 = r4
        L2e:
            if (r4 == 0) goto L77
            r6 = r5
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L7e
            int r7 = r4.a()     // Catch: java.lang.Throwable -> L7e
            if (r7 != r1) goto L71
            if (r5 == 0) goto L71
            yqg r7 = r6.h     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.c(r12, r5)     // Catch: java.lang.Throwable -> L7e
            if (r7 == 0) goto L71
            ytv r7 = r4.d()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L53
            yui r12 = defpackage.yui.EXPLICIT     // Catch: java.lang.Throwable -> L7e
        L51:
            r8 = r12
            goto L5c
        L53:
            boolean r12 = r7.f()     // Catch: java.lang.Throwable -> L7e
            if (r12 == 0) goto L77
            yui r12 = defpackage.yui.COLLECTED     // Catch: java.lang.Throwable -> L7e
            goto L51
        L5c:
            int r12 = r2.d     // Catch: java.lang.Throwable -> L7e
            int r12 = r12 + 1
            r2.d = r12     // Catch: java.lang.Throwable -> L7e
            yuh r12 = r2.x(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7e
            int r0 = r2.b     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L7e
            r2.b = r0     // Catch: java.lang.Throwable -> L7e
            r0 = r6
            goto L77
        L71:
            yuh r4 = r4.e()     // Catch: java.lang.Throwable -> L7e
            r5 = r6
            goto L2e
        L77:
            r2.unlock()
            r2.s()
            return r0
        L7e:
            r0 = move-exception
            r12 = r0
            r2.unlock()
            r2.s()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yug.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        ytm ytmVarC = c(iA);
        ytmVarC.lock();
        try {
            yug yugVar = ytmVarC.a;
            long jA = yugVar.p.a();
            ytmVarC.r(jA);
            AtomicReferenceArray atomicReferenceArray = ytmVarC.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            yuh yuhVar = (yuh) atomicReferenceArray.get(length);
            long j = jA;
            yuh yuhVarE = yuhVar;
            while (true) {
                obj3 = null;
                if (yuhVarE == null) {
                    break;
                }
                Object objJ = yuhVarE.j();
                if (yuhVarE.a() == iA && objJ != null && yugVar.h.c(obj, objJ)) {
                    long j2 = j;
                    ytv ytvVarD = yuhVarE.d();
                    Object obj4 = ytvVarD.get();
                    if (obj4 != null) {
                        ytmVarC.d++;
                        ytmVarC.w(obj, obj4, ytvVarD.a(), yui.REPLACED);
                        ytmVarC.y(yuhVarE, obj2, j2);
                        ytmVarC.k(yuhVarE);
                        obj3 = obj4;
                    } else if (ytvVarD.f()) {
                        int i = ytmVarC.b;
                        ytmVarC.d++;
                        yuh yuhVarX = ytmVarC.x(yuhVar, yuhVarE, objJ, null, ytvVarD, yui.COLLECTED);
                        int i2 = ytmVarC.b - 1;
                        atomicReferenceArray.set(length, yuhVarX);
                        ytmVarC.b = i2;
                    }
                } else {
                    long j3 = j;
                    yuhVarE = yuhVarE.e();
                    j = j3;
                }
            }
            return obj3;
        } finally {
            ytmVarC.unlock();
            ytmVarC.s();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ztm.d(b());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.t;
        if (collection != null) {
            return collection;
        }
        ytw ytwVar = new ytw(this);
        this.t = ytwVar;
        return ytwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r4.d();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.i.c(r13, r12) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r13 = defpackage.yui.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r6 = r12;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r12 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r7.f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r13 = defpackage.yui.COLLECTED;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r2.d++;
        r12 = r2.x(r4, r4, r5, r6, r7, r8);
        r1 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r8 != defpackage.yui.EXPLICIT) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L97
            if (r13 != 0) goto L7
            goto L97
        L7:
            int r1 = r11.a(r12)
            ytm r2 = r11.c(r1)
            r2.lock()
            yug r3 = r2.a     // Catch: java.lang.Throwable -> L8e
            yrx r4 = r3.p     // Catch: java.lang.Throwable -> L8e
            long r4 = r4.a()     // Catch: java.lang.Throwable -> L8e
            r2.r(r4)     // Catch: java.lang.Throwable -> L8e
            int r4 = r2.b     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L8e
            int r4 = r9.length()     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 + (-1)
            r10 = r1 & r4
            java.lang.Object r4 = r9.get(r10)     // Catch: java.lang.Throwable -> L8e
            yuh r4 = (defpackage.yuh) r4     // Catch: java.lang.Throwable -> L8e
            r5 = r3
            r3 = r4
        L31:
            if (r4 == 0) goto L81
            r6 = r5
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L8e
            int r7 = r4.a()     // Catch: java.lang.Throwable -> L8e
            if (r7 != r1) goto L88
            if (r5 == 0) goto L88
            yqg r7 = r6.h     // Catch: java.lang.Throwable -> L8e
            boolean r7 = r7.c(r12, r5)     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L88
            ytv r7 = r4.d()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L8e
            yqg r1 = r6.i     // Catch: java.lang.Throwable -> L8e
            boolean r13 = r1.c(r13, r12)     // Catch: java.lang.Throwable -> L8e
            if (r13 == 0) goto L5d
            yui r13 = defpackage.yui.EXPLICIT     // Catch: java.lang.Throwable -> L8e
        L5a:
            r6 = r12
            r8 = r13
            goto L69
        L5d:
            if (r12 != 0) goto L81
            boolean r12 = r7.f()     // Catch: java.lang.Throwable -> L8e
            if (r12 == 0) goto L81
            yui r13 = defpackage.yui.COLLECTED     // Catch: java.lang.Throwable -> L8e
            r12 = 0
            goto L5a
        L69:
            int r12 = r2.d     // Catch: java.lang.Throwable -> L8e
            r13 = 1
            int r12 = r12 + r13
            r2.d = r12     // Catch: java.lang.Throwable -> L8e
            yuh r12 = r2.x(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8e
            int r1 = r2.b     // Catch: java.lang.Throwable -> L8e
            int r1 = r1 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L8e
            r2.b = r1     // Catch: java.lang.Throwable -> L8e
            yui r12 = defpackage.yui.EXPLICIT     // Catch: java.lang.Throwable -> L8e
            if (r8 != r12) goto L81
            r0 = r13
        L81:
            r2.unlock()
            r2.s()
            return r0
        L88:
            yuh r4 = r4.e()     // Catch: java.lang.Throwable -> L8e
            r5 = r6
            goto L31
        L8e:
            r0 = move-exception
            r12 = r0
            r2.unlock()
            r2.s()
            throw r12
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yug.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        ytm ytmVarC = c(iA);
        ytmVarC.lock();
        try {
            yug yugVar = ytmVarC.a;
            long jA = yugVar.p.a();
            ytmVarC.r(jA);
            AtomicReferenceArray atomicReferenceArray = ytmVarC.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            yuh yuhVar = (yuh) atomicReferenceArray.get(length);
            long j = jA;
            yuh yuhVarE = yuhVar;
            while (true) {
                if (yuhVarE == null) {
                    break;
                }
                Object objJ = yuhVarE.j();
                if (yuhVarE.a() == iA && objJ != null && yugVar.h.c(obj, objJ)) {
                    long j2 = j;
                    ytv ytvVarD = yuhVarE.d();
                    Object obj4 = ytvVarD.get();
                    if (obj4 == null) {
                        if (ytvVarD.f()) {
                            int i = ytmVarC.b;
                            ytmVarC.d++;
                            yuh yuhVarX = ytmVarC.x(yuhVar, yuhVarE, objJ, null, ytvVarD, yui.COLLECTED);
                            int i2 = ytmVarC.b - 1;
                            atomicReferenceArray.set(length, yuhVarX);
                            ytmVarC.b = i2;
                        }
                    } else if (yugVar.i.c(obj2, obj4)) {
                        ytmVarC.d++;
                        ytmVarC.w(obj, obj4, ytvVarD.a(), yui.REPLACED);
                        ytmVarC.y(yuhVarE, obj3, j2);
                        ytmVarC.k(yuhVarE);
                        z = true;
                    } else {
                        ytmVarC.o(yuhVarE, j2);
                    }
                } else {
                    long j3 = j;
                    yuhVarE = yuhVarE.e();
                    j = j3;
                }
            }
            return z;
        } finally {
            ytmVarC.unlock();
            ytmVarC.s();
        }
    }
}
