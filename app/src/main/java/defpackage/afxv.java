package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxv implements Runnable {
    final /* synthetic */ afih a;
    final /* synthetic */ afyc b;

    public afxv(afyc afycVar, afih afihVar) {
        this.a = afihVar;
        this.b = afycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.C.c(this.a);
    }
}
