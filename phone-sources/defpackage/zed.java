package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zed {
    public static final zea[] a = {new zea(zea.f, ""), new zea(zea.c, "GET"), new zea(zea.c, "POST"), new zea(zea.d, "/"), new zea(zea.d, "/index.html"), new zea(zea.e, "http"), new zea(zea.e, "https"), new zea(zea.b, "200"), new zea(zea.b, "204"), new zea(zea.b, "206"), new zea(zea.b, "304"), new zea(zea.b, "400"), new zea(zea.b, "404"), new zea(zea.b, "500"), new zea("accept-charset", ""), new zea("accept-encoding", "gzip, deflate"), new zea("accept-language", ""), new zea("accept-ranges", ""), new zea("accept", ""), new zea("access-control-allow-origin", ""), new zea("age", ""), new zea("allow", ""), new zea("authorization", ""), new zea("cache-control", ""), new zea("content-disposition", ""), new zea("content-encoding", ""), new zea("content-language", ""), new zea("content-length", ""), new zea("content-location", ""), new zea("content-range", ""), new zea("content-type", ""), new zea("cookie", ""), new zea("date", ""), new zea("etag", ""), new zea("expect", ""), new zea("expires", ""), new zea("from", ""), new zea("host", ""), new zea("if-match", ""), new zea("if-modified-since", ""), new zea("if-none-match", ""), new zea("if-range", ""), new zea("if-unmodified-since", ""), new zea("last-modified", ""), new zea("link", ""), new zea("location", ""), new zea("max-forwards", ""), new zea("proxy-authenticate", ""), new zea("proxy-authorization", ""), new zea("range", ""), new zea("referer", ""), new zea("refresh", ""), new zea("retry-after", ""), new zea("server", ""), new zea("set-cookie", ""), new zea("strict-transport-security", ""), new zea("transfer-encoding", ""), new zea("user-agent", ""), new zea("vary", ""), new zea("via", ""), new zea("www-authenticate", "")};
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            zea[] zeaVarArr = a;
            if (!linkedHashMap.containsKey(zeaVarArr[i].g)) {
                linkedHashMap.put(zeaVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static final void a(zgn zgnVar) {
        int iC = zgnVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = zgnVar.a(i);
            if (bA >= 65 && bA < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zgnVar.h()));
            }
        }
    }
}
