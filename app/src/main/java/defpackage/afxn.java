package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxn extends afev {
    long a;
    final /* synthetic */ afyf b;
    private final afyd c;

    public afxn(afyf afyfVar, afyd afydVar) {
        this.b = afyfVar;
        this.c = afydVar;
    }

    @Override // defpackage.afjy
    public final void c(long j) {
        afyf afyfVar = this.b;
        if (afyfVar.w.f != null) {
            return;
        }
        synchronized (afyfVar.q) {
            if (afyfVar.w.f == null) {
                afyd afydVar = this.c;
                if (!afydVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    long j3 = afyfVar.B;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > afyfVar.s) {
                        afydVar.c = true;
                    } else {
                        long jAddAndGet = afyfVar.r.a.addAndGet(j2 - j3);
                        afyfVar.B = this.a;
                        if (jAddAndGet > afyfVar.t) {
                            afydVar.c = true;
                        }
                    }
                    Runnable runnableL = afydVar.c ? afyfVar.l(afydVar) : null;
                    if (runnableL != null) {
                        runnableL.run();
                    }
                }
            }
        }
    }
}
