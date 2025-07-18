package com.google.android.apps.grpc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.assistant.base.ContextHelper;
import com.google.assistant.base.Log;
import com.google.assistant.base.annotations.JNINamespace;
import defpackage.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@JNINamespace("chromecast")
/* loaded from: classes.dex */
public class AndroidIpcUidPolicy {
    private static final Set ALLOWED_CERTIFICATES = allowedCertificates();
    private static final Set ALLOWED_CERTIFICATES_DEV = allowedCertificatesDev();
    private static final String TAG = "GrpcIpcUidPolicy";

    private static Set allowedCertificates() {
        HashSet hashSet = new HashSet();
        hashSet.add("E1He2WC11gZ+g5sh38NTm1yEehUByFFJZh9JiDUAaqA=");
        hashSet.add("flpB5vyv7/Df8PHKwehJrrnGWQcAAUoROggbjpBw3cY=");
        hashSet.add("8P1sW0EPJcslw7UzRsiXL64w+O50Ed+RBICtay1g24M=");
        return hashSet;
    }

    private static Set allowedCertificatesDev() {
        HashSet hashSet = new HashSet();
        hashSet.add("T3FWTW4FrfZGfnxVLvvYYYrf02Ws4NZTsvI808lwDxA=");
        hashSet.add("cq7jXjREJv+MCsWNcKnoKwOXtKRzDbfYWN5tmN3S6/8=");
        hashSet.add("GXWy8XF3vIml3/MfnmSmyuKBpT3B0dWbHRR/4cgq+gA=");
        return hashSet;
    }

    private static boolean checkPackage(String str, String str2, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        Signature[] signatures = getSignatures(str, packageManager);
        if (signatures == null) {
            Log.e(TAG, "Failed to get APK signatures.", new Object[0]);
            return false;
        }
        if (checkSignatures(signatures, str2, packageManager)) {
            return true;
        }
        Log.e(TAG, "Unauthorized access attempt from %s", str);
        return false;
    }

    private static boolean checkSignatures(Signature[] signatureArr, String str, PackageManager packageManager) {
        if (signatureArr != null) {
            for (Signature signature : signatureArr) {
                String strSignatureBase64Hash = signatureBase64Hash(signature);
                if (ALLOWED_CERTIFICATES.contains(strSignatureBase64Hash)) {
                    return true;
                }
                if ((!Build.TYPE.equals("user") || currentPackageIsDev(str, packageManager)) && ALLOWED_CERTIFICATES_DEV.contains(strSignatureBase64Hash)) {
                    return true;
                }
                Log.w(TAG, a.e(strSignatureBase64Hash, "Signaure hash ", " not in whitelisted signatures"), new Object[0]);
            }
        }
        return false;
    }

    private static boolean currentPackageIsDev(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        for (Signature signature : getSignatures(str, packageManager)) {
            if (ALLOWED_CERTIFICATES_DEV.contains(signatureBase64Hash(signature))) {
                return true;
            }
        }
        return false;
    }

    public static String[] getPackageInfo(int i) throws PackageManager.NameNotFoundException {
        int length;
        Context applicationContext = ContextHelper.getApplicationContext();
        if (applicationContext == null) {
            Log.wtf(TAG, "Could not get ApplicationContext.", new Object[0]);
            return new String[0];
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) <= 0) {
            Log.wtf(TAG, "uid %d does not correspond to any packages", Integer.valueOf(i));
            return new String[0];
        }
        if (length > 1) {
            Log.wtf(TAG, "Multiple packages found for uid %d. But only first one will be used.", Integer.valueOf(i));
        }
        Signature[] signatures = getSignatures(packagesForUid[0], packageManager);
        int length2 = signatures.length;
        if (length2 <= 0) {
            Log.wtf(TAG, "uid %d does not correspond to any signatures", Integer.valueOf(i));
            return new String[0];
        }
        if (length2 > 1) {
            Log.wtf(TAG, "Multiple signatures found for uid %d. But only first one will be used.", Integer.valueOf(i));
        }
        return new String[]{packagesForUid[0], signatureBase64Hash(signatures[0])};
    }

    private static Signature[] getSignatures(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            if (packageInfo.signingInfo == null) {
                return null;
            }
            return packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Failed to find package %s", str, e);
            return null;
        }
    }

    public static boolean isWhitelisted(int i) {
        Context applicationContext = ContextHelper.getApplicationContext();
        if (applicationContext == null) {
            Log.wtf(TAG, "Could not get ApplicationContext.", new Object[0]);
            return false;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) <= 0) {
            Log.wtf(TAG, "uid %d does not correspond to any packages", Integer.valueOf(i));
            return false;
        }
        String packageName = applicationContext.getPackageName();
        for (String str : packagesForUid) {
            if (checkPackage(str, packageName, packageManager)) {
                Log.d(TAG, "Valid access from %s", str);
                return true;
            }
        }
        return false;
    }

    private static String signatureBase64Hash(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("sha256").digest(signature.toByteArray()), 2);
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "No SHA-256 support.", e);
            return "";
        }
    }
}
