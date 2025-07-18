package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yxa implements Runnable {
    final /* synthetic */ yxb a;
    private Runnable b;

    public yxa(yxb yxbVar, Runnable runnable) {
        this.a = yxbVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                yks.k(yim.a, th);
            }
            yxb yxbVar = this.a;
            Runnable runnableE = yxbVar.e();
            if (runnableE == null) {
                return;
            }
            try {
                this.b = runnableE;
                i++;
                if (i >= 16) {
                    yot yotVar = yxbVar.a;
                    if (ywv.c(yotVar, yxbVar)) {
                        ywv.b(yotVar, yxbVar, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                yxb yxbVar2 = this.a;
                synchronized (yxbVar2.c) {
                    yxbVar2.b.a();
                    throw th2;
                }
            }
        }
    }
}
