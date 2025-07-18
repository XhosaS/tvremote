package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfm implements dhf, dfk {
    private final AssetManager a;

    public dfm(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.dfk
    public final daw a(AssetManager assetManager, String str) {
        return new dbl(assetManager, str);
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dfn(this.a, this);
    }
}
