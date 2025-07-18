package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksk {
    public static final int b;
    private static boolean d;
    private static long e;
    private static final Object f;
    private static AtomicBoolean g;
    private static final Handler c = new Handler(Looper.getMainLooper());
    public static final Executor a = new ksj();

    static {
        b = "Q".equals(Build.VERSION.CODENAME) ? 29 : Build.VERSION.SDK_INT;
        f = new Object();
    }

    public static Uri a(String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    public static Spanned b(String str) {
        return b >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    @SafeVarargs
    public static ieg c(ieg... iegVarArr) {
        for (ieg iegVar : iegVarArr) {
            if (iegVar.m()) {
                return iegVar;
            }
        }
        return ieg.a;
    }

    public static Object d(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    public static String e(Uri uri) {
        return (uri == null || uri.equals(Uri.EMPTY) || TextUtils.isEmpty(uri.toString())) ? "" : uri.toString();
    }

    public static void f(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            krd.g("Failed to close ".concat(String.valueOf(closeable.getClass().getSimpleName())), e2);
        }
    }

    public static void g(Runnable runnable) {
        c.post(runnable);
    }

    public static void h(Runnable runnable, long j) {
        c.postDelayed(runnable, j);
    }

    public static void i(Runnable runnable) {
        Handler handler = c;
        runnable.getClass();
        handler.removeCallbacks(runnable);
    }

    public static void j(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c.post(runnable);
        }
    }

    public static void k(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (IllegalStateException unused) {
            krd.c("Tried to start service in foreground illegally");
        }
    }

    public static void l(Context context, Intent intent) {
        int i = b;
        if (i < 26 || i >= 31) {
            k(context, intent);
            return;
        }
        try {
            context.startForegroundService(intent);
        } catch (ForegroundServiceStartNotAllowedException e2) {
            krd.d("Tried to call startForegroundService() from the background.", e2);
        }
    }

    public static boolean m(Object obj, Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    public static boolean n(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean o(Context context) {
        if (context == null) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean p() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public static synchronized boolean q() {
        boolean z;
        if (g == null) {
            try {
                Class.forName("com.google.android.apps.play.movies.testing.meet.espresso.testcases.BaseTest");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            g = new AtomicBoolean(z);
        }
        return g.get();
    }

    public static boolean r() {
        return Build.MANUFACTURER.equals("Google") && Build.DEVICE.equals("sabrina");
    }

    public static boolean s(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean t() {
        boolean z;
        synchronized (f) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - e > 1000) {
                d = ActivityManager.isUserAMonkey();
                e = jElapsedRealtime;
            }
            z = d;
        }
        return z;
    }

    public static boolean u() {
        return b >= 24;
    }

    public static boolean v(Context context) {
        return b >= 26 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }
}
