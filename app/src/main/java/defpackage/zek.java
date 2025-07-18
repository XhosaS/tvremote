package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zek implements Runnable {
    final /* synthetic */ zej a;
    final /* synthetic */ zel b;

    public zek(zel zelVar, zej zejVar) {
        this.a = zejVar;
        this.b = zelVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.remove(this.a);
    }
}
