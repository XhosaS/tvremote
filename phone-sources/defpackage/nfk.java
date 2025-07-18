package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfk extends nez {
    private final void A(ekl eklVar, int i) {
        nfa nfaVar = this.b;
        StringBuilder sbE = nfaVar.e(eklVar.a);
        sbE.append(i);
        nfaVar.f("df", sbE.toString());
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("df");
    }

    @Override // defpackage.nez
    public final void f(ekl eklVar, evv evvVar, boolean z) {
        if (z) {
            A(eklVar, 0);
        }
    }

    @Override // defpackage.nez
    public final void p(ekl eklVar, ebh ebhVar, boolean z) {
        if (z) {
            A(eklVar, 0);
        }
    }

    @Override // defpackage.nez
    public final void r(ekl eklVar, int i, boolean z) {
        if (z) {
            A(eklVar, i);
        }
    }
}
