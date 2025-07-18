package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cgu implements cdk {
    public static final String a = cbx.d("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final ceh e;

    public cgu(Context context, ceh cehVar) {
        this.b = context;
        this.e = cehVar;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, ckp ckpVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, ckpVar);
        return intent;
    }

    static Intent d(Context context, ckp ckpVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, ckpVar);
        return intent;
    }

    static ckp e(Intent intent) {
        return new ckp(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, ckp ckpVar) {
        intent.putExtra("KEY_WORKSPEC_ID", ckpVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", ckpVar.b);
    }

    @Override // defpackage.cdk
    public final void a(ckp ckpVar, boolean z) {
        synchronized (this.d) {
            cha chaVar = (cha) this.c.remove(ckpVar);
            this.e.a(ckpVar);
            if (chaVar != null) {
                cbx cbxVarC = cbx.c();
                String str = cha.a;
                StringBuilder sb = new StringBuilder("onExecuted ");
                ckp ckpVar2 = chaVar.d;
                sb.append(ckpVar2);
                sb.append(", ");
                sb.append(z);
                cbxVarC.a(str, sb.toString());
                chaVar.a();
                if (z) {
                    chaVar.i.execute(new chc(chaVar.e, d(chaVar.b, ckpVar2), chaVar.c));
                }
                if (chaVar.k) {
                    chaVar.i.execute(new chc(chaVar.e, b(chaVar.b), chaVar.c));
                }
            }
        }
    }
}
