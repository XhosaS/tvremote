package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapt {
    static String a(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String b(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:20)(30:22|(2:133|24)|27|28|(2:135|30)|35|(1:40)(1:39)|41|(2:47|(1:49)(2:50|(1:45)(1:53)))(3:43|(3:46|47|(0)(0))|45)|(1:55)(1:(1:57)(1:58))|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:74)|75|(3:126|77|84)(4:81|(3:130|83|84)(1:87)|88|(3:128|90|91)(2:94|(1:96)(2:97|(0)(2:123|100))))|104|(1:106)|107|125|108|132|109|(3:111|114|(2:116|139)(2:117|118))(2:112|113))|125|108|132|109|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0204 A[Catch: IOException -> 0x0220, RuntimeException -> 0x0257, TryCatch #1 {RuntimeException -> 0x0257, blocks: (B:108:0x01b9, B:109:0x01eb, B:111:0x0204, B:112:0x0208, B:113:0x021f, B:114:0x0220, B:116:0x0239, B:117:0x024f, B:118:0x0256), top: B:125:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0208 A[Catch: IOException -> 0x0220, RuntimeException -> 0x0257, TryCatch #1 {RuntimeException -> 0x0257, blocks: (B:108:0x01b9, B:109:0x01eb, B:111:0x0204, B:112:0x0208, B:113:0x021f, B:114:0x0220, B:116:0x0239, B:117:0x024f, B:118:0x0256), top: B:125:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[PHI: r5
  0x00d1: PHI (r5v12 java.lang.String) = (r5v11 java.lang.String), (r5v29 java.lang.String) binds: [B:42:0x00b9, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187 A[PHI: r22
  0x0187: PHI (r22v5 java.lang.String) = (r22v2 java.lang.String), (r22v6 java.lang.String), (r22v6 java.lang.String), (r22v6 java.lang.String) binds: [B:93:0x0175, B:95:0x0185, B:98:0x0190, B:103:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Intent r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aapt.c(android.content.Intent):void");
    }

    public static void d(String str, Bundle bundle) {
        try {
            aahf.a();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String strB = b(bundle);
            if (strB != null) {
                bundle2.putString("_nt", strB);
            }
            String string5 = bundle.getString("google.c.a.ts");
            if (string5 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string5));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string6 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string6 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = true != aapv.b(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2.toString());
            }
            aahs aahsVar = (aahs) aahf.a().b(aahs.class);
            if (aahsVar != null) {
                aahsVar.a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean e() {
        ApplicationInfo applicationInfo;
        try {
            aahf.a();
            aahf aahfVarA = aahf.a();
            aahfVarA.d();
            Context context = aahfVarA.c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean f(Intent intent) {
        if (intent == null || h(intent)) {
            return false;
        }
        return g(intent.getExtras());
    }

    public static boolean g(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    private static boolean h(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
}
