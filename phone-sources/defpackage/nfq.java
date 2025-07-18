package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfq extends nez {
    private boolean a;

    public nfq(nfc nfcVar) {
        this.a = nfcVar.e();
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("is_offline");
    }

    @Override // defpackage.nez
    public final void e(ekl eklVar, int i, long j, long j2, boolean z) {
        if (z && this.a) {
            this.a = false;
            nfa nfaVar = this.b;
            StringBuilder sbE = nfaVar.e(eklVar.a - i);
            sbE.append('0');
            nfaVar.f("is_offline", sbE.toString());
        }
    }

    @Override // defpackage.nez
    protected final void i() {
        if (this.a) {
            this.b.f("feature", "offlinelist");
            this.b.f("is_offline", "0:1");
        }
    }
}
