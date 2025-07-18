package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eca {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable, Drawable drawable2) {
        if (drawable == 0) {
            return drawable2 == 0;
        }
        if (drawable2 == 0) {
            return false;
        }
        return ((drawable instanceof ebz) && (drawable2 instanceof ebz)) ? ((ebz) drawable).a((ebz) drawable2) : drawable.equals(drawable2);
    }
}
