package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafp implements aafu {
    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
