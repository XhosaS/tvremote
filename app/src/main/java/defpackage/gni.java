package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gni {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/userbehavior/OnDeviceImpressionsProvider");
    private static final HashMap c;
    public final gmx b;

    static {
        HashMap map = new HashMap();
        c = map;
        map.put("_id", "_id");
        map.put("search_term", "search_term");
        map.put("timestamp", "timestamp");
        map.put("package_name", "package_name");
        map.put("number_of_results", "number_of_results");
    }

    public gni(Context context) {
        this.b = new gmx(context);
    }
}
