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
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kcp {
    public static final Executor a = new Executor() { // from class: kch
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public final kcg e;
    public Messenger f;
    public CloudMessagingMessengerCompat g;
    private final ScheduledExecutorService j;
    public final wx c = new wx(0);
    private final Messenger k = new Messenger(new kco(this, Looper.getMainLooper()));

    public kcp(Context context) {
        this.d = context;
        this.e = new kcg(context);
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
            i = PendingIntent.getBroadcast(context, 0, intent2, kok.a);
        }
        intent.putExtra("app", i);
    }

    public final lvf a(Bundle bundle) throws RemoteException {
        final String strE = e();
        final lvj lvjVar = new lvj();
        wx wxVar = this.c;
        synchronized (wxVar) {
            wxVar.put(strE, lvjVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.e.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", a.e(strE, "|ID|", "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.k);
        if (this.f != null || this.g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.a.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.e.b() == 2) {
            Context context = this.d;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.d.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.j.schedule(new Runnable() { // from class: kcm
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor = kcp.a;
                if (lvjVar.a.q(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        lvn lvnVar = lvjVar.a;
        lvnVar.l(a, new luu() { // from class: kcn
            @Override // defpackage.luu
            public final void a(lvf lvfVar) {
                wx wxVar2 = this.a.c;
                String str = strE;
                synchronized (wxVar2) {
                    wxVar2.remove(str);
                }
                scheduledFutureSchedule.cancel(false);
            }
        });
        return lvnVar;
    }

    public final lvf b(final Bundle bundle) {
        kcg kcgVar = this.e;
        return kcgVar.a() < 12000000 ? kcgVar.b() != 0 ? a(bundle).b(a, new luj() { // from class: kci
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) {
                if (!lvfVar.i() || !kcp.d((Bundle) lvfVar.e())) {
                    return lvfVar;
                }
                return this.a.a(bundle).c(kcp.a, new lve() { // from class: kck
                    @Override // defpackage.lve
                    public final lvf a(Object obj) {
                        Bundle bundle2 = (Bundle) obj;
                        return kcp.d(bundle2) ? lvq.c(null) : lvq.c(bundle2);
                    }
                });
            }
        }) : lvq.b(new IOException("MISSING_INSTANCEID_SERVICE")) : kcf.a(this.d).c(1, bundle).a(a, new luj() { // from class: kcj
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) throws IOException {
                Executor executor = kcp.a;
                if (lvfVar.i()) {
                    return (Bundle) lvfVar.e();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(lvfVar.d()))));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", lvfVar.d());
            }
        });
    }

    public final void c(String str, Bundle bundle) {
        wx wxVar = this.c;
        synchronized (wxVar) {
            lvj lvjVar = (lvj) wxVar.remove(str);
            if (lvjVar == null) {
                Log.w("Rpc", a.j(str, "Missing callback for "));
            } else {
                lvjVar.a.p(bundle);
            }
        }
    }
}
