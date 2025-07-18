package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cns implements Runnable {
    private final cdy a;
    private final cee b;
    private final boolean c;
    private final int d;

    public cns(cdy cdyVar, cee ceeVar, boolean z, int i) {
        cdyVar.getClass();
        this.a = cdyVar;
        this.b = ceeVar;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zF;
        cgk cgkVarA;
        if (this.c) {
            cdy cdyVar = this.a;
            cee ceeVar = this.b;
            int i = this.d;
            Object obj = cdyVar.g;
            String str = ceeVar.a.a;
            synchronized (obj) {
                cgkVarA = cdyVar.a(str);
            }
            zF = cdy.f(str, cgkVarA, i);
        } else {
            cdy cdyVar2 = this.a;
            cee ceeVar2 = this.b;
            int i2 = this.d;
            Object obj2 = cdyVar2.g;
            String str2 = ceeVar2.a.a;
            synchronized (obj2) {
                if (cdyVar2.c.get(str2) != null) {
                    cbx.c().a(cdy.a, a.e(str2, "Ignored stopWork. WorkerWrapper ", " is in foreground"));
                } else {
                    Set set = (Set) cdyVar2.d.get(str2);
                    if (set != null && set.contains(ceeVar2)) {
                        zF = cdy.f(str2, cdyVar2.a(str2), i2);
                    }
                }
                zF = false;
            }
        }
        cbx.c().a(cbx.d("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zF);
    }
}
