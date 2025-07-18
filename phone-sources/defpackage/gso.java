package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gso implements gqg {
    public static final String a = gpn.a("SystemAlarmDispatcher");
    final Context b;
    public final gvy c;
    public final gqr d;
    public final grs e;
    public final gsh f;
    public final List g;
    public Intent h;
    public gsn i;
    public final fse j;
    public final isy k;
    private final gqw l;

    public gso(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        gqw gqwVarAT = fki.aT();
        this.l = gqwVarAT;
        grs grsVarH = grs.h(context);
        this.e = grsVarH;
        Object obj = grsVarH.h.e;
        this.f = new gsh(applicationContext, gqwVarAT);
        this.c = new gvy((cb) grsVarH.h.g);
        gqr gqrVar = grsVarH.e;
        this.d = gqrVar;
        isy isyVar = grsVarH.k;
        this.k = isyVar;
        this.j = new fse(gqrVar, isyVar);
        gqrVar.c(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gqg
    public final void a(gun gunVar, boolean z) {
        String str = gsh.a;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        gsh.f(intent, gunVar);
        this.k.a.execute(new gsm(this, intent, 0));
    }

    public final void b() {
        gpn.b();
        this.d.d(this);
        this.i = null;
    }

    public final void c() {
        e();
        PowerManager.WakeLock wakeLockA = gvs.a(this.b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.k.q(new gsl(this));
        } finally {
            wakeLockA.release();
        }
    }

    public final void d(Intent intent, int i) {
        gpn.b();
        Objects.toString(intent);
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            gpn.b();
            Log.w(a, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            List list = this.g;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.g;
        synchronized (list2) {
            boolean zIsEmpty = list2.isEmpty();
            list2.add(intent);
            if (zIsEmpty) {
                c();
            }
        }
    }
}
