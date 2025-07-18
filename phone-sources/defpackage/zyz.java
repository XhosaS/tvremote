package defpackage;

import android.net.Network;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyz extends zzo {
    public static final /* synthetic */ int b = 0;
    private static boolean c;
    private static boolean d;
    public final HttpEngine a;
    private final Map e = DesugarCollections.synchronizedMap(new HashMap());

    public zyz(HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    private static final Network c(long j) {
        if (j == -1) {
            return null;
        }
        return Network.fromNetworkHandle(j);
    }

    final void a(RequestFinishedInfo requestFinishedInfo, aabc aabcVar) {
        ArrayList arrayList = new ArrayList();
        Map map = this.e;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (aabcVar != null) {
            arrayList.add(aabcVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aabc aabcVar2 = (aabc) arrayList.get(i);
            try {
                aabcVar2.getExecutor().execute(new xxl(aabcVar2, requestFinishedInfo, 13, (short[]) null));
            } catch (RejectedExecutionException e) {
                Log.e("HttpEngineWrapper", "Exception posting task to executor", e);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.e.put(listener, new aabc(listener));
    }

    @Override // defpackage.zzo
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        zzi zziVar = new zzi(callback);
        UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, zziVar);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z2) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(c(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i4);
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new zze(uploadDataProvider), executor2);
        }
        zzk zzkVar = new zzk(builderNewUrlRequestBuilder.build(), this, str, collection, listener);
        zziVar.b = zzkVar;
        return zzkVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(c(j));
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // defpackage.zzo, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new zzm(str, callback, executor, this);
    }

    @Override // defpackage.zzo, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new aaay(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) vxr.aJ(new zzg(this, url, 1), IOException.class);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.e.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (c) {
            return;
        }
        c = true;
    }

    @Override // defpackage.zzo, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new zzm(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return (URLConnection) vxr.aJ(new zzg(this, url, 1), IOException.class);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}
