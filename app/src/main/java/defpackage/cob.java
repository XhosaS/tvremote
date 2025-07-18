package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cob implements Runnable {
    private final coc a;
    private final ckp b;

    public cob(coc cocVar, ckp ckpVar) {
        this.a = cocVar;
        this.b = ckpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        coc cocVar = this.a;
        synchronized (cocVar.e) {
            Map map = cocVar.c;
            ckp ckpVar = this.b;
            if (((cob) map.remove(ckpVar)) != null) {
                coa coaVar = (coa) cocVar.d.remove(ckpVar);
                if (coaVar != null) {
                    coaVar.b(ckpVar);
                }
            } else {
                cbx.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", ckpVar));
            }
        }
    }
}
