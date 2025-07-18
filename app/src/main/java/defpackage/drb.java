package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drb {
    public static final boolean a = ebc.a;

    public static boolean a(Context context) {
        if (ebc.b) {
            return false;
        }
        if (ebc.a) {
            return (context == null || Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) ? false : true;
        }
        return true;
    }
}
