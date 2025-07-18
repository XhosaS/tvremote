package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import defpackage.by;
import defpackage.njp;
import defpackage.njt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SignInHubActivity extends by {
    public static final String ACTION_FALLBACK_SIGN_IN = "com.google.android.gms.auth.APPAUTH_SIGN_IN";
    public static final String ACTION_GOOGLE_SIGN_IN = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
    public static final String ACTION_NO_IMPLEMENTATION = "com.google.android.gms.auth.NO_IMPL";
    private static boolean c = false;
    public int a;
    public Intent b;
    private boolean d = false;
    private SignInConfiguration e;
    private boolean f;

    private final void a() {
        getSupportLoaderManager().c(0, new njt(this));
        c = false;
    }

    private final void b(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        c = false;
    }

    private final void c(String str) {
        Intent intent = new Intent(str);
        if (str.equals(ACTION_GOOGLE_SIGN_IN)) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.e);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.d = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            b(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.d) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                njp.a(this).c(this.e.b, googleSignInAccount);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f = true;
                this.a = i2;
                this.b = intent;
                a();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                b(intExtra);
                return;
            }
        }
        b(8);
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            b(12500);
            return;
        }
        if (action.equals(ACTION_NO_IMPLEMENTATION)) {
            Log.e("AuthSignInClient", "Action not implemented");
            b(12500);
            return;
        }
        if (!action.equals(ACTION_GOOGLE_SIGN_IN) && !action.equals(ACTION_FALLBACK_SIGN_IN)) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.e = signInConfiguration;
        if (bundle == null) {
            if (c) {
                setResult(0);
                b(12502);
                return;
            } else {
                c = true;
                c(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.f = z;
        if (z) {
            this.a = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.b = intent2;
                a();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // defpackage.by, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c = false;
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f);
        if (this.f) {
            bundle.putInt("signInResultCode", this.a);
            bundle.putParcelable("signInResultData", this.b);
        }
    }
}
