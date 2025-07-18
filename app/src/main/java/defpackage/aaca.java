package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaca extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandomA = aacb.a();
        secureRandomA.nextLong();
        return secureRandomA;
    }
}
