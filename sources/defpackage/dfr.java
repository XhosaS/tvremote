package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfr implements dfo {
    final /* synthetic */ Provider a;
    final /* synthetic */ dfs b;

    public dfr(dfs dfsVar, Provider provider) {
        this.a = provider;
        this.b = dfsVar;
    }

    @Override // defpackage.dfo
    public final Signature a(String str) {
        Provider provider = this.a;
        return provider != null ? Signature.getInstance(this.b.b, provider) : Signature.getInstance(this.b.b);
    }
}
