package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class cza implements dmt {
    final /* synthetic */ czb a;
    private final dnn b;

    public cza(czb czbVar, dnn dnnVar) {
        this.a = czbVar;
        this.b = dnnVar;
    }

    @Override // defpackage.dmt
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                dnn dnnVar = this.b;
                for (don donVar : dqm.e(dnnVar.a)) {
                    if (!donVar.l() && !donVar.k()) {
                        donVar.c();
                        if (dnnVar.c) {
                            dnnVar.b.add(donVar);
                        } else {
                            donVar.b();
                        }
                    }
                }
            }
        }
    }
}
