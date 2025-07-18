package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nqs implements nqk {
    final /* synthetic */ nqv a;
    private final /* synthetic */ int b;

    public nqs(nqv nqvVar, int i) {
        this.b = i;
        this.a = nqvVar;
    }

    @Override // defpackage.nqk
    public final void a(Bitmap bitmap) {
        if (this.b == 0) {
            this.a.a(bitmap, 3);
            return;
        }
        nsf nsfVar = nqv.a;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - r3) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, bitmap.getHeight() + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        this.a.a(bitmap2, 0);
    }
}
