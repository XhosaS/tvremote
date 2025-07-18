package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;

/* compiled from: PG */
/* loaded from: classes.dex */
public class myi extends LinkMovementMethod {
    public static final /* synthetic */ int a = 0;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private Runnable c;

    private final void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            b.removeCallbacks(runnable);
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.widget.TextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mxx
            if (r0 == 0) goto L92
            mxx r7 = (defpackage.mxx) r7
            int r0 = r9.getActionMasked()
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L19
            java.lang.Runnable r7 = r6.c
            if (r7 == 0) goto L15
            r6.a()
        L15:
            android.text.Selection.removeSelection(r8)
            return r2
        L19:
            r1 = 1
            if (r0 == r1) goto L1f
            if (r0 != 0) goto L8d
            r0 = r2
        L1f:
            r7.requestFocus()
            float r3 = r9.getX()
            int r3 = (int) r3
            float r4 = r9.getY()
            int r4 = (int) r4
            int r5 = r7.getTotalPaddingLeft()
            int r3 = r3 - r5
            int r5 = r7.getTotalPaddingTop()
            int r4 = r4 - r5
            int r5 = r7.getScrollX()
            int r3 = r3 + r5
            int r5 = r7.getScrollY()
            int r4 = r4 + r5
            android.text.Layout r5 = r7.getLayout()
            int r4 = r5.getLineForVertical(r4)
            float r3 = (float) r3
            int r3 = r5.getOffsetForHorizontal(r4, r3)
            java.lang.Class<ehg> r4 = defpackage.ehg.class
            java.lang.Object[] r4 = r8.getSpans(r3, r3, r4)
            ehg[] r4 = (defpackage.ehg[]) r4
            int r5 = r4.length
            if (r5 == 0) goto L8d
            r2 = r4[r2]
            int r4 = r8.getSpanStart(r2)
            int r5 = r8.getSpanEnd(r2)
            if (r4 > r3) goto L8d
            if (r3 >= r5) goto L8d
            if (r0 != r1) goto L76
            java.lang.Runnable r9 = r6.c
            if (r9 == 0) goto L6f
            r6.a()
        L6f:
            r2.onClick(r7)
            android.text.Selection.removeSelection(r8)
            goto L8a
        L76:
            android.text.Selection.setSelection(r8, r4, r5)
            myg r8 = new myg
            r8.<init>()
            r6.c = r8
            android.os.Handler r9 = defpackage.myi.b
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r0
            r9.postDelayed(r8, r2)
        L8a:
            r7.c = r1
            return r1
        L8d:
            boolean r7 = super.onTouchEvent(r7, r8, r9)
            return r7
        L92:
            boolean r7 = super.onTouchEvent(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
