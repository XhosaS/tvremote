package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafs implements aafu {
    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
