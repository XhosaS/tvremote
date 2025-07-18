package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.fba;
import defpackage.igu;
import defpackage.nux;
import defpackage.nuz;
import defpackage.nvc;
import defpackage.ocv;
import defpackage.ocy;
import defpackage.onz;
import defpackage.osk;
import defpackage.qtl;
import defpackage.ufx;
import defpackage.uiv;
import defpackage.uiz;
import defpackage.ujh;
import defpackage.uky;
import defpackage.ulp;
import defpackage.umr;
import defpackage.uni;
import defpackage.unj;
import defpackage.uol;
import defpackage.uom;
import defpackage.uoo;
import defpackage.uop;
import defpackage.uoq;
import defpackage.uos;
import defpackage.uoy;
import defpackage.upa;
import defpackage.upd;
import defpackage.upe;
import defpackage.usr;
import defpackage.zft;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseMessaging {
    static ScheduledExecutorService b;
    private static ulp p;
    public final uiz c;
    public final Context d;
    public final uoq e;
    public final Executor f;
    public final uos g;
    private final uni i;
    private final uop j;
    private final Executor k;
    private final onz l;
    private boolean m = false;
    private final Application.ActivityLifecycleCallbacks n;
    private final usr o;
    private static final long h = TimeUnit.HOURS.toSeconds(8);
    public static unj a = new uky(6);

    public FirebaseMessaging(uiz uizVar, uni uniVar, unj unjVar, umr umrVar, uos uosVar, uoq uoqVar, Executor executor, Executor executor2, Executor executor3) {
        a = unjVar;
        this.c = uizVar;
        this.i = uniVar;
        this.j = new uop(this, umrVar);
        Context contextA = uizVar.a();
        this.d = contextA;
        uom uomVar = new uom();
        this.n = uomVar;
        this.g = uosVar;
        this.e = uoqVar;
        this.o = new usr(executor);
        this.k = executor2;
        this.f = executor3;
        Context contextA2 = uizVar.a();
        if (contextA2 instanceof Application) {
            ((Application) contextA2).registerActivityLifecycleCallbacks(uomVar);
        } else {
            Log.w("FirebaseMessaging", a.ch(contextA2, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (uniVar != null) {
            uniVar.c(new zft(this));
        }
        int i = 7;
        executor2.execute(new ufx(this, i));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ocy("Firebase-Messaging-Topics-Io", 0));
        int i2 = upe.e;
        onz onzVarP = osk.p(scheduledThreadPoolExecutor, new upd(contextA, scheduledThreadPoolExecutor, this, uosVar, uoqVar, 0));
        this.l = onzVarP;
        onzVarP.n(executor2, new igu(this, i));
        executor2.execute(new ufx(this, 8));
    }

    static synchronized FirebaseMessaging getInstance(uiz uizVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) uizVar.e(FirebaseMessaging.class);
        ocv.aG(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static final void l(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new ocy("TAG", 0));
            }
            b.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized ulp m(Context context) {
        if (p == null) {
            p = new ulp(context, (byte[]) null);
        }
        return p;
    }

    private final synchronized void n() {
        if (this.m) {
            return;
        }
        h(0L);
    }

    final uoy a() {
        return m(this.d).e(c(), qtl.aO(this.c));
    }

    public final String b() throws IOException {
        uni uniVar = this.i;
        if (uniVar != null) {
            try {
                return (String) osk.s(uniVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        uoy uoyVarA = a();
        if (!k(uoyVarA)) {
            return uoyVarA.b;
        }
        uiz uizVar = this.c;
        usr usrVar = this.o;
        String strAO = qtl.aO(uizVar);
        try {
            return (String) osk.s(usrVar.f(strAO, new uoo(this, strAO, uoyVarA)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final String c() {
        uiz uizVar = this.c;
        return "[DEFAULT]".equals(uizVar.f()) ? "" : uizVar.g();
    }

    public final void d() {
        nvc nvcVar = this.e.b;
        (nvcVar.g.a() >= 241100000 ? nux.a(nvcVar.d).c(5, Bundle.EMPTY).a(nvc.a, new nuz(0)) : osk.q(new IOException("SERVICE_NOT_AVAILABLE"))).n(this.k, new igu(this, 8));
    }

    public final void e(String str) {
        if ("[DEFAULT]".equals(this.c.f())) {
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            uol.b(intent, this.d, new fba(11));
        }
    }

    public final synchronized void f(boolean z) {
        this.m = z;
    }

    public final void g() {
        uni uniVar = this.i;
        if (uniVar != null) {
            uniVar.b();
        } else if (k(a())) {
            n();
        }
    }

    public final synchronized void h(long j) {
        l(new upa(this, Math.min(Math.max(30L, j + j), h)), j);
        this.m = true;
    }

    public final boolean i() {
        return this.j.b();
    }

    public final boolean j() {
        Context context = this.d;
        uiv.q(context);
        if (ocv.h()) {
            if (!uiv.r(context)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package ".concat(String.valueOf(context.getPackageName())));
            } else if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (this.c.e(ujh.class) != null) {
                    return true;
                }
                if (uiv.y() && a != null) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean k(uoy uoyVar) {
        if (uoyVar == null) {
            return true;
        }
        return System.currentTimeMillis() > uoyVar.d + uoy.a || !this.g.c().equals(uoyVar.c);
    }
}
