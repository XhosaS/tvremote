package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpx implements Runnable {
    final /* synthetic */ affa a;
    final /* synthetic */ afqm b;

    public afpx(afqm afqmVar, affa affaVar) {
        this.a = affaVar;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.f(this.a);
    }
}
