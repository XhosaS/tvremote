package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxz implements Runnable {
    final /* synthetic */ afyd a;
    final /* synthetic */ afyc b;

    public afxz(afyc afycVar, afyd afydVar) {
        this.a = afydVar;
        this.b = afycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.w(this.a);
    }
}
