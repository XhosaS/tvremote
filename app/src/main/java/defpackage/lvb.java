package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class lvb implements Runnable {
    final /* synthetic */ lvf a;
    final /* synthetic */ lvc b;

    public lvb(lvc lvcVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = lvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            lvf lvfVarA = this.b.a.a(this.a.e());
            lvc lvcVar = this.b;
            Executor executor = lvm.b;
            lvfVarA.n(executor, lvcVar);
            lvfVarA.m(executor, lvcVar);
            lvfVarA.j(executor, lvcVar);
        } catch (CancellationException unused) {
            this.b.b.r();
        } catch (lvd e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.o(e);
                return;
            }
            lvc lvcVar2 = this.b;
            lvcVar2.b.o((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.o(e2);
        }
    }
}
