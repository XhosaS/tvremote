package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpe implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ afpn b;

    public afpe(afpn afpnVar, int i) {
        this.a = i;
        this.b = afpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
