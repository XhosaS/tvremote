package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yef {
    public static final zgn a;
    public static final yec[] b;
    public static final Map c;

    static {
        zgn zgnVar = zgn.a;
        a = wcq.aD(":");
        int i = 0;
        b = new yec[]{new yec(yec.e, ""), new yec(yec.b, "GET"), new yec(yec.b, "POST"), new yec(yec.c, "/"), new yec(yec.c, "/index.html"), new yec(yec.d, "http"), new yec(yec.d, "https"), new yec(yec.a, "200"), new yec(yec.a, "204"), new yec(yec.a, "206"), new yec(yec.a, "304"), new yec(yec.a, "400"), new yec(yec.a, "404"), new yec(yec.a, "500"), new yec("accept-charset", ""), new yec("accept-encoding", "gzip, deflate"), new yec("accept-language", ""), new yec("accept-ranges", ""), new yec("accept", ""), new yec("access-control-allow-origin", ""), new yec("age", ""), new yec("allow", ""), new yec("authorization", ""), new yec("cache-control", ""), new yec("content-disposition", ""), new yec("content-encoding", ""), new yec("content-language", ""), new yec("content-length", ""), new yec("content-location", ""), new yec("content-range", ""), new yec("content-type", ""), new yec("cookie", ""), new yec("date", ""), new yec("etag", ""), new yec("expect", ""), new yec("expires", ""), new yec("from", ""), new yec("host", ""), new yec("if-match", ""), new yec("if-modified-since", ""), new yec("if-none-match", ""), new yec("if-range", ""), new yec("if-unmodified-since", ""), new yec("last-modified", ""), new yec("link", ""), new yec("location", ""), new yec("max-forwards", ""), new yec("proxy-authenticate", ""), new yec("proxy-authorization", ""), new yec("range", ""), new yec("referer", ""), new yec("refresh", ""), new yec("retry-after", ""), new yec("server", ""), new yec("set-cookie", ""), new yec("strict-transport-security", ""), new yec("transfer-encoding", ""), new yec("user-agent", ""), new yec("vary", ""), new yec("via", ""), new yec("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            yec[] yecVarArr = b;
            int length = yecVarArr.length;
            if (i >= 61) {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(yecVarArr[i].f)) {
                    linkedHashMap.put(yecVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(zgn zgnVar) throws IOException {
        int iC = zgnVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = zgnVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zgnVar.h()));
            }
        }
    }
}
