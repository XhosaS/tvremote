package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahlp implements Runnable {
    final /* synthetic */ ahlq a;
    private Runnable b;

    public ahlp(ahlq ahlqVar, Runnable runnable) {
        this.a = ahlqVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                ahbo.b(agtf.a, th);
            }
            ahlq ahlqVar = this.a;
            Runnable runnableE = ahlqVar.e();
            if (runnableE == null) {
                return;
            }
            try {
                this.b = runnableE;
                i++;
                if (i >= 16) {
                    ahbm ahbmVar = ahlqVar.a;
                    if (ahle.c(ahbmVar, ahlqVar)) {
                        ahle.b(ahbmVar, ahlqVar, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                ahlq ahlqVar2 = this.a;
                synchronized (ahlqVar2.e) {
                    agzw.a.decrementAndGet(ahlqVar2.d);
                    throw th2;
                }
            }
        }
    }
}
