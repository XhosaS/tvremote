package defpackage;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nrr extends nsb {
    public final AtomicReference a;
    private final Handler b;

    public nrr(nrs nrsVar) {
        this.a = new AtomicReference(nrsVar);
        this.b = new ogh(nrsVar.v);
    }

    @Override // defpackage.nsc
    public final void a(njz njzVar, String str, String str2, boolean z) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.c = njzVar;
        nrsVar.o = njzVar.a;
        nrsVar.p = str2;
        nrsVar.f = str;
        synchronized (nrs.b) {
            nxs nxsVar = nrsVar.r;
            if (nxsVar != null) {
                nxsVar.c(new nrq(new Status(0), njzVar, str, str2, z));
                nrsVar.r = null;
            }
        }
    }

    @Override // defpackage.nsc
    public final void b(int i) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.r(i);
    }

    @Override // defpackage.nsc
    public final void c(int i) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.o = null;
        nrsVar.p = null;
        nrsVar.t(i);
        if (nrsVar.s != null) {
            this.b.post(new csl(nrsVar, i, 14, (byte[]) null));
        }
    }

    @Override // defpackage.nsc
    public final void d(int i) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.t(i);
    }

    @Override // defpackage.nsc
    public final void e(nrh nrhVar) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nsf.e();
        this.b.post(new non(nrsVar, nrhVar, 3));
    }

    @Override // defpackage.nsc
    public final void f(int i) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.t(i);
    }

    @Override // defpackage.nsc
    public final void h(nrw nrwVar) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nsf.e();
        this.b.post(new non(nrsVar, nrwVar, 2, (char[]) null));
    }

    @Override // defpackage.nsc
    public final void i(int i) {
        nrs nrsVarQ = q();
        if (nrsVarQ == null) {
            return;
        }
        nsf.e();
        if (i != 0) {
            nrsVarQ.R(2);
        }
    }

    @Override // defpackage.nsc
    public final void l(String str, String str2) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nsf.e();
        this.b.post(new lke(nrsVar, str, str2, 10));
    }

    @Override // defpackage.nsc
    public final void m(long j) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.s(j, 0);
    }

    @Override // defpackage.nsc
    public final void n(long j, int i) {
        nrs nrsVar = (nrs) this.a.get();
        if (nrsVar == null) {
            return;
        }
        nrsVar.s(j, i);
    }

    @Override // defpackage.nsc
    public final void o() {
        nsf nsfVar = nrs.a;
        nsf.e();
    }

    @Override // defpackage.nsc
    public final void p(byte[] bArr) {
        if (((nrs) this.a.get()) == null) {
            return;
        }
        nsf nsfVar = nrs.a;
        int length = bArr.length;
        nsf.e();
    }

    public final nrs q() {
        nrs nrsVar = (nrs) this.a.getAndSet(null);
        if (nrsVar == null) {
            return null;
        }
        nrsVar.m();
        return nrsVar;
    }

    @Override // defpackage.nsc
    public final void g(int i) {
    }

    @Override // defpackage.nsc
    public final void j(int i) {
    }
}
