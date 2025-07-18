package defpackage;

import android.util.Base64;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class feb {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/common/crypto/EncryptedString");
    public final String a;
    public final String b;

    private feb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static Optional a(String str, String str2, fdz fdzVar) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Optional optionalC = fdzVar.c();
        Optional optionalA = fdzVar.a();
        if (optionalC.isEmpty() || optionalA.isEmpty()) {
            return Optional.empty();
        }
        Key key = (Key) optionalC.get();
        Object obj = optionalA.get();
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            ((Cipher) obj).init(2, key, new GCMParameterSpec(128, Base64.decode(str2, 0)));
            return Optional.of(new String(((Cipher) obj).doFinal(bArrDecode), StandardCharsets.UTF_8));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            ((zdv) ((zdv) ((zdv) c.d()).p(e)).q("com/google/android/apps/tvsearch/common/crypto/EncryptedString", "decrypt", ']', "EncryptedString.java")).u("Unable to decrypt string");
            return Optional.empty();
        }
    }

    public static Optional b(String str, fdz fdzVar) throws InvalidKeyException {
        Optional optionalC = fdzVar.c();
        if (optionalC.isEmpty()) {
            optionalC = fdzVar.b();
        }
        Optional optionalA = fdzVar.a();
        if (optionalC.isEmpty() || optionalA.isEmpty()) {
            return Optional.empty();
        }
        Key key = (Key) optionalC.get();
        Object obj = optionalA.get();
        try {
            ((Cipher) obj).init(1, key);
            return Optional.of(new feb(Base64.encodeToString(((Cipher) obj).doFinal(str.getBytes(StandardCharsets.UTF_8)), 0), Base64.encodeToString(((Cipher) obj).getIV(), 0)));
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            ((zdv) ((zdv) ((zdv) c.d()).p(e)).q("com/google/android/apps/tvsearch/common/crypto/EncryptedString", "encrypt", 'A', "EncryptedString.java")).u("Unable to encrypt string");
            return Optional.empty();
        }
    }
}
