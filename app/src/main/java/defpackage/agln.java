package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agln implements Runnable {
    final /* synthetic */ aglo a;
    private final aglm b;

    public agln(aglo agloVar, aglm aglmVar) {
        this.a = agloVar;
        this.b = aglmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.m(this.b);
    }
}
