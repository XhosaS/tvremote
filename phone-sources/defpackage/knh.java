package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knh {
    private static final tui a = tui.l("com/google/android/apps/googletv/compose/NetworkImageKt");

    public static final String a(wlw wlwVar, int i, int i2) {
        vun vunVar = wlwVar.b;
        vunVar.getClass();
        wlv wlvVar = (wlv) yfm.U(vunVar);
        int iAbs = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (wlv wlvVar2 : wlwVar.b) {
            int i3 = wlvVar2.d * wlvVar2.c;
            if (i3 != 0) {
                int i4 = i3 - (i * i2);
                if (Math.abs(i4) < iAbs) {
                    iAbs = Math.abs(i4);
                    wlvVar = wlvVar2;
                }
            }
        }
        if (wlvVar != null) {
            return wlvVar.b;
        }
        return null;
    }

    public static final String b(wlx wlxVar, int i, int i2) {
        int i3 = wlxVar.b;
        int iP = wbb.p(i3);
        if (iP == 0) {
            throw null;
        }
        int i4 = iP - 1;
        if (i4 == 0) {
            return (i3 == 1 ? (wlu) wlxVar.c : wlu.a).b;
        }
        if (i4 != 2) {
            return null;
        }
        wlw wlwVar = i3 == 3 ? (wlw) wlxVar.c : wlw.a;
        wlwVar.getClass();
        return a(wlwVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.wlw r16, defpackage.bkp r17, defpackage.buo r18, defpackage.bao r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knh.c(wlw, bkp, buo, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(java.lang.String r18, defpackage.bkp r19, defpackage.buo r20, defpackage.yjz r21, defpackage.bao r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knh.d(java.lang.String, bkp, buo, yjz, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(android.content.Context r5, java.lang.String r6, defpackage.riv r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.kng
            if (r0 == 0) goto L13
            r0 = r8
            kng r0 = (defpackage.kng) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kng r0 = new kng
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r6 = r0.c
            defpackage.ybn.f(r8)
            goto L50
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.ybn.f(r8)
            gzs r8 = new gzs
            r8.<init>(r5)
            r8.a = r6
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r8.c = r5
            gzu r5 = r8.a()
            r0.c = r6
            r0.b = r4
            java.lang.Object r8 = r7.b(r5, r0)
            if (r8 == r1) goto Le8
        L50:
            gzv r8 = (defpackage.gzv) r8
            boolean r5 = r8 instanceof defpackage.hac
            if (r5 == 0) goto Lb9
            hac r8 = (defpackage.hac) r8
            android.graphics.drawable.Drawable r5 = r8.a
            int r6 = r5.getIntrinsicWidth()
            int r7 = r5.getIntrinsicHeight()
            boolean r8 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L98
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            android.graphics.Bitmap r8 = r5.getBitmap()
            if (r8 == 0) goto L90
            android.graphics.Bitmap r8 = r5.getBitmap()
            int r8 = r8.getWidth()
            if (r6 != r8) goto L87
            android.graphics.Bitmap r8 = r5.getBitmap()
            int r8 = r8.getHeight()
            if (r7 != r8) goto L87
            android.graphics.Bitmap r5 = r5.getBitmap()
            return r5
        L87:
            android.graphics.Bitmap r5 = r5.getBitmap()
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r6, r7, r4)
            return r5
        L90:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bitmap is null"
            r5.<init>(r6)
            throw r5
        L98:
            android.graphics.Rect r8 = r5.getBounds()
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r6, r7, r4)
            r5.setBounds(r3, r3, r6, r7)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r4)
            r5.draw(r6)
            r5.setBounds(r0, r1, r2, r8)
            return r4
        Lb9:
            boolean r5 = r8 instanceof defpackage.gzq
            if (r5 == 0) goto Le2
            tui r5 = defpackage.knh.a
            tuv r5 = r5.g()
            tug r5 = (defpackage.tug) r5
            gzq r8 = (defpackage.gzq) r8
            java.lang.Throwable r7 = r8.c
            tuv r5 = r5.i(r7)
            r7 = 166(0xa6, float:2.33E-43)
            java.lang.String r8 = "NetworkImage.kt"
            java.lang.String r0 = "com/google/android/apps/googletv/compose/NetworkImageKt"
            java.lang.String r1 = "loadImageBitmap"
            tuv r5 = r5.j(r0, r1, r7, r8)
            tug r5 = (defpackage.tug) r5
            java.lang.String r7 = "Failed to load image. url=%s"
            r5.v(r7, r6)
            r5 = 0
            return r5
        Le2:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        Le8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knh.f(android.content.Context, java.lang.String, riv, yih):java.lang.Object");
    }

    private static final long g(bcb bcbVar) {
        return ((cmh) bcbVar.a()).a;
    }
}
