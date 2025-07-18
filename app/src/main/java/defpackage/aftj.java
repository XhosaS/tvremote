package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftj implements Runnable {
    final /* synthetic */ afun a;

    public aftj(afun afunVar) {
        this.a = afunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afun afunVar = this.a;
        afunVar.J.a(2, "Entering SHUTDOWN state");
        afunVar.p.a(affe.SHUTDOWN);
    }
}
