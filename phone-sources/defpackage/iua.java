package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;
import j$.time.Duration;
import java.net.InetAddress;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iua implements ith {
    public static final Duration a;
    public final String b;
    public String c;
    public final boolean d;
    public nmq e;
    public String f;
    public wlx g;
    public String h;
    public fux i;
    public iwu j;
    public boolean k;
    public boolean l;
    public final idr m;
    public final jah n;
    public final yvc o;
    public final kmx p;
    private final lie q;
    private final itz r;
    private final itw s;
    private final npd t;
    private final kmy u;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
    }

    public iua(kmy kmyVar, jah jahVar, String str, String str2, boolean z, lie lieVar, iwu iwuVar, fux fuxVar) {
        nmj nmjVarF;
        now nowVar;
        str.getClass();
        this.u = kmyVar;
        this.n = jahVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.q = lieVar;
        kmx kmxVar = new kmx(this, 1);
        this.p = kmxVar;
        this.r = new itz(this);
        this.s = new itw(this);
        nmg nmgVarC = nmg.c();
        this.t = (nmgVarC == null || (nmjVarF = nmgVarC.f()) == null || (nowVar = nmjVarF.h) == null) ? null : nowVar.a();
        idz idzVar = new idz(new itx(E(), (itg) null, 5));
        this.m = idzVar;
        this.o = yvd.a(idzVar.a());
        y(iwuVar);
        x(fuxVar);
        nmg nmgVarC2 = nmg.c();
        if (nmgVarC2 != null) {
            nmgVarC2.h().c(kmxVar, nmq.class);
        }
    }

    private final itg D() {
        iwr iwrVar;
        iwe iweVarG;
        iwu iwuVar = this.j;
        if (iwuVar != null && (iwrVar = iwuVar.e) != null && (iweVarG = iwrVar.g()) != null) {
            return new itg(iweVarG.a);
        }
        nmq nmqVar = this.e;
        if (nmqVar == null) {
            return null;
        }
        return new itg(nmqVar.n());
    }

    private final boolean E() {
        CastDevice castDeviceC;
        iwr iwrVar;
        iwu iwuVar = this.j;
        if (iwuVar != null && (iwrVar = iwuVar.e) != null && iwrVar.q()) {
            return true;
        }
        nmq nmqVar = this.e;
        return (nmqVar == null || (castDeviceC = nmqVar.c()) == null || castDeviceC.g(6144)) ? false : true;
    }

    public final boolean A(fux fuxVar, boolean z) {
        InetAddress inetAddress;
        String hostAddress;
        InetAddress inetAddress2;
        fux fuxVar2 = this.i;
        if (fuxVar2 == null) {
            iwu iwuVar = this.j;
            if (iwuVar == null) {
                return false;
            }
            tmd tmdVar = iwuVar.b;
            if (tmdVar.c == 2) {
                return !z && yks.e(fuxVar.e, tmdVar.a());
            }
            CastDevice castDeviceC = CastDevice.c(fuxVar.q);
            if (castDeviceC == null) {
                return false;
            }
            return yks.e(ipc.k(tmdVar), castDeviceC.c.getHostAddress());
        }
        if (yks.e(fuxVar.d, fuxVar2.d)) {
            return true;
        }
        CastDevice castDeviceC2 = CastDevice.c(fuxVar2.q);
        if (castDeviceC2 == null || (inetAddress = castDeviceC2.c) == null || (hostAddress = inetAddress.getHostAddress()) == null) {
            return false;
        }
        CastDevice castDeviceC3 = CastDevice.c(fuxVar.q);
        String hostAddress2 = null;
        if (castDeviceC3 != null && (inetAddress2 = castDeviceC3.c) != null) {
            hostAddress2 = inetAddress2.getHostAddress();
        }
        return yks.e(hostAddress, hostAddress2);
    }

    public final boolean B(tmd tmdVar, boolean z) {
        iwu iwuVar = this.j;
        if (iwuVar != null) {
            return iwuVar.b.b(tmdVar);
        }
        if (tmdVar.c == 2) {
            return !z && yks.e(tmdVar.a(), this.c);
        }
        fux fuxVar = this.i;
        CastDevice castDeviceC = CastDevice.c(fuxVar != null ? fuxVar.q : null);
        if (castDeviceC == null) {
            return false;
        }
        return yks.e(ipc.k(tmdVar), castDeviceC.c.getHostAddress());
    }

    public final void C() {
        this.k = true;
    }

    @Override // defpackage.ith
    public final fux a() {
        return this.i;
    }

    @Override // defpackage.ith
    public final /* synthetic */ iwf b() {
        return this.j;
    }

    @Override // defpackage.ith
    public final String c() {
        return this.b;
    }

    @Override // defpackage.ith
    public final String d() {
        return this.c;
    }

    @Override // defpackage.ith
    public final void e() {
        iwr iwrVar;
        iwu iwuVar = this.j;
        if (iwuVar == null || (iwrVar = iwuVar.e) == null || !iwrVar.q()) {
            nmq nmqVar = this.e;
            if (nmqVar != null) {
                nmqVar.j(Math.max(0.0d, nmqVar.a() - 0.1d));
                return;
            }
            return;
        }
        iwu iwuVar2 = this.j;
        if (iwuVar2 != null) {
            iwuVar2.h(25, 3);
        }
    }

    @Override // defpackage.ith
    public final void f() {
        iwr iwrVar;
        iwu iwuVar = this.j;
        if (iwuVar == null || (iwrVar = iwuVar.e) == null || !iwrVar.q()) {
            nmq nmqVar = this.e;
            if (nmqVar != null) {
                nmqVar.j(Math.min(1.0d, nmqVar.a() + 0.1d));
                return;
            }
            return;
        }
        iwu iwuVar2 = this.j;
        if (iwuVar2 != null) {
            iwuVar2.h(24, 3);
        }
    }

    @Override // defpackage.ith
    public final void g(long j) {
        nqj nqjVarD;
        nmq nmqVar = this.e;
        if (nmqVar == null || (nqjVarD = nmqVar.d()) == null) {
            return;
        }
        nqjVarD.F(new nlm(j));
    }

    @Override // defpackage.ith
    public final void h() {
        tls tlsVar;
        iwu iwuVar = this.j;
        if (iwuVar == null || (tlsVar = iwuVar.l) == null) {
            return;
        }
        tlsVar.d(true);
    }

    @Override // defpackage.ith
    public final void i() {
        tls tlsVar;
        iwu iwuVar = this.j;
        if (iwuVar == null || (tlsVar = iwuVar.l) == null) {
            return;
        }
        tlsVar.d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ith
    public final void j() {
        iwr iwrVar;
        iwu iwuVar = this.j;
        if (iwuVar != null && (iwrVar = iwuVar.e) != null && iwrVar.q()) {
            iwu iwuVar2 = this.j;
            if (iwuVar2 != null) {
                iwuVar2.h(91, 3);
                return;
            }
            return;
        }
        nmq nmqVar = this.e;
        if (nmqVar != null) {
            boolean zN = nmqVar.n();
            nmq nmqVar2 = this.e;
            if (nmqVar2 != null) {
                final boolean z = !zN;
                ocv.aC();
                nkn nknVar = nmqVar2.c;
                if (nknVar == 0 || !nknVar.a()) {
                    return;
                }
                oaf oafVar = new oaf();
                final nla nlaVar = (nla) nknVar;
                oafVar.a = new nzz() { // from class: nkw
                    @Override // defpackage.nzz
                    public final void a(Object obj, Object obj2) {
                        nrt nrtVar = (nrt) obj;
                        nsa nsaVar = (nsa) nrtVar.L();
                        Context context = nrtVar.u;
                        nla nlaVar2 = nlaVar;
                        double d = nlaVar2.j;
                        boolean z2 = nlaVar2.k;
                        nwl nwlVarQ = ocv.q();
                        Parcel parcelK = nsaVar.k();
                        int i = ifl.a;
                        parcelK.writeInt(z ? 1 : 0);
                        parcelK.writeDouble(d);
                        parcelK.writeInt(z2 ? 1 : 0);
                        ifl.c(parcelK, nwlVarQ);
                        nsaVar.n(8, parcelK);
                        ((kwy) obj2).u(null);
                    }
                };
                oafVar.c = 8412;
                ((nwq) nknVar).t(oafVar.a());
            }
        }
    }

    @Override // defpackage.ith
    public final void k() {
        nqj nqjVarD;
        iwu iwuVar = this.j;
        if (iwuVar != null) {
            iwuVar.h(85, 3);
            return;
        }
        nmq nmqVar = this.e;
        if (nmqVar == null || (nqjVarD = nmqVar.d()) == null) {
            return;
        }
        if (nqjVarD.w()) {
            nqjVarD.A();
        } else if (nqjVarD.v()) {
            nqjVarD.B();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    @Override // defpackage.ith
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(defpackage.wpm r6) {
        /*
            r5 = this;
            boolean r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L6
            goto L64
        L6:
            int r0 = r6.b
            r0 = r0 & 4
            r2 = 0
            if (r0 == 0) goto L1a
            fux r0 = r5.i
            if (r0 == 0) goto L63
            kmy r3 = r5.u
            boolean r0 = r3.d(r0, r6)
            if (r0 != r1) goto L63
            goto L64
        L1a:
            boolean r0 = defpackage.ipc.j(r6)
            if (r0 == 0) goto L63
            fux r0 = r5.i
            if (r0 == 0) goto L2d
            kmy r3 = r5.u
            boolean r0 = r3.d(r0, r6)
            if (r0 != r1) goto L2d
            goto L64
        L2d:
            iwu r0 = r5.j
            if (r0 == 0) goto L63
            iwr r3 = r0.e
            ivy r3 = r3.e()
            ivy r4 = defpackage.ivy.g
            if (r3 != r4) goto L40
            tlp r0 = r0.k
            if (r0 != 0) goto L40
            goto L63
        L40:
            wld r0 = r6.h
            if (r0 != 0) goto L46
            wld r0 = defpackage.wld.a
        L46:
            java.lang.String r0 = r0.c
            r0.getClass()
            int r0 = r0.length()
            if (r0 != 0) goto L52
            goto L63
        L52:
            wld r0 = r6.h
            if (r0 != 0) goto L58
            wld r0 = defpackage.wld.a
        L58:
            java.lang.String r0 = r0.b
            r0.getClass()
            int r0 = r0.length()
            if (r0 != 0) goto L64
        L63:
            r1 = r2
        L64:
            if (r1 != 0) goto L8c
            int r0 = r6.b
            r0 = r0 & 4
            if (r0 == 0) goto L73
            wld r6 = r6.e
            if (r6 != 0) goto L79
            wld r6 = defpackage.wld.a
            goto L79
        L73:
            wld r6 = r6.h
            if (r6 != 0) goto L79
            wld r6 = defpackage.wld.a
        L79:
            lie r0 = r5.q
            if (r6 == 0) goto L81
            java.lang.String r2 = r6.b
            if (r2 != 0) goto L83
        L81:
            java.lang.String r2 = "UNKNOWN"
        L83:
            if (r6 == 0) goto L88
            java.lang.String r6 = r6.c
            goto L89
        L88:
            r6 = 0
        L89:
            r0.F(r2, r6, r5)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iua.l(wpm):boolean");
    }

    @Override // defpackage.ith
    public final boolean m() {
        return this.l;
    }

    @Override // defpackage.ith
    public final boolean n() {
        iwu iwuVar = this.j;
        if (iwuVar != null) {
            return iwuVar.m.contains(tmf.FIND_MY_REMOTE);
        }
        return false;
    }

    @Override // defpackage.ith
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.ith
    public final boolean p() {
        return this.k;
    }

    @Override // defpackage.ith
    public final yvc q() {
        return this.o;
    }

    public final void r(nmq nmqVar) {
        nqj nqjVarD;
        nqj nqjVarD2 = nmqVar.d();
        if (yks.e(this.e, nmqVar) || nqjVarD2 == null) {
            return;
        }
        krd.b("Attaching cast session for device: " + this.c + ".");
        nmq nmqVar2 = this.e;
        if (nmqVar2 != null && (nqjVarD = nmqVar2.d()) != null) {
            nqjVarD.H(this.r);
            nqjVarD.l(this.s);
        }
        this.e = nmqVar;
        nqjVarD2.G(this.r);
        itw itwVar = this.s;
        ocv.aC();
        if (itwVar != null) {
            Map map = nqjVarD2.g;
            if (!map.containsKey(itwVar)) {
                Map map2 = nqjVarD2.h;
                nqi nqiVar = (nqi) map2.get(1000L);
                if (nqiVar == null) {
                    nqiVar = new nqi(nqjVarD2);
                    map2.put(1000L, nqiVar);
                }
                nqiVar.a.add(itwVar);
                map.put(itwVar, nqiVar);
                if (nqjVarD2.q()) {
                    nqiVar.a();
                }
            }
        }
        t();
    }

    public final void s() {
        nqj nqjVarD;
        krd.b("Detaching cast session for device: " + this.c + ".");
        nmq nmqVar = this.e;
        if (nmqVar != null && (nqjVarD = nmqVar.d()) != null) {
            nqjVarD.H(this.r);
            nqjVarD.l(this.s);
        }
        this.e = null;
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iua.t():void");
    }

    public final void u() {
        iwr iwrVar;
        Object objD;
        Object objA;
        iwr iwrVar2;
        iwu iwuVar = this.j;
        ivy ivyVarE = null;
        if (((iwuVar == null || (iwrVar2 = iwuVar.e) == null) ? null : iwrVar2.e()) == ivy.g) {
            this.l = true;
        } else {
            iwu iwuVar2 = this.j;
            if (iwuVar2 != null && (iwrVar = iwuVar2.e) != null) {
                ivyVarE = iwrVar.e();
            }
            if (ivyVarE == ivy.h) {
                this.l = false;
            }
        }
        idr idrVar = this.m;
        Object objA2 = idrVar.a();
        objA2.getClass();
        idrVar.c(new itx(((itf) objA2).c(), E(), D()));
        yvc yvcVar = this.o;
        do {
            objD = yvcVar.d();
            objA = idrVar.a();
            objA.getClass();
        } while (!yvcVar.f(objD, (itf) objA));
    }

    public final void v() {
        new Handler(Looper.getMainLooper()).post(new gfe(this, 20));
    }

    public final void w() {
        yvc yvcVar;
        Object objD;
        Object objA;
        itx itxVar = new itx(E(), (itg) null, 5);
        idr idrVar = this.m;
        idrVar.c(itxVar);
        do {
            yvcVar = this.o;
            objD = yvcVar.d();
            objA = idrVar.a();
            objA.getClass();
        } while (!yvcVar.f(objD, (itf) objA));
    }

    public final void x(fux fuxVar) {
        nmq nmqVarA;
        Set setI;
        this.i = fuxVar;
        if (fuxVar != null && !this.k) {
            kmy kmyVar = this.u;
            nmg nmgVarC = nmg.c();
            if (nmgVarC != null && (setI = nmgVarC.i(kmyVar.b.bq())) != null && setI.contains(fuxVar)) {
                C();
            }
        }
        nmg nmgVarC2 = nmg.c();
        if (nmgVarC2 != null && (nmqVarA = nmgVarC2.h().a()) != null && z(nmqVarA.c())) {
            r(nmqVarA);
        }
        t();
    }

    public final void y(iwu iwuVar) {
        idr idrVar;
        this.j = iwuVar;
        if (iwuVar != null) {
            C();
        } else {
            this.l = false;
        }
        if (iwuVar != null && (idrVar = iwuVar.f) != null) {
            idrVar.ea(new itm(this, 3));
        }
        u();
    }

    public final boolean z(CastDevice castDevice) {
        fux fuxVar = this.i;
        if (fuxVar == null || castDevice == null) {
            return false;
        }
        String strE = castDevice.e();
        CastDevice castDeviceC = CastDevice.c(fuxVar.q);
        return yks.e(strE, castDeviceC != null ? castDeviceC.e() : null);
    }
}
