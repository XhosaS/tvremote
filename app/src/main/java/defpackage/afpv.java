package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpv implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ afqm b;

    public afpv(afqm afqmVar, int i) {
        this.a = i;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.e(this.a);
    }
}
