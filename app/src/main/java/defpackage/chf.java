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

/* compiled from: PG */
/* loaded from: classes.dex */
public class chf implements cdk {
    public static final String a = cbx.d("SystemAlarmDispatcher");
    final Context b;
    public final coc c;
    public final cdy d;
    public final cfq e;
    final cgu f;
    final List g;
    Intent h;
    public chd i;
    final coe j;
    public final cfo k;
    private final ceh l;

    public chf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        ceh cehVarA = ceh.a.a(true);
        this.l = cehVarA;
        cfq cfqVarJ = cfq.j(context);
        this.e = cfqVarJ;
        ccn ccnVar = cfqVarJ.d.i;
        this.f = new cgu(applicationContext, cehVarA);
        this.c = new coc(cfqVarJ.d.e);
        cdy cdyVar = cfqVarJ.g;
        this.d = cdyVar;
        coe coeVar = cfqVarJ.m;
        this.j = coeVar;
        this.k = new cfo(cdyVar, coeVar);
        cdyVar.c(this);
        this.g = new ArrayList();
        this.h = null;
    }

    @Override // defpackage.cdk
    public final void a(ckp ckpVar, boolean z) {
        String str = cgu.a;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        cgu.f(intent, ckpVar);
        this.j.d.execute(new chc(this, intent, 0));
    }

    public final void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        cbx.c().a(a, "Destroying SystemAlarmDispatcher");
        this.d.d(this);
        this.i = null;
    }

    public final void d() {
        b();
        PowerManager.WakeLock wakeLockA = cnt.a(this.b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            coe coeVar = this.e.m;
            coeVar.a.execute(new chb(this));
        } finally {
            wakeLockA.release();
        }
    }

    public final void e(Intent intent, int i) {
        cbx cbxVarC = cbx.c();
        String str = a;
        cbxVarC.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            cbx.c();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
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
                d();
            }
        }
    }
}
