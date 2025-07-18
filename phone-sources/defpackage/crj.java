package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crj extends crr {
    private IconCompat c;
    private IconCompat d;
    private boolean e;

    @Override // defpackage.crr
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void b(Bitmap bitmap) {
        this.d = bitmap == null ? null : IconCompat.e(bitmap);
        this.e = true;
    }

    public final void c(Bitmap bitmap) {
        this.c = bitmap == null ? null : IconCompat.e(bitmap);
    }

    @Override // defpackage.crr
    public final void d(fhy fhyVar) {
        Bitmap bitmapC;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) fhyVar.d).setBigContentTitle(this.b);
        if (this.c != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                cri.c(bigContentTitle, cmq.n(this.c, (Context) fhyVar.e));
            } else if (this.c.b() == 1) {
                IconCompat iconCompat = this.c;
                int i = iconCompat.b;
                if (i == -1) {
                    Object obj = iconCompat.c;
                    bitmapC = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapC = (Bitmap) iconCompat.c;
                } else {
                    if (i != 5) {
                        Objects.toString(iconCompat);
                        throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                    }
                    bitmapC = IconCompat.c((Bitmap) iconCompat.c, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapC);
            }
        }
        if (this.e) {
            IconCompat iconCompat2 = this.d;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                crh.a(bigContentTitle, cmq.n(iconCompat2, (Context) fhyVar.e));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            cri.e(bigContentTitle, false);
            cri.d(bigContentTitle, null);
        }
    }
}
