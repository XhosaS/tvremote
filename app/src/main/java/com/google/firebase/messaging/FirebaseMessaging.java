package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a;
import defpackage.aahf;
import defpackage.aahs;
import defpackage.aaln;
import defpackage.aamx;
import defpackage.aamy;
import defpackage.aang;
import defpackage.aaow;
import defpackage.aapb;
import defpackage.aapc;
import defpackage.aape;
import defpackage.aapk;
import defpackage.aapm;
import defpackage.aapq;
import defpackage.aapt;
import defpackage.aapu;
import defpackage.aapx;
import defpackage.aaqd;
import defpackage.aaqi;
import defpackage.aaqj;
import defpackage.aaql;
import defpackage.aaqp;
import defpackage.kcf;
import defpackage.kcp;
import defpackage.kkk;
import defpackage.klp;
import defpackage.klw;
import defpackage.luj;
import defpackage.lva;
import defpackage.lvf;
import defpackage.lvq;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseMessaging {
    static ScheduledExecutorService b;
    public static final /* synthetic */ int i = 0;
    private static aaqj k;
    public final aahf c;
    public final Context d;
    public final aapq e;
    public final aapm f;
    public final Executor g;
    public final aapu h;
    private final aamx l;
    private final aaqd m;
    private final Executor n;
    private final lvf o;
    private boolean p;
    private final Application.ActivityLifecycleCallbacks q;
    private static final long j = TimeUnit.HOURS.toSeconds(8);
    public static aamy a = new aamy() { // from class: aapi
        @Override // defpackage.aamy
        public final Object a() {
            int i2 = FirebaseMessaging.i;
            return null;
        }
    };

    public FirebaseMessaging(aahf aahfVar, aamx aamxVar, aamy aamyVar, aamy aamyVar2, aang aangVar, aamy aamyVar3, aaln aalnVar) {
        aahfVar.d();
        final aapu aapuVar = new aapu(aahfVar.c);
        final aapq aapqVar = new aapq(aahfVar, aapuVar, aamyVar, aamyVar2, aangVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new klw("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new klw("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new klw("Firebase-Messaging-File-Io"));
        this.p = false;
        a = aamyVar3;
        this.c = aahfVar;
        this.l = aamxVar;
        this.f = new aapm(this, aalnVar);
        aahfVar.d();
        final Context context = aahfVar.c;
        this.d = context;
        aapc aapcVar = new aapc();
        this.q = aapcVar;
        this.h = aapuVar;
        this.e = aapqVar;
        this.m = new aaqd(executorServiceNewSingleThreadExecutor);
        this.n = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        aahfVar.d();
        Context context2 = aahfVar.c;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(aapcVar);
        } else {
            Log.w("FirebaseMessaging", a.t(context2, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (aamxVar != null) {
            aamxVar.b(new aape(this));
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: aapf
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.a;
                if (firebaseMessaging.f.b()) {
                    firebaseMessaging.i();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new klw("Firebase-Messaging-Topics-Io"));
        int i2 = aaqp.e;
        lvf lvfVarA = lvq.a(scheduledThreadPoolExecutor2, new Callable() { // from class: aaqo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3 = aaqp.e;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                return new aaqp(this, aapuVar, aaqn.b(context3, scheduledExecutorService), aapqVar, context3, scheduledExecutorService);
            }
        });
        this.o = lvfVarA;
        lvfVarA.n(scheduledThreadPoolExecutor, new lva() { // from class: aapg
            @Override // defpackage.lva
            public final void d(Object obj) {
                aaqp aaqpVar = (aaqp) obj;
                if (!this.a.f.b() || aaqpVar.d.a() == null || aaqpVar.f()) {
                    return;
                }
                aaqpVar.d(0L);
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: aaph
            @Override // java.lang.Runnable
            public final void run() {
                lvf lvfVarB;
                FirebaseMessaging firebaseMessaging = this.a;
                final Context context3 = firebaseMessaging.d;
                aapx.a(context3);
                final boolean zK = firebaseMessaging.k();
                if (klp.a()) {
                    SharedPreferences sharedPreferencesA = aaqa.a(context3);
                    if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zK) {
                        kcp kcpVar = firebaseMessaging.e.b;
                        if (kcpVar.e.a() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", zK);
                            lvfVarB = kcf.a(kcpVar.d).b(4, bundle);
                        } else {
                            lvfVarB = lvq.b(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        lvfVarB.n(new Executor() { // from class: aapy
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new lva() { // from class: aapz
                            @Override // defpackage.lva
                            public final void d(Object obj) {
                                SharedPreferences.Editor editorEdit = aaqa.a(context3).edit();
                                editorEdit.putBoolean("proxy_retention", zK);
                                editorEdit.apply();
                            }
                        });
                    }
                }
                if (firebaseMessaging.k()) {
                    firebaseMessaging.f();
                }
            }
        });
    }

    public static synchronized aaqj b(Context context) {
        if (k == null) {
            k = new aaqj(context);
        }
        return k;
    }

    static synchronized FirebaseMessaging getInstance(aahf aahfVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) aahfVar.b(FirebaseMessaging.class);
        kkk.l(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    private final synchronized void m() {
        if (this.p) {
            return;
        }
        j(0L);
    }

    final aaqi a() {
        return b(this.d).a(d(), aapu.e(this.c));
    }

    public final String c() throws IOException {
        aamx aamxVar = this.l;
        if (aamxVar != null) {
            try {
                return (String) lvq.d(aamxVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        aaqi aaqiVarA = a();
        if (!l(aaqiVarA)) {
            return aaqiVarA.b;
        }
        aahf aahfVar = this.c;
        aaqd aaqdVar = this.m;
        String strE = aapu.e(aahfVar);
        try {
            return (String) lvq.d(aaqdVar.a(strE, new aapk(this, strE, aaqiVarA)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final String d() {
        aahf aahfVar = this.c;
        aahfVar.d();
        return "[DEFAULT]".equals(aahfVar.d) ? "" : aahfVar.c();
    }

    public final void e(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new klw("TAG"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final void f() {
        kcp kcpVar = this.e.b;
        (kcpVar.e.a() >= 241100000 ? kcf.a(kcpVar.d).c(5, Bundle.EMPTY).a(kcp.a, new luj() { // from class: kcl
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) {
                Executor executor = kcp.a;
                Intent intent = (Intent) ((Bundle) lvfVar.e()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : lvq.b(new IOException("SERVICE_NOT_AVAILABLE"))).n(this.n, new lva() { // from class: aapj
            @Override // defpackage.lva
            public final void d(Object obj) throws NumberFormatException {
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    FirebaseMessaging firebaseMessaging = this.a;
                    aapt.c(cloudMessage.a);
                    firebaseMessaging.f();
                }
            }
        });
    }

    public final void g(String str) {
        aahf aahfVar = this.c;
        aahfVar.d();
        String str2 = aahfVar.d;
        if ("[DEFAULT]".equals(str2)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                aahfVar.d();
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: ".concat(String.valueOf(str2)));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            aapb.b(intent, this.d, new aaow());
        }
    }

    public final synchronized void h(boolean z) {
        this.p = z;
    }

    public final void i() {
        aamx aamxVar = this.l;
        if (aamxVar != null) {
            aamxVar.c();
        } else if (l(a())) {
            m();
        }
    }

    public final synchronized void j(long j2) {
        e(new aaql(this, Math.min(Math.max(30L, j2 + j2), j)), j2);
        this.p = true;
    }

    public final boolean k() {
        Context context = this.d;
        aapx.a(context);
        if (klp.a()) {
            if (!aapx.b(context)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package ".concat(String.valueOf(context.getPackageName())));
            } else if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.c.b(aahs.class) != null) {
                    return true;
                }
                if (aapt.e() && a != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    final boolean l(aaqi aaqiVar) {
        if (aaqiVar == null) {
            return true;
        }
        return System.currentTimeMillis() > aaqiVar.d + aaqi.a || !this.h.c().equals(aaqiVar.c);
    }
}
