package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class lum implements Runnable {
    final /* synthetic */ lvf a;
    final /* synthetic */ lun b;

    public lum(lun lunVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = lunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            lvf lvfVar = (lvf) this.b.a.a(this.a);
            if (lvfVar == null) {
                lun lunVar = this.b;
                lunVar.b.o(new NullPointerException("Continuation returned null"));
            } else {
                lun lunVar2 = this.b;
                Executor executor = lvm.b;
                lvfVar.n(executor, lunVar2);
                lvfVar.m(executor, lunVar2);
                lvfVar.j(executor, lunVar2);
            }
        } catch (lvd e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.o(e);
                return;
            }
            lun lunVar3 = this.b;
            lunVar3.b.o((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.o(e2);
        }
    }
}
