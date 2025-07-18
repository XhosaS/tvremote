package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafw {
    public static byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws IllegalStateException, GeneralSecurityException {
        Mac mac = (Mac) aafm.b.a(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr4, i3, i - i3);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, i3, length);
            i2++;
            i3 = i4;
        }
    }
}
