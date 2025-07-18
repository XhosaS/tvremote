package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaba extends UrlResponseInfo {
    public final int a;
    public final String b;
    private final List c;
    private final String d;
    private final String e = "";
    private final AtomicLong f = new AtomicLong(0);
    private final aaaz g;

    public aaba(List list, int i, String str, List list2, String str2) {
        this.c = DesugarCollections.unmodifiableList(list);
        this.a = i;
        this.d = str;
        this.g = new aaaz(DesugarCollections.unmodifiableList(list2));
        this.b = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map<String, List<String>> getAllHeaders() {
        aaaz aaazVar = this.g;
        Map<String, List<String>> map = aaazVar.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : aaazVar.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        aaazVar.b = DesugarCollections.unmodifiableMap(treeMap);
        return aaazVar.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.g.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return (String) this.c.get(r0.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<String> getUrlChain() {
        return this.c;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), getUrl(), this.c.toString(), Integer.valueOf(this.a), this.d, getAllHeadersAsList().toString(), false, this.b, this.e, Long.valueOf(this.f.get()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
