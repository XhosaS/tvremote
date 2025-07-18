package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tas implements Handler.Callback {
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r9.what
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L71
            if (r0 == r3) goto La
            return r2
        La:
            java.lang.Object r0 = r9.obj
            taz r0 = (defpackage.taz) r0
            int r9 = r9.arg1
            boolean r9 = r0.k()
            if (r9 == 0) goto L6d
            tay r9 = r0.j
            int r4 = r9.getVisibility()
            if (r4 != 0) goto L6d
            int r9 = r9.c
            if (r9 != r3) goto L3d
            float[] r9 = new float[r1]
            r9 = {x00e6: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = r0.c(r9)
            int r1 = r0.d
            long r1 = (long) r1
            r9.setDuration(r1)
            tap r1 = new tap
            r1.<init>(r0)
            r9.addListener(r1)
            r9.start()
            goto L70
        L3d:
            android.animation.ValueAnimator r9 = new android.animation.ValueAnimator
            r9.<init>()
            int r1 = r0.b()
            int[] r1 = new int[]{r2, r1}
            r9.setIntValues(r1)
            android.animation.TimeInterpolator r1 = r0.f
            r9.setInterpolator(r1)
            int r1 = r0.e
            long r1 = (long) r1
            r9.setDuration(r1)
            tar r1 = new tar
            r1.<init>(r0)
            r9.addListener(r1)
            spv r1 = new spv
            r2 = 6
            r1.<init>(r0, r2)
            r9.addUpdateListener(r1)
            r9.start()
            goto L70
        L6d:
            r0.l()
        L70:
            return r3
        L71:
            java.lang.Object r9 = r9.obj
            taz r9 = (defpackage.taz) r9
            tay r0 = r9.j
            android.view.ViewParent r4 = r0.getParent()
            if (r4 != 0) goto Ld9
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            boolean r5 = r4 instanceof defpackage.cqx
            if (r5 == 0) goto La7
            cqx r4 = (defpackage.cqx) r4
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r5 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r5.<init>()
            xzg r6 = r5.g
            zft r7 = r9.v
            r6.a = r7
            zft r6 = new zft
            r7 = 0
            r6.<init>(r9, r7)
            r5.f = r6
            r4.b(r5)
            android.view.View r5 = r9.d()
            if (r5 != 0) goto La7
            r5 = 80
            r4.g = r5
        La7:
            android.view.ViewGroup r4 = r9.h
            r0.g = r3
            r4.addView(r0)
            r0.g = r2
            android.view.View r5 = r9.d()
            if (r5 != 0) goto Lb7
            goto Ld0
        Lb7:
            int[] r2 = new int[r1]
            android.view.View r5 = r9.d()
            r5.getLocationOnScreen(r2)
            r2 = r2[r3]
            int[] r1 = new int[r1]
            r4.getLocationOnScreen(r1)
            r1 = r1[r3]
            int r4 = r4.getHeight()
            int r1 = r1 + r4
            int r2 = r1 - r2
        Ld0:
            r9.q = r2
            r9.j()
            r1 = 4
            r0.setVisibility(r1)
        Ld9:
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto Le3
            r9.i()
            goto Le5
        Le3:
            r9.t = r3
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tas.handleMessage(android.os.Message):boolean");
    }
}
