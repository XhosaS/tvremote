package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gye implements gyh {
    private final /* synthetic */ int a;

    public gye(int i) {
        this.a = i;
    }

    @Override // defpackage.gyh
    public final /* synthetic */ gyi a(Object obj, gzy gzyVar) {
        int i = this.a;
        if (i == 0) {
            return new gyf((Bitmap) obj, gzyVar, 0);
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            if (hat.d(uri)) {
                return new gyf(uri, gzyVar, 1);
            }
            return null;
        }
        if (i == 2) {
            return new gyf((ByteBuffer) obj, gzyVar, 2);
        }
        if (i == 3) {
            Uri uri2 = (Uri) obj;
            if (yks.e(uri2.getScheme(), "content")) {
                return new gyf(uri2, gzyVar, 3);
            }
            return null;
        }
        if (i == 4) {
            return new gyf((Drawable) obj, gzyVar, 4);
        }
        if (i == 5) {
            return new gyj((File) obj);
        }
        Uri uri3 = (Uri) obj;
        if (yks.e(uri3.getScheme(), "android.resource")) {
            return new gyf(uri3, gzyVar, 5);
        }
        return null;
    }
}
