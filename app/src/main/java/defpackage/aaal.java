package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaal {
    public static final Object a = new Object();

    public final zzj a(String str) throws GeneralSecurityException {
        aaak aaakVar;
        try {
            synchronized (a) {
                aaakVar = new aaak(aagd.a(str));
                byte[] bArrB = aacb.b(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(bArrB, aaakVar.a(aaakVar.b(bArrB, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return aaakVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
