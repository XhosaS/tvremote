package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafq implements aafu {
    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
