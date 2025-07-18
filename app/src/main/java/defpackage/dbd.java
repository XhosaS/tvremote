package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dbd extends dat {
    public dbd(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.daw
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.dat
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.dat
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
