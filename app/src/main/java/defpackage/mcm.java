package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mcm {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/s3client/GrpcTransportUtils");

    public static String a(Context context) throws PackageManager.NameNotFoundException {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 64).signatures[0].toByteArray());
            return zkl.f.k(bArrDigest, bArrDigest.length);
        } catch (PackageManager.NameNotFoundException | NullPointerException | NoSuchAlgorithmException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/assistant/soda/s3client/GrpcTransportUtils", "getAndroidCertFingerprint", '?', "GrpcTransportUtils.java")).u("Failed to get certificate fingerprint");
            return null;
        }
    }
}
