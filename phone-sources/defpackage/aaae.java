package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaae extends zzo {
    private static final String e = "aaae";
    public final int a;
    public final zzy b;
    public final Context d;
    private final String f;
    private final ExecutorService g;
    public final AtomicInteger c = new AtomicInteger();
    private long h = -1;

    public aaae(zzq zzqVar) {
        int i;
        new zyg("JavaCronetEngine#JavaCronetEngine", 0);
        try {
            Context context = zzqVar.c;
            this.d = context;
            int iHashCode = hashCode();
            this.a = iHashCode;
            this.f = zzqVar.e;
            this.g = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rhw(3));
            zzv zzvVar = zzv.CRONET_SOURCE_FALLBACK;
            zzy zzyVarA = zzz.a(context, zzvVar);
            this.b = zzyVarA;
            long j = iHashCode;
            try {
                boolean z = zzqVar.d;
                boolean z2 = zzqVar.g;
                boolean z3 = zzqVar.h;
                boolean z4 = zzqVar.i;
                int iOrdinal = zzqVar.j.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 3;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                    i = 1;
                }
                zzyVarA.c(j, new zzt(z, z2, z3, z4, i, zzqVar.k, zzqVar.l, zzqVar.getLogCronetInitializationRef()), new zzx("CronetHttpURLConnection/".concat(ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0]), zzvVar);
            } catch (RuntimeException e2) {
                Log.e(e, "Error while trying to log JavaCronetEngine creation: ", e2);
            }
            Log.w(e, "using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
            Trace.endSection();
        } finally {
        }
    }

    final void a() {
        this.c.decrementAndGet();
    }

    @Override // defpackage.zzo
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        if (j != -1) {
            this.h = j;
        }
        return new aaas(this, callback, this.g, executor, str, this.f, z2, z3, i2, z4, i3, this.h, str2, arrayList, uploadDataProvider, executor2);
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.h = j;
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new aaad();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.c.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "CronetHttpURLConnection/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // defpackage.zzo, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new aaay(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return url.openConnection();
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.g.shutdown();
    }

    @Override // defpackage.zzo, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
    }
}
