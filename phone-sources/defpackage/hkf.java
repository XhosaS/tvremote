package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkf implements htv {
    final /* synthetic */ hkg a;
    private final huj b;

    public hkf(hkg hkgVar, huj hujVar) {
        this.a = hkgVar;
        this.b = hujVar;
    }

    @Override // defpackage.htv
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                huj hujVar = this.b;
                for (hux huxVar : hwp.f(hujVar.a)) {
                    if (!huxVar.l() && !huxVar.k()) {
                        huxVar.c();
                        if (hujVar.c) {
                            hujVar.b.add(huxVar);
                        } else {
                            huxVar.b();
                        }
                    }
                }
            }
        }
    }
}
