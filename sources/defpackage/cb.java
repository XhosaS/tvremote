package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.tv.remote.service.R;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cb extends dh {
    public boolean a;
    public boolean b;
    final /* synthetic */ cj c;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(cj cjVar, Window.Callback callback) {
        super(callback);
        this.c = cjVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.e = true;
            callback.onContentChanged();
        } finally {
            this.e = false;
        }
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.d.dispatchKeyEvent(keyEvent) : this.c.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x003c  */
    @Override // defpackage.dh, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L69
            cj r0 = r6.c
            int r2 = r7.getKeyCode()
            bk r3 = r0.b()
            r4 = 0
            if (r3 == 0) goto L3c
            ct r3 = (defpackage.ct) r3
            cs r3 = r3.f
            if (r3 != 0) goto L1b
            goto L3c
        L1b:
            if (r7 == 0) goto L22
            int r5 = r7.getDeviceId()
            goto L23
        L22:
            r5 = -1
        L23:
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L2f
            r5 = r1
            goto L30
        L2f:
            r5 = r4
        L30:
            du r3 = r3.a
            r3.setQwertyMode(r5)
            boolean r2 = r3.performShortcut(r2, r7, r4)
            if (r2 == 0) goto L3c
            goto L69
        L3c:
            ch r2 = r0.B
            if (r2 == 0) goto L51
            int r3 = r7.getKeyCode()
            boolean r2 = r0.O(r2, r3, r7)
            if (r2 == 0) goto L51
            ch r7 = r0.B
            if (r7 == 0) goto L69
            r7.l = r1
            goto L69
        L51:
            ch r2 = r0.B
            if (r2 != 0) goto L68
            ch r2 = r0.N(r4)
            r0.J(r2, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r0.O(r2, r3, r7)
            r2.k = r4
            if (r7 != 0) goto L69
        L68:
            return r4
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.e) {
            this.d.onContentChanged();
        }
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof du)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        bk bkVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (bkVarB = this.c.b()) != null) {
            bkVarB.b(true);
        }
        return true;
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.b) {
            this.d.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        cj cjVar = this.c;
        if (i == 108) {
            bk bkVarB = cjVar.b();
            if (bkVarB != null) {
                bkVarB.b(false);
                return;
            }
            return;
        }
        if (i == 0) {
            ch chVarN = cjVar.N(0);
            if (chVarN.m) {
                cjVar.z(chVarN, false);
            }
        }
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        du duVar = menu instanceof du ? (du) menu : null;
        if (i == 0) {
            if (duVar == null) {
                return false;
            }
            i = 0;
        }
        if (duVar != null) {
            duVar.j = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (duVar != null) {
            duVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        du duVar = this.c.N(0).h;
        if (duVar != null) {
            super.onProvideKeyboardShortcuts(list, duVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.dh, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cj cjVar = this.c;
        if (!cjVar.t || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        da daVar = new da(cjVar.k, callback);
        cy cyVar = cjVar.p;
        if (cyVar != null) {
            cyVar.f();
        }
        ca caVar = new ca(cjVar, daVar);
        bk bkVarB = cjVar.b();
        if (bkVarB != null) {
            ct ctVar = (ct) bkVarB;
            cs csVar = ctVar.f;
            if (csVar != null) {
                csVar.f();
            }
            ctVar.b.k(false);
            ctVar.d.i();
            cs csVar2 = new cs(ctVar, ctVar.d.getContext(), caVar);
            du duVar = csVar2.a;
            duVar.s();
            try {
                if (csVar2.b.c(csVar2, duVar)) {
                    ctVar.f = csVar2;
                    csVar2.g();
                    ctVar.d.h(csVar2);
                    ctVar.g(true);
                } else {
                    csVar2 = null;
                }
                cjVar.p = csVar2;
            } finally {
                csVar2.a.r();
            }
        }
        if (cjVar.p == null) {
            cjVar.B();
            cy cyVar2 = cjVar.p;
            if (cyVar2 != null) {
                cyVar2.f();
            }
            if (cjVar.q == null) {
                if (cjVar.z) {
                    TypedValue typedValue = new TypedValue();
                    Context context = cjVar.k;
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        lh lhVar = new lh(context, 0);
                        lhVar.getTheme().setTo(themeNewTheme);
                        context = lhVar;
                    }
                    cjVar.q = new ActionBarContextView(context);
                    cjVar.r = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    cjVar.r.setWindowLayoutType(2);
                    cjVar.r.setContentView(cjVar.q);
                    cjVar.r.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    cjVar.q.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    cjVar.r.setHeight(-2);
                    cjVar.s = new ac(cjVar, 5, null);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) cjVar.v.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(cjVar.s());
                        cjVar.q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (cjVar.q != null) {
                cjVar.B();
                cjVar.q.i();
                cz czVar = new cz(cjVar.q.getContext(), cjVar.q, caVar);
                if (caVar.c(czVar, czVar.a)) {
                    czVar.g();
                    cjVar.q.h(czVar);
                    cjVar.p = czVar;
                    if (cjVar.K()) {
                        cjVar.q.setAlpha(0.0f);
                        asv asvVarS = qv.s(cjVar.q);
                        asvVarS.P(1.0f);
                        cjVar.K = asvVarS;
                        cjVar.K.R(new by(cjVar));
                    } else {
                        cjVar.q.setAlpha(1.0f);
                        cjVar.q.setVisibility(0);
                        if (cjVar.q.getParent() instanceof View) {
                            View view = (View) cjVar.q.getParent();
                            int[] iArr = qv.a;
                            qk.j(view);
                        }
                    }
                    if (cjVar.r != null) {
                        cjVar.l.getDecorView().post(cjVar.s);
                    }
                } else {
                    cjVar.p = null;
                }
            }
            cjVar.F();
        }
        cjVar.F();
        cy cyVar3 = cjVar.p;
        if (cyVar3 != null) {
            return daVar.e(cyVar3);
        }
        return null;
    }
}
