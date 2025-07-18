package com.google.android.gms.net;

import android.content.Context;
import android.os.Trace;
import defpackage.nvz;
import defpackage.nwa;
import defpackage.ocv;
import defpackage.odp;
import defpackage.ois;
import defpackage.oiu;
import defpackage.zyg;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private static Class<? extends ICronetEngineBuilder> subclassNativeCronetEngine(ClassLoader classLoader) {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class);
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            ois.b(this.mContext);
        } catch (nvz | nwa unused) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        CronetEngine.Builder builderCreateBuilder;
        new zyg("GMS PlayServicesCronetProvider#createBuilder", 1, null);
        try {
            try {
                ois.b(this.mContext);
                try {
                    oiu oiuVar = new oiu(this.mContext, 37402, 0.01f);
                    try {
                        HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
                        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                            builderCreateBuilder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                            oiuVar.close();
                        } else {
                            odp odpVarA = ois.a();
                            ocv.aF(odpVarA);
                            ClassLoader classLoader = odpVarA.c.getClassLoader();
                            ocv.aF(classLoader);
                            ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(subclassNativeCronetEngine(classLoader).getConstructor(Context.class).newInstance(this.mContext));
                            oiuVar.a();
                            oiuVar.close();
                            builderCreateBuilder = builder;
                        }
                        Trace.endSection();
                        return builderCreateBuilder;
                    } catch (Throwable th) {
                        try {
                            oiuVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
                }
            } catch (nvz e2) {
                throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
            } catch (nwa e3) {
                throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
            }
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        synchronized (ois.a) {
            str = ois.b;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        if (HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return ois.c();
    }
}
