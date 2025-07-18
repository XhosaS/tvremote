package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.ActivityChooserView;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hat {
    public static final Bitmap.Config a;
    public static final zcc b;

    static {
        a = Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        b = new upq((byte[]) null, (byte[]) null).t();
    }

    public static final File a(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        cacheDir.getClass();
        return cacheDir;
    }

    public static final String b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        return (String) yfm.U(pathSegments);
    }

    public static final String c(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || ylh.L(str)) {
            return null;
        }
        String strI = ylh.I(str, '#', str);
        String strI2 = ylh.I(strI, '?', strI);
        return mimeTypeMap.getMimeTypeFromExtension(ylh.H(ylh.H(strI2, '/', strI2), '.', ""));
    }

    public static final boolean d(Uri uri) {
        return yks.e(uri.getScheme(), "file") && yks.e(b(uri), "android_asset");
    }

    public static final boolean e(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean f(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof glh);
    }

    public static final boolean g(qza qzaVar) {
        qzaVar.getClass();
        return false;
    }

    public static final int h(hjs hjsVar, int i) {
        if (hjsVar instanceof hae) {
            return ((hae) hjsVar).a;
        }
        int i2 = has.a[i - 1];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        throw new yfu();
    }
}
