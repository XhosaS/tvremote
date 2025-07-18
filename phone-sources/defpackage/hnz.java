package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnz implements hlt {
    final /* synthetic */ hoa a;
    final /* synthetic */ cvi b;

    public hnz(hoa hoaVar, cvi cviVar) {
        this.b = cviVar;
        this.a = hoaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [hlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [hlu, java.lang.Object] */
    @Override // defpackage.hlt
    public final void b(Object obj) {
        hoa hoaVar = this.a;
        cvi cviVar = this.b;
        if (hoaVar.e(cviVar)) {
            hng hngVar = hoaVar.a.o;
            if (obj != null && hngVar.c(cviVar.a.g())) {
                hoaVar.c = obj;
                ((hmz) hoaVar.b).e(2);
            } else {
                hmv hmvVar = hoaVar.b;
                ?? r2 = cviVar.c;
                ?? r4 = cviVar.a;
                hmvVar.d(r2, obj, r4, r4.g(), hoaVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hlu, java.lang.Object] */
    @Override // defpackage.hlt
    public final void e(Exception exc) {
        hoa hoaVar = this.a;
        cvi cviVar = this.b;
        if (hoaVar.e(cviVar)) {
            hmu hmuVar = hoaVar.d;
            ?? r1 = cviVar.a;
            hoaVar.b.b(hmuVar, exc, r1, r1.g());
        }
    }
}
