package org.chromium.net.impl;

import android.content.Context;
import defpackage.aaaf;
import defpackage.zyr;
import defpackage.zys;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        zys zysVar;
        return (HttpEngineNativeProvider.a() && (zysVar = (zys) zyr.a(this.mContext, false).a().get("Cronet_ForceHttpEngineInFallback")) != null && zysVar.a()) ? new HttpEngineNativeProvider(this.mContext).createBuilder() : new ExperimentalCronetEngine.Builder(new aaaf(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
