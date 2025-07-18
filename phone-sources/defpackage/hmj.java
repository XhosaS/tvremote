package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmj extends hlr {
    public hmj(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.hlu
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.hlr
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.hlr
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
