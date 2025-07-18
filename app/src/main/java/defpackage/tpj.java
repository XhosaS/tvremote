package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tpj extends tpr {
    final /* synthetic */ String a;

    public tpj(String str) {
        this.a = str;
    }

    @Override // defpackage.tpr
    protected final int a(Context context, tpq tpqVar, boolean z) {
        ProviderInfo providerInfo = tpqVar.b;
        if (context.getPackageName().equals(providerInfo.packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        return !this.a.equals(providerInfo.packageName) ? 3 : 1;
    }
}
