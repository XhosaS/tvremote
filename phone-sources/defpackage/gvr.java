package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvr implements Runnable {
    private final gqr a;
    private final boolean b;
    private final int c;
    private final cb d;

    public gvr(gqr gqrVar, cb cbVar, boolean z, int i) {
        gqrVar.getClass();
        this.a = gqrVar;
        this.d = cbVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gsb gsbVarA;
        if (this.b) {
            gqr gqrVar = this.a;
            cb cbVar = this.d;
            int i = this.c;
            String str = ((gun) cbVar.a).a;
            synchronized (gqrVar.i) {
                gsbVarA = gqrVar.a(str);
            }
            gqr.f(gsbVarA, i);
        } else {
            gqr gqrVar2 = this.a;
            cb cbVar2 = this.d;
            int i2 = this.c;
            String str2 = ((gun) cbVar2.a).a;
            synchronized (gqrVar2.i) {
                if (gqrVar2.d.get(str2) != null) {
                    gpn.b();
                } else {
                    Set set = (Set) gqrVar2.f.get(str2);
                    if (set != null && set.contains(cbVar2)) {
                        gqr.f(gqrVar2.a(str2), i2);
                    }
                }
            }
        }
        gpn.b();
        gpn.a("StopWorkRunnable");
    }
}
