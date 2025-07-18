package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egh implements ees {
    public final egc a;
    private final ees b;
    private final ees c;
    private final ees d;
    private final boolean e;
    private Uri f;
    private eey g;
    private eey h;
    private ees i;
    private long j;
    private long k;
    private long l;
    private egl m;
    private long n;
    private long o;

    public egh(egc egcVar, ees eesVar, ees eesVar2, egf egfVar, int i, nuh nuhVar, int i2) {
        boolean z = 1 == i;
        this.a = egcVar;
        this.b = eesVar2;
        this.e = z;
        if (eesVar == null) {
            this.d = efp.a;
            this.c = null;
        } else {
            eesVar = nuhVar != null ? new efq(eesVar, nuhVar, i2) : eesVar;
            this.d = eesVar;
            this.c = egfVar != null ? new efx(eesVar, egfVar) : null;
        }
    }

    private final void g() {
        ees eesVar = this.i;
        if (eesVar == null) {
            return;
        }
        try {
            eesVar.d();
            this.h = null;
            this.i = null;
            egl eglVar = this.m;
            if (eglVar != null) {
                this.a.i(eglVar);
                this.m = null;
            }
        } catch (Throwable th) {
            this.h = null;
            this.i = null;
            egl eglVar2 = this.m;
            if (eglVar2 != null) {
                this.a.i(eglVar2);
                this.m = null;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    private final void h(eey eeyVar, boolean z) throws InterruptedIOException {
        egl eglVarD;
        long jMin;
        eey eeyVarA;
        ees eesVar;
        String str = edt.a;
        String str2 = eeyVar.h;
        if (this.e) {
            try {
                eglVarD = this.a.d(str2, this.k, this.l);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            eglVarD = this.a.e(str2, this.k, this.l);
        }
        if (eglVarD == null) {
            eesVar = this.d;
            eex eexVar = new eex(eeyVar);
            eexVar.f = this.k;
            eexVar.g = this.l;
            eeyVarA = eexVar.a();
        } else if (eglVarD.d) {
            File file = eglVarD.e;
            long j = eglVarD.b;
            Uri uriFromFile = Uri.fromFile(file);
            long j2 = this.k - j;
            long j3 = eglVarD.c;
            long j4 = this.l;
            long jMin2 = j3 - j2;
            if (j4 != -1) {
                jMin2 = Math.min(jMin2, j4);
            }
            eex eexVar2 = new eex(eeyVar);
            eexVar2.a = uriFromFile;
            eexVar2.b = j;
            eexVar2.f = j2;
            eexVar2.g = jMin2;
            eeyVarA = eexVar2.a();
            eesVar = this.b;
        } else {
            if (eglVarD.b()) {
                jMin = this.l;
            } else {
                jMin = eglVarD.c;
                long j5 = this.l;
                if (j5 != -1) {
                    jMin = Math.min(jMin, j5);
                }
            }
            eex eexVar3 = new eex(eeyVar);
            eexVar3.f = this.k;
            eexVar3.g = jMin;
            eeyVarA = eexVar3.a();
            eesVar = this.c;
            if (eesVar == null) {
                eesVar = this.d;
                this.a.i(eglVarD);
                eglVarD = null;
            }
        }
        ees eesVar2 = this.d;
        this.o = eesVar == eesVar2 ? this.k + 102400 : Long.MAX_VALUE;
        if (z) {
            a.ab(this.i == eesVar2);
            if (eesVar == eesVar2) {
                return;
            }
            try {
                g();
            } catch (Throwable th) {
                if (eglVarD.a()) {
                    this.a.i(eglVarD);
                }
                throw th;
            }
        }
        if (eglVarD != null && eglVarD.a()) {
            this.m = eglVarD;
        }
        this.i = eesVar;
        this.h = eeyVarA;
        this.j = 0L;
        long jB = eesVar.b(eeyVarA);
        dwi dwiVar = new dwi((byte[]) null);
        if (eeyVarA.g == -1 && jB != -1) {
            this.l = jB;
            dwi.v(dwiVar, this.k + jB);
        }
        if (j()) {
            this.f = eesVar.c();
            Uri uri = eeyVar.a.equals(this.f) ? null : this.f;
            if (uri == null) {
                dwiVar.a.add("exo_redir");
                dwiVar.b.remove("exo_redir");
            } else {
                dwiVar.s("exo_redir", uri.toString());
            }
        }
        if (k()) {
            this.a.k(str2, dwiVar);
        }
    }

    private final boolean i() {
        return this.i == this.b;
    }

    private final boolean j() {
        return !i();
    }

    private final boolean k() {
        return this.i == this.c;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws InterruptedIOException {
        long j;
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            return -1;
        }
        eey eeyVar = this.g;
        eeyVar.getClass();
        eey eeyVar2 = this.h;
        eeyVar2.getClass();
        if (this.k >= this.o) {
            h(eeyVar, true);
        }
        ees eesVar = this.i;
        eesVar.getClass();
        int iA = eesVar.a(bArr, i, i2);
        if (iA != -1) {
            if (i()) {
                this.n += iA;
            }
            long j2 = iA;
            this.k += j2;
            this.j += j2;
            long j3 = this.l;
            if (j3 != -1) {
                this.l = j3 - j2;
                return iA;
            }
        } else {
            if (j()) {
                long j4 = eeyVar2.g;
                if (j4 != -1) {
                    j = -1;
                    if (this.j < j4) {
                    }
                }
                String str = eeyVar.h;
                String str2 = edt.a;
                this.l = 0L;
                if (k()) {
                    dwi dwiVar = new dwi((byte[]) null);
                    dwi.v(dwiVar, this.k);
                    this.a.k(str, dwiVar);
                    return iA;
                }
            } else {
                j = -1;
            }
            long j5 = this.l;
            if (j5 > 0 || j5 == j) {
                g();
                h(eeyVar, false);
                return a(bArr, i, i2);
            }
        }
        return iA;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) throws eev, InterruptedIOException {
        String strP = clw.P(eeyVar);
        eex eexVar = new eex(eeyVar);
        eexVar.h = strP;
        eey eeyVarA = eexVar.a();
        this.g = eeyVarA;
        egc egcVar = this.a;
        Uri uri = eeyVarA.a;
        byte[] bArr = (byte[]) ((egt) egcVar.f(strP)).b.get("exo_redir");
        String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
        Uri uri2 = str != null ? Uri.parse(str) : null;
        if (uri2 != null) {
            uri = uri2;
        }
        this.f = uri;
        long j = eeyVar.f;
        this.k = j;
        long jO = clw.O(egcVar.f(strP));
        this.l = jO;
        if (jO != -1) {
            jO -= j;
            this.l = jO;
            if (jO < 0) {
                throw new eev(2008);
            }
        }
        long j2 = eeyVar.g;
        if (j2 != -1) {
            jO = jO == -1 ? j2 : Math.min(jO, j2);
            this.l = jO;
        }
        if (jO > 0 || jO == -1) {
            h(eeyVarA, false);
        }
        return j2 != -1 ? j2 : this.l;
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.f;
    }

    @Override // defpackage.ees
    public final void d() {
        this.g = null;
        this.f = null;
        this.k = 0L;
        g();
    }

    @Override // defpackage.ees
    public final Map e() {
        return j() ? this.d.e() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        this.b.f(efyVar);
        this.d.f(efyVar);
    }
}
