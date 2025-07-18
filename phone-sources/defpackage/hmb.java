package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmb extends hlr {
    public hmb(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.hlu
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.hlr
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.hlr
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
