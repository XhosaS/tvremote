package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvp {
    static final Bitmap.Config b;
    public static final Bitmap a = Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888);
    private static final Map c = new WeakHashMap();

    static {
        new SparseArray();
        b = Bitmap.Config.HARDWARE;
    }

    static boolean a() {
        return !"robolectric".equals(Build.HARDWARE);
    }

    static synchronized void b(Bitmap bitmap, bho bhoVar) {
        if (bhoVar != null) {
            c.put(bitmap, Pair.create(Integer.valueOf(bitmap.getGenerationId()), bhoVar));
        }
    }
}
