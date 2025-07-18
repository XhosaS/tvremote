package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class enc {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r3, int r4, int r5, int r6, java.lang.Object r7, boolean r8) {
        /*
            emc r0 = defpackage.emd.a
            boolean r0 = defpackage.ema.a
            boolean r0 = r7 instanceof android.view.View
            if (r0 == 0) goto L49
            android.view.View r7 = (android.view.View) r7
            int r0 = r5 - r3
            int r1 = r6 - r4
            if (r8 != 0) goto L1c
            int r2 = r7.getMeasuredHeight()
            if (r2 != r1) goto L1c
            int r2 = r7.getMeasuredWidth()
            if (r2 == r0) goto L2b
        L1c:
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r7.measure(r0, r1)
            if (r8 != 0) goto L45
        L2b:
            int r8 = r7.getLeft()
            if (r8 != r3) goto L45
            int r8 = r7.getTop()
            if (r8 != r4) goto L45
            int r8 = r7.getRight()
            if (r8 != r5) goto L45
            int r8 = r7.getBottom()
            if (r8 == r6) goto L44
            goto L45
        L44:
            return
        L45:
            r7.layout(r3, r4, r5, r6)
            return
        L49:
            boolean r8 = r7 instanceof android.graphics.drawable.Drawable
            if (r8 == 0) goto L53
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r7.setBounds(r3, r4, r5, r6)
            return
        L53:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unsupported mounted content "
            java.lang.String r4 = defpackage.a.p(r7, r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enc.a(int, int, int, int, java.lang.Object, boolean):void");
    }
}
