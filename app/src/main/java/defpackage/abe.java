package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abe extends abk {
    public IconCompat a;
    public boolean b;

    @Override // defpackage.abk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.abk
    public final void b(abb abbVar) {
        Bitmap bitmap;
        abl ablVar = (abl) abbVar;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(ablVar.b).setBigContentTitle(null);
        if (this.a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                abd.a(bigContentTitle, adi.a(this.a, ablVar.a));
            } else if (this.a.b() == 1) {
                IconCompat iconCompat = this.a;
                int i = iconCompat.b;
                if (i == -1) {
                    Object obj = iconCompat.c;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat.c;
                } else {
                    if (i != 5) {
                        Objects.toString(iconCompat);
                        throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat.c;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    paint.setColor(0);
                    float f = iMin;
                    float f2 = 0.010416667f * f;
                    paint.setShadowLayer(f2, 0.0f, 0.020833334f * f, 1023410176);
                    float f3 = f * 0.5f;
                    float f4 = 0.9166667f * f3;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setShadowLayer(f2, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f3, f3, f4, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.b) {
            bigContentTitle.bigLargeIcon((Bitmap) null);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            abd.c(bigContentTitle, false);
            abd.b(bigContentTitle, null);
        }
    }
}
