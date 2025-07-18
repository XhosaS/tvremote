package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axq {
    final ArrayList a = new ArrayList();
    public ato b;
    private boolean c;

    private final void f(ayb aybVar, TextView textView) {
        axh axhVar = aybVar.s;
        if (textView == aybVar.u) {
            if (axhVar.f != null) {
                axhVar.f = textView.getText();
                return;
            } else {
                axhVar.c = textView.getText();
                return;
            }
        }
        if (textView == aybVar.t) {
            if (axhVar.e != null) {
                axhVar.e = textView.getText();
            } else {
                axhVar.b = textView.getText();
            }
        }
    }

    public final void a(axp axpVar, axp axpVar2) {
        this.a.add(new Pair(axpVar, axpVar2));
        if (axpVar != null) {
            axpVar.g = this;
        }
        if (axpVar2 != null) {
            axpVar2.g = this;
        }
    }

    public final void b(View view) {
        if (this.c) {
            this.c = false;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            this.b.a.aQ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0034, code lost:
    
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.axp r10, android.widget.TextView r11) {
        /*
            r9 = this;
            ayb r0 = r10.o(r11)
            r9.f(r0, r11)
            r10.p(r0)
            ato r1 = r9.b
            axh r2 = r0.s
            ats r1 = r1.a
            long r1 = r1.aC(r2)
            ayc r3 = r10.f
            r4 = 0
            r5 = 1
            r3.j(r0, r4, r5)
            axh r3 = r0.s
            long r6 = r3.a
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto L9c
            r6 = -2
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 != 0) goto L33
            int r3 = r10.m(r3)
            if (r3 >= 0) goto L31
            goto L9c
        L31:
            int r3 = r3 + r5
            goto L34
        L33:
            r3 = r4
        L34:
            java.util.List r5 = r10.e
            int r5 = r5.size()
            if (r6 != 0) goto L4b
        L3c:
            if (r3 >= r5) goto L5a
            axh r7 = r10.n(r3)
            boolean r7 = r7.h()
            if (r7 != 0) goto L5a
            int r3 = r3 + 1
            goto L3c
        L4b:
            if (r3 >= r5) goto L5a
            axh r7 = r10.n(r3)
            long r7 = r7.a
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 == 0) goto L5a
            int r3 = r3 + 1
            goto L4b
        L5a:
            if (r3 >= r5) goto L7d
            ayc r1 = r10.f
            androidx.leanback.widget.VerticalGridView r1 = r1.c
            qv r1 = r1.k(r3, r4)
            ayb r1 = (defpackage.ayb) r1
            if (r1 == 0) goto L9c
            axh r11 = r1.s
            boolean r11 = r11.c()
            if (r11 == 0) goto L74
            r9.e(r10, r1)
            return
        L74:
            android.view.View r10 = r1.a
            r9.b(r10)
            r10.requestFocus()
            return
        L7d:
            r3 = r4
        L7e:
            java.util.ArrayList r5 = r9.a
            int r7 = r5.size()
            if (r3 >= r7) goto L98
            java.lang.Object r5 = r5.get(r3)
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r7 = r5.first
            if (r7 != r10) goto L95
            java.lang.Object r10 = r5.second
            axp r10 = (defpackage.axp) r10
            goto L99
        L95:
            int r3 = r3 + 1
            goto L7e
        L98:
            r10 = 0
        L99:
            if (r10 == 0) goto L9c
            goto L33
        L9c:
            r9.b(r11)
            android.view.View r10 = r0.a
            r10.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axq.c(axp, android.widget.TextView):void");
    }

    public final void d(axp axpVar, TextView textView) {
        ayb aybVarO = axpVar.o(textView);
        f(aybVarO, textView);
        axh axhVar = aybVarO.s;
        axpVar.f.j(aybVarO, false, true);
        b(textView);
        aybVarO.a.requestFocus();
    }

    public final void e(axp axpVar, ayb aybVar) {
        axpVar.f.j(aybVar, true, true);
        int i = aybVar.z;
        View view = i != 1 ? i != 2 ? i != 3 ? null : aybVar.v : aybVar.u : aybVar.t;
        if (view != null) {
            if (i == 1 || i == 2) {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                view.setFocusable(true);
                view.requestFocus();
                inputMethodManager.showSoftInput(view, 0);
                if (this.c) {
                    return;
                }
                this.c = true;
                this.b.a.aQ();
            }
        }
    }
}
