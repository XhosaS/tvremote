package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class aes implements Runnable {
    final /* synthetic */ afe a;
    final /* synthetic */ Object b;

    public aes(afe afeVar, Object obj) {
        this.a = afeVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((aej) this.a).accept((aek) this.b);
    }
}
