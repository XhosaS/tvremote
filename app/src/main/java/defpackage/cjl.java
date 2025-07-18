package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cjl implements chv, cdk {
    public static final String a = cbx.d("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final cfq b;
    final Object c = new Object();
    ckp d;
    final Map e;
    final Map f;
    final Map g;
    final cic h;
    public cjk i;
    public final coe j;
    private final Context l;

    public cjl(Context context) {
        this.l = context;
        cfq cfqVarJ = cfq.j(context);
        this.b = cfqVarJ;
        this.j = cfqVarJ.m;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new cic(cfqVarJ.l);
        cfqVarJ.g.c(this);
    }

    @Override // defpackage.cdk
    public final void a(ckp ckpVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            ahdl ahdlVar = ((cld) this.f.remove(ckpVar)) != null ? (ahdl) this.g.remove(ckpVar) : null;
            if (ahdlVar != null) {
                ahdlVar.s(null);
            }
        }
        Map map = this.e;
        cbf cbfVar = (cbf) map.remove(ckpVar);
        if (ckpVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (ckp) entry.getKey();
                if (this.i != null) {
                    cbf cbfVar2 = (cbf) entry.getValue();
                    cjk cjkVar = this.i;
                    int i = cbfVar2.a;
                    cjkVar.c(i, cbfVar2.b, cbfVar2.c);
                    this.i.a(i);
                }
            } else {
                this.d = null;
            }
        }
        cjk cjkVar2 = this.i;
        if (cbfVar == null || cjkVar2 == null) {
            return;
        }
        cbx cbxVarC = cbx.c();
        String str = a;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        int i2 = cbfVar.a;
        sb.append(i2);
        sb.append(", workSpecId: ");
        sb.append(ckpVar);
        sb.append(", notificationType: ");
        sb.append(cbfVar.b);
        cbxVarC.a(str, sb.toString());
        cjkVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.i == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        ckp ckpVar = new ckp(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        cbx.c().a(a, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        cbf cbfVar = new cbf(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(ckpVar, cbfVar);
        cbf cbfVar2 = (cbf) map.get(this.d);
        if (cbfVar2 == null) {
            this.d = ckpVar;
        } else {
            this.i.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((cbf) ((Map.Entry) it.next()).getValue()).b;
                }
                cbfVar = new cbf(cbfVar2.a, cbfVar2.c, i);
            } else {
                cbfVar = cbfVar2;
            }
        }
        this.i.c(cbfVar.a, cbfVar.b, cbfVar.c);
    }

    public final void c() {
        this.i = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((ahdl) it.next()).s(null);
            }
        }
        this.b.g.d(this);
    }

    public final void d(int i) {
        cbx.c();
        Log.i(a, a.b(i, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.e.entrySet()) {
            if (((cbf) entry.getValue()).b == i) {
                this.b.o((ckp) entry.getKey(), -128);
            }
        }
        cjk cjkVar = this.i;
        if (cjkVar != null) {
            cjkVar.d();
        }
    }

    @Override // defpackage.chv
    public final void e(cld cldVar, chl chlVar) {
        if (chlVar instanceof chk) {
            cbx.c().a(a, "Constraints unmet for WorkSpec ".concat(cldVar.c));
            this.b.o(cmk.a(cldVar), ((chk) chlVar).a);
        }
    }
}
