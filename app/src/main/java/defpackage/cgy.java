package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgy implements Runnable {
    public final /* synthetic */ cha a;

    public /* synthetic */ cgy(cha chaVar) {
        this.a = chaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cha chaVar = this.a;
        int i = chaVar.g;
        ckp ckpVar = chaVar.d;
        String str = ckpVar.a;
        if (i >= 2) {
            cbx.c().a(cha.a, "Already stopped work for ".concat(str));
            return;
        }
        chaVar.g = 2;
        String strConcat = "Stopping work for WorkSpec ".concat(str);
        cbx cbxVarC = cbx.c();
        String str2 = cha.a;
        cbxVarC.a(str2, strConcat);
        Context context = chaVar.b;
        String str3 = cgu.a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        cgu.f(intent, ckpVar);
        Executor executor = chaVar.i;
        chf chfVar = chaVar.e;
        int i2 = chaVar.c;
        executor.execute(new chc(chfVar, intent, i2));
        if (!chfVar.d.g(str)) {
            cbx.c().a(str2, a.e(str, "Processor does not have WorkSpec ", ". No need to reschedule"));
        } else {
            cbx.c().a(str2, a.e(str, "WorkSpec ", " needs to be rescheduled"));
            executor.execute(new chc(chfVar, cgu.d(context, ckpVar), i2));
        }
    }
}
