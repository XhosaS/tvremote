package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lto extends kdy {
    @Override // defpackage.kdy
    public final /* bridge */ /* synthetic */ keg a(Context context, Looper looper, kjd kjdVar, Object obj, ket ketVar, keu keuVar) {
        return c(context, looper, kjdVar, ketVar, keuVar);
    }

    public final ltx c(Context context, Looper looper, kjd kjdVar, ket ketVar, keu keuVar) {
        ltq ltqVar = kjdVar.f;
        Integer num = kjdVar.g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", kjdVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new ltx(context, looper, kjdVar, bundle, ketVar, keuVar);
    }
}
