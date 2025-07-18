package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmo implements Runnable {
    final afmm a;
    final /* synthetic */ String b;
    final /* synthetic */ afih c;
    final /* synthetic */ afil d;
    final /* synthetic */ afzw e;
    final /* synthetic */ afem f;
    final /* synthetic */ afmp g;

    public afmo(afmp afmpVar, String str, afih afihVar, afil afilVar, afzw afzwVar, afem afemVar) {
        this.b = str;
        this.c = afihVar;
        this.d = afilVar;
        this.e = afzwVar;
        this.f = afemVar;
        this.g = afmpVar;
        this.a = new afmm(str, afmpVar.a, afmpVar.e, afihVar, afmpVar, this, afmpVar.c, afmpVar.f, afilVar, afzwVar, afemVar, afmpVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        afmp afmpVar = this.g;
        synchronized (afmpVar.c) {
            if (afmpVar.j) {
                this.a.o.j(afmpVar.k, afof.PROCESSED, true, new afih());
            } else {
                if (!afmpVar.l) {
                    throw new AssertionError("Transport is not started");
                }
                afmm afmmVar = this.a;
                afmpVar.d.add(afmmVar);
                afmmVar.o.h.p = afmpVar.i;
            }
        }
    }
}
