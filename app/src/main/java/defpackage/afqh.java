package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqh implements Runnable {
    final /* synthetic */ afzy a;
    final /* synthetic */ afql b;

    public afqh(afql afqlVar, afzy afzyVar) {
        this.a = afzyVar;
        this.b = afqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
