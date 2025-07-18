package com.google.android.gms.net;

import android.content.Context;
import defpackage.ocv;
import defpackage.rbi;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HttpEngineProviderSingleton {
    private static final String TAG = "com.google.android.gms.net.HttpEngineProviderSingleton";
    private static HttpEngineProviderSingleton httpEngineProviderSingleton;
    private CronetProvider httpEngineProvider;

    private HttpEngineProviderSingleton(Context context) {
        try {
            if (shouldOverrideWithHttpEngine(context)) {
                CronetProvider cronetProvider = (CronetProvider) Class.forName("org.chromium.net.impl.HttpEngineNativeProvider").asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context);
                if (cronetProvider.isEnabled()) {
                    this.httpEngineProvider = cronetProvider;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized HttpEngineProviderSingleton getInstance(Context context) {
        HttpEngineProviderSingleton httpEngineProviderSingleton2 = httpEngineProviderSingleton;
        if (httpEngineProviderSingleton2 != null) {
            return httpEngineProviderSingleton2;
        }
        HttpEngineProviderSingleton httpEngineProviderSingleton3 = new HttpEngineProviderSingleton(context);
        httpEngineProviderSingleton = httpEngineProviderSingleton3;
        return httpEngineProviderSingleton3;
    }

    private boolean getReflectionValueAsBool(Object obj) {
        return obj != null && ((Boolean) obj).booleanValue();
    }

    private boolean shouldOverrideWithHttpEngine(Context context) {
        try {
            try {
                return getReflectionValueAsBool(ocv.aQ(ExperimentalCronetEngine.class, "shouldOverrideWithHttpEngine", new ExperimentalCronetEngineHolder(), new rbi(Context.class, context, null)));
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable unused2) {
            return getReflectionValueAsBool(ocv.aP(ExperimentalCronetEngine.class, "shouldOverrideWithHttpEngine", new rbi(Context.class, context, null)));
        }
    }

    public CronetProvider getHttpEngineProvider() {
        return this.httpEngineProvider;
    }

    public boolean shouldUseHttpEngine() {
        return this.httpEngineProvider != null;
    }

    /* compiled from: PG */
    class ExperimentalCronetEngineHolder extends ExperimentalCronetEngine {
        @Override // org.chromium.net.CronetEngine
        public URLStreamHandlerFactory createURLStreamHandlerFactory() {
            return null;
        }

        @Override // org.chromium.net.CronetEngine
        public byte[] getGlobalMetricsDeltas() {
            return null;
        }

        @Override // org.chromium.net.CronetEngine
        public String getVersionString() {
            return "";
        }

        @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
        public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
            return null;
        }

        @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
        public ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
            return null;
        }

        @Override // org.chromium.net.CronetEngine
        public URLConnection openConnection(URL url) {
            return null;
        }

        @Override // org.chromium.net.CronetEngine
        public void shutdown() {
        }

        @Override // org.chromium.net.CronetEngine
        public void stopNetLog() {
        }

        @Override // org.chromium.net.CronetEngine
        public void startNetLogToFile(String str, boolean z) {
        }
    }
}
