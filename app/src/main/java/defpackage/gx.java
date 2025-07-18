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
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class gx extends is {
    public boolean a;
    public boolean b;
    final /* synthetic */ hf c;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(hf hfVar, Window.Callback callback) {
        super(callback);
        this.c = hfVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.e = true;
            callback.onContentChanged();
        } finally {
            this.e = false;
        }
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.d.dispatchKeyEvent(keyEvent) : this.c.E(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // defpackage.is, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6a
            hf r0 = r6.c
            int r2 = r7.getKeyCode()
            r0.B()
            fs r3 = r0.n
            r4 = 0
            if (r3 == 0) goto L3d
            hr r3 = (defpackage.hr) r3
            hq r3 = r3.g
            if (r3 != 0) goto L1c
            goto L3d
        L1c:
            if (r7 == 0) goto L23
            int r5 = r7.getDeviceId()
            goto L24
        L23:
            r5 = -1
        L24:
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L30
            r5 = r1
            goto L31
        L30:
            r5 = r4
        L31:
            jj r3 = r3.a
            r3.setQwertyMode(r5)
            boolean r2 = r3.performShortcut(r2, r7, r4)
            if (r2 == 0) goto L3d
            goto L6a
        L3d:
            hd r2 = r0.D
            if (r2 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r2 = r0.M(r2, r3, r7)
            if (r2 == 0) goto L52
            hd r7 = r0.D
            if (r7 == 0) goto L6a
            r7.l = r1
            goto L6a
        L52:
            hd r2 = r0.D
            if (r2 != 0) goto L69
            hd r2 = r0.L(r4)
            r0.H(r2, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r0.M(r2, r3, r7)
            r2.k = r4
            if (r7 != 0) goto L6a
        L69:
            return r4
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.e) {
            this.d.onContentChanged();
        }
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof jj)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        if (i == 108) {
            hf hfVar = this.c;
            hfVar.B();
            fs fsVar = hfVar.n;
            if (fsVar != null) {
                fsVar.b(true);
            }
        }
        return true;
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.d.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        hf hfVar = this.c;
        if (i == 108) {
            hfVar.B();
            fs fsVar = hfVar.n;
            if (fsVar != null) {
                fsVar.b(false);
                return;
            }
            return;
        }
        if (i == 0) {
            hd hdVarL = hfVar.L(0);
            if (hdVarL.m) {
                hfVar.x(hdVarL, false);
            }
        }
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        jj jjVar = menu instanceof jj ? (jj) menu : null;
        if (i == 0) {
            if (jjVar == null) {
                return false;
            }
            i = 0;
        }
        if (jjVar != null) {
            jjVar.l = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (jjVar != null) {
            jjVar.l = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        jj jjVar = this.c.L(0).h;
        if (jjVar != null) {
            this.d.onProvideKeyboardShortcuts(list, jjVar, i);
        } else {
            this.d.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.is, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        gg ggVar;
        gg ggVar2;
        hf hfVar = this.c;
        if (!hfVar.v || i != 0) {
            return this.d.onWindowStartingActionMode(callback, i);
        }
        il ilVar = new il(hfVar.k, callback);
        ij ijVar = hfVar.q;
        if (ijVar != null) {
            ijVar.f();
        }
        gu guVar = new gu(hfVar, ilVar);
        hfVar.B();
        fs fsVar = hfVar.n;
        if (fsVar != null) {
            hr hrVar = (hr) fsVar;
            hq hqVar = hrVar.g;
            if (hqVar != null) {
                hqVar.f();
            }
            hrVar.b.j(false);
            hrVar.e.i();
            hq hqVar2 = new hq(hrVar, hrVar.e.getContext(), guVar);
            jj jjVar = hqVar2.a;
            jjVar.q();
            try {
                if (hqVar2.b.c(hqVar2, jjVar)) {
                    hrVar.g = hqVar2;
                    hqVar2.g();
                    hrVar.e.g(hqVar2);
                    hrVar.g(true);
                } else {
                    hqVar2 = null;
                }
                hfVar.q = hqVar2;
                if (hfVar.q != null && (ggVar2 = hfVar.m) != null) {
                    ggVar2.cY();
                }
            } finally {
                hqVar2.a.p();
            }
        }
        if (hfVar.q == null) {
            hfVar.z();
            ij ijVar2 = hfVar.q;
            if (ijVar2 != null) {
                ijVar2.f();
            }
            if (hfVar.r == null) {
                if (hfVar.B) {
                    TypedValue typedValue = new TypedValue();
                    Context context = hfVar.k;
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        ve veVar = new ve(context, 0);
                        veVar.getTheme().setTo(themeNewTheme);
                        context = veVar;
                    }
                    hfVar.r = new ActionBarContextView(context);
                    hfVar.s = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    hfVar.s.setWindowLayoutType(2);
                    hfVar.s.setContentView(hfVar.r);
                    hfVar.s.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    hfVar.r.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    hfVar.s.setHeight(-2);
                    hfVar.t = new gq(hfVar);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) hfVar.x.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(hfVar.r());
                        hfVar.r = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (hfVar.r != null) {
                hfVar.z();
                hfVar.r.i();
                ik ikVar = new ik(hfVar.r.getContext(), hfVar.r, guVar);
                if (guVar.c(ikVar, ikVar.a)) {
                    ikVar.g();
                    hfVar.r.g(ikVar);
                    hfVar.q = ikVar;
                    if (hfVar.I()) {
                        hfVar.r.setAlpha(0.0f);
                        ahw ahwVarD = ahj.d(hfVar.r);
                        ahwVarD.b(1.0f);
                        hfVar.u = ahwVarD;
                        hfVar.u.d(new gr(hfVar));
                    } else {
                        hfVar.r.setAlpha(1.0f);
                        hfVar.r.setVisibility(0);
                        if (hfVar.r.getParent() instanceof View) {
                            View view = (View) hfVar.r.getParent();
                            int[] iArr = ahj.a;
                            aha.c(view);
                        }
                    }
                    if (hfVar.s != null) {
                        hfVar.l.getDecorView().post(hfVar.t);
                    }
                } else {
                    hfVar.q = null;
                }
            }
            if (hfVar.q != null && (ggVar = hfVar.m) != null) {
                ggVar.cY();
            }
            hfVar.D();
        }
        hfVar.D();
        ij ijVar3 = hfVar.q;
        if (ijVar3 != null) {
            return ilVar.e(ijVar3);
        }
        return null;
    }
}
