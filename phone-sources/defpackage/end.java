package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class end implements ezr {
    final /* synthetic */ enf a;

    public end(enf enfVar) {
        this.a = enfVar;
    }

    @Override // defpackage.ezr
    /* renamed from: do */
    public final /* synthetic */ aacv mo349do(ezt eztVar, long j, long j2, IOException iOException, int i) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        int i2 = faaVar.c;
        enf enfVar = this.a;
        enfVar.o.g(evqVar, i2, iOException, true);
        enfVar.e(iOException);
        return ezw.e;
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        this.a.d((faa) eztVar, j, j2);
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void du(ezt eztVar, long j, long j2) {
        faa faaVar = (faa) eztVar;
        long j3 = faaVar.a;
        eey eeyVar = faaVar.b;
        faaVar.a();
        evq evqVar = new evq(eeyVar, j, j2);
        int i = faaVar.c;
        enf enfVar = this.a;
        enfVar.o.e(evqVar, i);
        enfVar.f(((Long) faaVar.d).longValue() - j);
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void dn(ezt eztVar, long j, long j2, int i) {
    }
}
