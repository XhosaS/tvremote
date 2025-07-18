package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ics {
    public static final /* synthetic */ int a = 0;
    private static final yft b = ybn.g(3, new gel(9));

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }

    public static final Handler b() {
        return (Handler) b.a();
    }
}
