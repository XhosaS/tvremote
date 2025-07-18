package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class djg implements dar {
    @Override // defpackage.dar
    public final ddp b(Context context, ddp ddpVar, int i, int i2) {
        if (!dqm.k(i, i2)) {
            throw new IllegalArgumentException(a.m(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        ddz ddzVar = cyg.a(context).b;
        Bitmap bitmap = (Bitmap) ddpVar.c();
        if (i == Integer.MIN_VALUE) {
            bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            bitmap.getHeight();
        }
        Bitmap bitmapC = c(ddzVar, bitmap);
        return bitmap.equals(bitmapC) ? ddpVar : djf.f(bitmapC, ddzVar);
    }

    protected abstract Bitmap c(ddz ddzVar, Bitmap bitmap);
}
