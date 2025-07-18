package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfo extends nez {
    private final void A(long j, long j2) {
        nfa nfaVar = this.b;
        StringBuilder sbE = nfaVar.e(j);
        sbE.append(nfa.b(j2));
        nfaVar.f("cmt", sbE.toString());
    }

    private final void B(ekl eklVar) {
        A(eklVar.a, eklVar.e);
    }

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        B(eklVar);
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("cmt");
    }

    @Override // defpackage.nez
    public final void j(ekl eklVar, eai eaiVar, boolean z) {
        if (z) {
            B(eklVar);
        }
    }

    @Override // defpackage.nez
    public final void k(ekl eklVar, int i, boolean z) {
        if (z) {
            B(eklVar);
        }
    }

    @Override // defpackage.nez
    public final void m(ekl eklVar, boolean z, int i, boolean z2) {
        if (z2) {
            B(eklVar);
        }
    }

    @Override // defpackage.nez
    public final void n(ekl eklVar, ean eanVar, ean eanVar2, int i, boolean z, boolean z2) {
        if (z) {
            A(eklVar.a, eanVar.j);
        }
        if (z2) {
            A(eklVar.a, eanVar2.j);
        }
    }

    @Override // defpackage.nez
    public final void v(ekl eklVar, boolean z) {
        if (z) {
            B(eklVar);
        }
    }
}
