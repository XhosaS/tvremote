package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eje implements Handler.Callback, evw, ezj, eju, eia, ejy, eht, fbu {
    private static final long p = edt.F(10000);
    private final boolean A;
    private final ehu B;
    private ekj C;
    private boolean E;
    private boolean F;
    private ejx G;
    private ejd H;
    private boolean J;
    private boolean K;
    private boolean M;
    private int N;
    private boolean O;
    private boolean P;
    private int Q;
    private long R;
    private long S;
    private int T;
    private boolean U;
    private eii V;
    private boolean Y;
    public final ekg[] a;
    private final ehy aa;
    private final hkt ab;
    private erh ac;
    private erh ad;
    private final pku ae;
    public final eke[] b;
    public final ezk c;
    public final ecu d;
    public final Looper e;
    public final ecn f;
    public final ejv g;
    public boolean i;
    public boolean j;
    public boolean k;
    public eim l;
    public final ele m;
    public final ehz n;
    public final sro o;
    private final boolean[] q;
    private final ezm r;
    private final eax s;
    private final eav t;
    private final long u;
    private final eib v;
    private final ArrayList w;
    private final ejn x;
    private final elk y;
    private final ecu z;
    private long X = -9223372036854775807L;
    public final long h = 500;
    private boolean I = false;
    private float Z = 1.0f;
    private eki D = eki.a;
    private long W = -9223372036854775807L;
    private long L = -9223372036854775807L;

    public eje(Context context, ekc[] ekcVarArr, ekc[] ekcVarArr2, ezk ezkVar, sro sroVar, ehz ehzVar, ezm ezmVar, int i, boolean z, ele eleVar, ekj ekjVar, ehy ehyVar, long j, Looper looper, ecn ecnVar, pku pkuVar, elk elkVar, eim eimVar, final fbu fbuVar) {
        Object obj;
        this.ae = pkuVar;
        this.c = ezkVar;
        this.o = sroVar;
        this.n = ehzVar;
        this.r = ezmVar;
        this.N = i;
        this.O = z;
        this.C = ekjVar;
        this.aa = ehyVar;
        boolean z2 = false;
        this.f = ecnVar;
        this.y = elkVar;
        this.l = eimVar;
        this.m = eleVar;
        this.u = ehzVar.f;
        eay eayVar = eay.a;
        this.G = ejx.l(sroVar);
        this.H = new ejd(this.G);
        int length = ekcVarArr.length;
        this.b = new eke[length];
        this.q = new boolean[length];
        ekd ekdVarD = ezkVar.d();
        this.a = new ekg[length];
        boolean z3 = false;
        for (int i2 = 0; i2 < ekcVarArr.length; i2++) {
            ekcVarArr[i2].t(i2, elkVar, ecnVar);
            this.b[i2] = ekcVarArr[i2].k();
            this.b[i2].J(ekdVarD);
            ekc ekcVar = ekcVarArr2[i2];
            if (ekcVar != null) {
                ekcVar.t(i2, elkVar, ecnVar);
                z3 = true;
            }
            this.a[i2] = new ekg(ekcVarArr[i2], ekcVarArr2[i2], i2);
        }
        this.A = z3;
        this.v = new eib(this);
        this.w = new ArrayList();
        this.s = new eax();
        this.t = new eav();
        ezkVar.p(this, ezmVar);
        this.U = true;
        ecu ecuVarB = ecnVar.b(looper, null);
        this.z = ecuVarB;
        this.x = new ejn(eleVar, ecuVarB, new pku(this, null), eimVar);
        this.g = new ejv(this, eleVar, ecuVarB, elkVar);
        hkt hktVar = new hkt(null);
        this.ab = hktVar;
        synchronized (hktVar.b) {
            if (hktVar.c == null) {
                if (hktVar.a == 0 && hktVar.d == null) {
                    z2 = true;
                }
                a.ab(z2);
                hktVar.d = new HandlerThread("ExoPlayer:Playback", -16);
                ((HandlerThread) hktVar.d).start();
                hktVar.c = ((HandlerThread) hktVar.d).getLooper();
            }
            hktVar.a++;
            obj = hktVar.c;
        }
        Looper looper2 = (Looper) obj;
        this.e = looper2;
        ecu ecuVarB2 = ecnVar.b(looper2, this);
        this.d = ecuVarB2;
        this.B = new ehu(context, looper2, this);
        ecuVarB2.h(35, new fbu() { // from class: eja
            @Override // defpackage.fbu
            public final void c(long j2, long j3, dze dzeVar, MediaFormat mediaFormat) {
                fbuVar.c(j2, j3, dzeVar, mediaFormat);
                this.a.c(j2, j3, dzeVar, mediaFormat);
            }
        }).l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x02e3, code lost:
    
        r7 = r9.a(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(defpackage.eay r32, boolean r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.A(eay, boolean):void");
    }

    private final void B(eai eaiVar, boolean z) {
        C(eaiVar, eaiVar.d, true, z);
    }

    private final void C(eai eaiVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.H.a(1);
            }
            this.G = this.G.g(eaiVar);
        }
        float f2 = eaiVar.d;
        ejk ejkVar = this.x.d;
        while (true) {
            i = 0;
            if (ejkVar == null) {
                break;
            }
            ezf[] ezfVarArr = (ezf[]) ejkVar.l.e;
            int length = ezfVarArr.length;
            while (i < length) {
                ezf ezfVar = ezfVarArr[i];
                if (ezfVar != null) {
                    ezfVar.n(f2);
                }
                i++;
            }
            ejkVar = ejkVar.i;
        }
        ekg[] ekgVarArr = this.a;
        while (i < ekgVarArr.length) {
            ekg ekgVar = ekgVarArr[i];
            ekgVar.a.K(f, f2);
            ekc ekcVar = ekgVar.c;
            if (ekcVar != null) {
                ekcVar.K(f, f2);
            }
            i++;
        }
    }

    private final void D() {
        boolean zE;
        ejn ejnVar = this.x;
        if (ak(ejnVar.g)) {
            ejk ejkVar = ejnVar.g;
            long jL = l(ejkVar.b());
            if (ejkVar == ejnVar.d) {
                ejkVar.d(this.R);
            } else {
                ejkVar.d(this.R);
                long j = ejkVar.g.b;
            }
            long j2 = aj(this.G.b, ejkVar.g.a) ? this.aa.l : -9223372036854775807L;
            elk elkVar = this.y;
            eay eayVar = this.G.b;
            evz evzVar = ejkVar.g.a;
            float f = this.v.b().d;
            boolean z = this.G.l;
            ejg ejgVar = new ejg(elkVar, jL, f, this.K, j2);
            ehz ehzVar = this.n;
            boolean zE2 = ehzVar.e(ejgVar);
            ejk ejkVar2 = ejnVar.d;
            if (zE2 || !ejkVar2.e || jL >= 500000 || this.u <= 0) {
                zE = zE2;
            } else {
                ejkVar2.a.dt(this.G.s);
                zE = ehzVar.e(ejgVar);
            }
        } else {
            zE = false;
        }
        this.M = zE;
        if (zE) {
            ejk ejkVar3 = ejnVar.g;
            ejkVar3.getClass();
            ejh ejhVar = new ejh();
            ejhVar.a = ejkVar3.d(this.R);
            ejhVar.b(this.v.b().d);
            ejhVar.a(this.L);
            ejkVar3.f(new eji(ejhVar));
        }
        Y();
    }

    private final void E() {
        ejn ejnVar = this.x;
        ejnVar.i();
        ejk ejkVar = ejnVar.h;
        if (ejkVar != null) {
            if (!ejkVar.d || ejkVar.e) {
                evx evxVar = ejkVar.a;
                if (evxVar.o()) {
                    return;
                }
                ehz ehzVar = this.n;
                eay eayVar = this.G.b;
                evz evzVar = ejkVar.g.a;
                if (ejkVar.e) {
                    evxVar.c();
                }
                Iterator it = ehzVar.g.values().iterator();
                while (it.hasNext()) {
                    if (((tia) it.next()).b) {
                        return;
                    }
                }
                if (!ejkVar.d) {
                    ejkVar.g(this, ejkVar.g.b);
                    return;
                }
                ejh ejhVar = new ejh();
                ejhVar.a = ejkVar.d(this.R);
                ejhVar.b(this.v.b().d);
                ejhVar.a(this.L);
                ejkVar.f(new eji(ejhVar));
            }
        }
    }

    private final void F() {
        ejd ejdVar = this.H;
        ejx ejxVar = this.G;
        boolean z = ejdVar.a | (ejdVar.b != ejxVar);
        ejdVar.a = z;
        ejdVar.b = ejxVar;
        if (z) {
            this.ae.s(ejdVar);
            this.H = new ejd(this.G);
        }
    }

    private final void G(int i) {
        ekg ekgVar = this.a[i];
        try {
            ejk ejkVar = this.x.d;
            ejkVar.getClass();
            ekc ekcVarC = ekgVar.c(ejkVar);
            ekcVarC.getClass();
            ekcVarC.u();
        } catch (IOException | RuntimeException e) {
            int iB = ekgVar.b();
            if (iB != 3 && iB != 5) {
                throw e;
            }
            ejn ejnVar = this.x;
            sro sroVar = ejnVar.d.l;
            ezf[] ezfVarArr = (ezf[]) sroVar.e;
            edb.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(dze.f(ezfVarArr[i].g())), e);
            sro sroVar2 = new sro((ekf[]) ((ekf[]) sroVar.d).clone(), (ezf[]) ezfVarArr.clone(), (ebh) sroVar.b, sroVar.c);
            ((ekf[]) sroVar2.d)[i] = null;
            ((ezf[]) sroVar2.e)[i] = null;
            s(i);
            ejnVar.d.p(sroVar2, this.G.s);
        }
    }

    private final void H(int i, boolean z) {
        boolean[] zArr = this.q;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.z.d(new mju(this, i, z, 1));
        }
    }

    private final void I() {
        eje ejeVar;
        eib eibVar = this.v;
        float f = eibVar.b().d;
        ejn ejnVar = this.x;
        ejk ejkVar = ejnVar.d;
        ejk ejkVar2 = ejnVar.e;
        sro sroVar = null;
        boolean z = true;
        while (ejkVar != null && ejkVar.e) {
            ejx ejxVar = this.G;
            eay eayVar = ejxVar.b;
            boolean z2 = ejxVar.l;
            sro sroVarQ = ejkVar.q(f, eayVar);
            sro sroVar2 = ejkVar == ejnVar.d ? sroVarQ : sroVar;
            sro sroVar3 = ejkVar.l;
            boolean z3 = false;
            if (sroVar3 != null) {
                ezf[] ezfVarArr = (ezf[]) sroVarQ.e;
                if (((ezf[]) sroVar3.e).length == ezfVarArr.length) {
                    for (int i = 0; i < ezfVarArr.length; i++) {
                        if (sroVarQ.g(sroVar3, i)) {
                        }
                    }
                    if (ejkVar != ejkVar2) {
                        z3 = true;
                    }
                    z &= z3;
                    ejkVar = ejkVar.i;
                    sroVar = sroVar2;
                }
            }
            if (z) {
                ejk ejkVar3 = ejnVar.d;
                boolean z4 = 1 == (ejnVar.a(ejkVar3) & 1);
                ekg[] ekgVarArr = this.a;
                int length = ekgVarArr.length;
                boolean[] zArr = new boolean[length];
                sroVar2.getClass();
                long jO = ejkVar3.o(sroVar2, this.G.s, z4, zArr);
                ejx ejxVar2 = this.G;
                if (ejxVar2.f != 4 && jO != ejxVar2.s) {
                    z3 = true;
                }
                ejx ejxVar3 = this.G;
                ejx ejxVarP = p(ejxVar3.c, jO, ejxVar3.d, ejxVar3.e, z3, 5);
                boolean z5 = z3;
                ejeVar = this;
                ejeVar.G = ejxVarP;
                if (z5) {
                    ejeVar.M(jO);
                }
                ejeVar.r();
                boolean[] zArr2 = new boolean[length];
                int i2 = 0;
                while (i2 < ekgVarArr.length) {
                    int iA = ekgVarArr[i2].a();
                    zArr2[i2] = ekgVarArr[i2].n();
                    ekg ekgVar = ekgVarArr[i2];
                    ewx ewxVar = ejkVar3.c[i2];
                    long j = ejeVar.R;
                    boolean z6 = zArr[i2];
                    eib eibVar2 = eibVar;
                    ekgVar.e(ekgVar.a, ewxVar, eibVar2, j, z6);
                    ekc ekcVar = ekgVar.c;
                    if (ekcVar != null) {
                        ekgVar.e(ekcVar, ewxVar, eibVar2, j, z6);
                    }
                    if (iA - ekgVarArr[i2].a() > 0) {
                        ejeVar.H(i2, false);
                    }
                    ejeVar.Q -= iA - ekgVarArr[i2].a();
                    i2++;
                    eibVar = eibVar2;
                }
                ejeVar.x(zArr2, ejeVar.R);
                ejkVar3.h = true;
            } else {
                ejeVar = this;
                ejnVar.a(ejkVar);
                if (ejkVar.e) {
                    long jMax = Math.max(ejkVar.g.b, ejkVar.d(ejeVar.R));
                    if (ejeVar.A && ejeVar.af() && ejnVar.f == ejkVar) {
                        ejeVar.r();
                    }
                    ejkVar.p(sroVarQ, jMax);
                }
            }
            ejeVar.z(true);
            if (ejeVar.G.f != 4) {
                ejeVar.D();
                ejeVar.ac();
                ejeVar.d.f(2);
                return;
            }
            return;
        }
    }

    private final void J() {
        I();
        P(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[PHI: r2 r6 r8
  0x0093: PHI (r2v2 evz) = (r2v1 evz), (r2v20 evz) binds: [B:26:0x006b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r6v3 long) = (r6v2 long), (r6v14 long) binds: [B:26:0x006b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r8v2 long) = (r8v1 long), (r8v9 long) binds: [B:26:0x006b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[PHI: r6
  0x00ed: PHI (r6v7 eay) = (r6v6 eay), (r6v6 eay), (r6v13 eay), (r6v13 eay) binds: [B:32:0x00a1, B:34:0x00a5, B:40:0x00cd, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v16, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [eoz, ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [ewa, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.K(boolean, boolean, boolean, boolean):void");
    }

    private final void L() {
        ejk ejkVar = this.x.d;
        boolean z = false;
        if (ejkVar != null && ejkVar.g.i && this.I) {
            z = true;
        }
        this.J = z;
    }

    private final void M(long j) {
        ejk ejkVar = this.x.d;
        long jE = ejkVar == null ? j + 1000000000000L : ejkVar.e(j);
        this.R = jE;
        this.v.a.c(jE);
        for (ekg ekgVar : this.a) {
            long j2 = this.R;
            ekc ekcVarC = ekgVar.c(ejkVar);
            if (ekcVarC != null) {
                ekcVarC.H(j2);
            }
        }
        for (ejk ejkVar2 = r0.d; ejkVar2 != null; ejkVar2 = ejkVar2.i) {
            for (ezf ezfVar : (ezf[]) ejkVar2.l.e) {
            }
        }
    }

    private final void N(eay eayVar, eay eayVar2) {
        if (eayVar.q() && eayVar2.q()) {
            return;
        }
        ArrayList arrayList = this.w;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        ejc ejcVar = (ejc) arrayList.get(size);
        Object obj = ejcVar.b;
        eka ekaVar = ejcVar.a;
        throw null;
    }

    private final void O(long j) {
        if (g()) {
            jMin = this.G.f != 3 ? p : 1000L;
            if (ai()) {
                for (ekg ekgVar : this.a) {
                    long j2 = this.R;
                    long j3 = this.S;
                    ekc ekcVar = ekgVar.a;
                    long jE = ekg.o(ekcVar) ? ekcVar.e(j2, j3) : Long.MAX_VALUE;
                    ekc ekcVar2 = ekgVar.c;
                    if (ekcVar2 != null && ekg.o(ekcVar2)) {
                        jE = Math.min(jE, ekcVar2.e(j2, j3));
                    }
                    jMin = Math.min(jMin, edt.F(jE));
                }
                ejk ejkVar = this.x.d;
                if ((ejkVar != null ? ejkVar.i : null) != null) {
                    if (this.R + (edt.y(jMin) * this.G.o.d) >= r0.c()) {
                        jMin = Math.min(jMin, p);
                    }
                }
            }
        } else if (this.G.f != 3 || ai()) {
            jMin = p;
        }
        ((edm) this.d).b.sendEmptyMessageAtTime(2, j + jMin);
    }

    private final void P(boolean z) {
        evz evzVar = this.x.d.g.a;
        long jN = n(evzVar, this.G.s, true, false);
        if (jN != this.G.s) {
            ejx ejxVar = this.G;
            this.G = p(evzVar, jN, ejxVar.d, ejxVar.e, z, 5);
        }
    }

    private final void Q(eai eaiVar) {
        this.d.b(16);
        this.v.d(eaiVar);
    }

    private final void R(boolean z) {
        if (z == this.k) {
            return;
        }
        this.k = z;
        if (z || !this.G.p) {
            return;
        }
        this.d.f(2);
    }

    private final void S(boolean z, int i, boolean z2, int i2) {
        this.H.a(z2 ? 1 : 0);
        aa(z, i, i2);
    }

    private final void T(int i) {
        ejx ejxVar = this.G;
        if (ejxVar.f != i) {
            if (i != 2) {
                this.W = -9223372036854775807L;
            }
            this.G = ejxVar.h(i);
        }
    }

    private final void U(float f) {
        this.Z = f;
        float f2 = f * this.B.d;
        int i = 0;
        while (true) {
            ekg[] ekgVarArr = this.a;
            if (i >= ekgVarArr.length) {
                return;
            }
            ekg ekgVar = ekgVarArr[i];
            if (ekgVar.b() == 1) {
                ekc ekcVar = ekgVar.a;
                Float fValueOf = Float.valueOf(f2);
                ekcVar.s(2, fValueOf);
                ekc ekcVar2 = ekgVar.c;
                if (ekcVar2 != null) {
                    ekcVar2.s(2, fValueOf);
                }
            }
            i++;
        }
    }

    private final void V() {
        ejk ejkVar = this.x.d;
        if (ejkVar == null) {
            return;
        }
        sro sroVar = ejkVar.l;
        int i = 0;
        while (true) {
            ekg[] ekgVarArr = this.a;
            if (i >= ekgVarArr.length) {
                return;
            }
            if (sroVar.c(i)) {
                ekgVarArr[i].h();
            }
            i++;
        }
    }

    private final void W(boolean z, boolean z2) {
        K(z || !this.P, false, true, false);
        this.H.a(z2 ? 1 : 0);
        this.n.c(this.y);
        this.B.a(this.G.l, 1);
        T(1);
    }

    private final void X() {
        this.v.f();
        int i = 0;
        while (true) {
            ekg[] ekgVarArr = this.a;
            if (i >= ekgVarArr.length) {
                return;
            }
            ekg ekgVar = ekgVarArr[i];
            ekc ekcVar = ekgVar.a;
            if (ekg.o(ekcVar)) {
                ekg.r(ekcVar);
            }
            ekc ekcVar2 = ekgVar.c;
            if (ekcVar2 != null && ekg.o(ekcVar2)) {
                ekg.r(ekcVar2);
            }
            i++;
        }
    }

    private final void Y() {
        ejk ejkVar = this.x.g;
        boolean z = true;
        if (!this.M && (ejkVar == null || !ejkVar.a.o())) {
            z = false;
        }
        ejx ejxVar = this.G;
        if (z != ejxVar.h) {
            this.G = ejxVar.c(z);
        }
    }

    private final void Z() {
        ejx ejxVar = this.G;
        aa(ejxVar.l, ejxVar.n, ejxVar.m);
    }

    static int a(eax eaxVar, eav eavVar, int i, boolean z, Object obj, eay eayVar, eay eayVar2) {
        eav eavVar2;
        Object obj2 = eayVar.p(eayVar.o(obj, eavVar).h, eaxVar).o;
        int i2 = 0;
        for (int i3 = 0; i3 < eayVar2.c(); i3++) {
            if (eayVar2.p(i3, eaxVar).o.equals(obj2)) {
                return i3;
            }
        }
        int iA = eayVar.a(obj);
        int iB = eayVar.b();
        int iK = iA;
        int iA2 = -1;
        while (i2 < iB && iA2 == -1) {
            eax eaxVar2 = eaxVar;
            eavVar2 = eavVar;
            int i4 = i;
            boolean z2 = z;
            eay eayVar3 = eayVar;
            iK = eayVar3.k(iK, eavVar2, eaxVar2, i4, z2);
            if (iK == -1) {
                iA2 = -1;
                break;
            }
            iA2 = eayVar2.a(eayVar3.f(iK));
            i2++;
            eayVar = eayVar3;
            eavVar = eavVar2;
            eaxVar = eaxVar2;
            i = i4;
            z = z2;
        }
        eavVar2 = eavVar;
        if (iA2 == -1) {
            return -1;
        }
        return eayVar2.n(iA2, eavVar2).h;
    }

    private final void aa(boolean z, int i, int i2) {
        ab(z, this.B.a(z, this.G.f), i, i2);
    }

    private final void ab(boolean z, int i, int i2, int i3) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        ejx ejxVar = this.G;
        if (ejxVar.l == z2 && ejxVar.n == i2 && ejxVar.m == i3) {
            return;
        }
        this.G = ejxVar.e(z2, i3, i2);
        ae(false, false);
        ejn ejnVar = this.x;
        for (ejk ejkVar = ejnVar.d; ejkVar != null; ejkVar = ejkVar.i) {
            for (ezf ezfVar : (ezf[]) ejkVar.l.e) {
            }
        }
        if (!ai()) {
            X();
            ac();
            ejnVar.k(this.R);
            return;
        }
        int i4 = this.G.f;
        if (i4 == 3) {
            this.v.e();
            V();
            this.d.f(2);
        } else if (i4 == 2) {
            this.d.f(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0136, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ac() {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.ac():void");
    }

    private final void ad(eay eayVar, evz evzVar, eay eayVar2, evz evzVar2, long j, boolean z) {
        if (!aj(eayVar, evzVar)) {
            eai eaiVar = evzVar.b() ? eai.a : this.G.o;
            if (this.v.b().equals(eaiVar)) {
                return;
            }
            Q(eaiVar);
            C(this.G.o, eaiVar.d, false, false);
            return;
        }
        Object obj = evzVar.a;
        eav eavVar = this.t;
        int i = eayVar.o(obj, eavVar).h;
        eax eaxVar = this.s;
        eayVar.p(i, eaxVar);
        ehy ehyVar = this.aa;
        dzs dzsVar = eaxVar.x;
        String str = edt.a;
        ehyVar.h = edt.y(dzsVar.g);
        ehyVar.j = edt.y(dzsVar.h);
        ehyVar.k = edt.y(dzsVar.i);
        float f = dzsVar.j;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        ehyVar.n = f;
        float f2 = dzsVar.k;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        ehyVar.m = f2;
        if (f == 1.0f && f2 == 1.0f) {
            ehyVar.h = -9223372036854775807L;
        }
        ehyVar.a();
        if (j != -9223372036854775807L) {
            ehyVar.b(i(eayVar, obj, j));
            return;
        }
        if (!Objects.equals(!eayVar2.q() ? eayVar2.p(eayVar2.o(evzVar2.a, eavVar).h, eaxVar).o : null, eaxVar.o) || z) {
            ehyVar.b(-9223372036854775807L);
        }
    }

    private final void ae(boolean z, boolean z2) {
        this.K = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.L = jElapsedRealtime;
    }

    private final boolean af() {
        if (!this.A) {
            return false;
        }
        for (ekg ekgVar : this.a) {
            if (ekgVar.k()) {
                return true;
            }
        }
        return false;
    }

    private final boolean ag() {
        ejk ejkVar = this.x.d;
        long j = ejkVar.g.e;
        if (ejkVar.e) {
            return j == -9223372036854775807L || this.G.s < j || !ai();
        }
        return false;
    }

    private static boolean ah(ejx ejxVar, eav eavVar) {
        evz evzVar = ejxVar.c;
        eay eayVar = ejxVar.b;
        return eayVar.q() || eayVar.o(evzVar.a, eavVar).k;
    }

    private final boolean ai() {
        ejx ejxVar = this.G;
        return ejxVar.l && ejxVar.n == 0;
    }

    private final boolean aj(eay eayVar, evz evzVar) {
        if (!evzVar.b() && !eayVar.q()) {
            int i = eayVar.o(evzVar.a, this.t).h;
            eax eaxVar = this.s;
            eayVar.p(i, eaxVar);
            if (eaxVar.d() && eaxVar.w && eaxVar.t != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private static final boolean ak(ejk ejkVar) {
        if (ejkVar != null) {
            try {
                if (ejkVar.e) {
                    for (ewx ewxVar : ejkVar.c) {
                        if (ewxVar != null) {
                            ewxVar.b();
                        }
                    }
                } else {
                    ejkVar.a.dr();
                }
                if (ejkVar.b() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static Pair al(eay eayVar, erh erhVar, boolean z, int i, boolean z2, eax eaxVar, eav eavVar) {
        Pair pairL;
        Object obj = erhVar.c;
        if (eayVar.q()) {
            return null;
        }
        if (true == ((eay) obj).q()) {
            obj = eayVar;
        }
        try {
            pairL = ((eay) obj).l(eaxVar, eavVar, erhVar.b, erhVar.a);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!eayVar.equals(obj)) {
            if (eayVar.a(pairL.first) == -1) {
                int iA = a(eaxVar, eavVar, i, z2, pairL.first, (eay) obj, eayVar);
                if (iA != -1) {
                    return eayVar.l(eaxVar, eavVar, iA, -9223372036854775807L);
                }
                return null;
            }
            eay eayVar2 = (eay) obj;
            if (eayVar2.o(pairL.first, eavVar).k && eayVar2.p(eavVar.h, eaxVar).B == eayVar2.a(pairL.first)) {
                return eayVar.l(eaxVar, eavVar, eayVar.o(pairL.first, eavVar).h, erhVar.a);
            }
        }
        return pairL;
    }

    private final void am(erh erhVar, boolean z) throws Throwable {
        long jLongValue;
        long j;
        long j2;
        evz evzVarG;
        boolean z2;
        evz evzVar;
        long j3;
        boolean z3;
        long j4;
        long jA;
        ejx ejxVar;
        eay eayVar;
        evz evzVar2;
        long j5;
        evz evzVar3;
        long j6;
        long j7;
        boolean z4;
        ejx ejxVar2;
        int i;
        this.H.a(z ? 1 : 0);
        if (this.F) {
            this.ac = erhVar;
            return;
        }
        eay eayVar2 = this.G.b;
        int i2 = this.N;
        boolean z5 = this.O;
        eax eaxVar = this.s;
        eav eavVar = this.t;
        Pair pairAl = al(eayVar2, erhVar, true, i2, z5, eaxVar, eavVar);
        if (pairAl == null) {
            Pair pairO = o(this.G.b);
            evzVarG = (evz) pairO.first;
            jLongValue = ((Long) pairO.second).longValue();
            z2 = !this.G.b.q();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairAl.first;
            jLongValue = ((Long) pairAl.second).longValue();
            long j8 = erhVar.a;
            j = j8 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j2 = 0;
            evzVarG = this.x.g(this.G.b, obj, jLongValue);
            if (evzVarG.b()) {
                this.G.b.o(evzVarG.a, eavVar);
                if (eavVar.d(evzVarG.b) == evzVarG.c) {
                    eavVar.h();
                }
                z2 = true;
                jLongValue = 0;
            } else {
                z2 = j8 == -9223372036854775807L;
            }
        }
        try {
            if (this.G.b.q()) {
                this.ad = erhVar;
            } else {
                if (pairAl != null) {
                    if (evzVarG.equals(this.G.c)) {
                        ejk ejkVar = this.x.d;
                        if (ejkVar == null || !ejkVar.e || jLongValue == j2) {
                            jA = jLongValue;
                        } else {
                            evx evxVar = ejkVar.a;
                            long j9 = eaxVar.A;
                            if (this.E && j9 != -9223372036854775807L) {
                                Double d = this.D.c;
                            }
                            jA = evxVar.a(jLongValue, this.C);
                        }
                        if (edt.F(jA) == edt.F(this.G.s) && ((i = (ejxVar2 = this.G).f) == 2 || i == 3)) {
                            jLongValue = ejxVar2.s;
                        }
                    } else {
                        jA = jLongValue;
                    }
                    this.F = this.E;
                    long jM = m(evzVarG, jA, this.G.f == 4);
                    boolean z6 = z2 | (jLongValue != jM);
                    try {
                        ejxVar = this.G;
                        eayVar = ejxVar.b;
                        evzVar2 = evzVarG;
                        j5 = j;
                    } catch (Throwable th) {
                        th = th;
                        evzVar = evzVarG;
                        j3 = j;
                    }
                    try {
                        ad(eayVar, evzVar2, eayVar, ejxVar.c, j5, true);
                        evzVar3 = evzVar2;
                        j6 = j5;
                        j7 = jM;
                        z4 = z6;
                        this.G = p(evzVar3, j7, j6, j7, z4, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        evzVar = evzVar2;
                        j3 = j5;
                        j4 = jM;
                        z3 = z6;
                        this.G = p(evzVar, j4, j3, j4, z3, 2);
                        throw th;
                    }
                }
                if (this.G.f != 1) {
                    T(4);
                }
                K(false, true, false, true);
            }
            z4 = z2;
            evzVar3 = evzVarG;
            j7 = jLongValue;
            j6 = j;
            this.G = p(evzVar3, j7, j6, j7, z4, 2);
        } catch (Throwable th3) {
            th = th3;
            evzVar = evzVarG;
            j3 = j;
            z3 = z2;
            j4 = jLongValue;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void an(sro sroVar) {
        ejn ejnVar = this.x;
        ejk ejkVar = ejnVar.g;
        ejkVar.getClass();
        if (ejkVar != ejnVar.d) {
            long j = ejkVar.g.b;
        }
        long jL = l(ejkVar.a());
        long j2 = aj(this.G.b, ejkVar.g.a) ? this.aa.l : -9223372036854775807L;
        ehz ehzVar = this.n;
        elk elkVar = this.y;
        eay eayVar = this.G.b;
        float f = this.v.b().d;
        boolean z = this.G.l;
        ejg ejgVar = new ejg(elkVar, jL, f, this.K, j2);
        Object obj = sroVar.e;
        tia tiaVar = (tia) ehzVar.g.get(ejgVar.a);
        tiaVar.getClass();
        int iMax = ehzVar.d;
        if (iMax == -1) {
            ezf[] ezfVarArr = (ezf[]) obj;
            int length = ezfVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    ezf ezfVar = ezfVarArr[i];
                    if (ezfVar != null) {
                        switch (ezfVar.h().e) {
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        tiaVar.a = iMax;
        ehzVar.d();
    }

    public static final void h(eka ekaVar) {
        ekaVar.b();
        try {
            ekaVar.a.s(ekaVar.b, ekaVar.c);
        } finally {
            ekaVar.a(true);
        }
    }

    private final long i(eay eayVar, Object obj, long j) {
        eav eavVar = this.t;
        int i = eayVar.o(obj, eavVar).h;
        eax eaxVar = this.s;
        eayVar.p(i, eaxVar);
        if (eaxVar.t == -9223372036854775807L || !eaxVar.d() || !eaxVar.w) {
            return -9223372036854775807L;
        }
        long jA = eaxVar.a() - eaxVar.t;
        String str = edt.a;
        return edt.y(jA) - (j + eavVar.j);
    }

    private final long j(ejk ejkVar) {
        long jMax = ejkVar.k;
        if (ejkVar.e) {
            int i = 0;
            while (true) {
                ekg[] ekgVarArr = this.a;
                if (i >= ekgVarArr.length) {
                    break;
                }
                if (ekgVarArr[i].m(ejkVar)) {
                    ekc ekcVarC = ekgVarArr[i].c(ejkVar);
                    ekcVarC.getClass();
                    long jF = ekcVarC.f();
                    if (jF == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(jF, jMax);
                }
                i++;
            }
        }
        return jMax;
    }

    private final long k() {
        return l(this.G.q);
    }

    private final long l(long j) {
        ejk ejkVar = this.x.g;
        if (ejkVar == null) {
            return 0L;
        }
        return Math.max(0L, j - ejkVar.d(this.R));
    }

    private final long m(evz evzVar, long j, boolean z) {
        ejn ejnVar = this.x;
        return n(evzVar, j, ejnVar.d != ejnVar.e, z);
    }

    private final long n(evz evzVar, long j, boolean z, boolean z2) {
        X();
        ae(false, true);
        if (z2 || this.G.f == 3) {
            T(2);
        }
        ejn ejnVar = this.x;
        ejk ejkVar = ejnVar.d;
        ejk ejkVar2 = ejkVar;
        while (ejkVar2 != null && !evzVar.equals(ejkVar2.g.a)) {
            ejkVar2 = ejkVar2.i;
        }
        if (z || ejkVar != ejkVar2 || (ejkVar2 != null && ejkVar2.e(j) < 0)) {
            t();
            if (ejkVar2 != null) {
                while (ejnVar.d != ejkVar2) {
                    ejnVar.c();
                }
                ejnVar.a(ejkVar2);
                ejkVar2.k = 1000000000000L;
                w();
                ejkVar2.h = true;
            }
        }
        r();
        if (ejkVar2 != null) {
            ejnVar.a(ejkVar2);
            if (!ejkVar2.e) {
                ejkVar2.g = ejkVar2.g.b(j);
            } else if (ejkVar2.f) {
                evx evxVar = ejkVar2.a;
                j = evxVar.f(j);
                evxVar.dt(j - this.u);
            }
            M(j);
            D();
        } else {
            ejnVar.h();
            M(j);
        }
        z(false);
        this.d.f(2);
        return j;
    }

    private final Pair o(eay eayVar) {
        long j = 0;
        if (eayVar.q()) {
            return Pair.create(ejx.a, 0L);
        }
        int iG = eayVar.g(this.O);
        eax eaxVar = this.s;
        eav eavVar = this.t;
        Pair pairL = eayVar.l(eaxVar, eavVar, iG, -9223372036854775807L);
        evz evzVarG = this.x.g(eayVar, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (evzVarG.b()) {
            eayVar.o(evzVarG.a, eavVar);
            if (evzVarG.c == eavVar.d(evzVarG.b)) {
                eavVar.h();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(evzVarG, Long.valueOf(j));
    }

    private final ejx p(evz evzVar, long j, long j2, long j3, boolean z, int i) {
        exi exiVar;
        sro sroVar;
        List list;
        boolean z2;
        exi exiVar2;
        this.U = (!this.U && j == this.G.s && evzVar.equals(this.G.c)) ? false : true;
        L();
        ejx ejxVar = this.G;
        exi exiVar3 = ejxVar.i;
        sro sroVar2 = ejxVar.u;
        List listOf = ejxVar.j;
        if (this.g.h) {
            ejn ejnVar = this.x;
            ejk ejkVar = ejnVar.d;
            exi exiVar4 = ejkVar == null ? exi.a : ejkVar.j;
            sro sroVar3 = ejkVar == null ? this.o : ejkVar.l;
            Object obj = sroVar3.e;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ezf[] ezfVarArr = (ezf[]) obj;
            int length = ezfVarArr.length;
            int i2 = 0;
            boolean z3 = false;
            while (i2 < length) {
                ezf ezfVar = ezfVarArr[i2];
                if (ezfVar != null) {
                    ead eadVar = ezfVar.f(0).V;
                    if (eadVar == null) {
                        exiVar2 = exiVar4;
                        builder.add((ImmutableList.Builder) new ead(new eac[0]));
                    } else {
                        exiVar2 = exiVar4;
                        builder.add((ImmutableList.Builder) eadVar);
                        z3 = true;
                    }
                } else {
                    exiVar2 = exiVar4;
                }
                i2++;
                exiVar4 = exiVar2;
            }
            exi exiVar5 = exiVar4;
            ImmutableList immutableListBuild = z3 ? builder.build() : ImmutableList.of();
            if (ejkVar != null) {
                ejl ejlVar = ejkVar.g;
                if (ejlVar.c != j2) {
                    ejkVar.g = ejlVar.a(j2);
                }
            }
            ejk ejkVar2 = ejnVar.d;
            if (ejkVar2 == ejnVar.e && ejkVar2 != null) {
                sro sroVar4 = ejkVar2.l;
                int i3 = 0;
                boolean z4 = false;
                while (true) {
                    ekg[] ekgVarArr = this.a;
                    if (i3 >= ekgVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (sroVar4.c(i3)) {
                        if (ekgVarArr[i3].b() != 1) {
                            z2 = false;
                            break;
                        }
                        if (((ekf[]) sroVar4.d)[i3].b != 0) {
                            z4 = true;
                        }
                    }
                    i3++;
                }
                R(z4 && z2);
            }
            list = immutableListBuild;
            sroVar = sroVar3;
            exiVar = exiVar5;
        } else {
            if (!evzVar.equals(ejxVar.c)) {
                sroVar2 = this.o;
                exiVar3 = exi.a;
                listOf = ImmutableList.of();
            }
            exiVar = exiVar3;
            sroVar = sroVar2;
            list = listOf;
        }
        if (z) {
            ejd ejdVar = this.H;
            if (!ejdVar.d || ejdVar.e == 5) {
                ejdVar.a = true;
                ejdVar.d = true;
                ejdVar.e = i;
            } else {
                a.H(i == 5);
            }
        }
        return this.G.k(evzVar, j, j2, j3, k(), exiVar, sroVar, list);
    }

    private final void q() {
        int i = 0;
        while (true) {
            ekg[] ekgVarArr = this.a;
            if (i >= ekgVarArr.length) {
                return;
            }
            ekg ekgVar = ekgVarArr[i];
            eki ekiVar = this.E ? this.D : null;
            ekgVar.a.s(18, ekiVar);
            ekc ekcVar = ekgVar.c;
            if (ekcVar != null) {
                ekcVar.s(18, ekiVar);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r() {
        /*
            r11 = this;
            boolean r0 = r11.A
            if (r0 == 0) goto L59
            boolean r0 = r11.af()
            if (r0 != 0) goto Lb
            goto L59
        Lb:
            ekg[] r0 = r11.a
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r0.length
            if (r2 >= r3) goto L52
            r3 = r0[r2]
            int r4 = r3.a()
            eib r5 = r11.v
            boolean r6 = r3.k()
            if (r6 != 0) goto L21
            goto L45
        L21:
            int r6 = r3.d
            r7 = 4
            r8 = 1
            if (r6 == r7) goto L2e
            r9 = 2
            if (r6 != r9) goto L2c
            r6 = r9
            goto L2e
        L2c:
            r9 = r1
            goto L2f
        L2e:
            r9 = r8
        L2f:
            if (r9 == 0) goto L34
            ekc r10 = r3.a
            goto L39
        L34:
            ekc r10 = r3.c
            defpackage.a.aq(r10)
        L39:
            r3.d(r10, r5)
            r3.f(r9)
            if (r6 != r7) goto L42
            goto L43
        L42:
            r8 = r1
        L43:
            r3.d = r8
        L45:
            int r5 = r11.Q
            int r3 = r3.a()
            int r4 = r4 - r3
            int r5 = r5 - r4
            r11.Q = r5
            int r2 = r2 + 1
            goto Lf
        L52:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.X = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.r():void");
    }

    private final void s(int i) {
        ekg[] ekgVarArr = this.a;
        int iA = ekgVarArr[i].a();
        ekg ekgVar = ekgVarArr[i];
        ekc ekcVar = ekgVar.a;
        eib eibVar = this.v;
        ekgVar.d(ekcVar, eibVar);
        ekc ekcVar2 = ekgVar.c;
        if (ekcVar2 != null) {
            boolean z = ekg.o(ekcVar2) && ekgVar.d != 3;
            ekgVar.d(ekcVar2, eibVar);
            ekgVar.f(false);
            if (z) {
                ekgVar.i(true);
            }
        }
        ekgVar.d = 0;
        H(i, false);
        this.Q -= iA;
    }

    private final void t() {
        for (int i = 0; i < this.a.length; i++) {
            s(i);
        }
        this.X = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0437 A[EDGE_INSN: B:543:0x0437->B:253:0x0437 BREAK  A[LOOP:1: B:241:0x03f9->B:252:0x0425], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:596:0x060a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u() {
        /*
            Method dump skipped, instructions count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.u():void");
    }

    private final void v(ejk ejkVar, int i, boolean z, long j) {
        evz evzVar;
        boolean z2;
        eib eibVar;
        long j2;
        ekg ekgVar = this.a[i];
        if (ekgVar.n()) {
            return;
        }
        boolean z3 = ejkVar == this.x.d;
        sro sroVar = ejkVar.l;
        ekf ekfVar = ((ekf[]) sroVar.d)[i];
        ezf ezfVar = ((ezf[]) sroVar.e)[i];
        boolean z4 = ai() && this.G.f == 3;
        boolean z5 = !z && z4;
        this.Q++;
        ewx ewxVar = ejkVar.c[i];
        long j3 = this.R;
        long j4 = ejkVar.k;
        evz evzVar2 = ejkVar.g.a;
        eib eibVar2 = this.v;
        dze[] dzeVarArrQ = ekg.q(ezfVar);
        int i2 = ekgVar.d;
        if (i2 == 0) {
            evzVar = evzVar2;
            z2 = true;
            eibVar = eibVar2;
            j2 = j4;
        } else {
            if (i2 != 2 && i2 != 4) {
                ekgVar.f = true;
                ekc ekcVar = ekgVar.c;
                ekcVar.getClass();
                ekcVar.q(ekfVar, dzeVarArrQ, ewxVar, j3, z5, z3, j, j4, evzVar2);
                eibVar2.c(ekcVar);
                pku pkuVar = new pku(this);
                ekc ekcVarC = ekgVar.c(ejkVar);
                ekcVarC.getClass();
                ekcVarC.s(11, pkuVar);
                if (z4 || !z3) {
                }
                ekgVar.h();
                return;
            }
            evzVar = evzVar2;
            eibVar = eibVar2;
            j2 = j4;
            z2 = true;
        }
        ekgVar.e = z2;
        ekc ekcVar2 = ekgVar.a;
        ekcVar2.q(ekfVar, dzeVarArrQ, ewxVar, j3, z5, z3, j, j2, evzVar);
        eibVar.c(ekcVar2);
        pku pkuVar2 = new pku(this);
        ekc ekcVarC2 = ekgVar.c(ejkVar);
        ekcVarC2.getClass();
        ekcVarC2.s(11, pkuVar2);
        if (z4) {
        }
    }

    private final void w() {
        x(new boolean[this.a.length], this.x.e.c());
    }

    private final void x(boolean[] zArr, long j) {
        ekg[] ekgVarArr;
        long j2;
        ejk ejkVar = this.x.e;
        sro sroVar = ejkVar.l;
        int i = 0;
        while (true) {
            ekgVarArr = this.a;
            if (i >= ekgVarArr.length) {
                break;
            }
            if (!sroVar.c(i)) {
                ekgVarArr[i].g();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ekgVarArr.length) {
            if (!sroVar.c(i2) || ekgVarArr[i2].m(ejkVar)) {
                j2 = j;
            } else {
                j2 = j;
                v(ejkVar, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void y(IOException iOException, int i) {
        eii eiiVar = new eii(0, iOException, i);
        ejk ejkVar = this.x.d;
        if (ejkVar != null) {
            eiiVar = eiiVar.b(ejkVar.g.a);
        }
        edb.d("ExoPlayerImplInternal", "Playback error", eiiVar);
        W(false, false);
        this.G = this.G.f(eiiVar);
    }

    private final void z(boolean z) {
        ejk ejkVar = this.x.g;
        evz evzVar = ejkVar == null ? this.G.c : ejkVar.g.a;
        boolean zEquals = this.G.k.equals(evzVar);
        if (!zEquals) {
            this.G = this.G.d(evzVar);
        }
        ejx ejxVar = this.G;
        ejxVar.q = ejkVar == null ? ejxVar.s : ejkVar.a();
        this.G.r = k();
        if ((!zEquals || z) && ejkVar != null && ejkVar.e) {
            evz evzVar2 = ejkVar.g.a;
            an(ejkVar.l);
        }
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        this.d.h(9, (evx) ewzVar).l();
    }

    @Override // defpackage.fbu
    public final void c(long j, long j2, dze dzeVar, MediaFormat mediaFormat) {
        if (this.F) {
            this.d.g(37).l();
        }
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        this.d.h(8, evxVar).l();
    }

    @Override // defpackage.ezj
    public final void e() {
        this.d.f(10);
    }

    public final void f(dyo dyoVar, boolean z) {
        this.d.j(31, z ? 1 : 0, 0, dyoVar).l();
    }

    public final boolean g() {
        if (!this.E) {
            return false;
        }
        boolean z = this.D.g;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [eje] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.handleMessage(android.os.Message):boolean");
    }
}
