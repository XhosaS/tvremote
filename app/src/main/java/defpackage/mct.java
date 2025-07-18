package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mct {
    private static volatile boolean a;

    public static String a(String str, String str2) throws Exception {
        if (str == null || a) {
            return null;
        }
        try {
            String str3 = String.format(Locale.US, "%s:%d:%s", str, 1, str2);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = mcx.a;
            int length = bArrDigest.length;
            char[] cArr2 = new char[length + length];
            for (int i = 0; i < bArrDigest.length; i++) {
                byte b = bArrDigest[i];
                char[] cArr3 = mcx.a;
                char c = cArr3[(b >> 4) & 15];
                char c2 = cArr3[b & 15];
                int i2 = i + i;
                cArr2[i2] = c;
                cArr2[i2 + 1] = c2;
            }
            return new String(cArr2).toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException unused) {
            a = true;
            throw new Exception("No SHA-256 algorithm");
        }
    }
}
