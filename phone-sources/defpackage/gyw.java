package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyw implements gyv {
    private final /* synthetic */ int a;

    public gyw(int i) {
        this.a = i;
    }

    @Override // defpackage.gyv
    public final /* synthetic */ String a(Object obj, gzy gzyVar) {
        if (this.a != 0) {
            File file = (File) obj;
            return file.getPath() + ":" + file.lastModified();
        }
        Uri uri = (Uri) obj;
        if (!yks.e(uri.getScheme(), "android.resource")) {
            String string = uri.toString();
            string.getClass();
            return string;
        }
        Configuration configuration = gzyVar.a.getResources().getConfiguration();
        configuration.getClass();
        Bitmap.Config config = hat.a;
        return uri + "-" + (configuration.uiMode & 48);
    }
}
