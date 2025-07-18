package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqa implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ afqm b;

    public afqa(afqm afqmVar, int i) {
        this.a = i;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.t(this.a);
    }
}
