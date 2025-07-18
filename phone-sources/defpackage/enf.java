package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enf extends euv {
    private final enb A;
    private final SparseArray B;
    private final Runnable C;
    private final ezy D;
    private ees E;
    private efy F;
    private dzs G;
    private final Uri H;
    private dzy I;
    private final iom J;
    private final pku K;
    public final Object a;
    public final Runnable b;
    public ezw c;
    public IOException d;
    public Handler e;
    public Uri f;
    public enr g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public int l;
    public long m;
    public int n;
    public final eph o;
    public final sew p;
    private final boolean t;
    private final eer u;
    private final emu v;
    private final epd w;
    private final long x;
    private final long y;
    private final ezz z;

    static {
        dzz.b("media3.exoplayer.dash");
    }

    public enf(dzy dzyVar, enr enrVar, eer eerVar, ezz ezzVar, emu emuVar, epd epdVar, sew sewVar, long j, long j2) {
        this.I = dzyVar;
        this.G = dzyVar.d;
        dzt dztVar = dzyVar.c;
        dztVar.getClass();
        this.f = dztVar.i;
        this.H = dzyVar.c.i;
        this.g = enrVar;
        this.u = eerVar;
        this.z = ezzVar;
        this.v = emuVar;
        this.w = epdVar;
        this.p = sewVar;
        this.x = j;
        this.y = j2;
        this.J = new iom();
        boolean z = enrVar != null;
        this.t = z;
        this.o = E(null);
        this.a = new Object();
        this.B = new SparseArray();
        this.K = new pku(this);
        this.m = -9223372036854775807L;
        this.k = -9223372036854775807L;
        if (!z) {
            this.A = new enb(this);
            this.D = new enc(this);
            this.C = new emy(this, 1);
            this.b = new emy(this, 0);
            return;
        }
        a.ab(!enrVar.d);
        this.A = null;
        this.C = null;
        this.b = null;
        this.D = new ezx();
    }

    private final void G(faa faaVar, ezr ezrVar, int i) {
        this.c.i(faaVar, ezrVar, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    private static boolean H(gsf gsfVar) {
        int i = 0;
        while (true) {
            ?? r2 = gsfVar.b;
            if (i >= r2.size()) {
                return false;
            }
            int i2 = ((enp) r2.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    @Override // defpackage.ewb
    public final synchronized dzy a() {
        return this.I;
    }

    public final void b() {
        ezw ezwVar = this.c;
        pku pkuVar = new pku(this);
        if (fay.b()) {
            pkuVar.p();
            return;
        }
        if (ezwVar == null) {
            ezwVar = new ezw("SntpClient");
        }
        ezwVar.i(new fax(), new faw(pkuVar), 1);
    }

    @Override // defpackage.ewb
    public final void c() {
        this.D.a();
    }

    final void d(faa faaVar, long j, long j2) {
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        this.o.c(new evq(eeyVar, j, j2), faaVar.c);
    }

    public final void e(IOException iOException) {
        edb.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.k = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        h(true);
    }

    public final void f(long j) {
        this.k = j;
        h(true);
    }

    @Override // defpackage.euv
    protected final void g(efy efyVar) {
        this.F = efyVar;
        epd epdVar = this.w;
        epdVar.eo(Looper.myLooper(), q());
        epdVar.em();
        if (this.t) {
            h(false);
            return;
        }
        this.E = this.u.a();
        this.c = new ezw("DashMediaSource");
        this.e = edt.J();
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0421  */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v11, types: [ezf] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r51) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enf.h(boolean):void");
    }

    @Override // defpackage.ewb
    public final void i(evx evxVar) {
        emx emxVar = (emx) evxVar;
        eno enoVar = emxVar.b;
        enoVar.g = true;
        enoVar.b.removeCallbacksAndMessages(null);
        for (exs exsVar : emxVar.d) {
            exsVar.h(emxVar);
        }
        emxVar.c = null;
        this.B.remove(emxVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.euv
    protected final void j() {
        this.h = false;
        this.E = null;
        ezw ezwVar = this.c;
        if (ezwVar != null) {
            ezwVar.e();
            this.c = null;
        }
        this.i = 0L;
        this.j = 0L;
        this.f = this.H;
        this.d = null;
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.e = null;
        }
        this.k = -9223372036854775807L;
        this.l = 0;
        this.m = -9223372036854775807L;
        this.B.clear();
        iom iomVar = this.J;
        iomVar.d.clear();
        iomVar.b.clear();
        iomVar.a.clear();
        this.w.en();
    }

    public final void k(eoi eoiVar, ezz ezzVar) {
        ees eesVar = this.E;
        Uri uri = Uri.parse(eoiVar.b);
        eex eexVar = new eex();
        eexVar.a = uri;
        eexVar.i = 1;
        G(new faa(eesVar, eexVar.a(), 5, ezzVar), new end(this), 1);
    }

    public final void l(long j) {
        this.e.postDelayed(this.C, j);
    }

    public final void m() {
        Uri uri;
        this.e.removeCallbacks(this.C);
        if (this.c.g()) {
            return;
        }
        if (this.c.h()) {
            this.h = true;
            return;
        }
        synchronized (this.a) {
            uri = this.f;
        }
        this.h = false;
        eex eexVar = new eex();
        eexVar.a = uri;
        eexVar.i = 1;
        G(new faa(this.E, eexVar.a(), 4, this.z), this.A, this.p.h(4));
    }

    @Override // defpackage.euv, defpackage.ewb
    public final synchronized void n(dzy dzyVar) {
        this.I = dzyVar;
    }

    @Override // defpackage.euv, defpackage.ewb
    public final boolean o(dzy dzyVar) {
        dzy dzyVarA = a();
        dzt dztVar = dzyVarA.c;
        dztVar.getClass();
        dzt dztVar2 = dzyVar.c;
        if (dztVar2 != null) {
            return dztVar2.i.equals(dztVar.i) && dztVar2.m.equals(dztVar.m) && Objects.equals(dztVar2.k, dztVar.k) && dzyVarA.d.equals(dzyVar.d);
        }
        return false;
    }

    @Override // defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        int iIntValue = ((Integer) evzVar.a).intValue() - this.n;
        eph ephVarE = E(evzVar);
        eph ephVarF = F(evzVar);
        int i = this.n + iIntValue;
        enr enrVar = this.g;
        efy efyVar = this.F;
        long j2 = this.k;
        q();
        pku pkuVar = this.K;
        ezy ezyVar = this.D;
        sew sewVar = this.p;
        epd epdVar = this.w;
        emx emxVar = new emx(i, enrVar, this.J, iIntValue, this.v, efyVar, epdVar, ephVarF, sewVar, ephVarE, j2, ezyVar, ezpVar, pkuVar);
        this.B.put(emxVar.a, emxVar);
        return emxVar;
    }
}
