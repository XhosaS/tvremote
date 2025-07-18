package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hri extends hrf {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hrf
    protected final Bitmap c(hod hodVar, Bitmap bitmap, int i, int i2) {
        Paint paint = hsq.a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? hsq.c(hodVar, bitmap, i, i2) : bitmap;
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        return obj instanceof hri;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return -670243078;
    }
}
