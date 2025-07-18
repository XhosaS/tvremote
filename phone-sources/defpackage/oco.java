package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oco {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = -1;

    public static MessageDigest a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("SHA1");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
