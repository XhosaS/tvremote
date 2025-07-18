package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwg {
    private final yqt a;

    public vwg(yqt yqtVar) {
        yqtVar.getClass();
        this.a = yqtVar;
    }

    public final agte a(ScheduledExecutorService scheduledExecutorService) {
        agte agteVarPlus;
        Boolean bool = true;
        bool.getClass();
        if (((Boolean) this.a.e(false)).booleanValue()) {
            agteVarPlus = new ahdc(new vwu(scheduledExecutorService)).plus(vws.a);
        } else {
            vwp vwpVar = new vwp(scheduledExecutorService);
            agteVarPlus = new ahdc(vwpVar).plus(vwpVar);
        }
        return agteVarPlus.plus(new wzc(new wwn(), false, false));
    }
}
