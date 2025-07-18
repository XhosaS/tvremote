package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwr implements iyd {
    final /* synthetic */ iwt a;
    final /* synthetic */ abnb b;

    public iwr(iwt iwtVar, abnb abnbVar) {
        this.a = iwtVar;
        this.b = abnbVar;
    }

    public final void a() {
        iwt iwtVar = this.a;
        Runnable runnable = iwtVar.r;
        if (runnable != null) {
            iwtVar.j.removeCallbacks(runnable);
        }
    }
}
