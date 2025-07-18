package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfi extends nez {
    private long a;

    private final void A(ekl eklVar, boolean z, boolean z2) {
        if (z2) {
            long j = eklVar.a;
            if (j - this.a > 500 || z) {
                nfa nfaVar = this.b;
                StringBuilder sbE = nfaVar.e(j);
                sbE.append(nfa.b(eklVar.j));
                nfaVar.f("bh", sbE.toString());
                this.a = j;
            }
        }
    }

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        A(eklVar, false, true);
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("bh");
    }

    @Override // defpackage.nez
    public final void f(ekl eklVar, evv evvVar, boolean z) {
        A(eklVar, true, z);
    }

    @Override // defpackage.nez
    public final void m(ekl eklVar, boolean z, int i, boolean z2) {
        A(eklVar, false, z2);
    }

    @Override // defpackage.nez
    public final void n(ekl eklVar, ean eanVar, ean eanVar2, int i, boolean z, boolean z2) {
        A(eklVar, true, z2);
    }

    @Override // defpackage.nez
    public final void p(ekl eklVar, ebh ebhVar, boolean z) {
        A(eklVar, true, z);
    }

    @Override // defpackage.nez
    public final void s(ekl eklVar, boolean z) {
        A(eklVar, false, z);
    }

    @Override // defpackage.nez
    public final void x(ekl eklVar, boolean z) {
        A(eklVar, false, z);
    }
}
