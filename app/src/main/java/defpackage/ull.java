package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ull {
    public final SharedPreferences a;
    private final Set b;

    public ull(SharedPreferences sharedPreferences, Set set) {
        this.a = sharedPreferences;
        this.b = set;
    }

    public final yyr a() {
        yqw.B(this.b == null, "SharedPreferencesView#getAll() not available on key migration");
        return yyr.j(this.a.getAll());
    }

    public final String b(String str, String str2) {
        e(str);
        return this.a.getString(str, str2);
    }

    public final Set c(String str, Set set) {
        e(str);
        return this.a.getStringSet(str, set);
    }

    public final boolean d(String str, boolean z) {
        e(str);
        return this.a.getBoolean(str, z);
    }

    public final void e(String str) {
        Set set = this.b;
        if (set != null) {
            yqw.F(set.contains(str), "Can't access key outside migration: %s", str);
        }
    }

    public final long f(String str) {
        e(str);
        return this.a.getLong(str, 0L);
    }
}
