package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpd implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ afpn b;

    public afpd(afpn afpnVar, Object obj) {
        this.a = obj;
        this.b = afpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
