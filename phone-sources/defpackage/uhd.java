package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhd extends ufa implements Runnable {
    private uhp a;

    public uhd(uhp uhpVar) {
        this.a = uhpVar;
    }

    @Override // defpackage.ufb
    protected final void d() {
        this.a = null;
    }

    @Override // defpackage.ufb
    protected final String dw() {
        uhp uhpVar = this.a;
        if (uhpVar != null) {
            return a.ch(uhpVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uhp uhpVar = this.a;
        if (uhpVar != null) {
            ev(uhpVar);
        }
    }
}
