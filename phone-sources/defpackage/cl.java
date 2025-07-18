package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cl extends gx {
    @Override // defpackage.gx
    public final /* synthetic */ Object a(int i, Intent intent) {
        return new gn(i, intent);
    }

    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        Bundle bundleExtra;
        gw gwVarA = (gw) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = gwVarA.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                gv gvVar = new gv(gwVarA.a);
                gvVar.a = null;
                gvVar.b(gwVarA.d, gwVarA.c);
                gwVarA = gvVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gwVarA);
        if (cr.Y(2)) {
            intent.toString();
        }
        return intent;
    }
}
