package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agdm {
    public static final ahxb a = ahxb.a.a(":");
    public static final agdj[] b = {new agdj(agdj.e, ahxb.a.a("")), new agdj(agdj.b, ahxb.a.a("GET")), new agdj(agdj.b, ahxb.a.a("POST")), new agdj(agdj.c, ahxb.a.a("/")), new agdj(agdj.c, ahxb.a.a("/index.html")), new agdj(agdj.d, ahxb.a.a("http")), new agdj(agdj.d, ahxb.a.a("https")), new agdj(agdj.a, ahxb.a.a("200")), new agdj(agdj.a, ahxb.a.a("204")), new agdj(agdj.a, ahxb.a.a("206")), new agdj(agdj.a, ahxb.a.a("304")), new agdj(agdj.a, ahxb.a.a("400")), new agdj(agdj.a, ahxb.a.a("404")), new agdj(agdj.a, ahxb.a.a("500")), new agdj("accept-charset", ""), new agdj("accept-encoding", "gzip, deflate"), new agdj("accept-language", ""), new agdj("accept-ranges", ""), new agdj("accept", ""), new agdj("access-control-allow-origin", ""), new agdj("age", ""), new agdj("allow", ""), new agdj("authorization", ""), new agdj("cache-control", ""), new agdj("content-disposition", ""), new agdj("content-encoding", ""), new agdj("content-language", ""), new agdj("content-length", ""), new agdj("content-location", ""), new agdj("content-range", ""), new agdj("content-type", ""), new agdj("cookie", ""), new agdj("date", ""), new agdj("etag", ""), new agdj("expect", ""), new agdj("expires", ""), new agdj("from", ""), new agdj("host", ""), new agdj("if-match", ""), new agdj("if-modified-since", ""), new agdj("if-none-match", ""), new agdj("if-range", ""), new agdj("if-unmodified-since", ""), new agdj("last-modified", ""), new agdj("link", ""), new agdj("location", ""), new agdj("max-forwards", ""), new agdj("proxy-authenticate", ""), new agdj("proxy-authorization", ""), new agdj("range", ""), new agdj("referer", ""), new agdj("refresh", ""), new agdj("retry-after", ""), new agdj("server", ""), new agdj("set-cookie", ""), new agdj("strict-transport-security", ""), new agdj("transfer-encoding", ""), new agdj("user-agent", ""), new agdj("vary", ""), new agdj("via", ""), new agdj("www-authenticate", "")};
    public static final Map c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            agdj[] agdjVarArr = b;
            int length = agdjVarArr.length;
            if (i >= 61) {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(agdjVarArr[i].f)) {
                    linkedHashMap.put(agdjVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(ahxb ahxbVar) throws IOException {
        int iB = ahxbVar.b();
        for (int i = 0; i < iB; i++) {
            byte bA = ahxbVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ahxbVar.d()));
            }
        }
    }
}
