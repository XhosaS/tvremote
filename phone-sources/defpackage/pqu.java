package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.material.featurehighlight.TextContentView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqu extends dao {
    private final pqw e;
    private final View f;
    private final Rect g;
    private final String h;

    public pqu(pqw pqwVar, View view) {
        super(pqwVar);
        this.g = new Rect();
        this.e = pqwVar;
        this.f = view;
        this.h = pqwVar.getResources().getString(R.string.libraries_material_featurehighlight_dismiss);
    }

    @Override // defpackage.dao
    protected final int a(float f, float f2) {
        int i = pqw.J;
        pqw pqwVar = this.e;
        TextContentView textContentView = pqwVar.H;
        int i2 = (int) f;
        int i3 = (int) f2;
        if (textContentView.g() && pqwVar.b.contains(i2, i3)) {
            return 1;
        }
        if (textContentView.e() && pqwVar.c.contains(i2, i3)) {
            return 2;
        }
        if (textContentView.f() && pqwVar.d.contains(i2, i3)) {
            return 3;
        }
        if (pqwVar.a.contains(i2, i3)) {
            return 4;
        }
        return (pqwVar.o(f, f2) && pqwVar.e.e(f, f2)) ? -1 : 5;
    }

    @Override // defpackage.dao
    protected final void c(List list) {
        int i = pqw.J;
        TextContentView textContentView = this.e.H;
        if (textContentView.g()) {
            list.add(1);
        }
        if (textContentView.e()) {
            list.add(2);
        }
        if (textContentView.f()) {
            list.add(3);
        }
        list.add(4);
        list.add(5);
    }

    @Override // defpackage.dao
    protected final void f(int i, AccessibilityEvent accessibilityEvent) {
        if (i == 1) {
            pqw pqwVar = this.e;
            int i2 = pqw.J;
            accessibilityEvent.setContentDescription(pqwVar.H.c());
            return;
        }
        if (i == 2) {
            pqw pqwVar2 = this.e;
            int i3 = pqw.J;
            accessibilityEvent.setContentDescription(pqwVar2.H.a());
        } else if (i == 3) {
            pqw pqwVar3 = this.e;
            int i4 = pqw.J;
            accessibilityEvent.setContentDescription(pqwVar3.H.b());
        } else if (i == 4) {
            View view = this.f;
            accessibilityEvent.setContentDescription(view.getContentDescription());
            accessibilityEvent.setClassName(view.getAccessibilityClassName());
        } else if (i == 5) {
            accessibilityEvent.setContentDescription(this.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // defpackage.dao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void h(int r5, defpackage.cyq r6) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "android.widget.TextView"
            if (r5 == r0) goto Laf
            r0 = 2
            if (r5 == r0) goto L97
            r0 = 3
            r1 = 16
            if (r5 == r0) goto L7a
            r0 = 4
            java.lang.String r2 = ""
            if (r5 == r0) goto L39
            r0 = 5
            if (r5 == r0) goto L1f
            android.graphics.Rect r5 = r4.g
            r5.setEmpty()
            r6.x(r2)
            goto Lc6
        L1f:
            android.graphics.Rect r5 = r4.g
            pqw r0 = r4.e
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            r3 = 0
            r5.set(r3, r3, r2, r0)
            java.lang.String r5 = r4.h
            r6.x(r5)
            r6.i(r1)
            goto Lc6
        L39:
            android.graphics.Rect r5 = r4.g
            pqw r0 = r4.e
            int r3 = defpackage.pqw.J
            android.graphics.Rect r0 = r0.a
            r5.set(r0)
            android.view.View r5 = r4.f
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L5d
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            r6.T(r0)
            if (r0 == 0) goto L5d
            int r0 = r0.length()
            if (r0 == 0) goto L5d
            goto L68
        L5d:
            java.lang.CharSequence r0 = r5.getContentDescription()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r2 = r0
        L65:
            r6.x(r2)
        L68:
            java.lang.CharSequence r0 = r5.getAccessibilityClassName()
            r6.t(r0)
            boolean r5 = r5.isClickable()
            r6.u(r5)
            r6.i(r1)
            goto Lc6
        L7a:
            android.graphics.Rect r5 = r4.g
            pqw r0 = r4.e
            int r2 = defpackage.pqw.J
            android.graphics.Rect r2 = r0.d
            r5.set(r2)
            com.google.android.libraries.material.featurehighlight.TextContentView r5 = r0.H
            java.lang.CharSequence r5 = r5.b()
            r6.T(r5)
            java.lang.String r5 = "android.widget.Button"
            r6.t(r5)
            r6.i(r1)
            goto Lc6
        L97:
            android.graphics.Rect r5 = r4.g
            pqw r0 = r4.e
            int r2 = defpackage.pqw.J
            android.graphics.Rect r2 = r0.c
            r5.set(r2)
            com.google.android.libraries.material.featurehighlight.TextContentView r5 = r0.H
            java.lang.CharSequence r5 = r5.a()
            r6.T(r5)
            r6.t(r1)
            goto Lc6
        Laf:
            android.graphics.Rect r5 = r4.g
            pqw r0 = r4.e
            int r2 = defpackage.pqw.J
            android.graphics.Rect r2 = r0.b
            r5.set(r2)
            com.google.android.libraries.material.featurehighlight.TextContentView r5 = r0.H
            java.lang.CharSequence r5 = r5.c()
            r6.T(r5)
            r6.t(r1)
        Lc6:
            android.graphics.Rect r5 = r4.g
            r6.p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqu.h(int, cyq):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r3 == 3) goto L14;
     */
    @Override // defpackage.dao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean o(int r3, int r4, android.os.Bundle r5) {
        /*
            r2 = this;
            r5 = 16
            r0 = 0
            if (r4 != r5) goto L24
            r4 = 4
            r5 = 1
            if (r3 != r4) goto L11
            pqw r3 = r2.e
            int r4 = defpackage.pqw.J
            r3.e()
            return r5
        L11:
            r4 = 5
            r1 = 3
            if (r3 == r4) goto L18
            if (r3 != r1) goto L24
            goto L1b
        L18:
            if (r3 != r4) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            pqw r3 = r2.e
            int r4 = defpackage.pqw.J
            r3.d(r0)
            return r5
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqu.o(int, int, android.os.Bundle):boolean");
    }
}
