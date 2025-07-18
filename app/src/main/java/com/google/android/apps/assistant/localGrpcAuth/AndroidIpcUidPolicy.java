package com.google.android.apps.assistant.localgrpcauth;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.google.assistant.base.ContextHelper;
import com.google.assistant.base.Log;
import com.google.assistant.base.annotations.JNINamespace;
import j$.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@JNINamespace("grpc_ipc_transport")
/* loaded from: classes.dex */
class AndroidIpcUidPolicy {
    private static final Set ALLOWED_CERTIFICATES = new HashSet() { // from class: com.google.android.apps.assistant.localgrpcauth.AndroidIpcUidPolicy.1
        {
            add("E1He2WC11gZ+g5sh38NTm1yEehUByFFJZh9JiDUAaqA=");
            add("flpB5vyv7/Df8PHKwehJrrnGWQcAAUoROggbjpBw3cY=");
            if (Build.TYPE.equals("user")) {
                return;
            }
            add("T3FWTW4FrfZGfnxVLvvYYYrf02Ws4NZTsvI808lwDxA=");
            add("cq7jXjREJv+MCsWNcKnoKwOXtKRzDbfYWN5tmN3S6/8=");
        }
    };
    private static final String TAG = "GrpcIpcUidPolicy";

    AndroidIpcUidPolicy() {
    }

    private static boolean checkPackage(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            if (packageInfo.signingInfo == null) {
                return false;
            }
            if (checkSignatures(packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory())) {
                return true;
            }
            Log.e(TAG, "Unauthorized access attempt from %s", str);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Failed to find package %s", str, e);
            return false;
        }
    }

    private static boolean checkSignatures(Signature[] signatureArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("sha256");
            for (Signature signature : signatureArr) {
                if (ALLOWED_CERTIFICATES.contains(Base64.getEncoder().encodeToString(messageDigest.digest(signature.toByteArray())))) {
                    return true;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "No SHA-256 support.", e);
        }
        return false;
    }

    public static boolean isWhitelisted(int i) {
        int length;
        Context applicationContext = ContextHelper.getApplicationContext();
        if (applicationContext == null) {
            Log.wtf(TAG, "Could not get ApplicationContext.", new Object[0]);
            return false;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) <= 0) {
            Log.wtf(TAG, "uid %d does not correspond to any packages", Integer.valueOf(i));
            return false;
        }
        if (length > 1) {
            Log.wtf(TAG, "uid %d corresponds to multiple packages.", Integer.valueOf(i));
        }
        return checkPackage(packagesForUid[0], packageManager);
    }
}
