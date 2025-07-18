package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class khx implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ khy b;

    public khx(khy khyVar, SignInResponse signInResponse) {
        this.a = signInResponse;
        this.b = khyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignInResponse signInResponse = this.a;
        ConnectionResult connectionResult = signInResponse.b;
        boolean zC = connectionResult.c();
        khy khyVar = this.b;
        if (zC) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            kkk.k(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.c()) {
                String strValueOf = String.valueOf(String.valueOf(connectionResult2));
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                khyVar.g.b(connectionResult2);
                khyVar.h.z();
                return;
            }
            kgt kgtVar = khyVar.g;
            kjw kjwVarA = resolveAccountResponse.a();
            Set set = khyVar.e;
            if (kjwVarA == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                kgtVar.b(new ConnectionResult(1, 4, null, null));
            } else {
                kgtVar.f = kjwVarA;
                kgtVar.c = set;
                kgtVar.c();
            }
        } else {
            khyVar.g.b(connectionResult);
        }
        khyVar.h.z();
    }
}
