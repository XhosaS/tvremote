package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgn implements rez {
    public static final Map a = new we();
    public final SharedPreferences b;
    public SharedPreferences.OnSharedPreferenceChangeListener c;
    public volatile Map e;
    public final Object d = new Object();
    public final List f = new ArrayList();

    public rgn(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }

    static synchronized void a() {
        Map map = a;
        for (rgn rgnVar : map.values()) {
            SharedPreferences sharedPreferences = rgnVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = rgnVar.c;
            onSharedPreferenceChangeListener.getClass();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        map.clear();
    }

    @Override // defpackage.rez
    public final Object b(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.b.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
