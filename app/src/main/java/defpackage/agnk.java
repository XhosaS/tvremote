package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agnk implements Runnable {
    final agnj a;
    final /* synthetic */ agnl b;

    public agnk(agnl agnlVar, agnj agnjVar) {
        this.b = agnlVar;
        this.a = agnjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agnj agnjVar = this.a;
        agnjVar.d = true;
        this.b.a.remove(agnjVar);
    }
}
