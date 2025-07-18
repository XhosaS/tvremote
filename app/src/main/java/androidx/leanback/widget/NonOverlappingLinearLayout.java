package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {
    public boolean a;
    boolean b;
    final ArrayList c;

    public NonOverlappingLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.b) {
            super.focusableViewAvailable(view);
            return;
        }
        for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
            if (view2.getParent() == this) {
                iIndexOfChild = indexOfChild(view2);
                break;
            }
        }
        iIndexOfChild = -1;
        if (iIndexOfChild != -1) {
            ((ArrayList) this.c.get(iIndexOfChild)).add(view);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r9, int r10, int r11, int r12, int r13) throws java.lang.Throwable {
        /*
            r8 = this;
            r1 = 0
            boolean r0 = r8.a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L18
            int r0 = r8.getOrientation()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L18
            int r0 = r8.getLayoutDirection()     // Catch: java.lang.Throwable -> L13
            r2 = 1
            if (r0 != r2) goto L18
            goto L19
        L13:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L9e
        L18:
            r2 = r1
        L19:
            r8.b = r2     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L46
        L1d:
            java.util.ArrayList r0 = r8.c     // Catch: java.lang.Throwable -> L13
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L13
            int r3 = r8.getChildCount()     // Catch: java.lang.Throwable -> L13
            if (r2 > r3) goto L3c
        L29:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L13
            int r3 = r8.getChildCount()     // Catch: java.lang.Throwable -> L13
            if (r2 >= r3) goto L46
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            r0.add(r2)     // Catch: java.lang.Throwable -> L13
            goto L29
        L3c:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L13
            int r2 = r2 + (-1)
            r0.remove(r2)     // Catch: java.lang.Throwable -> L13
            goto L1d
        L46:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            super.onLayout(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L99
            boolean r9 = r2.b     // Catch: java.lang.Throwable -> L99
            if (r9 == 0) goto L7e
            r9 = r1
        L54:
            java.util.ArrayList r10 = r2.c     // Catch: java.lang.Throwable -> L99
            int r11 = r10.size()     // Catch: java.lang.Throwable -> L99
            if (r9 >= r11) goto L7e
            r11 = r1
        L5d:
            java.lang.Object r12 = r10.get(r9)     // Catch: java.lang.Throwable -> L99
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch: java.lang.Throwable -> L99
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L99
            if (r11 >= r12) goto L7b
            java.lang.Object r12 = r10.get(r9)     // Catch: java.lang.Throwable -> L99
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch: java.lang.Throwable -> L99
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> L99
            android.view.View r12 = (android.view.View) r12     // Catch: java.lang.Throwable -> L99
            super.focusableViewAvailable(r12)     // Catch: java.lang.Throwable -> L99
            int r11 = r11 + 1
            goto L5d
        L7b:
            int r9 = r9 + 1
            goto L54
        L7e:
            boolean r9 = r2.b
            if (r9 == 0) goto L98
            r2.b = r1
        L84:
            java.util.ArrayList r9 = r2.c
            int r10 = r9.size()
            if (r1 >= r10) goto L98
            java.lang.Object r9 = r9.get(r1)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.clear()
            int r1 = r1 + 1
            goto L84
        L98:
            return
        L99:
            r0 = move-exception
            goto L9d
        L9b:
            r0 = move-exception
            r2 = r8
        L9d:
            r9 = r0
        L9e:
            boolean r10 = r2.b
            if (r10 == 0) goto Lb8
            r2.b = r1
        La4:
            java.util.ArrayList r10 = r2.c
            int r11 = r10.size()
            if (r1 >= r11) goto Lb8
            java.lang.Object r10 = r10.get(r1)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.clear()
            int r1 = r1 + 1
            goto La4
        Lb8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.NonOverlappingLinearLayout.onLayout(boolean, int, int, int, int):void");
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.c = new ArrayList();
    }
}
