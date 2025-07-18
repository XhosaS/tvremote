package defpackage;

import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ivz extends agvw implements agvc {
    public ivz(Object obj) {
        super(3, obj, iwd.class, "updateStateAtFixedRate", "updateStateAtFixedRate(Lcom/google/android/apps/tvsearch/statesync/monitors/StateMonitor;Ljava/time/Duration;Ljava/time/Duration;)V", 0);
    }

    @Override // defpackage.agvc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ite iteVar = (ite) obj;
        Duration duration = (Duration) obj2;
        Duration duration2 = (Duration) obj3;
        iteVar.getClass();
        duration.getClass();
        duration2.getClass();
        iwd iwdVar = (iwd) this.c;
        Map map = iwdVar.i;
        ahdl ahdlVar = (ahdl) map.get(iteVar);
        if (ahdlVar != null) {
            ahdlVar.s(null);
        }
        map.put(iteVar, ahal.e(iwdVar.b, null, 0, new iwc(duration, iwdVar, iteVar, duration2, null), 3));
        return agpu.a;
    }
}
