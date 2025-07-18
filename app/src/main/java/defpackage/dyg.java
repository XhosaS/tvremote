package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.facebook.litho.ComponentHost;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyg extends TouchDelegate {
    private static final Rect c = new Rect();
    public final wy a;
    public wy b;

    public dyg(ComponentHost componentHost) {
        super(c, componentHost);
        this.a = new wy(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0006 A[SYNTHETIC] */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            wy r0 = r13.a
            int r1 = r0.c()
        L6:
            int r1 = r1 + (-1)
            r2 = 0
            if (r1 < 0) goto Lc1
            java.lang.Object r3 = r0.d(r1)
            dyf r3 = (defpackage.dyf) r3
            if (r3 == 0) goto L6
            float r4 = r14.getX()
            int r4 = (int) r4
            float r5 = r14.getY()
            int r5 = (int) r5
            elv r6 = r3.b
            eme r6 = r6.d
            emh r7 = r6.b
            dvu r7 = (defpackage.dvu) r7
            duz r7 = r7.b
            dzj r7 = r7.b
            r8 = 0
            if (r7 != 0) goto L2d
            goto L4f
        L2d:
            android.graphics.Rect r7 = r7.a()
            if (r7 != 0) goto L34
            goto L4f
        L34:
            android.graphics.Rect r6 = r6.d
            android.graphics.Rect r8 = new android.graphics.Rect
            int r9 = r6.left
            int r10 = r7.left
            int r9 = r9 - r10
            int r10 = r6.top
            int r11 = r7.top
            int r10 = r10 - r11
            int r11 = r6.right
            int r12 = r7.right
            int r11 = r11 + r12
            int r6 = r6.bottom
            int r7 = r7.bottom
            int r6 = r6 + r7
            r8.<init>(r9, r10, r11, r6)
        L4f:
            if (r8 != 0) goto L52
            goto L6
        L52:
            android.view.View r6 = r3.a
            android.content.Context r7 = r6.getContext()
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            int r7 = r7.getScaledTouchSlop()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r9.set(r8)
            int r10 = -r7
            r9.inset(r10, r10)
            int r10 = r14.getAction()
            r11 = 2
            r12 = 1
            if (r10 == 0) goto L99
            if (r10 == r12) goto L82
            if (r10 == r11) goto L82
            r4 = 3
            if (r10 == r4) goto L7c
            goto L9f
        L7c:
            boolean r4 = r3.c
            r3.c = r2
            r2 = r4
            goto L9f
        L82:
            boolean r8 = r3.c
            if (r8 == 0) goto L8e
            boolean r4 = r9.contains(r4, r5)
            if (r4 != 0) goto L8e
            r4 = r2
            goto L8f
        L8e:
            r4 = r12
        L8f:
            int r5 = r14.getAction()
            if (r5 != r12) goto L97
            r3.c = r2
        L97:
            r2 = r8
            goto La0
        L99:
            boolean r2 = r8.contains(r4, r5)
            r3.c = r2
        L9f:
            r4 = r12
        La0:
            if (r2 == 0) goto L6
            if (r4 == 0) goto Lb4
            int r2 = r6.getWidth()
            int r2 = r2 / r11
            int r3 = r6.getHeight()
            int r3 = r3 / r11
            float r2 = (float) r2
            float r3 = (float) r3
            r14.setLocation(r2, r3)
            goto Lba
        Lb4:
            int r7 = r7 + r7
            int r2 = -r7
            float r2 = (float) r2
            r14.setLocation(r2, r2)
        Lba:
            boolean r2 = r6.dispatchTouchEvent(r14)
            if (r2 == 0) goto L6
            return r12
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyg.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
