package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aal extends tj {
    public aal() {
        super(null);
    }

    @Override // defpackage.tj
    public final void e(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    @Override // defpackage.tj
    public final void f(Bundle bundle) {
        bundle.getString("groupableTitle");
        bundle.getString("transferableTitle");
    }
}
