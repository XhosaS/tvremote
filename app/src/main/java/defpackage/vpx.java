package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vpx extends Service {
    public vqr a;

    public final vqr a() {
        vqr vqrVar = this.a;
        if (vqrVar != null) {
            return vqrVar;
        }
        agvy.b("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.getClass();
        vqq vqqVarA = a().a(getClass());
        synchronized (vqqVarA.b) {
            Iterator it = vqqVarA.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((vpw) wgw.a(this, vpw.class)).gY(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        agum agumVar = new agum() { // from class: vpv
            @Override // defpackage.agum
            public final Object a() {
                vpx vpxVar = this.a;
                vqq vqqVarA = vpxVar.a().a(vpxVar.getClass());
                Object obj = vqqVarA.b;
                int i3 = i2;
                Intent intent2 = intent;
                synchronized (obj) {
                    if (intent2 != null) {
                        vqqVarA.g = vpxVar;
                        vqqVarA.h = i3;
                        vqqVarA.f = vqp.STARTED;
                        IdentityHashMap identityHashMap = vqqVarA.c;
                        if (identityHashMap.isEmpty()) {
                            vqqVarA.a(vpxVar, (Notification) intent2.getParcelableExtra("fallback_notification"));
                            vqqVarA.b();
                        } else {
                            vqn vqnVar = vqqVarA.i;
                            yqw.M(!identityHashMap.isEmpty(), "Can't select a best notification if thare are none");
                            vqn vqnVar2 = null;
                            for (vqn vqnVar3 : identityHashMap.values()) {
                                if (vqnVar2 != null) {
                                    int i4 = vqnVar3.b;
                                    if (vqnVar == vqnVar3) {
                                        int i5 = vqnVar.b;
                                    }
                                }
                                vqnVar2 = vqnVar3;
                            }
                            vqqVarA.i = vqnVar2;
                            Notification notification = vqqVarA.i.a;
                            vqqVarA.a(vpxVar, null);
                        }
                    } else if (vqqVarA.f == vqp.STOPPED) {
                        vpxVar.stopSelf(i3);
                    }
                }
                return agpu.a;
            }
        };
        wwq wwqVarN = intent != null ? wyo.a.n(intent, true) : null;
        if (wwqVarN == null) {
            agumVar.a();
            return 2;
        }
        wwl wwlVarC = wum.c();
        wwq wwqVarG = wum.g(wwlVarC, wwqVarN);
        try {
            agumVar.a();
            return 2;
        } catch (Throwable th) {
            try {
                wub.c(th);
                throw th;
            } finally {
                wum.g(wwlVarC, wwqVarG);
            }
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        vqq vqqVarA = a().a(getClass());
        synchronized (vqqVarA.b) {
            if (vqqVarA.f.ordinal() == 2) {
                vqqVarA.b();
                vqo vqoVar = new vqo();
                yxs yxsVar = vqqVarA.d;
                Collection yvkVar = yxsVar.d;
                if (yvkVar == null) {
                    yvkVar = new yvk(yxsVar);
                    yxsVar.d = yvkVar;
                }
                yzo yzoVar = new yzo();
                yun yunVar = new yun((yve) ((yvk) yvkVar).a);
                while (yunVar.hasNext()) {
                    yzoVar.c(((wyt) yunVar.next()).a);
                }
                yzq<wwq> yzqVarF = yzoVar.f();
                wyy wyyVar = new wyy(vqoVar, new StackTraceElement[0]);
                yyn yynVar = new yyn(4);
                for (wwq wwqVar : yzqVarF) {
                    wyy wyyVar2 = new wyy(null, wyy.k(wwqVar, null));
                    wyyVar.addSuppressed(wyyVar2);
                    yynVar.c(wwqVar, wyyVar2);
                }
                yyr yyrVarA = yynVar.a(true);
                wyy.g(yyrVarA);
                wyy.e(yyrVarA);
                ((zdv) ((zdv) ((zdv) vqq.a.c()).p(wyyVar)).q("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", 438, "ForegroundServiceTracker.java")).u("Timeout elapsed");
                vqqVarA.e.clear();
                yxsVar.j();
            }
        }
    }
}
