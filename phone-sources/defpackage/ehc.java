package defpackage;

import com.google.common.collect.ImmutableMap;
import java.net.CookieHandler;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehc extends UrlRequest.Callback {
    public volatile boolean a = false;
    final /* synthetic */ ehd b;

    public ehc(ehd ehdVar) {
        this.b = ehdVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.a) {
            return;
        }
        if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
            this.b.e = new UnknownHostException();
        } else {
            this.b.e = cronetException;
        }
        this.b.g.g();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (this.a) {
            return;
        }
        this.b.g.g();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        List<String> list;
        if (this.a) {
            return;
        }
        ehd ehdVar = this.b;
        ehdVar.a.getClass();
        ehdVar.b.getClass();
        eey eeyVar = ehdVar.c;
        eeyVar.getClass();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (eeyVar.c == 2) {
            if (httpStatusCode != 307) {
                if (httpStatusCode == 308) {
                    httpStatusCode = 308;
                }
            }
            ehd ehdVar2 = this.b;
            urlResponseInfo.getHttpStatusText();
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            String str2 = edt.a;
            ehdVar2.e = new efm(httpStatusCode, null, allHeaders);
            ehdVar2.g.g();
            return;
        }
        CookieHandler cookieHandler = CookieHandler.getDefault();
        String url = urlResponseInfo.getUrl();
        Map<String, List<String>> allHeaders2 = urlResponseInfo.getAllHeaders();
        efo.d(url, allHeaders2, cookieHandler);
        if (cookieHandler != null) {
            Map<String, List<String>> mapOf = ImmutableMap.of();
            try {
                mapOf = cookieHandler.get(new URI(url), allHeaders2);
            } catch (Exception e) {
                edb.f("HttpUtil", "Failed to read cookies from CookieHandler", e);
            }
            StringBuilder sb = new StringBuilder();
            if (mapOf.containsKey("Cookie") && (list = mapOf.get("Cookie")) != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("; ");
                }
            }
            String string = sb.toString();
            int length = string.length();
            while (length > 0) {
                int iCodePointBefore = Character.codePointBefore(string, length);
                if (!Character.isWhitespace(iCodePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(iCodePointBefore);
                }
            }
            string.substring(0, length);
        }
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.a) {
            return;
        }
        efo.d(urlResponseInfo.getUrl(), urlResponseInfo.getAllHeaders(), CookieHandler.getDefault());
        ehd ehdVar = this.b;
        ehdVar.d = urlResponseInfo;
        ehdVar.g.g();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.a) {
            return;
        }
        ehd ehdVar = this.b;
        ehdVar.f = true;
        ehdVar.g.g();
    }
}
