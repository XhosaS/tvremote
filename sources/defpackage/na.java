package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class na {
    public final Bundle a;
    public final boolean b;
    public boolean c;

    @Deprecated
    public int d;
    public final CharSequence e;
    public final PendingIntent f;
    public final ii[] g;
    private IconCompat h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public na(androidx.core.graphics.drawable.IconCompat r9, java.lang.CharSequence r10, android.app.PendingIntent r11, android.os.Bundle r12) {
        /*
            r8 = this;
            java.lang.String r0 = "IconCompat"
            java.lang.String r1 = "Unable to get icon type "
            r8.<init>()
            r2 = 1
            r8.c = r2
            r8.h = r9
            int r3 = r9.b
            r4 = 0
            r5 = -1
            if (r3 != r5) goto L66
            java.lang.Object r3 = r9.c
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 < r7) goto L21
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            int r3 = defpackage.du$$ExternalSyntheticApiModelOutline0.m$1(r3)
            goto L66
        L21:
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L56
            java.lang.String r7 = "getType"
            java.lang.reflect.Method r6 = r6.getMethod(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L56
            java.lang.Object r6 = r6.invoke(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L56
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L56
            int r3 = r6.intValue()     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.reflect.InvocationTargetException -> L46 java.lang.IllegalAccessException -> L56
            goto L66
        L36:
            r6 = move-exception
            java.util.Objects.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r1.concat(r3)
            android.util.Log.e(r0, r1, r6)
            goto L65
        L46:
            r6 = move-exception
            java.util.Objects.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r1.concat(r3)
            android.util.Log.e(r0, r1, r6)
            goto L65
        L56:
            r6 = move-exception
            java.util.Objects.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r1.concat(r3)
            android.util.Log.e(r0, r1, r6)
        L65:
            r3 = r5
        L66:
            r0 = 2
            if (r3 != r0) goto L6f
            int r9 = r9.a()
            r8.d = r9
        L6f:
            java.lang.CharSequence r9 = defpackage.nb.b(r10)
            r8.e = r9
            r8.f = r11
            r8.a = r12
            r8.g = r4
            r8.b = r2
            r8.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na.<init>(androidx.core.graphics.drawable.IconCompat, java.lang.CharSequence, android.app.PendingIntent, android.os.Bundle):void");
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.d) != 0) {
            this.h = IconCompat.c(i);
        }
        return this.h;
    }
}
