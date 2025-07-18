package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvc {
    public static final Executor a = new fba(5);
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public Messenger e;
    public nuo f;
    public final rbu g;
    private final ScheduledExecutorService j;
    public final ko c = new ko();
    private final Messenger k = new Messenger(new nvb(this, Looper.getMainLooper()));

    public nvc(Context context) {
        this.d = context;
        this.g = new rbu(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String e() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return Integer.toString(i2);
    }

    private static synchronized void f(Context context, Intent intent) {
        if (i == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            i = ogf.a(context, intent2, ogf.a);
        }
        intent.putExtra("app", i);
    }

    public final onz a(Bundle bundle) throws RemoteException {
        String strE = e();
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        ko koVar = this.c;
        synchronized (koVar) {
            koVar.put(strE, kwyVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.g.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", a.cg(strE, "|ID|", "|"));
        intent.putExtra("google.messenger", this.k);
        if (this.e != null || this.f != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.e;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f.b(messageObtain);
                }
            } catch (RemoteException unused) {
            }
        } else if (this.g.b() == 2) {
            Context context = this.d;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.d.startService(intent);
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.j.schedule(new nur(kwyVar, 3), 30L, TimeUnit.SECONDS);
        onz onzVar = (onz) kwyVar.a;
        onzVar.l(a, new nva(this, strE, scheduledFutureSchedule, 0));
        return onzVar;
    }

    public final onz b(Bundle bundle) {
        rbu rbuVar = this.g;
        return rbuVar.a() < 12000000 ? rbuVar.b() != 0 ? a(bundle).b(a, new nuy(this, bundle, 0)) : osk.q(new IOException("MISSING_INSTANCEID_SERVICE")) : nux.a(this.d).c(1, bundle).a(a, new nuz(1));
    }

    public final void c(String str, Bundle bundle) {
        ko koVar = this.c;
        synchronized (koVar) {
            kwy kwyVar = (kwy) koVar.remove(str);
            if (kwyVar == null) {
                Log.w("Rpc", a.cr(str, "Missing callback for "));
            } else {
                kwyVar.u(bundle);
            }
        }
    }
}
