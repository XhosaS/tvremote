package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafh implements zzj {
    public static final aaae a = aaae.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public final SecretKey b;
    public final byte[] c;

    public aafh(byte[] bArr) throws GeneralSecurityException {
        aage aageVarA = aage.a(new byte[0]);
        if (!a.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i = aaab.a;
        int length = bArr.length;
        int i2 = aagd.a;
        if (length != 16 && length != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(length * 8)));
        }
        this.b = new SecretKeySpec(bArr, "AES");
        this.c = aageVarA.b();
    }

    @Override // defpackage.zzj
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.c;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i = aacj.a;
        if (length >= length2) {
            int i2 = 0;
            while (true) {
                int length3 = bArr3.length;
                if (i2 >= length3) {
                    AlgorithmParameterSpec algorithmParameterSpecA = aaab.a(bArr, length3, 12);
                    SecretKey secretKey = this.b;
                    Cipher cipherB = aaab.b();
                    cipherB.init(2, secretKey, algorithmParameterSpecA);
                    return cipherB.doFinal(bArr, length3 + 12, (bArr.length - length3) - 12);
                }
                if (bArr[i2] != bArr3[i2]) {
                    break;
                }
                i2++;
            }
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // defpackage.zzj
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
