package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bge {
    private static final Object a = new Object();

    public static void a(String str) {
        synchronized (a) {
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            Log.w("SubtitlePainter", str);
        }
    }
}
