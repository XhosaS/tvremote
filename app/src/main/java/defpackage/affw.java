package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affw {
    static final yqn a = yqn.b(',');
    public static final affw b = new affw(afey.a, false, new affw(new afex(), true, new affw()));
    public final byte[] c;
    private final Map d;

    private affw() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    public final affu a(String str) {
        affv affvVar = (affv) this.d.get(str);
        if (affvVar != null) {
            return affvVar.a;
        }
        return null;
    }

    private affw(affu affuVar, boolean z, affw affwVar) {
        String strC = affuVar.c();
        yqw.B(!strC.contains(","), "Comma is currently not allowed in message encoding");
        int size = affwVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(affwVar.d.containsKey(affuVar.c()) ? size : size + 1);
        for (affv affvVar : affwVar.d.values()) {
            String strC2 = affvVar.a.c();
            if (!strC2.equals(strC)) {
                linkedHashMap.put(strC2, new affv(affvVar.a, affvVar.b));
            }
        }
        linkedHashMap.put(strC, new affv(affuVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = mapUnmodifiableMap;
        yqn yqnVar = a;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((affv) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = yqnVar.c(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
