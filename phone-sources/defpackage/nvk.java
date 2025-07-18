package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nvk {
    public static final int c;
    public static final nvk d;

    static {
        boolean z = nwb.a;
        c = 252505000;
        d = new nvk();
    }

    public final int g(Context context) {
        return h(context, c);
    }

    public final int h(Context context, int i) {
        int iB = nwb.b(context, i);
        if (nwb.e(context, iB)) {
            return 18;
        }
        return iB;
    }

    public final Intent i(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && ocp.e(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(c);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(oda.b(context).z(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public final PendingIntent j(Context context, int i, String str) {
        Intent intentI = i(context, i, str);
        if (intentI == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, intentI, 201326592);
    }
}
