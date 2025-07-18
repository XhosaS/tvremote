package defpackage;

import android.text.TextUtils;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lmg implements ekm, llk {
    final /* synthetic */ lmi a;

    public lmg(lmi lmiVar) {
        this.a = lmiVar;
    }

    private static final int aw(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? -1 : 4;
        }
        return 2;
    }

    @Override // defpackage.ekm
    public final void F(ekl eklVar, int i) {
        lmi lmiVar = this.a;
        ExoPlayer exoPlayer = lmiVar.f;
        if (exoPlayer.an() != lmiVar.O) {
            boolean zAn = exoPlayer.an();
            lmiVar.O = zAn;
            if (zAn) {
                av();
            } else {
                au();
            }
        }
    }

    @Override // defpackage.ekm
    public final void P(ekl eklVar, String str, long j) {
        this.a.d(12, eklVar.a, j);
    }

    @Override // defpackage.ekm
    public final void Y(evq evqVar, evv evvVar) {
        int i;
        kzo kzoVar;
        StringBuilder sb = new StringBuilder("Loading completed with time ");
        long j = evqVar.b;
        sb.append(j);
        krd.f(sb.toString());
        lmi lmiVar = this.a;
        kzo[] kzoVarArr = lmiVar.z;
        String str = (kzoVarArr == null || (i = lmiVar.A) >= kzoVarArr.length || (kzoVar = kzoVarArr[i]) == null) ? "" : kzoVar.c;
        String strD = ksh.d(evvVar.c.N);
        if (!str.isEmpty() && !strD.isEmpty() && !str.equals(strD) && !lmiVar.S) {
            lmd lmdVar = lmiVar.E;
            lmiVar.s.e(str, strD, lmdVar != null ? lmdVar.b : "");
            lmiVar.S = true;
        }
        int i2 = evvVar.a;
        if (i2 == 2) {
            lmiVar.g.b(14, j - evqVar.c, j);
            return;
        }
        if (i2 == 1 && evvVar.b == 2) {
            lkp lkpVar = lmiVar.T;
            long j2 = evvVar.e;
            long j3 = evvVar.f;
            long j4 = evqVar.c;
            if (lkpVar.M) {
                return;
            }
            long j5 = lkpVar.O;
            if (j5 < j2 || j5 > j3) {
                return;
            }
            lkpVar.M = true;
            long jAi = lkpVar.O + lkpVar.b.ai();
            if (j4 != 0) {
                float f = (j3 - j2) / j4;
                if (f != 0.0f) {
                    float f2 = (jAi - j2) / f;
                    long j6 = j - j4;
                    lkpVar.p.b(15, j6, j6 + ((int) f2));
                }
            }
        }
    }

    @Override // defpackage.ekm
    public final void ah(ekl eklVar, Object obj) {
        lmi lmiVar = this.a;
        if (obj == lmiVar.u || lmiVar.t.a() == obj) {
            lmiVar.t.c();
        }
    }

    @Override // defpackage.ekm
    public final void am(ekl eklVar, String str, long j) {
        this.a.d(13, eklVar.a, j);
    }

    @Override // defpackage.ekm
    public final void ao(int i, int i2) {
        lmi lmiVar = this.a;
        lmiVar.M = i;
        lmiVar.N = i2;
        lmiVar.t.f(i, i2);
    }

    @Override // defpackage.ekm
    public final void aq(ekl eklVar, int i) {
        lnr lnrVar = this.a.h;
        a.ab(lnrVar.q);
        int iO = lnrVar.O();
        lnrVar.l.b.n += i;
        Iterator it = lnrVar.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).e(iO, i);
        }
    }

    @Override // defpackage.ekm
    public final void ar(ekl eklVar, evq evqVar, evv evvVar, IOException iOException) {
        if (iOException instanceof efm) {
            efm efmVar = (efm) iOException;
            lmi lmiVar = this.a;
            lmiVar.h.T(16, efmVar.c, efmVar, lmiVar.a());
        } else if (iOException instanceof efl) {
            efl eflVar = (efl) iOException;
            lmi lmiVar2 = this.a;
            String str = eflVar.c;
            lmiVar2.h.T(17, llx.b(null), eflVar, lmiVar2.a());
        } else {
            lmi lmiVar3 = this.a;
            lmiVar3.h.T(7, llx.b(iOException.getMessage()), iOException, lmiVar3.a());
        }
        krd.f("Error occurred during load at position " + this.a.a() + " and exception " + iOException.getMessage() + " but load was not cancelled");
    }

    @Override // defpackage.ekm
    public final void at(eao eaoVar, dwi dwiVar) {
        int iA;
        boolean z;
        int i;
        int i2 = 4;
        if (((dzb) dwiVar.a).d(4, 5)) {
            boolean zAl = eaoVar.al();
            int iBf = eaoVar.bf();
            lmi lmiVar = this.a;
            int iU = lmi.u(iBf);
            boolean zAn = eaoVar.an();
            lkp lkpVar = lmiVar.T;
            lmi lmiVar2 = lkpVar.V;
            boolean z2 = false;
            if (lmiVar2 == null) {
                krd.b("Player is null when attempting to log player state change");
                iA = 0;
            } else {
                iA = lmiVar2.a();
            }
            lnr lnrVar = lkpVar.o;
            a.ab(lnrVar.q);
            int iO = lnrVar.O();
            lnf lnfVar = lnrVar.l;
            lnfVar.k = zAl;
            lnfVar.l = iU;
            lnfVar.c(iO);
            Iterator it = lnrVar.o.iterator();
            while (it.hasNext()) {
                ((lnn) it.next()).k(iO, iA, zAl, iU);
            }
            if (iU == 1) {
                z = true;
                i = 3;
                if (lkpVar.H != 2) {
                    i2 = 0;
                }
            } else if (iU == 3) {
                z = true;
                i = 3;
                i2 = true != zAl ? 3 : 1;
            } else if (iU == 4) {
                tst tstVarA = lkpVar.z.a(zAn);
                if (tstVarA.g()) {
                    if (zAn) {
                        Object objC = tstVarA.c();
                        int iO2 = lnrVar.O();
                        Iterator it2 = lnrVar.o.iterator();
                        while (it2.hasNext()) {
                            ((lnn) it2.next()).b(iO2, (lih) objC);
                        }
                    } else {
                        Object objC2 = tstVarA.c();
                        int iO3 = lnrVar.O();
                        Iterator it3 = lnrVar.o.iterator();
                        while (it3.hasNext()) {
                            ((lnn) it3.next()).a(iO3, (lih) objC2);
                        }
                    }
                }
                lkpVar.p.c(10);
                lkpVar.c(0);
                if (zAl) {
                    lmy lmyVar = lkpVar.m;
                    if (lmyVar.g == 0) {
                        lmyVar.g = System.currentTimeMillis();
                        lmyVar.h = 0L;
                    }
                    if (lkpVar.L) {
                        z = true;
                        i = 3;
                        lkpVar.g.execute(new jcp(lkpVar, System.currentTimeMillis() + lkpVar.N.c, new kuh((ksn) lkpVar.l.g(), lkpVar.i), 3));
                        lkpVar.L = false;
                    } else {
                        z = true;
                        i = 3;
                    }
                    i2 = 2;
                } else {
                    z = true;
                    i = 3;
                    lkpVar.m.h = System.currentTimeMillis();
                    i2 = 3;
                }
                lkpVar.b();
            } else if (iU != 5) {
                z = true;
                i = 3;
                i2 = 0;
            } else {
                lkpVar.H = 3;
                i2 = 5;
                z = true;
                i = 3;
            }
            lkpVar.l(i2, null);
            if (lmiVar.f.bf() == i && !lmiVar.s()) {
                z2 = z;
            }
            if (lmiVar.B != z2) {
                lmiVar.B = z2;
                if (z2) {
                    lkpVar.d((int) (lmiVar.k.a / 1000));
                }
            }
            if (iBf == i) {
                lmiVar.p();
            }
        }
    }

    public final void au() {
        lmi lmiVar = this.a;
        ((lmk) lmiVar.y[2]).a = false;
        lkp lkpVar = (lkp) lmiVar.d;
        lkpVar.z.b();
        lkpVar.U.a.onAdPlaybackCompleted();
    }

    public final void av() {
        lmi lmiVar = this.a;
        ((lmk) lmiVar.y[2]).a = true;
        lkp lkpVar = (lkp) lmiVar.d;
        lkpVar.z.c();
        lkpVar.U.a.onAdPlaybackStarted();
    }

    @Override // defpackage.ekm
    public final void g(ekl eklVar, int i, long j, long j2) {
        lmi lmiVar = this.a;
        lnr lnrVar = lmiVar.h;
        int iA = lmiVar.a();
        a.ab(lnrVar.q);
        int iO = lnrVar.O();
        lnf lnfVar = lnrVar.l;
        lnfVar.b.m++;
        lnfVar.a();
        Iterator it = lnrVar.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).s(iO, iA, 29, 0, null);
        }
    }

    @Override // defpackage.ekm
    public final void h(ekl eklVar, int i, long j, long j2) {
        lmi lmiVar = this.a;
        if (lmiVar.C) {
            lme lmeVar = lmiVar.n;
            if (lmeVar.d != null) {
                vtw vtwVarM = ldp.a.m();
                int size = ((ldr) lmeVar.d.b).d.size();
                vtw vtwVar = lmeVar.d;
                vuc vucVar = vtwVar.b;
                int i2 = ((ldr) vucVar).e + 1;
                int i3 = 0;
                if (i2 % 5760 != 0) {
                    if (!vucVar.A()) {
                        vtwVar.u();
                    }
                    ldr ldrVar = (ldr) vtwVar.b;
                    ldrVar.b |= 2;
                    ldrVar.e = i2;
                } else {
                    if (!vucVar.A()) {
                        vtwVar.u();
                    }
                    ldr ldrVar2 = (ldr) vtwVar.b;
                    ldrVar2.b |= 2;
                    ldrVar2.e = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        if (vtwVarM.a.A()) {
                            throw new IllegalArgumentException("Default instance must be immutable.");
                        }
                        vtwVarM.b = vtwVarM.q();
                        vtwVarM.x(lmeVar.d.af(i4));
                        vuc vucVar2 = vtwVarM.b;
                        float f = ((ldp) vucVar2).d;
                        if (!vucVar2.A()) {
                            vtwVarM.u();
                        }
                        ldp ldpVar = (ldp) vtwVarM.b;
                        ldpVar.b |= 2;
                        ldpVar.d = (int) (f * 0.7f);
                        lmeVar.d.bt(i4, vtwVarM);
                    }
                }
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    long j3 = j2 / 8;
                    ldp ldpVarAf = lmeVar.d.af(i3);
                    if (j3 < ldpVarAf.c) {
                        i3++;
                    } else {
                        if (vtwVarM.a.A()) {
                            throw new IllegalArgumentException("Default instance must be immutable.");
                        }
                        vtwVarM.b = vtwVarM.q();
                        vtwVarM.x(ldpVarAf);
                        vuc vucVar3 = vtwVarM.b;
                        int i5 = ((ldp) vucVar3).d + 1;
                        if (!vucVar3.A()) {
                            vtwVarM.u();
                        }
                        ldp ldpVar2 = (ldp) vtwVarM.b;
                        ldpVar2.b |= 2;
                        ldpVar2.d = i5;
                        lmeVar.d.bt(i3, vtwVarM);
                    }
                }
            }
            lnr lnrVar = lmiVar.h;
            a.ab(lnrVar.q);
            lnrVar.O();
            Iterator it = lnrVar.o.iterator();
            while (it.hasNext()) {
                ((lnn) it.next()).r(j2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekm
    public final void i(ekl eklVar, evv evvVar) {
        int i;
        int i2 = evvVar.b;
        if (i2 != 2) {
            if (i2 == 1) {
                dze dzeVar = evvVar.c;
                if (dzeVar != null) {
                    krd.b("onDownstreamFormatChanged. mediaLoadData.trackFormat = ".concat(dzeVar.toString()));
                }
                lmi lmiVar = this.a;
                int iB = kfw.B(dzeVar.K);
                int i3 = evvVar.d;
                String str = dzeVar.N;
                int i4 = dzeVar.P;
                lnr lnrVar = lmiVar.h;
                a.ab(lnrVar.q);
                int iO = lnrVar.O();
                lnrVar.l.b(iO, iB);
                Iterator it = lnrVar.o.iterator();
                while (it.hasNext()) {
                    ((lnn) it.next()).c(iO, iB, aw(i3), str, i4);
                }
                return;
            }
            return;
        }
        lmi lmiVar2 = this.a;
        int iB2 = kfw.B(evvVar.c.K);
        a.ab(lmiVar2.E != null);
        lmd lmdVar = lmiVar2.E;
        if (lmdVar.d) {
            i = ((lvd) lmdVar.f.get(0)).b.c;
        } else {
            boolean zI = lmiVar2.c.g().i();
            if ((lmiVar2.b.m() != 3 && zI && lmiVar2.e) || (i = lmiVar2.K) == -1) {
                i = lmiVar2.L;
            }
        }
        lnr lnrVar2 = lmiVar2.h;
        int i5 = evvVar.d;
        a.ab(lnrVar2.q);
        int iO2 = lnrVar2.O();
        lnrVar2.l.b(iO2, iB2);
        lny lnyVar = lnrVar2.m;
        if (!TextUtils.isEmpty(lnyVar.d)) {
            for (Map.Entry entry : lnyVar.b.entrySet()) {
                String str2 = (String) ((Map) entry.getValue()).get("fmt");
                if (!TextUtils.isEmpty(str2) && str2.equals(Integer.toString(iB2))) {
                    lnyVar.d = (String) entry.getKey();
                }
            }
        }
        Iterator it2 = lnrVar2.o.iterator();
        while (it2.hasNext()) {
            ((lnn) it2.next()).g(iO2, iB2, i, aw(i5));
        }
    }

    @Override // defpackage.ekm
    public final void p(ekl eklVar, boolean z) {
        lnr lnrVar = this.a.h;
        a.ab(lnrVar.q);
        krd.e("Loading state changed to " + z + " session time " + lnrVar.O());
        Iterator it = lnrVar.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).u(z);
        }
    }

    @Override // defpackage.ekm
    public final void r(ekl eklVar, evq evqVar, evv evvVar) {
        evz evzVar = eklVar.d;
        if (evzVar != null && !evzVar.b()) {
            dze dzeVar = evvVar.c;
            int iB = kfw.B(dzeVar.K);
            int i = evvVar.b;
            if (i == 2) {
                lmi lmiVar = this.a;
                if (iB != lmiVar.F) {
                    int i2 = evvVar.d;
                    if (i2 == 1) {
                        i2 = lmiVar.J;
                    }
                    lnr lnrVar = lmiVar.h;
                    a.ab(lnrVar.q);
                    int iO = lnrVar.O();
                    StringBuilder sb = new StringBuilder("Format selected with itag ");
                    sb.append(iB);
                    sb.append(" and trigger ");
                    int iAw = aw(i2);
                    sb.append(iAw);
                    sb.append(" with sessionTime ");
                    sb.append(iO);
                    krd.e(sb.toString());
                    lnrVar.l.b.s++;
                    Iterator it = lnrVar.o.iterator();
                    while (it.hasNext()) {
                        ((lnn) it.next()).h(iO, iB, iAw);
                    }
                    lmiVar.F = iB;
                    lmiVar.H = dzeVar.ag;
                }
            } else if (i == 1) {
                lmi lmiVar2 = this.a;
                if (iB != lmiVar2.G) {
                    lmiVar2.G = iB;
                }
            }
            this.a.r(ieg.f(evvVar));
        }
        krd.f("Loading started with elapsed time " + evqVar.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    @Override // defpackage.ekm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(defpackage.ekl r25, defpackage.eah r26) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmg.x(ekl, eah):void");
    }

    @Override // defpackage.ekm
    public final void z(ekl eklVar, ean eanVar, ean eanVar2, int i) {
        lmi lmiVar = this.a;
        ExoPlayer exoPlayer = lmiVar.f;
        if (exoPlayer.an() != lmiVar.O) {
            boolean zAn = exoPlayer.an();
            lmiVar.O = zAn;
            if (zAn) {
                av();
            } else {
                au();
            }
        }
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void N() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void S() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void T() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ae() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Q(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void R(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void an(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void j(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void k(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void l(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void o(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void B(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void C(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void D(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void G(ekl eklVar, ebh ebhVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void H(ekl eklVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void I(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void J(ekl eklVar, ehw ehwVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void L(ekl eklVar, ebo eboVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void M(ekl eklVar, float f) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void a(ekl eklVar, dyo dyoVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ab(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ap(ekl eklVar, dze dzeVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void as(ekl eklVar, dze dzeVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void b(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void c(ekl eklVar, long j) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void d(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void e(ekl eklVar, elt eltVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void f(ekl eklVar, elt eltVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void m(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void n(ekl eklVar, Exception exc) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void q(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void s(ekl eklVar, ead eadVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void u(ekl eklVar, eai eaiVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void v(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void w(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void E(ekl eklVar, int i, int i2) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void K(ekl eklVar, long j, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void t(ekl eklVar, boolean z, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void y(ekl eklVar, boolean z, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void A(ekl eklVar, int i, int i2, boolean z) {
    }
}
