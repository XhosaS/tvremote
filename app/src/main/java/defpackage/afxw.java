package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxw implements Runnable {
    final /* synthetic */ afyd a;
    final /* synthetic */ afxx b;

    public afxw(afxx afxxVar, afyd afydVar) {
        this.a = afydVar;
        this.b = afxxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.b.w(this.a);
    }
}
