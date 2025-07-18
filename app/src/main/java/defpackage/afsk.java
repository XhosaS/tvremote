package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsk implements Runnable {
    final /* synthetic */ afot a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afsv c;

    public afsk(afsv afsvVar, afot afotVar, boolean z) {
        this.a = afotVar;
        this.b = z;
        this.c = afsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.o.c(this.a, this.b);
    }
}
