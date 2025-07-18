package defpackage;

import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsv extends vsq {
    public vsv(ProviderInfo providerInfo, Throwable th) {
        super("Provider exists, but could not be obtained: ".concat(providerInfo.toString()), th);
    }
}
