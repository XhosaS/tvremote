package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ afqm b;

    public afpz(afqm afqmVar, int i) {
        this.a = i;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.s(this.a);
    }
}
