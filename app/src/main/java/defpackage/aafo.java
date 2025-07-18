package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafo implements aafu {
    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
