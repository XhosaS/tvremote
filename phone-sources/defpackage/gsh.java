package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsh implements gqg {
    public static final String a = gpn.a("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final gqw e;

    public gsh(Context context, gqw gqwVar) {
        this.b = context;
        this.e = gqwVar;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, gun gunVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, gunVar);
        return intent;
    }

    public static Intent d(Context context, gun gunVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, gunVar);
        return intent;
    }

    static gun e(Intent intent) {
        return new gun(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, gun gunVar) {
        intent.putExtra("KEY_WORKSPEC_ID", gunVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", gunVar.b);
    }

    @Override // defpackage.gqg
    public final void a(gun gunVar, boolean z) {
        synchronized (this.d) {
            gsk gskVar = (gsk) this.c.remove(gunVar);
            this.e.c(gunVar);
            if (gskVar != null) {
                gpn.b();
                gun gunVar2 = gskVar.c;
                Objects.toString(gunVar2);
                gskVar.a();
                if (z) {
                    gskVar.g.execute(new gsm(gskVar.d, d(gskVar.a, gunVar2), gskVar.b));
                }
                if (gskVar.i) {
                    gskVar.g.execute(new gsm(gskVar.d, b(gskVar.a), gskVar.b));
                }
            }
        }
    }
}
