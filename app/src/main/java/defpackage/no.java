package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class no {
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    static {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.graphics.Insets"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L39 java.lang.ClassNotFoundException -> L3d java.lang.NoSuchMethodException -> L41
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.String r5 = "getOpticalInsets"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r2)     // Catch: java.lang.NoSuchFieldException -> L39 java.lang.ClassNotFoundException -> L3d java.lang.NoSuchMethodException -> L41
            java.lang.String r5 = "left"
            java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L33 java.lang.ClassNotFoundException -> L35 java.lang.NoSuchMethodException -> L37
            java.lang.String r6 = "top"
            java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L2f java.lang.NoSuchMethodException -> L31
            java.lang.String r7 = "right"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = "bottom"
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L45
            r8 = r0
            goto L47
        L2b:
            r7 = r2
            goto L45
        L2d:
            r6 = r2
            goto L44
        L2f:
            r6 = r2
            goto L44
        L31:
            r6 = r2
            goto L44
        L33:
            r5 = r2
            goto L3b
        L35:
            r5 = r2
            goto L3f
        L37:
            r5 = r2
            goto L43
        L39:
            r4 = r2
            r5 = r4
        L3b:
            r6 = r5
            goto L44
        L3d:
            r4 = r2
            r5 = r4
        L3f:
            r6 = r5
            goto L44
        L41:
            r4 = r2
            r5 = r4
        L43:
            r6 = r5
        L44:
            r7 = r6
        L45:
            r8 = r1
            r3 = r2
        L47:
            if (r8 == 0) goto L56
            defpackage.no.b = r4
            defpackage.no.c = r5
            defpackage.no.d = r6
            defpackage.no.e = r7
            defpackage.no.f = r3
            defpackage.no.a = r0
            return
        L56:
            defpackage.no.b = r2
            defpackage.no.c = r2
            defpackage.no.d = r2
            defpackage.no.e = r2
            defpackage.no.f = r2
            defpackage.no.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no.<clinit>():void");
    }
}
