package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ido {
    public final Set a(SharedPreferences sharedPreferences, String str) {
        Set<String> set = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet(str, set);
        if (stringSet != null) {
            set = stringSet;
        }
        return agqq.z(set);
    }

    public final Set b(SharedPreferences sharedPreferences, String str) {
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet(str, agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }
}
