package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbc {
    private static final Map a = new lz();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            bbc bbcVar = (bbc) it.next();
            SharedPreferences sharedPreferences = bbcVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = bbcVar.c;
            throw null;
        }
        map.clear();
    }
}
