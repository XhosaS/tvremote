package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiy {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        e(str, "Unexpected type for bundle response code: ".concat(String.valueOf(obj.getClass().getName())));
        return 6;
    }

    public static int b(Intent intent, String str) {
        return c(intent, str).a;
    }

    public static hij c(Intent intent, String str) {
        if (intent != null) {
            return hjs.i(a(intent.getExtras(), str), 0, d(intent.getExtras(), str));
        }
        e("BillingHelper", "Got null intent!");
        return hjs.i(6, 0, "An internal error occurred.");
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        e(str, "Unexpected type for debug message: ".concat(String.valueOf(obj.getClass().getName())));
        return "";
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void g(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", "8.0.0");
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle h(hij hijVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", hijVar.a);
        bundle.putString("DEBUG_MESSAGE", hijVar.c);
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Bundle i(hij hijVar, String str) {
        Bundle bundleH = h(hijVar, 5);
        if (str != null) {
            bundleH.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleH;
    }
}
