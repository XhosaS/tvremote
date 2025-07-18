package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bih implements bie, ghe {
    public final ghd a;
    private final /* synthetic */ bie b;
    private final dvl c;
    private final ghc d;

    public bih(bie bieVar) {
        this.b = bieVar;
        ghd ghdVarY = gez.y(this);
        this.a = ghdVarY;
        this.c = new dvl(this);
        this.d = (ghc) ghdVarY.b;
        Object objA = a("androidx.savedstate.SavedStateRegistry");
        ghdVarY.b(objA instanceof Bundle ? (Bundle) objA : null);
        f("androidx.savedstate.SavedStateRegistry", new awa(this, 14));
    }

    @Override // defpackage.bie
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.bie
    public final Map b() {
        return this.b.b();
    }

    @Override // defpackage.bie
    public final boolean e(Object obj) {
        return this.b.e(obj);
    }

    @Override // defpackage.bie
    public final gmz f(String str, yjk yjkVar) {
        return this.b.f(str, yjkVar);
    }

    @Override // defpackage.dvk
    public final /* synthetic */ dve getLifecycle() {
        return this.c;
    }

    @Override // defpackage.ghe
    public final ghc getSavedStateRegistry() {
        return this.d;
    }
}
