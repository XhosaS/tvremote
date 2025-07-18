package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.katniss.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hua implements hty {
    public static final yyk a = yyk.q("android.intent.category.LEANBACK_SETTINGS", "android.intent.category.LEANBACK_LAUNCHER", "android.intent.category.LAUNCHER");
    public final PackageManager b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public boolean e = false;
    private final Context f;

    public hua(Context context, PackageManager packageManager) {
        this.f = context;
        this.b = packageManager;
    }

    public final void a(String str, Intent intent) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map map = this.c;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, intent);
        if (str.contains("&")) {
            map.put(str.replace("&", this.f.getResources().getString(R.string.full_spell_of_and)), intent);
        }
    }
}
