package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class snp implements zxe {
    final /* synthetic */ sgo a;
    final /* synthetic */ snr b;

    public snp(snr snrVar, sgo sgoVar) {
        this.a = sgoVar;
        this.b = snrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        sor sorVar = (sor) this.b.b.a();
        int iB = sgn.b(this.a.b);
        if (iB == 0) {
            throw null;
        }
        sorVar.a("FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE", sgn.a(iB));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        sor sorVar = (sor) this.b.b.a();
        int iB = rtu.b(((rts) obj).c);
        if (iB == 0) {
            iB = 1;
        }
        int iB2 = sgn.b(this.a.b);
        if (iB2 == 0) {
            throw null;
        }
        sorVar.a(rtu.a(iB), sgn.a(iB2));
    }
}
