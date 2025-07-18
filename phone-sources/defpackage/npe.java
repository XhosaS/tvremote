package defpackage;

import java.util.Deque;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class npe extends TimerTask {
    final /* synthetic */ nph a;

    public npe(nph nphVar) {
        this.a = nphVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        nwx nwxVarZ;
        nph nphVar = this.a;
        Deque deque = nphVar.h;
        if (deque.isEmpty() || nphVar.i != null || nphVar.b == 0) {
            return;
        }
        nqj nqjVar = nphVar.c;
        int[] iArrJ = nrv.j(deque);
        ocv.aC();
        if (nqjVar.p()) {
            npr nprVar = new npr(nqjVar, iArrJ);
            nqj.y(nprVar);
            nwxVarZ = nprVar;
        } else {
            nwxVarZ = nqj.z();
        }
        nphVar.i = nwxVarZ;
        nphVar.i.i(new mkk(nphVar, 7));
        deque.clear();
    }
}
