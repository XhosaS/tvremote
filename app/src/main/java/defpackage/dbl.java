package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dbl extends dat {
    public dbl(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.daw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.dat
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.dat
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
