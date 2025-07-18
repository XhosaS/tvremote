package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import j$.util.Optional;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fea implements fdz {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/common/crypto/CryptoToolsProviderImpl");

    @Override // defpackage.fdz
    public final Optional a() {
        try {
            return Optional.of(Cipher.getInstance("AES/GCM/NoPadding"));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/common/crypto/CryptoToolsProviderImpl", "getCipher", 'w', "CryptoToolsProviderImpl.java")).u("Failed to get cipher");
            return Optional.empty();
        }
    }

    @Override // defpackage.fdz
    public final Optional b() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("key_alias_for_global_query_routing_tokens", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            return Optional.of(keyGenerator.generateKey());
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/common/crypto/CryptoToolsProviderImpl", "generateAndStoreEncryptionKey", 'E', "CryptoToolsProviderImpl.java")).u("Unable to generate encryption key");
            return Optional.empty();
        }
    }

    @Override // defpackage.fdz
    public final Optional c() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias("key_alias_for_global_query_routing_tokens") ? Optional.ofNullable(keyStore.getKey("key_alias_for_global_query_routing_tokens", null)) : Optional.empty();
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            ((zdv) ((zdv) ((zdv) a.b()).p(e)).q("com/google/android/apps/tvsearch/common/crypto/CryptoToolsProviderImpl", "getEncryptionKey", '[', "CryptoToolsProviderImpl.java")).u("Failed to get encryption key");
            return Optional.empty();
        }
    }
}
