package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqs {
    static final tsp a = new tsp(",");
    public static final xqs b = new xqs(xqf.a, false, new xqs(new xqf(1), true, new xqs()));
    public final Map c;
    public final byte[] d;

    private xqs() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xqq] */
    private xqs(xqq xqqVar, boolean z, xqs xqsVar) {
        String strB = xqqVar.b();
        sij.o(!strB.contains(","), "Comma is currently not allowed in message encoding");
        int size = xqsVar.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(xqsVar.c.containsKey(xqqVar.b()) ? size : size + 1);
        for (xqr xqrVar : xqsVar.c.values()) {
            String strB2 = xqrVar.b.b();
            if (!strB2.equals(strB)) {
                linkedHashMap.put(strB2, new xqr(xqrVar.b, xqrVar.a));
            }
        }
        linkedHashMap.put(strB, new xqr(xqqVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.c = mapUnmodifiableMap;
        tsp tspVar = a;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((xqr) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.d = tspVar.b(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
