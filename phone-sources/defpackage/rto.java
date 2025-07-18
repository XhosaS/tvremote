package defpackage;

import j$.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rto extends RequestFinishedInfo.Listener {
    public rto(Executor executor) {
        super(executor);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Map<String, List<String>> allHeaders;
        List<String> list;
        if (!rmr.a().h()) {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 61, "RequestFinishedListener.java")).s("onRequestFinished is skipped as primes preconditions failed.");
            return;
        }
        if (requestFinishedInfo == null) {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 65, "RequestFinishedListener.java")).s("Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent");
            return;
        }
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null) {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 72, "RequestFinishedListener.java")).s("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
            return;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            Iterator<Object> it = requestFinishedInfo.getAnnotations().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof owo) {
                    ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 81, "RequestFinishedListener.java")).s("onRequestFinished is skipped due to PrimesCronetMonitorIgnoreAnnotation");
                    return;
                }
            }
        }
        Date requestStart = metrics.getRequestStart();
        rtg rtgVar = new rtg(null, requestFinishedInfo.getUrl(), false, requestStart == null ? Instant.now().toEpochMilli() : requestStart.getTime());
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null && (allHeaders = responseInfo.getAllHeaders()) != null && (list = allHeaders.get("Content-Type")) != null && !list.isEmpty()) {
            rtgVar.k = list.get(0);
        }
        Long receivedByteCount = metrics.getReceivedByteCount();
        if (receivedByteCount != null) {
            rtgVar.d = receivedByteCount.intValue();
        }
        Long sentByteCount = metrics.getSentByteCount();
        if (sentByteCount != null) {
            rtgVar.e = sentByteCount.intValue();
        }
        Long ttfbMs = metrics.getTtfbMs();
        if (ttfbMs != null) {
            rtgVar.b = ttfbMs.longValue();
        }
        Long totalTimeMs = metrics.getTotalTimeMs();
        if (totalTimeMs != null) {
            rtgVar.c = totalTimeMs.longValue();
        }
        UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 != null) {
            int httpStatusCode = responseInfo2.getHttpStatusCode();
            if (httpStatusCode >= 0) {
                rtgVar.j = httpStatusCode;
            }
            String negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
            if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                rtgVar.i = negotiatedProtocol;
            }
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        int i = 4;
        rtgVar.w = finishedReason != 0 ? finishedReason != 1 ? finishedReason != 2 ? 1 : 4 : 3 : 2;
        CronetException exception = requestFinishedInfo.getException();
        if (exception != null) {
            if (exception instanceof NetworkException) {
                switch (((NetworkException) exception).getErrorCode()) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 11;
                        break;
                    case 10:
                        i = 12;
                        break;
                    case 11:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                rtgVar.o = i - 1;
            } else if (exception instanceof CallbackException) {
                rtgVar.o = 1;
            } else {
                rtgVar.o = 0;
            }
            if (exception instanceof QuicException) {
                rtgVar.p = ((QuicException) exception).getQuicDetailedErrorCode();
            }
        }
        rtgVar.m = 1;
        rmr.a().e(rtgVar);
    }
}
