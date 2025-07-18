package defpackage;

import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zzl extends UrlResponseInfo {
    private final android.net.http.UrlResponseInfo a;
    private final String b;

    private zzl(android.net.http.UrlResponseInfo urlResponseInfo, String str) {
        this.a = urlResponseInfo;
        this.b = str;
    }

    public static zzl a(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new zzl(urlResponseInfo, null);
    }

    public static zzl b(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new zzl(urlResponseInfo, ":0");
    }

    private static boolean c(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return true;
        }
        try {
            urlResponseInfo.getUrl();
            return false;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map<String, List<String>> getAllHeaders() {
        return this.a.getHeaders().getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.a.getHeaders().getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a.getHttpStatusCode();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.a.getHttpStatusText();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.a.getNegotiatedProtocol();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.a.getReceivedByteCount();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return this.a.getUrl();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<String> getUrlChain() {
        return this.a.getUrlChain();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.a.wasCached();
    }
}
