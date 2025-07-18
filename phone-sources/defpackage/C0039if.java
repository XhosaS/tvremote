package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039if extends BiometricPrompt$AuthenticationCallback {
    final /* synthetic */ ht a;

    public C0039if(ht htVar) {
        this.a = htVar;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.b(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.a.c();
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        hr hrVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipher = cryptoObject.getCipher();
            if (cipher != null) {
                hrVar = new hr(cipher);
            } else {
                Signature signature = cryptoObject.getSignature();
                if (signature != null) {
                    hrVar = new hr(signature);
                } else {
                    Mac mac = cryptoObject.getMac();
                    if (mac != null) {
                        hrVar = new hr(mac);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredential = cryptoObject.getIdentityCredential()) != null) {
                        hrVar = new hr(identityCredential);
                    } else if (Build.VERSION.SDK_INT >= 33 && (presentationSession = cryptoObject.getPresentationSession()) != null) {
                        hrVar = new hr(presentationSession);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        long operationHandle = cryptoObject.getOperationHandle();
                        if (operationHandle != 0) {
                            hrVar = new hr(operationHandle);
                        }
                    }
                }
            }
        }
        int authenticationType = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            if (authenticationResult != null) {
                authenticationType = authenticationResult.getAuthenticationType();
            }
        } else if (Build.VERSION.SDK_INT != 29) {
            authenticationType = 2;
        }
        this.a.B(new zuw(hrVar, authenticationType));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
