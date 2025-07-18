package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsf {
    private static final hwj a = new hwi(new hwj() { // from class: hse
        @Override // defpackage.hwj
        public final Object a() {
            if (Build.VERSION.SDK_INT == 34) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
                Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
                bitmapCreateBitmap.recycle();
                z = bitmapCopy == null;
                if (bitmapCopy != null) {
                    bitmapCopy.recycle();
                }
            }
            return Boolean.valueOf(z);
        }
    });

    public static boolean a(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
