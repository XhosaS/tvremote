package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lbc {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final Boolean b(Resources resources, String str) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final String c(Resources resources, String str) {
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
