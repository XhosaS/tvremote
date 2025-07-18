package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vpt {
    public final /* synthetic */ wxc a;

    public /* synthetic */ vpt(wxc wxcVar) {
        this.a = wxcVar;
    }

    public final Runnable a(final Runnable runnable) {
        if (wum.t()) {
            return wyo.h(runnable);
        }
        final wxc wxcVar = this.a;
        return new Runnable() { // from class: vps
            @Override // java.lang.Runnable
            public final void run() {
                wxc wxcVar2 = wxcVar;
                Runnable runnable2 = runnable;
                wvl wvlVarB = wxcVar2.b("AutoGIL", "com/google/apps/tiktok/analytics/ve/VisualElementModule$VisualElementSingletonModule", "provideTracedRunner", 50);
                try {
                    runnable2.run();
                    wvlVarB.close();
                } catch (Throwable th) {
                    try {
                        wvlVarB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
    }
}
