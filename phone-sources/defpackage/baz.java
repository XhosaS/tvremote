package defpackage;

import android.os.Trace;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baz implements bcs, bav {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    public final Set c;
    public final bdg d;
    public baz e;
    public int f;
    public final bhx g;
    public final bas h;
    public boolean i;
    public final ki j;
    public final ki k;
    public ki l;
    public bcm m;
    public final bcm n;
    public fh o;
    private final baw p;
    private final bad q;
    private final bed r;
    private final bed s;
    private boolean t;
    private yjz u;
    private final kk v;
    private final kk w;
    private final ki x;

    public /* synthetic */ baz(baw bawVar, bad badVar) {
        this.p = bawVar;
        this.q = badVar;
        byte[] bArr = null;
        jw jwVar = new jw(new kk(bArr));
        this.c = jwVar;
        bdg bdgVar = new bdg();
        if (bawVar.k()) {
            bdgVar.d();
        }
        if (bawVar.m()) {
            bdgVar.e();
        }
        this.d = bdgVar;
        long[] jArr = kj.a;
        this.j = new ki((byte[]) null);
        this.v = new kk(bArr);
        this.w = new kk(bArr);
        this.k = new ki((byte[]) null);
        bed bedVar = new bed();
        this.r = bedVar;
        bed bedVar2 = new bed();
        this.s = bedVar2;
        this.x = new ki((byte[]) null);
        this.l = new ki((byte[]) null);
        bcm bcmVar = new bcm();
        this.n = bcmVar;
        this.g = new bhx();
        bas basVar = new bas(badVar, bawVar, bdgVar, jwVar, bedVar, bedVar2, bcmVar, this);
        bawVar.h(basVar);
        this.h = basVar;
        this.u = baj.a;
    }

    private final void q(Object obj, boolean z) {
        int i;
        Object objA = this.j.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof kk)) {
            bcr bcrVar = (bcr) objA;
            if (bgc.c(this.x, obj, bcrVar) || bcrVar.o(obj) == 1) {
                return;
            }
            if (!bcrVar.m() || z) {
                this.v.j(bcrVar);
                return;
            } else {
                this.w.j(bcrVar);
                return;
            }
        }
        kk kkVar = (kk) objA;
        Object[] objArr = kkVar.b;
        long[] jArr = kkVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        bcr bcrVar2 = (bcr) objArr[(i2 << 3) + i4];
                        if (!bgc.c(this.x, obj, bcrVar2) && bcrVar2.o(obj) != 1) {
                            if (!bcrVar2.m() || z) {
                                this.v.j(bcrVar2);
                            } else {
                                this.w.j(bcrVar2);
                            }
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void r(bed bedVar) throws Throwable {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        char c2;
        long[] jArr3;
        bas basVar = this.h;
        bhx bhxVar = this.g;
        bhxVar.g(this.c, basVar.R());
        try {
            try {
                if (!bedVar.cD()) {
                    Trace.beginSection("Compose:applyChanges");
                    try {
                        bad badVar = this.q;
                        bhx bhxVar2 = this.g;
                        bdj bdjVarC = this.d.c();
                        int i2 = 0;
                        try {
                            bedVar.cF(badVar, bdjVarC, bhxVar2, this.h.R());
                            bdjVarC.w(true);
                            badVar.f();
                            Trace.endSection();
                            bhx bhxVar3 = this.g;
                            bhxVar3.c();
                            bfz bfzVar = bhxVar3.c;
                            if (bfzVar.b != 0) {
                                Trace.beginSection("Compose:sideeffects");
                                try {
                                    Object[] objArr = bfzVar.a;
                                    int i3 = bfzVar.b;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        ((yjk) objArr[i4]).a();
                                    }
                                    bfzVar.h();
                                    Trace.endSection();
                                } finally {
                                }
                            }
                            if (this.t) {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.t = false;
                                    ki kiVar = this.j;
                                    long[] jArr4 = kiVar.a;
                                    int length = jArr4.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        while (true) {
                                            long j3 = jArr4[i5];
                                            char c3 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = i5 - length;
                                                int i7 = i2;
                                                while (true) {
                                                    i = 8 - ((~i6) >>> 31);
                                                    if (i7 >= i) {
                                                        break;
                                                    }
                                                    if ((j3 & 255) < 128) {
                                                        int i8 = (i5 << 3) + i7;
                                                        c = c3;
                                                        Object obj = kiVar.b[i8];
                                                        Object obj2 = kiVar.c[i8];
                                                        j2 = j4;
                                                        if (obj2 instanceof kk) {
                                                            obj2.getClass();
                                                            kk kkVar = (kk) obj2;
                                                            Object[] objArr2 = kkVar.b;
                                                            long[] jArr5 = kkVar.a;
                                                            int length2 = jArr5.length - 2;
                                                            if (length2 >= 0) {
                                                                int i9 = 8;
                                                                while (true) {
                                                                    int i10 = length2;
                                                                    long j5 = jArr5[i2];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i2 - i10)) >>> 31);
                                                                        int i12 = 0;
                                                                        while (i12 < i11) {
                                                                            if ((j5 & 255) < 128) {
                                                                                jArr3 = jArr4;
                                                                                int i13 = (i2 << 3) + i12;
                                                                                if (!((bcr) objArr2[i13]).l()) {
                                                                                    kkVar.i(i13);
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr4;
                                                                            }
                                                                            j5 >>= i9;
                                                                            i12++;
                                                                            jArr4 = jArr3;
                                                                        }
                                                                        jArr2 = jArr4;
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr2 = jArr4;
                                                                    }
                                                                    length2 = i10;
                                                                    if (i2 == length2) {
                                                                        break;
                                                                    }
                                                                    i2++;
                                                                    j3 = j;
                                                                    jArr4 = jArr2;
                                                                    i9 = 8;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                                j = j3;
                                                            }
                                                            if (kkVar.b()) {
                                                                kiVar.h(i8);
                                                            }
                                                            c2 = '\b';
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                            obj2.getClass();
                                                            if (!((bcr) obj2).l()) {
                                                                kiVar.h(i8);
                                                            }
                                                            c2 = '\b';
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        c = c3;
                                                        j2 = j4;
                                                        c2 = '\b';
                                                    }
                                                    j3 = j >> c2;
                                                    i7++;
                                                    c3 = c;
                                                    j4 = j2;
                                                    jArr4 = jArr2;
                                                    i2 = 0;
                                                }
                                                jArr = jArr4;
                                                if (i != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr4;
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                            jArr4 = jArr;
                                            i2 = 0;
                                        }
                                    }
                                    s();
                                    Trace.endSection();
                                } finally {
                                }
                            }
                            if (this.s.cD()) {
                                this.g.b();
                            }
                        } catch (Throwable th) {
                            bdjVarC.w(false);
                            throw th;
                        }
                    } finally {
                    }
                } else if (this.s.cD()) {
                    bhxVar.b();
                }
                this.g.a();
            } catch (Throwable th2) {
                th = th2;
                if (this.s.cD()) {
                    this.g.b();
                }
                this.g.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.g.a();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[PHI: r21 r24 r28 r29
  0x00e4: PHI (r21v8 long) = (r21v7 long), (r21v10 long) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r24v4 int) = (r24v3 int), (r24v7 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.s():void");
    }

    private final void t(Object obj) {
        int i;
        Object objA = this.j.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof kk)) {
            bcr bcrVar = (bcr) objA;
            if (bcrVar.o(obj) == 4) {
                bgc.a(this.x, obj, bcrVar);
                return;
            }
            return;
        }
        kk kkVar = (kk) objA;
        Object[] objArr = kkVar.b;
        long[] jArr = kkVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        bcr bcrVar2 = (bcr) objArr[(i2 << 3) + i4];
                        if (bcrVar2.o(obj) == 4) {
                            bgc.a(this.x, obj, bcrVar2);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final boolean u(bcr bcrVar, Object obj) {
        return o() && this.h.ah(bcrVar, obj);
    }

    private final void v() {
        bcm.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8 A[Catch: all -> 0x00d4, EDGE_INSN: B:69:0x00b8->B:53:0x00b8 BREAK  A[LOOP:0: B:36:0x0074->B:50:0x00b1], EDGE_INSN: B:70:0x00b8->B:53:0x00b8 BREAK  A[LOOP:0: B:36:0x0074->B:50:0x00b1], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:9:0x001d, B:11:0x0021, B:12:0x0026, B:14:0x002c, B:19:0x003c, B:25:0x0047, B:26:0x0050, B:28:0x0054, B:29:0x005c, B:31:0x0064, B:33:0x0068, B:36:0x0074, B:38:0x0084, B:39:0x0087, B:41:0x0090, B:43:0x009a, B:47:0x00a8, B:50:0x00b1, B:51:0x00b4, B:53:0x00b8), top: B:67:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int w(defpackage.bcr r22, defpackage.bac r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.w(bcr, bac, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // defpackage.bcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.a(java.lang.Object):void");
    }

    @Override // defpackage.bcs
    public final void b() {
        this.t = true;
        v();
    }

    @Override // defpackage.bcs
    public final int c(bcr bcrVar, Object obj) {
        baz bazVar;
        if ((bcrVar.a & 2) != 0) {
            bcrVar.c(true);
        }
        bac bacVar = bcrVar.c;
        if (bacVar != null && bacVar.a()) {
            if (!this.d.f(bacVar)) {
                synchronized (this.b) {
                    bazVar = this.e;
                }
                return (bazVar == null || !bazVar.u(bcrVar, obj)) ? 1 : 4;
            }
            if (bcrVar.d != null) {
                int iW = w(bcrVar, bacVar, obj);
                v();
                return iW;
            }
        }
        return 1;
    }

    @Override // defpackage.bav
    public final void d() {
        synchronized (this.b) {
            bas basVar = this.h;
            if (basVar.o) {
                bcm.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.i) {
                this.i = true;
                this.u = baj.b;
                bed bedVar = basVar.t;
                if (bedVar != null) {
                    r(bedVar);
                }
                bdg bdgVar = this.d;
                boolean z = bdgVar.b > 0;
                if (z || !this.c.isEmpty()) {
                    bhx bhxVar = this.g;
                    try {
                        bhxVar.g(this.c, basVar.R());
                        if (z) {
                            bdj bdjVarC = bdgVar.c();
                            try {
                                bau.n(bdjVarC, bhxVar);
                                bdjVarC.w(true);
                                bad badVar = this.q;
                                badVar.c();
                                badVar.f();
                                bhxVar.c();
                            } catch (Throwable th) {
                                bdjVarC.w(false);
                                throw th;
                            }
                        }
                        bhxVar.b();
                    } finally {
                        bhxVar.a();
                    }
                }
                bas basVar2 = this.h;
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    basVar2.b.j(basVar2);
                    basVar2.Z();
                    basVar2.a.c();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.p.r(this);
    }

    public final void e() {
        this.a.set(null);
        this.r.cB();
        this.s.cB();
        Set set = this.c;
        if (set.isEmpty()) {
            return;
        }
        bhx bhxVar = this.g;
        try {
            bhxVar.g(set, this.h.R());
            bhxVar.b();
        } finally {
            bhxVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0251 A[PHI: r24 r33
  0x0251: PHI (r24v14 long[]) = (r24v13 long[]), (r24v13 long[]), (r24v15 long[]) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]
  0x0251: PHI (r33v11 long) = (r33v10 long), (r33v10 long), (r33v12 long) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[EDGE_INSN: B:71:0x0176->B:225:0x0113 BREAK  A[LOOP:13: B:61:0x0144->B:72:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.Set r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.f(java.util.Set, boolean):void");
    }

    public final void g() {
        synchronized (this.b) {
            try {
                r(this.r);
                m();
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        bhx bhxVar = this.g;
                        try {
                            bhxVar.g(set, this.h.R());
                            bhxVar.b();
                            bhxVar.a();
                        } catch (Throwable th2) {
                            bhxVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    e();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        synchronized (this.b) {
            try {
                bed bedVar = this.s;
                if (bedVar.cE()) {
                    r(bedVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        bhx bhxVar = this.g;
                        try {
                            bhxVar.g(set, this.h.R());
                            bhxVar.b();
                            bhxVar.a();
                        } catch (Throwable th2) {
                            bhxVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    e();
                    throw th3;
                }
            }
        }
    }

    public final void i() {
        bhx bhxVar;
        synchronized (this.b) {
            try {
                bas basVar = this.h;
                basVar.z = null;
                Set set = this.c;
                if (!set.isEmpty()) {
                    bhxVar = this.g;
                    try {
                        bhxVar.g(set, basVar.R());
                        bhxVar.b();
                        bhxVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.c;
                    if (!set2.isEmpty()) {
                        bhxVar = this.g;
                        try {
                            bhxVar.g(set2, this.h.R());
                            bhxVar.b();
                            bhxVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    e();
                    throw th2;
                }
            }
        }
    }

    public final void j(yjz yjzVar) {
        if (this.i) {
            bcm.b("The composition is disposed");
        }
        this.u = yjzVar;
        this.p.o(this, yjzVar);
    }

    public final void k() {
        synchronized (this.b) {
            bdg bdgVar = this.d;
            boolean z = bdgVar.b > 0;
            if (z || !this.c.isEmpty()) {
                Trace.beginSection("Compose:deactivate");
                try {
                    bhx bhxVar = this.g;
                    try {
                        bhxVar.g(this.c, this.h.R());
                        if (z) {
                            bdj bdjVarC = bdgVar.c();
                            try {
                                bau.m(bdjVarC, bhxVar);
                                bdjVarC.w(true);
                                this.q.f();
                                bhxVar.c();
                            } catch (Throwable th) {
                                bdjVarC.w(false);
                                throw th;
                            }
                        }
                        bhxVar.b();
                    } finally {
                        bhxVar.a();
                    }
                } finally {
                    Trace.endSection();
                }
            }
            this.j.i();
            this.k.i();
            this.l.i();
            this.r.cB();
            this.s.cB();
            this.h.Z();
        }
    }

    public final void l() {
        AtomicReference atomicReference = this.a;
        Object obj = bba.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (yks.e(andSet, obj)) {
                bau.g("pending composition has not been applied");
                throw new yfs();
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                Objects.toString(atomicReference);
                bau.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new yfs();
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void m() {
        AtomicReference atomicReference = this.a;
        Object andSet = atomicReference.getAndSet(null);
        if (yks.e(andSet, bba.a)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                bau.g("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new yfs();
            }
            Objects.toString(atomicReference);
            bau.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new yfs();
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            r17.t(r18)     // Catch: java.lang.Throwable -> L64
            ki r0 = r1.k     // Catch: java.lang.Throwable -> L64
            r3 = r18
            java.lang.Object r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L62
            boolean r3 = r0 instanceof defpackage.kk     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L5d
            kk r0 = (defpackage.kk) r0     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r3 = r0.b     // Catch: java.lang.Throwable -> L64
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L64
            int r4 = r0.length     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
        L23:
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L64
            long r9 = ~r7     // Catch: java.lang.Throwable -> L64
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L58
            int r9 = r6 - r4
            r10 = r5
        L36:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L64
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L64
            bbh r11 = (defpackage.bbh) r11     // Catch: java.lang.Throwable -> L64
            r1.t(r11)     // Catch: java.lang.Throwable -> L64
        L52:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L36
        L56:
            if (r11 != r12) goto L62
        L58:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L23
        L5d:
            bbh r0 = (defpackage.bbh) r0     // Catch: java.lang.Throwable -> L64
            r1.t(r0)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r2)
            return
        L64:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.n(java.lang.Object):void");
    }

    public final boolean o() {
        return this.h.o;
    }

    public final ki p() {
        ki kiVar = this.l;
        long[] jArr = kj.a;
        this.l = new ki((byte[]) null);
        return kiVar;
    }
}
