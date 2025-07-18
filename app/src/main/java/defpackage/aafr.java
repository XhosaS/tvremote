package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafr implements aafu {
    @Override // defpackage.aafu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
