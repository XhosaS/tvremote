package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqj implements Runnable {
    final /* synthetic */ afih a;
    final /* synthetic */ afql b;

    public afqj(afql afqlVar, afih afihVar) {
        this.a = afihVar;
        this.b = afqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
