package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dea implements ddz {
    @Override // defpackage.ddz
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ddz
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ddz
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ddz
    public final void c() {
    }

    @Override // defpackage.ddz
    public final void e(int i) {
    }
}
