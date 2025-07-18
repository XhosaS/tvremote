package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ih {
    public static final int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static final boolean b(Context context) {
        return context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
