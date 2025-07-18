package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfn implements dhe {
    private final AssetManager a;
    private final dfk b;

    public dfn(AssetManager assetManager, dfk dfkVar) {
        this.a = assetManager;
        this.b = dfkVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        Uri uri = (Uri) obj;
        String strSubstring = uri.toString().substring(22);
        return new dhd(new dpt(uri), Collections.EMPTY_LIST, this.b.a(this.a, strSubstring));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
