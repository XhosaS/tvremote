package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hrf implements hlp {
    @Override // defpackage.hlp
    public final hnv b(Context context, hnv hnvVar, int i, int i2) {
        if (!hwp.l(i, i2)) {
            throw new IllegalArgumentException(a.cn(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        hod hodVar = hjr.b(context).a;
        Bitmap bitmap = (Bitmap) hnvVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(hodVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? hnvVar : hsj.g(bitmapC, hodVar);
    }

    protected abstract Bitmap c(hod hodVar, Bitmap bitmap, int i, int i2);
}
