package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabg {
    public static final aabg a = new aabg();
    private final Map b = new HashMap();

    public final synchronized void a(String str, zzw zzwVar) {
        Map map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, zzwVar);
            return;
        }
        if (((zzw) map.get(str)).equals(zzwVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(zzwVar));
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (zzw) entry.getValue());
        }
    }
}
