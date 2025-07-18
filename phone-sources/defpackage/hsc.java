package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsc extends hrf {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hrf
    protected final Bitmap c(hod hodVar, Bitmap bitmap, int i, int i2) {
        return hsq.c(hodVar, bitmap, i, i2);
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        return obj instanceof hsc;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return 1572326941;
    }
}
