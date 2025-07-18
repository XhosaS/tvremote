package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaoq {
    public static final void a(abh abhVar, aaps aapsVar) {
        if (aapsVar != null) {
            try {
                lvf lvfVar = aapsVar.c;
                kkk.k(lvfVar);
                Bitmap bitmap = (Bitmap) lvq.e(lvfVar, 5L, TimeUnit.SECONDS);
                IconCompat iconCompatD = null;
                abhVar.h = bitmap == null ? null : IconCompat.d(bitmap);
                abe abeVar = new abe();
                if (bitmap != null) {
                    iconCompatD = IconCompat.d(bitmap);
                }
                abeVar.a = iconCompatD;
                abeVar.b = true;
                abhVar.e(abeVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                aapsVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                aapsVar.close();
            }
        }
    }
}
