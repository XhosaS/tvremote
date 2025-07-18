package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmp implements Runnable {
    final /* synthetic */ ahap a;
    final /* synthetic */ bmn b;
    final /* synthetic */ agvb c;

    public bmp(ahap ahapVar, bmn bmnVar, agvb agvbVar) {
        this.a = ahapVar;
        this.b = bmnVar;
        this.c = agvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ahap ahapVar = this.a;
            ahak.a(((ahar) ahapVar).b.minusKey(agsy.b), new bmo(this.b, ahapVar, this.c, null));
        } catch (Throwable th) {
            this.a.k(th);
        }
    }
}
