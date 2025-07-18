package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agml implements Runnable {
    final /* synthetic */ agmq a;
    private final agmm b;

    public agml(agmq agmqVar, agmm agmmVar) {
        this.a = agmqVar;
        this.b = agmmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agmq agmqVar = this.a;
        agmm agmmVar = this.b;
        aghd.g(agmmVar.b, agmqVar.b(agmmVar));
    }
}
