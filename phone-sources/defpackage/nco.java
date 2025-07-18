package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nco extends nde {
    public nco() {
        super("MOLECULE");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.c(ndmVar);
        ndmVar.e(1.0f);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (!ndf.m(ndmVar) || j2 - j >= 100) {
            ndf.l(ndmVar);
            return false;
        }
        ndf.d(ndmVar);
        return true;
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
    }
}
