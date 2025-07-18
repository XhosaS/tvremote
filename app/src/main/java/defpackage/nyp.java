package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nyp {
    static Uri a(String str) {
        Uri uri = Uri.parse(str);
        return yqv.c(uri.getScheme()) ? uri.buildUpon().scheme("https").build() : uri;
    }

    static boolean b(Context context) {
        Context baseContext;
        return context instanceof Activity ? ((Activity) context).isDestroyed() : (context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && b(baseContext);
    }

    static void c(Drawable drawable, njs njsVar) {
        if (njsVar.g() == 0 || !njsVar.i(0).m() || njsVar.i(0).i().g() == 0) {
            return;
        }
        drawable.setColorFilter(njsVar.i(0).i().g(), PorterDuff.Mode.SRC_IN);
    }

    public static ImageView.ScaleType d(int i, boolean z, boolean z2, int i2) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return z ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_INSIDE;
            }
            if (i3 == 3) {
                return ImageView.ScaleType.CENTER_CROP;
            }
            if (i3 == 4) {
                return ImageView.ScaleType.CENTER;
            }
        } else if (z2 && i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArrValues = ImageView.ScaleType.values();
            if (i2 < scaleTypeArrValues.length) {
                return scaleTypeArrValues[i2];
            }
        }
        return ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nyo e(android.content.Context r6, defpackage.njs r7, defpackage.njs r8, defpackage.njs r9, defpackage.mrg r10, int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyp.e(android.content.Context, njs, njs, njs, mrg, int, int, boolean):nyo");
    }
}
