package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.aahf;
import defpackage.aahp;
import defpackage.aamb;
import defpackage.aamj;
import defpackage.aamk;
import defpackage.aaml;
import defpackage.aamr;
import defpackage.aamt;
import defpackage.aamu;
import defpackage.aamw;
import defpackage.aamy;
import defpackage.aang;
import defpackage.kkk;
import defpackage.klw;
import defpackage.luj;
import defpackage.lvf;
import defpackage.lvq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {
    public static aamu a;
    static ScheduledExecutorService b;
    private static final long j = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor c;
    public final aahf d;
    public final aaml e;
    public final aamj f;
    public final aamr g;
    public final aang h;
    public final List i;
    private boolean l;

    public FirebaseInstanceId(aahf aahfVar, aamy aamyVar, aamy aamyVar2, aang aangVar) {
        aahfVar.d();
        aaml aamlVar = new aaml(aahfVar.c);
        ExecutorService executorServiceA = aamb.a();
        ExecutorService executorServiceA2 = aamb.a();
        this.l = false;
        this.i = new ArrayList();
        if (aaml.e(aahfVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                aahfVar.d();
                a = new aamu(aahfVar.c);
            }
        }
        this.d = aahfVar;
        this.e = aamlVar;
        this.f = new aamj(aahfVar, aamlVar, aamyVar, aamyVar2, aangVar);
        this.c = executorServiceA2;
        this.g = new aamr(executorServiceA);
        this.h = aangVar;
    }

    public static void g(aahf aahfVar) {
        aahfVar.d();
        aahp aahpVar = aahfVar.e;
        kkk.i(aahpVar.d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        aahfVar.d();
        String str = aahpVar.b;
        kkk.i(str, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        aahfVar.d();
        String str2 = aahpVar.a;
        kkk.i(str2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        aahfVar.d();
        kkk.b(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aahfVar.d();
        kkk.b(k.matcher(str2).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance(aahf aahfVar) {
        g(aahfVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) aahfVar.b(FirebaseInstanceId.class);
        kkk.l(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static boolean m() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    private final Object o(lvf lvfVar) throws IOException {
        try {
            return lvq.e(lvfVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    i();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final lvf a(final String str, final String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return lvq.c(null).b(this.c, new luj() { // from class: aamc
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) throws InterruptedException, NumberFormatException {
                FirebaseInstanceId firebaseInstanceId = this.a;
                try {
                    FirebaseInstanceId.a.e(firebaseInstanceId.d.c());
                    lvf lvfVarA = firebaseInstanceId.h.a();
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    lvfVarA.l(new aamd(), new luu() { // from class: aame
                        @Override // defpackage.luu
                        public final void a(lvf lvfVar2) {
                            aamu aamuVar = FirebaseInstanceId.a;
                            countDownLatch.countDown();
                        }
                    });
                    countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
                    if (lvfVarA.i()) {
                        String str3 = (String) lvfVarA.e();
                        String str4 = str2;
                        String str5 = str;
                        aamt aamtVarC = firebaseInstanceId.c(str5, str4);
                        return !firebaseInstanceId.n(aamtVarC) ? lvq.c(new aamk(aamtVarC.b)) : firebaseInstanceId.g.a(str5, str4, new aamf(firebaseInstanceId, str3, str5, str4, aamtVarC));
                    }
                    if (((lvn) lvfVarA).a) {
                        throw new CancellationException("Task is already canceled");
                    }
                    if (lvfVarA.h()) {
                        throw new IllegalStateException(lvfVarA.d());
                    }
                    throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    public final aamt b() {
        return c(aaml.e(this.d), "*");
    }

    public final aamt c(String str, String str2) {
        return a.a(d(), str, str2);
    }

    public final String d() {
        aahf aahfVar = this.d;
        aahfVar.d();
        return "[DEFAULT]".equals(aahfVar.d) ? "" : aahfVar.c();
    }

    @Deprecated
    public final String e() {
        g(this.d);
        aamt aamtVarB = b();
        if (n(aamtVarB)) {
            k();
        }
        long j2 = aamt.a;
        if (aamtVarB == null) {
            return null;
        }
        return aamtVarB.b;
    }

    @Deprecated
    public final String f(String str, String str2) throws IOException {
        g(this.d);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((aamk) o(a(str, str2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final void h(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new klw("FirebaseInstanceId"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    final synchronized void i() {
        a.b();
    }

    public final synchronized void j(boolean z) {
        this.l = z;
    }

    final synchronized void k() {
        if (this.l) {
            return;
        }
        l(0L);
    }

    public final synchronized void l(long j2) {
        h(new aamw(this, Math.min(Math.max(30L, j2 + j2), j)), j2);
        this.l = true;
    }

    public final boolean n(aamt aamtVar) {
        if (aamtVar == null) {
            return true;
        }
        return System.currentTimeMillis() > aamtVar.d + aamt.a || !this.e.c().equals(aamtVar.c);
    }
}
