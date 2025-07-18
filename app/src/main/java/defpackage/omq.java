package defpackage;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omq {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil");

    public static yqt a(Signature signature) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signature.toByteArray());
            return yqt.h(zkl.f.f().k(bArrDigest, bArrDigest.length));
        } catch (NoSuchAlgorithmException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil", "signatureDigest", (char) 160, "GrpcMetadataUtil.java")).u("Failed to parse a signature");
            return ypv.a;
        }
    }
}
