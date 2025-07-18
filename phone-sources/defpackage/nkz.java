package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkz extends nsb {
    public final /* synthetic */ nla a;

    public nkz(nla nlaVar) {
        this.a = nlaVar;
    }

    @Override // defpackage.nsc
    public final void a(njz njzVar, String str, String str2, boolean z) {
        nla nlaVar = this.a;
        nlaVar.h = njzVar;
        nlaVar.i = str;
        nrq nrqVar = new nrq(new Status(0), njzVar, str, str2, z);
        synchronized (nlaVar.f) {
            kwy kwyVar = nlaVar.t;
            if (kwyVar != null) {
                kwyVar.u(nrqVar);
            }
            nlaVar.t = null;
        }
    }

    @Override // defpackage.nsc
    public final void b(int i) {
        this.a.g(i);
    }

    @Override // defpackage.nsc
    public final void c(int i) {
        nla nlaVar = this.a;
        nlaVar.i(i);
        if (nlaVar.v != null) {
            nlaVar.c().post(new csl(this, i, 12));
        }
    }

    @Override // defpackage.nsc
    public final void d(int i) {
        this.a.i(i);
    }

    @Override // defpackage.nsc
    public final void e(nrh nrhVar) {
        this.a.c().post(new non((Object) this, (Object) nrhVar, 1, (byte[]) null));
    }

    @Override // defpackage.nsc
    public final void f(int i) {
        this.a.i(i);
    }

    @Override // defpackage.nsc
    public final void g(int i) {
        this.a.c().post(new csl(this, i, 11));
    }

    @Override // defpackage.nsc
    public final void h(nrw nrwVar) {
        this.a.c().post(new lik(this, nrwVar, 20));
    }

    @Override // defpackage.nsc
    public final void i(int i) {
        this.a.c().post(new csl(this, i, 10));
    }

    @Override // defpackage.nsc
    public final void j(int i) {
        this.a.c().post(new csl(this, i, 13));
    }

    @Override // defpackage.nsc
    public final void l(String str, String str2) {
        nsf nsfVar = nla.a;
        nsf.e();
        this.a.c().post(new lke(this, str, str2, 9, (int[]) null));
    }

    @Override // defpackage.nsc
    public final void m(long j) {
        this.a.h(j, 0);
    }

    @Override // defpackage.nsc
    public final void n(long j, int i) {
        this.a.h(j, i);
    }

    @Override // defpackage.nsc
    public final void o() {
        nsf nsfVar = nla.a;
        nsf.e();
    }

    @Override // defpackage.nsc
    public final void p(byte[] bArr) {
        nsf nsfVar = nla.a;
        int length = bArr.length;
        nsf.e();
    }
}
