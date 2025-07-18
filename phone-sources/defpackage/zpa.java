package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpa implements zox {
    final /* synthetic */ Provider a;
    final /* synthetic */ zpb b;

    public zpa(zpb zpbVar, Provider provider) {
        this.a = provider;
        this.b = zpbVar;
    }

    @Override // defpackage.zox
    public final Signature a(String str) {
        Provider provider = this.a;
        return provider != null ? Signature.getInstance(this.b.b, provider) : Signature.getInstance(this.b.b);
    }
}
