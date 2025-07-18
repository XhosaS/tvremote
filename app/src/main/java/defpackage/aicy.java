package defpackage;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aicy {
    private static final String b = "aicw";
    public static final MessageDigest a = a();

    private static MessageDigest a() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            String str = b;
            if (!Log.isLoggable(str, 3)) {
                return null;
            }
            Log.d(str, "Error while instantiating messageDigest", e);
            return null;
        }
    }
}
