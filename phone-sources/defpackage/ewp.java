package defpackage;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewp implements evx, fdr, ezr, ezu, ewv {
    public static final Map a;
    public static final dze b;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private long G;
    private boolean I;
    private int J;
    private final ews K;
    private final ezp L;
    private final eux M;
    private final eph N;
    private final eph O;
    private final sew Q;
    private iom R;
    public final String c;
    public evw g;
    public ffz h;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    private final Uri o;
    private final ees p;
    private final epd q;
    private final dze r;
    private final long s;
    private boolean v;
    private boolean w;
    private boolean x;
    private fef y;
    private boolean z;
    public final ezw d = new ezw("ProgressiveMediaPeriod");
    private final shx P = new shx();
    private final Runnable t = new emy(this, 12);
    public final Runnable e = new emy(this, 13);
    public final Handler f = edt.J();
    private ewo[] u = new ewo[0];
    public eww[] i = new eww[0];
    private long H = -9223372036854775807L;
    private int A = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        a = DesugarCollections.unmodifiableMap(map);
        dzd dzdVar = new dzd();
        dzdVar.a = "icy";
        dzdVar.d("application/x-icy");
        b = new dze(dzdVar);
    }

    public ewp(Uri uri, ees eesVar, eux euxVar, epd epdVar, eph ephVar, sew sewVar, eph ephVar2, ews ewsVar, ezp ezpVar, String str, dze dzeVar, long j) {
        this.o = uri;
        this.p = eesVar;
        this.q = epdVar;
        this.O = ephVar;
        this.Q = sewVar;
        this.N = ephVar2;
        this.K = ewsVar;
        this.L = ezpVar;
        this.c = str;
        this.r = dzeVar;
        this.M = euxVar;
        this.s = j;
    }

    private final void A() {
        a.ab(this.j);
        this.R.getClass();
        this.y.getClass();
    }

    private final void B() {
        ewm ewmVar = new ewm(this, this.o, this.p, this.M, this, this.P);
        if (this.j) {
            a.ab(C());
            long j = this.k;
            if (j != -9223372036854775807L && this.H > j) {
                this.m = true;
                this.H = -9223372036854775807L;
                return;
            }
            fef fefVar = this.y;
            fefVar.getClass();
            ewmVar.a(fefVar.b(this.H).a.c, this.H);
            for (eww ewwVar : this.i) {
                ewwVar.d = this.H;
            }
            this.H = -9223372036854775807L;
        }
        this.J = z();
        this.d.i(ewmVar, this, this.Q.h(this.A));
    }

    private final boolean C() {
        return this.H != -9223372036854775807L;
    }

    private final int z() {
        int iM = 0;
        for (eww ewwVar : this.i) {
            iM += ewwVar.m();
        }
        return iM;
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        A();
        if (!this.y.z()) {
            return 0L;
        }
        fed fedVarB = this.y.b(j);
        return ekjVar.a(j, fedVarB.a.b, fedVarB.b.b);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        long jK;
        A();
        if (this.m || this.E == 0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.H;
        }
        if (this.w) {
            int length = this.i.length;
            jK = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                iom iomVar = this.R;
                if (((boolean[]) iomVar.d)[i] && ((boolean[]) iomVar.b)[i] && !this.i[i].E()) {
                    jK = Math.min(jK, this.i[i].p());
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = k(false);
        }
        return jK == Long.MIN_VALUE ? this.G : jK;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        return c();
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void dn(ezt eztVar, long j, long j2, int i) {
        evq evqVar;
        ewm ewmVar = (ewm) eztVar;
        efw efwVar = ewmVar.b;
        if (i == 0) {
            long j3 = ewmVar.a;
            evqVar = new evq(ewmVar.d, j);
        } else {
            long j4 = ewmVar.a;
            evqVar = new evq(ewmVar.d, j, j2);
        }
        this.N.q(evqVar, 1, -1, null, 0, ewmVar.c, this.k, i);
    }

    @Override // defpackage.ezr
    /* renamed from: do */
    public final /* bridge */ /* synthetic */ aacv mo349do(ezt eztVar, long j, long j2, IOException iOException, int i) {
        aacv aacvVar;
        fef fefVar;
        ewm ewmVar = (ewm) eztVar;
        efw efwVar = ewmVar.b;
        long j3 = ewmVar.a;
        evq evqVar = new evq(ewmVar.d, j, j2);
        long j4 = ewmVar.c;
        String str = edt.a;
        long jI = sew.i(new zuw(iOException, i));
        if (jI == -9223372036854775807L) {
            aacvVar = ezw.f;
        } else {
            int iZ = z();
            int i2 = iZ > this.J ? 1 : 0;
            if (this.l || !((fefVar = this.y) == null || fefVar.a() == -9223372036854775807L)) {
                this.J = iZ;
            } else {
                boolean z = this.j;
                if (!z || y()) {
                    this.C = z;
                    this.G = 0L;
                    this.J = 0;
                    for (eww ewwVar : this.i) {
                        ewwVar.A();
                    }
                    ewmVar.a(0L, 0L);
                } else {
                    this.I = true;
                    aacvVar = ezw.e;
                }
            }
            aacvVar = new aacv(i2, jI);
        }
        this.N.p(evqVar, 1, -1, null, 0, ewmVar.c, this.k, iOException, !aacvVar.c());
        return aacvVar;
    }

    @Override // defpackage.fdr
    public final fel dq(int i, int i2) {
        return q(new ewo(i, false));
    }

    @Override // defpackage.evx
    public final void dr() throws eaf {
        v();
        if (this.m && !this.j) {
            throw new eaf("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        ewm ewmVar = (ewm) eztVar;
        efw efwVar = ewmVar.b;
        long j3 = ewmVar.a;
        this.N.n(new evq(ewmVar.d, j, j2), 1, -1, null, 0, ewmVar.c, this.k);
        if (z) {
            return;
        }
        for (eww ewwVar : this.i) {
            ewwVar.A();
        }
        if (this.E > 0) {
            evw evwVar = this.g;
            evwVar.getClass();
            evwVar.b(this);
        }
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        if (this.x) {
            return;
        }
        A();
        if (C()) {
            return;
        }
        Object obj = this.R.b;
        int length = this.i.length;
        for (int i = 0; i < length; i++) {
            this.i[i].I(j, ((boolean[]) obj)[i]);
        }
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void du(ezt eztVar, long j, long j2) {
        ewm ewmVar = (ewm) eztVar;
        if (this.k == -9223372036854775807L && this.y != null) {
            long jK = k(true);
            long j3 = jK == Long.MIN_VALUE ? 0L : jK + 10000;
            this.k = j3;
            this.K.b(j3, this.y, this.z);
        }
        efw efwVar = ewmVar.b;
        long j4 = ewmVar.a;
        this.N.o(new evq(ewmVar.d, j, j2), 1, -1, null, 0, ewmVar.c, this.k);
        this.m = true;
        evw evwVar = this.g;
        evwVar.getClass();
        evwVar.b(this);
    }

    @Override // defpackage.evx
    public final long e() {
        if (this.D) {
            this.D = false;
        } else {
            if (!this.C) {
                return -9223372036854775807L;
            }
            if (!this.m && z() <= this.J) {
                return -9223372036854775807L;
            }
            this.C = false;
        }
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // defpackage.evx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r9) {
        /*
            r8 = this;
            r8.A()
            iom r0 = r8.R
            java.lang.Object r0 = r0.d
            fef r1 = r8.y
            boolean r1 = r1.z()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.C = r1
            long r2 = r8.G
            r8.G = r9
            boolean r4 = r8.C()
            if (r4 == 0) goto L22
            r8.H = r9
            return r9
        L22:
            int r4 = r8.A
            r5 = 7
            if (r4 == r5) goto L6a
            boolean r4 = r8.m
            if (r4 != 0) goto L33
            ezw r4 = r8.d
            boolean r4 = r4.h()
            if (r4 == 0) goto L6a
        L33:
            eww[] r4 = r8.i
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L9b
            eww[] r6 = r8.i
            r6 = r6[r5]
            int r7 = r6.k()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L67
        L48:
            boolean r7 = r8.x
            if (r7 == 0) goto L53
            int r7 = r6.c
            boolean r6 = r6.G(r7)
            goto L59
        L53:
            boolean r7 = r8.m
            boolean r6 = r6.H(r9, r7)
        L59:
            if (r6 != 0) goto L67
            r6 = r0
            boolean[] r6 = (boolean[]) r6
            boolean r6 = r6[r5]
            if (r6 != 0) goto L6a
            boolean r6 = r8.w
            if (r6 != 0) goto L67
            goto L6a
        L67:
            int r5 = r5 + 1
            goto L37
        L6a:
            r8.I = r1
            r8.H = r9
            r8.m = r1
            r8.D = r1
            ezw r0 = r8.d
            boolean r2 = r0.h()
            if (r2 == 0) goto L8b
            eww[] r2 = r8.i
            int r3 = r2.length
        L7d:
            if (r1 >= r3) goto L87
            r4 = r2[r1]
            r4.t()
            int r1 = r1 + 1
            goto L7d
        L87:
            r0.b()
            return r9
        L8b:
            r0.c()
            eww[] r0 = r8.i
            int r2 = r0.length
        L91:
            if (r1 >= r2) goto L9b
            r3 = r0[r1]
            r3.A()
            int r1 = r1 + 1
            goto L91
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewp.f(long):long");
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        ezf ezfVar;
        A();
        iom iomVar = this.R;
        Object obj = iomVar.a;
        Object obj2 = iomVar.b;
        int i = this.E;
        int i2 = 0;
        for (int i3 = 0; i3 < ezfVarArr.length; i3++) {
            ewx ewxVar = ewxVarArr[i3];
            if (ewxVar != null && (ezfVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((ewn) ewxVar).a;
                boolean[] zArr3 = (boolean[]) obj2;
                a.ab(zArr3[i4]);
                this.E--;
                zArr3[i4] = false;
                ewxVarArr[i3] = null;
            }
        }
        boolean z = !this.B ? j == 0 || this.x : i != 0;
        for (int i5 = 0; i5 < ezfVarArr.length; i5++) {
            if (ewxVarArr[i5] == null && (ezfVar = ezfVarArr[i5]) != null) {
                a.ab(ezfVar.t() == 1);
                a.ab(ezfVar.q(0) == 0);
                int iA = ((exi) obj).a(ezfVar.h());
                a.ab(!r7[iA]);
                this.E++;
                ((boolean[]) obj2)[iA] = true;
                this.D = ezfVar.g().ae | this.D;
                ewxVarArr[i5] = new ewn(this, iA);
                zArr2[i5] = true;
                if (!z) {
                    eww ewwVar = this.i[iA];
                    z = (ewwVar.k() == 0 || ewwVar.H(j, true)) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.C = false;
            this.D = false;
            ezw ezwVar = this.d;
            if (ezwVar.h()) {
                eww[] ewwVarArr = this.i;
                int length = ewwVarArr.length;
                while (i2 < length) {
                    ewwVarArr[i2].t();
                    i2++;
                }
                ezwVar.b();
            } else {
                this.m = false;
                eww[] ewwVarArr2 = this.i;
                int length2 = ewwVarArr2.length;
                while (i2 < length2) {
                    ewwVarArr2[i2].A();
                    i2++;
                }
            }
        } else if (z) {
            j = f(j);
            while (i2 < ewxVarArr.length) {
                if (ewxVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.B = true;
        return j;
    }

    @Override // defpackage.evx
    public final exi h() {
        A();
        return (exi) this.R.a;
    }

    @Override // defpackage.evx
    public final /* synthetic */ List i(List list) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.fdr
    public final void j() {
        this.v = true;
        this.f.post(this.t);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            eww[] r3 = r5.i
            int r3 = r3.length
            if (r0 >= r3) goto L26
            if (r6 != 0) goto L17
            iom r3 = r5.R
            defpackage.a.aq(r3)
            java.lang.Object r3 = r3.b
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r0]
            if (r3 == 0) goto L23
        L17:
            eww[] r3 = r5.i
            r3 = r3[r0]
            long r3 = r3.p()
            long r1 = java.lang.Math.max(r1, r3)
        L23:
            int r0 = r0 + 1
            goto L3
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewp.k(boolean):long");
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        this.g = evwVar;
        dze dzeVar = this.r;
        if (dzeVar == null) {
            this.P.g();
            B();
        } else {
            dq(0, 3).b(dzeVar);
            x(new fdz(new long[]{0}, new long[]{0}, -9223372036854775807L));
            j();
            this.H = j;
        }
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        if (this.m) {
            return false;
        }
        ezw ezwVar = this.d;
        if (ezwVar.g() || this.I) {
            return false;
        }
        if ((this.j || this.r != null) && this.E == 0) {
            return false;
        }
        boolean zG = this.P.g();
        if (ezwVar.h()) {
            return zG;
        }
        B();
        return true;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.d.h() && this.P.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fdp, java.lang.Object] */
    @Override // defpackage.ezu
    public final void p() {
        for (eww ewwVar : this.i) {
            ewwVar.z();
        }
        eux euxVar = this.M;
        ?? r1 = euxVar.b;
        if (r1 != 0) {
            r1.c();
            euxVar.b = null;
        }
        euxVar.c = null;
    }

    public final fel q(ewo ewoVar) {
        int length = this.i.length;
        for (int i = 0; i < length; i++) {
            if (ewoVar.equals(this.u[i])) {
                return this.i[i];
            }
        }
        if (this.v) {
            edb.e("ProgressiveMediaPeriod", "Extractor added new track (id=" + ewoVar.a + ") after finishing tracks.");
            return new fdm();
        }
        eww ewwVar = new eww(this.L, this.q, this.O);
        ewwVar.b = this;
        int i2 = length + 1;
        ewo[] ewoVarArr = (ewo[]) Arrays.copyOf(this.u, i2);
        ewoVarArr[length] = ewoVar;
        String str = edt.a;
        this.u = ewoVarArr;
        eww[] ewwVarArr = (eww[]) Arrays.copyOf(this.i, i2);
        ewwVarArr[length] = ewwVar;
        this.i = ewwVarArr;
        return ewwVar;
    }

    @Override // defpackage.fdr
    public final void r(fef fefVar) {
        this.f.post(new eoy(this, fefVar, 10, null));
    }

    public final void s() {
        int i;
        if (this.n || this.j || !this.v || this.y == null) {
            return;
        }
        for (eww ewwVar : this.i) {
            if (ewwVar.s() == null) {
                return;
            }
        }
        this.P.h();
        int length = this.i.length;
        eba[] ebaVarArr = new eba[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            dze dzeVarS = this.i[i2].s();
            dzeVarS.getClass();
            String str = dzeVarS.Y;
            boolean zL = eae.l(str);
            boolean z = zL || eae.p(str);
            zArr[i2] = z;
            this.w = z | this.w;
            this.x = this.s != -9223372036854775807L && length == 1 && eae.n(str);
            ffz ffzVar = this.h;
            if (ffzVar != null) {
                if (zL || this.u[i2].b) {
                    ead eadVar = dzeVarS.V;
                    ead eadVar2 = eadVar == null ? new ead(ffzVar) : eadVar.c(ffzVar);
                    dzd dzdVar = new dzd(dzeVarS);
                    dzdVar.k = eadVar2;
                    dzeVarS = new dze(dzdVar);
                }
                if (zL && dzeVarS.R == -1 && dzeVarS.S == -1 && (i = ffzVar.a) != -1) {
                    dzd dzdVar2 = new dzd(dzeVarS);
                    dzdVar2.h = i;
                    dzeVarS = new dze(dzdVar2);
                }
            }
            dze dzeVarB = dzeVarS.b(this.q.a(dzeVarS));
            ebaVarArr[i2] = new eba(Integer.toString(i2), dzeVarB);
            this.D = dzeVarB.ae | this.D;
        }
        this.R = new iom(new exi(ebaVarArr), zArr);
        if (this.x && this.k == -9223372036854775807L) {
            this.k = this.s;
            this.y = new ewl(this, this.y);
        }
        this.K.b(this.k, this.y, this.z);
        this.j = true;
        evw evwVar = this.g;
        evwVar.getClass();
        evwVar.dp(this);
    }

    public final void t(int i) {
        A();
        iom iomVar = this.R;
        boolean[] zArr = (boolean[]) iomVar.c;
        if (zArr[i]) {
            return;
        }
        dze dzeVarC = ((exi) iomVar.a).b(i).c(0);
        this.N.m(eae.b(dzeVarC.Y), dzeVarC, 0, this.G);
        zArr[i] = true;
    }

    public final void u(int i) {
        A();
        if (this.I) {
            if (!this.w || ((boolean[]) this.R.d)[i]) {
                if (this.i[i].F(false)) {
                    return;
                }
                this.H = 0L;
                this.I = false;
                this.C = true;
                this.G = 0L;
                this.J = 0;
                for (eww ewwVar : this.i) {
                    ewwVar.A();
                }
                evw evwVar = this.g;
                evwVar.getClass();
                evwVar.b(this);
            }
        }
    }

    final void v() {
        this.d.d(this.Q.h(this.A));
    }

    @Override // defpackage.ewv
    public final void w() {
        this.f.post(this.t);
    }

    public final void x(fef fefVar) {
        this.y = this.h == null ? fefVar : new fee(-9223372036854775807L);
        this.k = fefVar.a();
        boolean z = false;
        if (!this.l && fefVar.a() == -9223372036854775807L) {
            z = true;
        }
        this.z = z;
        this.A = true == z ? 7 : 1;
        if (this.j) {
            this.K.b(this.k, fefVar, z);
        } else {
            s();
        }
    }

    public final boolean y() {
        return this.C || C();
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
    }
}
