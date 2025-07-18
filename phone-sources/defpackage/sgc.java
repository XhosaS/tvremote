package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sgc extends sgh {
    final /* synthetic */ String a = "com.google.android.gms";

    @Override // defpackage.sgh
    protected final int a(Context context, rzy rzyVar, boolean z) {
        ProviderInfo providerInfo = (ProviderInfo) rzyVar.a;
        if (context.getPackageName().equals(providerInfo.packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        return !this.a.equals(providerInfo.packageName) ? 3 : 1;
    }
}
