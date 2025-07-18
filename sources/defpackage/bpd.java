package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpd extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/PowerFeature");
    private final Context c;
    private final PowerManager d;
    private final Handler e;
    private boolean g;
    private final BroadcastReceiver b = new bpb(this);
    private final List f = new ArrayList();

    public bpd(Context context, Handler handler) {
        this.c = context;
        this.d = (PowerManager) context.getSystemService(PowerManager.class);
        this.e = handler;
    }

    private static bvw f(boolean z) {
        clo cloVarO = bvw.a.o();
        clo cloVarO2 = bvs.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvs bvsVar = (bvs) cloVarO2.b;
        bvsVar.b |= 1;
        bvsVar.c = z;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvw bvwVar = (bvw) cloVarO.b;
        bvs bvsVar2 = (bvs) cloVarO2.i();
        bvsVar2.getClass();
        bvwVar.c = bvsVar2;
        bvwVar.b = 40;
        return (bvw) cloVarO.i();
    }

    public final synchronized void a(bug bugVar) {
        List list = this.f;
        list.remove(bugVar);
        if (list.isEmpty()) {
            ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/PowerFeature", "decrementActiveClients", 115, "PowerFeature.java")).p("Unregister from screen on/off broadcasts");
            this.c.unregisterReceiver(this.b);
        }
    }

    @Override // defpackage.bta
    public final btc b(bug bugVar) {
        if (this.d == null) {
            return null;
        }
        return new bpc(this, bugVar);
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
        if (this.d == null) {
            bxjVar.d("Power Feature is not available");
        } else {
            bxjVar.c("Power Feature: %d active clients%n", Integer.valueOf(this.f.size()));
        }
    }

    public final synchronized void d(bug bugVar) {
        List list = this.f;
        list.add(bugVar);
        if (list.size() == 1) {
            ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/PowerFeature", "incrementActiveClients", 94, "PowerFeature.java")).p("Register for screen on/off broadcasts");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.c.registerReceiver(this.b, intentFilter, null, this.e);
            this.g = this.d.isInteractive();
        }
        bugVar.d(f(this.g));
    }

    public final synchronized void e(boolean z) {
        this.g = z;
        List list = this.f;
        bvw bvwVarF = f(z);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bug) it.next()).d(bvwVarF);
        }
    }
}
