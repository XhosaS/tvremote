package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoe implements hod {
    @Override // defpackage.hod
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hod
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hod
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.hod
    public final void c() {
    }

    @Override // defpackage.hod
    public final void e(int i) {
    }
}
