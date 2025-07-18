package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eww implements fel {
    private dze A;
    private boolean C;
    private long D;
    private final eph E;
    public final ewu a;
    public ewv b;
    public int c;
    public long e;
    public boolean f;
    private final epd g;
    private dze h;
    private eox i;
    private int q;
    private int r;
    private int s;
    private boolean v;
    private boolean y;
    private dze z;
    private final fat F = new fat(null, null);
    private int j = 1000;
    private long[] k = new long[1000];
    private long[] l = new long[1000];
    private long[] o = new long[1000];
    private int[] n = new int[1000];
    private int[] m = new int[1000];
    private fek[] p = new fek[1000];
    private final nuh G = new nuh(new eoj(4));
    public long d = Long.MIN_VALUE;
    private long t = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private boolean x = true;
    private boolean w = true;
    private boolean B = true;

    public eww(ezp ezpVar, epd epdVar, eph ephVar) {
        this.g = epdVar;
        this.E = ephVar;
        this.a = new ewu(ezpVar);
    }

    private final int K(int i) {
        int i2 = this.r + i;
        int i3 = this.j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized long L() {
        int i = this.q;
        if (i == 0) {
            return -1L;
        }
        return M(i);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ecq, java.lang.Object] */
    private final long M(int i) {
        this.t = Math.max(this.t, O(i));
        this.q -= i;
        int i2 = this.c + i;
        this.c = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.j;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        nuh nuhVar = this.G;
        while (true) {
            SparseArray sparseArray = (SparseArray) nuhVar.b;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            nuhVar.c.a(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = nuhVar.a;
            if (i8 > 0) {
                nuhVar.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.q != 0) {
            return this.l[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.j;
        }
        return this.l[i9 - 1] + this.m[r7];
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ecq, java.lang.Object] */
    private final long N(int i) {
        int iM = m() - i;
        a.H(iM >= 0 && iM <= this.q - this.s);
        int i2 = this.q - iM;
        this.q = i2;
        this.u = Math.max(this.t, O(i2));
        this.v = iM == 0 && this.v;
        nuh nuhVar = this.G;
        SparseArray sparseArray = (SparseArray) nuhVar.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            nuhVar.c.a(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        nuhVar.a = sparseArray.size() > 0 ? Math.min(nuhVar.a, sparseArray.size() - 1) : -1;
        int i3 = this.q;
        if (i3 == 0) {
            return 0L;
        }
        return this.l[K(i3 - 1)] + this.m[r9];
    }

    private final long O(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iK = K(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.o[iK]);
            if ((this.n[iK] & 1) != 0) {
                return jMax;
            }
            iK--;
            if (iK == -1) {
                iK = this.j - 1;
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[Catch: all -> 0x0152, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x005b, B:39:0x00dc, B:41:0x00e5, B:18:0x006d, B:20:0x0076, B:22:0x007f, B:24:0x008d, B:28:0x009a, B:29:0x009f, B:31:0x00aa, B:35:0x00be, B:37:0x00c3, B:38:0x00d7, B:21:0x007d), top: B:50:0x0001 }] */
    /* JADX WARN: Type inference failed for: r10v8, types: [ecq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void P(long r10, int r12, long r13, int r15, defpackage.fek r16) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eww.P(long, int, long, int, fek):void");
    }

    private final void Q() {
        eox eoxVar = this.i;
        if (eoxVar != null) {
            eoxVar.p(this.E);
            this.i = null;
            this.h = null;
        }
    }

    private final synchronized void R() {
        this.s = 0;
        ewu ewuVar = this.a;
        ewuVar.d = ewuVar.c;
    }

    private final synchronized boolean S(long j) {
        if (this.q == 0) {
            return j > this.t;
        }
        if (q() >= j) {
            return false;
        }
        N(this.c + i(j));
        return true;
    }

    private final boolean T() {
        return this.s != this.q;
    }

    private final boolean U(int i) {
        eox eoxVar = this.i;
        if (eoxVar == null || eoxVar.a() == 4) {
            return true;
        }
        return (this.n[i] & 1073741824) == 0 && this.i.l();
    }

    private final synchronized boolean V(dze dzeVar) {
        this.x = false;
        if (Objects.equals(dzeVar, this.A)) {
            return false;
        }
        nuh nuhVar = this.G;
        if (nuhVar.l() || !((dze) ((epm) nuhVar.k()).b).equals(dzeVar)) {
            this.A = dzeVar;
        } else {
            this.A = (dze) ((epm) nuhVar.k()).b;
        }
        boolean z = this.B;
        dze dzeVar2 = this.A;
        this.B = z & eae.j(dzeVar2.Y, dzeVar2.U);
        this.C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized long W(long r9, boolean r11) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.q     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L2e
            long[] r1 = r8.o     // Catch: java.lang.Throwable -> L33
            int r3 = r8.r     // Catch: java.lang.Throwable -> L33
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L33
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L2e
        L10:
            if (r11 == 0) goto L1d
            int r11 = r8.s     // Catch: java.lang.Throwable -> L19
            if (r11 == r0) goto L1d
            int r0 = r11 + 1
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L36
        L1d:
            r4 = r0
            r7 = 0
            r2 = r8
            r5 = r9
            int r9 = r2.j(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L38
            r10 = -1
            if (r9 == r10) goto L2f
            long r9 = r8.M(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r8)
            return r9
        L2e:
            r2 = r8
        L2f:
            monitor-exit(r8)
            r9 = -1
            return r9
        L33:
            r0 = move-exception
            r2 = r8
        L35:
            r9 = r0
        L36:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L38
            throw r9
        L38:
            r0 = move-exception
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eww.W(long, boolean):long");
    }

    private final void X(dze dzeVar, hig higVar) {
        dze dzeVar2 = this.h;
        dza dzaVar = dzeVar2 == null ? null : dzeVar2.ac;
        this.h = dzeVar;
        dza dzaVar2 = dzeVar.ac;
        epd epdVar = this.g;
        higVar.a = epdVar != null ? dzeVar.b(epdVar.a(dzeVar)) : dzeVar;
        higVar.b = this.i;
        if (epdVar == null) {
            return;
        }
        if (dzeVar2 == null || !Objects.equals(dzaVar, dzaVar2)) {
            eox eoxVar = this.i;
            eph ephVar = this.E;
            eox eoxVarEp = epdVar.ep(ephVar, dzeVar);
            this.i = eoxVarEp;
            higVar.b = eoxVarEp;
            if (eoxVar != null) {
                eoxVar.p(ephVar);
            }
        }
    }

    private final synchronized int Y(hig higVar, ehk ehkVar, boolean z, boolean z2, fat fatVar) {
        ehkVar.d = false;
        if (!T()) {
            if (!z2 && !this.v) {
                dze dzeVar = this.A;
                if (dzeVar == null || (!z && dzeVar == this.h)) {
                    return -3;
                }
                X(dzeVar, higVar);
                return -5;
            }
            ehkVar.setFlags(4);
            ehkVar.e = Long.MIN_VALUE;
            return -4;
        }
        Object obj = ((epm) this.G.j(k())).b;
        if (!z && obj == this.h) {
            int iK = K(this.s);
            if (!U(iK)) {
                ehkVar.d = true;
                return -3;
            }
            ehkVar.setFlags(this.n[iK]);
            if (this.s == this.q - 1 && (z2 || this.v)) {
                ehkVar.addFlag(536870912);
            }
            ehkVar.e = this.o[iK];
            fatVar.a = this.m[iK];
            fatVar.b = this.l[iK];
            fatVar.c = this.p[iK];
            return -4;
        }
        X((dze) obj, higVar);
        return -5;
    }

    private final int i(long j) {
        int i = this.q;
        int iK = K(i - 1);
        while (i > this.s && this.o[iK] >= j) {
            i--;
            iK--;
            if (iK == -1) {
                iK = this.j - 1;
            }
        }
        return i;
    }

    private final int j(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.o[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.j) {
                i = 0;
            }
        }
        return i3;
    }

    public final void A() {
        B(false);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ecq, java.lang.Object] */
    public final void B(boolean z) {
        nuh nuhVar;
        SparseArray sparseArray;
        ewu ewuVar = this.a;
        ewuVar.b(ewuVar.c);
        ewuVar.c.c(0L, ewuVar.a);
        ewt ewtVar = ewuVar.c;
        ewuVar.d = ewtVar;
        ewuVar.e = ewtVar;
        ewuVar.f = 0L;
        ewuVar.g.d();
        int i = 0;
        this.q = 0;
        this.c = 0;
        this.r = 0;
        this.s = 0;
        this.w = true;
        this.d = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        while (true) {
            nuhVar = this.G;
            sparseArray = (SparseArray) nuhVar.b;
            if (i >= sparseArray.size()) {
                break;
            }
            nuhVar.c.a(sparseArray.valueAt(i));
            i++;
        }
        nuhVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.z = null;
            this.A = null;
            this.x = true;
            this.B = true;
        }
    }

    public final void C(long j) {
        if (this.D != j) {
            this.D = j;
            w();
        }
    }

    public final synchronized void D(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.s + i <= this.q) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a.H(z);
        this.s += i;
    }

    public final synchronized boolean E() {
        return this.v;
    }

    public final synchronized boolean F(boolean z) {
        boolean z2 = true;
        if (T()) {
            if (((epm) this.G.j(k())).b != this.h) {
                return true;
            }
            return U(K(this.s));
        }
        if (!z && !this.v) {
            dze dzeVar = this.A;
            if (dzeVar == null) {
                z2 = false;
            } else if (dzeVar == this.h) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean G(int i) {
        R();
        int i2 = this.c;
        if (i >= i2 && i <= this.q + i2) {
            this.d = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean H(long j, boolean z) throws Throwable {
        Throwable th;
        eww ewwVar;
        long j2;
        int iJ;
        try {
            try {
                R();
                int i = this.s;
                int iK = K(i);
                if (T() && j >= this.o[iK]) {
                    if (j > this.u) {
                        if (z) {
                            z = true;
                        }
                    }
                    if (this.B) {
                        try {
                            int i2 = this.q - i;
                            int i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    if (this.o[iK] >= j) {
                                        ewwVar = this;
                                        j2 = j;
                                        iJ = i3;
                                        break;
                                    }
                                    iK++;
                                    if (iK == this.j) {
                                        iK = 0;
                                    }
                                    i3++;
                                } else if (z) {
                                    j2 = j;
                                    iJ = i2;
                                    ewwVar = this;
                                } else {
                                    ewwVar = this;
                                    j2 = j;
                                    iJ = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        ewwVar = this;
                        j2 = j;
                        iJ = ewwVar.j(iK, this.q - i, j2, true);
                    }
                    if (iJ != -1) {
                        ewwVar.d = j2;
                        ewwVar.s += iJ;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void I(long j, boolean z) {
        this.a.c(W(j, z));
    }

    public final int J(hig higVar, ehk ehkVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        fat fatVar = this.F;
        int iY = Y(higVar, ehkVar, z2, z, fatVar);
        if (iY != -4) {
            return iY;
        }
        if (!ehkVar.isEndOfStream()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 != 0) {
                    ewu ewuVar = this.a;
                    ewu.e(ewuVar.d, ehkVar, fatVar, ewuVar.b);
                    return -4;
                }
                ewu ewuVar2 = this.a;
                ewuVar2.d = ewu.e(ewuVar2.d, ehkVar, fatVar, ewuVar2.b);
            } else if (i2 != 0) {
                return -4;
            }
            this.s++;
        }
        return -4;
    }

    @Override // defpackage.fel
    public final /* synthetic */ int a(dyu dyuVar, int i, boolean z) {
        return fki.L(this, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final void b(dze dzeVar) {
        dze dzeVarH = h(dzeVar);
        this.y = false;
        this.z = dzeVar;
        boolean zV = V(dzeVarH);
        ewv ewvVar = this.b;
        if (ewvVar == null || !zV) {
            return;
        }
        ewvVar.w();
    }

    @Override // defpackage.fel
    public final /* synthetic */ void c(edi ediVar, int i) {
        fki.M(this, ediVar, i);
    }

    @Override // defpackage.fel
    public final void d(edi ediVar, int i, int i2) {
        while (i > 0) {
            ewu ewuVar = this.a;
            int iA = ewuVar.a(i);
            ewt ewtVar = ewuVar.e;
            ediVar.F((byte[]) ewtVar.d.b, ewtVar.a(ewuVar.f), iA);
            i -= iA;
            ewuVar.d(iA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // defpackage.fel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r12, int r14, int r15, int r16, defpackage.fek r17) {
        /*
            r11 = this;
            boolean r1 = r11.y
            if (r1 == 0) goto Lc
            dze r1 = r11.z
            defpackage.eci.e(r1)
            r11.b(r1)
        Lc:
            r1 = r14 & 1
            boolean r2 = r11.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1a
            if (r1 != 0) goto L17
            goto L58
        L17:
            r11.w = r3
            r1 = r4
        L1a:
            r2 = r1
            long r5 = r11.D
            long r5 = r5 + r12
            boolean r7 = r11.B
            if (r7 == 0) goto L48
            long r7 = r11.d
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L58
            if (r1 != 0) goto L48
            boolean r1 = r11.C
            if (r1 != 0) goto L45
            dze r1 = r11.A
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r7 = "SampleQueue"
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            java.lang.String r1 = r8.concat(r1)
            defpackage.edb.e(r7, r1)
            r11.C = r4
        L45:
            r1 = r14 | 1
            goto L49
        L48:
            r1 = r14
        L49:
            boolean r4 = r11.f
            if (r4 == 0) goto L59
            if (r2 == 0) goto L58
            boolean r2 = r11.S(r5)
            if (r2 == 0) goto L58
            r11.f = r3
            goto L59
        L58:
            return
        L59:
            ewu r2 = r11.a
            long r7 = (long) r15
            long r9 = r2.f
            long r9 = r9 - r7
            r2 = r16
            long r7 = (long) r2
            long r9 = r9 - r7
            r0 = r11
            r7 = r17
            r3 = r1
            r1 = r5
            r4 = r9
            r6 = r15
            r0.P(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eww.e(long, int, int, int, fek):void");
    }

    @Override // defpackage.fel
    public final int g(dyu dyuVar, int i, boolean z) throws EOFException {
        ewu ewuVar = this.a;
        int iA = ewuVar.a(i);
        ewt ewtVar = ewuVar.e;
        int iA2 = dyuVar.a((byte[]) ewtVar.d.b, ewtVar.a(ewuVar.f), iA);
        if (iA2 != -1) {
            ewuVar.d(iA2);
            return iA2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    protected dze h(dze dzeVar) {
        long j = this.D;
        if (j == 0) {
            return dzeVar;
        }
        long j2 = dzeVar.ad;
        if (j2 == Long.MAX_VALUE) {
            return dzeVar;
        }
        dzd dzdVar = new dzd(dzeVar);
        dzdVar.r = j2 + j;
        return new dze(dzdVar);
    }

    public final int k() {
        return this.c + this.s;
    }

    public final synchronized int l(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.s;
                int iK = K(i);
                if (T() && j >= this.o[iK]) {
                    if (j <= this.u || !z) {
                        int iJ = j(iK, this.q - i, j, true);
                        if (iJ == -1) {
                            return 0;
                        }
                        return iJ;
                    }
                    try {
                        return this.q - i;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int m() {
        return this.c + this.q;
    }

    public final synchronized long n() {
        int i = this.s;
        if (i == 0) {
            return -1L;
        }
        return M(i);
    }

    public final synchronized long o() {
        if (this.q == 0) {
            return Long.MIN_VALUE;
        }
        return this.o[this.r];
    }

    public final synchronized long p() {
        return this.u;
    }

    public final synchronized long q() {
        return Math.max(this.t, O(this.s));
    }

    public final synchronized long r() {
        return T() ? this.k[K(this.s)] : this.e;
    }

    public final synchronized dze s() {
        if (this.x) {
            return null;
        }
        return this.A;
    }

    public final void t() {
        this.a.c(L());
    }

    public final void u(long j) {
        if (this.q == 0) {
            return;
        }
        a.H(j > q());
        v(this.c + i(j));
    }

    public final void v(int i) {
        ewu ewuVar = this.a;
        long jN = N(i);
        a.H(jN <= ewuVar.f);
        ewuVar.f = jN;
        if (jN != 0) {
            ewt ewtVar = ewuVar.c;
            if (jN != ewtVar.a) {
                while (ewuVar.f > ewtVar.b) {
                    ewtVar = ewtVar.c;
                }
                ewt ewtVar2 = ewtVar.c;
                ewtVar2.getClass();
                ewuVar.b(ewtVar2);
                ewtVar.c = new ewt(ewtVar.b, ewuVar.a);
                ewuVar.e = ewuVar.f == ewtVar.b ? ewtVar.c : ewtVar;
                if (ewuVar.d == ewtVar2) {
                    ewuVar.d = ewtVar.c;
                    return;
                }
                return;
            }
        }
        ewuVar.b(ewuVar.c);
        ewuVar.c = new ewt(ewuVar.f, ewuVar.a);
        ewt ewtVar3 = ewuVar.c;
        ewuVar.d = ewtVar3;
        ewuVar.e = ewtVar3;
    }

    protected final void w() {
        this.y = true;
    }

    public final void x() throws eow {
        eox eoxVar = this.i;
        if (eoxVar == null || eoxVar.a() != 1) {
            return;
        }
        eow eowVarC = this.i.c();
        eowVarC.getClass();
        throw eowVarC;
    }

    public final void y() {
        t();
        Q();
    }

    public final void z() {
        B(true);
        Q();
    }

    @Override // defpackage.fel
    public final /* synthetic */ void f() {
    }
}
