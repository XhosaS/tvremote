package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thp extends TouchDelegate {
    private final View a;
    private final Rect b;
    private final Rect c;
    private boolean d;
    private final int e;
    private final AccessibilityManager f;

    public thp(Rect rect, View view) {
        super(rect, view);
        this.b = rect;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect2 = new Rect(rect);
        this.c = rect2;
        int i = -scaledTouchSlop;
        rect2.inset(i, i);
        this.a = view;
        this.f = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            android.view.accessibility.AccessibilityManager r0 = r8.f
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            return r1
        Ld:
            float r0 = r9.getX()
            int r0 = (int) r0
            float r2 = r9.getY()
            int r2 = (int) r2
            int r3 = r9.getAction()
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L4a
            if (r3 == r5) goto L31
            if (r3 == r4) goto L31
            r0 = 3
            if (r3 == r0) goto L29
        L26:
            r0 = r5
            r5 = r1
            goto L55
        L29:
            boolean r0 = r8.d
            r8.d = r1
            r7 = r5
            r5 = r0
            r0 = r7
            goto L55
        L31:
            boolean r3 = r8.d
            if (r3 == 0) goto L3f
            android.graphics.Rect r6 = r8.c
            boolean r0 = r6.contains(r0, r2)
            if (r0 != 0) goto L3f
            r0 = r1
            goto L40
        L3f:
            r0 = r5
        L40:
            int r2 = r9.getAction()
            if (r2 != r5) goto L48
            r8.d = r1
        L48:
            r5 = r3
            goto L55
        L4a:
            android.graphics.Rect r3 = r8.b
            boolean r0 = r3.contains(r0, r2)
            if (r0 == 0) goto L26
            r8.d = r5
            r0 = r5
        L55:
            if (r5 == 0) goto L78
            android.view.View r1 = r8.a
            if (r0 == 0) goto L6b
            int r0 = r1.getWidth()
            int r0 = r0 / r4
            int r2 = r1.getHeight()
            int r2 = r2 / r4
            float r0 = (float) r0
            float r2 = (float) r2
            r9.setLocation(r0, r2)
            goto L73
        L6b:
            int r0 = r8.e
            int r0 = r0 + r0
            int r0 = -r0
            float r0 = (float) r0
            r9.setLocation(r0, r0)
        L73:
            boolean r9 = r1.dispatchTouchEvent(r9)
            return r9
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thp.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
