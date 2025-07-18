package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpb implements Runnable {
    final /* synthetic */ afep a;
    final /* synthetic */ afih b;
    final /* synthetic */ afpn c;

    public afpb(afpn afpnVar, afep afepVar, afih afihVar) {
        this.a = afepVar;
        this.b = afihVar;
        this.c = afpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
