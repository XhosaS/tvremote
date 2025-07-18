package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfa implements pjn {
    public final tfb a;
    private final pjn b;

    public tfa(pjn pjnVar, tfb tfbVar) {
        this.b = pjnVar;
        this.a = tfbVar;
    }

    private final String f() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.pjn
    public final zyd a(pgb pgbVar) {
        throw null;
    }

    @Override // defpackage.pjn
    public final zyd b(yqt yqtVar) {
        String strF = f();
        rqo rqoVar = rpv.a;
        this.a.a(new rqt(new rpz("SCHEDULE_PERIODIC_BACKGROUND_TASKS_START", true, yqt.i(600000L), 116, rpw.MDD_INTERACTION, rpv.b, rpv.a, rpv.c, rpv.d)), strF);
        zyd zydVarB = this.b.b(yqtVar);
        tez tezVar = new tez(this, strF);
        zxn.p(zydVarB, wyo.f(tezVar), zwk.a);
        zydVarB.getClass();
        return zydVarB;
    }

    @Override // defpackage.pjn
    public final void c(String str) {
        String strF = f();
        rqo rqoVar = rpv.a;
        yqt yqtVarI = yqt.i(600000L);
        rpw rpwVar = rpw.MDD_INTERACTION;
        int[] iArr = rpv.b;
        rqo rqoVar2 = rpv.a;
        yzq yzqVar = rpv.c;
        String str2 = rpv.d;
        rqt rqtVar = new rqt(new rpz("CANCEL_FOREGROUND_DOWNLOAD_START", true, yqtVarI, 113, rpwVar, iArr, rqoVar2, yzqVar, str2));
        tfb tfbVar = this.a;
        tfbVar.a(rqtVar, strF);
        this.b.c(str);
        tfbVar.c(new rqw(new rpz("CANCEL_FOREGROUND_DOWNLOAD_FINISHED", false, ypv.a, 134, rpwVar, new int[]{101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121}, rqoVar2, yzqVar, str2)), strF);
    }

    @Override // defpackage.pjn
    public final zyd d(String str, yqt yqtVar) {
        String strF = f();
        rqo rqoVar = rpv.a;
        this.a.a(new rqt(new rpz("HANDLE_TASK_START", true, yqt.i(600000L), 118, rpw.MDD_INTERACTION, rpv.b, rpv.a, rpv.c, rpv.d)), strF);
        zyd zydVarD = this.b.d(str, yqtVar);
        tey teyVar = new tey(this, strF);
        zxn.p(zydVarD, wyo.f(teyVar), zwk.a);
        return zydVarD;
    }

    public final int e(Throwable th) {
        if (th instanceof phc) {
            return ((phc) th).a.aF;
        }
        if (!(th instanceof pgc)) {
            return zsb.a(4);
        }
        yyk yykVar = ((pgc) th).a;
        yykVar.getClass();
        Throwable th2 = (Throwable) agqq.o(yykVar);
        return th2 != null ? e(th2) : zsb.a(4);
    }
}
