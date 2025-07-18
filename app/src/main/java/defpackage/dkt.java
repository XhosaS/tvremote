package defpackage;

import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dkt implements dap {
    private final djy a;
    private final ddx b;

    public dkt(djy djyVar, ddx ddxVar) {
        this.a = djyVar;
        this.b = ddxVar;
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        boolean z;
        dkq dkqVar;
        dpz dpzVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof dkq) {
            dkqVar = (dkq) inputStream;
            z = false;
        } else {
            z = true;
            dkqVar = new dkq(inputStream, this.b);
        }
        boolean z2 = z;
        Queue queue = dpz.a;
        synchronized (queue) {
            dpzVar = (dpz) queue.poll();
        }
        if (dpzVar == null) {
            dpzVar = new dpz();
        }
        dpz dpzVar2 = dpzVar;
        dpzVar2.b = dkqVar;
        dqi dqiVar = new dqi(dpzVar2);
        dks dksVar = new dks(dkqVar, dpzVar2);
        try {
            djy djyVar = this.a;
            ddp ddpVarA = djyVar.a(new dkj(dqiVar, djyVar.g, djyVar.f), i, i2, danVar, dksVar);
            dpzVar2.a();
            if (z2) {
                dkqVar.b();
            }
            return ddpVarA;
        } finally {
        }
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return true;
    }
}
