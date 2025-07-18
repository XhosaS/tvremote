package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxc {
    public static final Map a = new ir();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            rxc rxcVar = (rxc) it.next();
            SharedPreferences sharedPreferences = rxcVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = rxcVar.c;
            throw null;
        }
        map.clear();
    }
}
