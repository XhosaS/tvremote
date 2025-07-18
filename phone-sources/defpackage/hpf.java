package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpf implements hqg, hpe {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public hpf(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.hpe
    public final hlu a(AssetManager assetManager, String str) {
        return this.b != 0 ? new hmb(assetManager, str) : new hmj(assetManager, str);
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        return this.b != 0 ? new hpq(this.a, this, 1) : new hpq(this.a, this, 1);
    }
}
