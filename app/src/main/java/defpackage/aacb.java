package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacb {
    private static final ThreadLocal a = new aaca();

    public static SecureRandom a() {
        Provider provider;
        Provider provider2;
        String[] strArr = aaam.a;
        int i = 0;
        while (true) {
            provider = null;
            if (i >= 3) {
                provider2 = null;
                break;
            }
            provider2 = Security.getProvider(strArr[i]);
            if (provider2 != null) {
                break;
            }
            i++;
        }
        if (provider2 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider2);
            } catch (GeneralSecurityException unused) {
            }
        }
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
