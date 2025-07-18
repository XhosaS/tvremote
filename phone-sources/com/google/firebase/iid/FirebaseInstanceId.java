package com.google.firebase.iid;

import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.aafi;
import defpackage.fba;
import defpackage.nmn;
import defpackage.nvc;
import defpackage.ocv;
import defpackage.ocy;
import defpackage.ono;
import defpackage.onz;
import defpackage.ooe;
import defpackage.osk;
import defpackage.qtl;
import defpackage.uiz;
import defpackage.ulo;
import defpackage.ulp;
import defpackage.unc;
import defpackage.und;
import defpackage.unf;
import defpackage.unh;
import defpackage.unj;
import defpackage.unn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {
    static ScheduledExecutorService a;
    public static aafi h;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern j = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor b;
    public final uiz c;
    public final und d;
    public final unc e;
    public final ulo g;
    private final unn k;
    private boolean l = false;
    public final List f = new ArrayList();

    public FirebaseInstanceId(uiz uizVar, und undVar, Executor executor, Executor executor2, unj unjVar, unj unjVar2, unn unnVar) {
        if (qtl.aO(uizVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (h == null) {
                h = new aafi(uizVar.a());
            }
        }
        this.c = uizVar;
        this.d = undVar;
        this.e = new unc(uizVar, undVar, new nvc(uizVar.a()), unjVar, unjVar2, unnVar);
        this.b = executor2;
        this.g = new ulo(executor);
        this.k = unnVar;
    }

    public static FirebaseInstanceId getInstance(uiz uizVar) {
        j(uizVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) uizVar.e(FirebaseInstanceId.class);
        ocv.aG(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static String i(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public static void j(uiz uizVar) {
        ocv.aE(uizVar.d().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        ocv.aE(uizVar.d().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        ocv.aE(uizVar.d().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        ocv.au(uizVar.d().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ocv.au(j.matcher(uizVar.d().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static final void p(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                a = new ScheduledThreadPoolExecutor(1, new ocy("FirebaseInstanceId", 0));
            }
            a.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final onz a(final String str, String str2) {
        final String strI = i(str2);
        return osk.r(null).b(this.b, new ono() { // from class: umz
            @Override // defpackage.ono
            public final Object a(onz onzVar) throws InterruptedException, NumberFormatException {
                FirebaseInstanceId firebaseInstanceId = this.a;
                String strE = firebaseInstanceId.e();
                String str3 = str;
                String str4 = strI;
                unf unfVarC = firebaseInstanceId.c(str3, str4);
                return !firebaseInstanceId.o(unfVarC) ? osk.r(new ulp((Object) unfVarC.b, (byte[]) null)) : firebaseInstanceId.g.d(str3, str4, new una(firebaseInstanceId, strE, str3, str4, unfVarC));
            }
        });
    }

    public final unf b() {
        return c(qtl.aO(this.c), "*");
    }

    public final unf c(String str, String str2) {
        return h.f(f(), str, str2);
    }

    public final Object d(onz onzVar) throws IOException {
        try {
            return osk.t(onzVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    k();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final String e() throws InterruptedException, NumberFormatException {
        try {
            h.l(this.c.g());
            onz onzVarA = this.k.a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            onzVarA.l(new fba(9), new nmn(countDownLatch, 5));
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (onzVarA.i()) {
                return (String) onzVarA.e();
            }
            if (((ooe) onzVarA).c) {
                throw new CancellationException("Task is already canceled");
            }
            if (onzVarA.h()) {
                throw new IllegalStateException(onzVarA.d());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String f() {
        uiz uizVar = this.c;
        return "[DEFAULT]".equals(uizVar.f()) ? "" : uizVar.g();
    }

    @Deprecated
    public final String g() {
        j(this.c);
        unf unfVarB = b();
        if (o(unfVarB)) {
            m();
        }
        long j2 = unf.a;
        if (unfVarB == null) {
            return null;
        }
        return unfVarB.b;
    }

    @Deprecated
    public final String h(String str, String str2) throws IOException {
        j(this.c);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return (String) ((ulp) d(a(str, str2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }

    final synchronized void k() {
        h.g();
    }

    public final synchronized void l(boolean z) {
        this.l = z;
    }

    final synchronized void m() {
        if (this.l) {
            return;
        }
        n(0L);
    }

    public final synchronized void n(long j2) {
        p(new unh(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.l = true;
    }

    public final boolean o(unf unfVar) {
        if (unfVar == null) {
            return true;
        }
        return System.currentTimeMillis() > unfVar.d + unf.a || !this.d.c().equals(unfVar.c);
    }
}
