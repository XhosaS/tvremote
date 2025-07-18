package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ afmz b;

    public afmy(afmz afmzVar, int i) {
        this.a = i;
        this.b = afmzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = agfd.a;
            afox afoxVar = this.b.o;
            int i2 = this.a;
            yqw.B(i2 > 0, "numMessages must be > 0");
            if (((afvg) afoxVar).b()) {
                return;
            }
            ((afvg) afoxVar).e += i2;
            ((afvg) afoxVar).a();
        } catch (Throwable th) {
            this.b.b(th);
        }
    }
}
