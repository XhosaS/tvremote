package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafn implements aafu {
    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
