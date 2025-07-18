package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ewp extends ContextThemeWrapper implements Window.Callback, KeyEvent.Callback, ComponentCallbacks2, jpg {
    public boolean a;
    public exg b;
    public exh c;
    public Intent d;
    private jpl e;

    @Override // defpackage.jpg
    public final boolean A() {
        return this.a;
    }

    @Override // defpackage.jpg
    public final void D() {
        if (!this.a) {
            l();
        }
        if (this.a) {
            return;
        }
        n();
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        exb exbVar = this.b.b;
        return keyEvent.dispatch(this, exbVar != null ? exbVar.getKeyDispatcherState() : null, this);
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void e() {
        exh exhVar = this.c;
        if (exhVar != null) {
            exhVar.i();
        }
    }

    @Override // defpackage.jpg
    public void eA(Context context, exh exhVar, jpl jplVar, Intent intent) {
        attachBaseContext(context);
        this.c = exhVar;
        this.e = jplVar;
        this.d = intent;
        setTheme(R.style.Theme_Canvas_Search_Global);
        exg exgVar = new exg(this);
        this.b = exgVar;
        exgVar.setCallback(this);
    }

    public final View eB(int i) {
        View viewFindViewById = this.b.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this HoverActivity");
    }

    @Override // defpackage.jpg
    public final exg eC() {
        return this.b;
    }

    public final void eD() {
        this.a = true;
        exh exhVar = this.c;
        if (exhVar != null) {
            exhVar.g();
        }
    }

    public void f() {
        eD();
    }

    @Override // defpackage.jpg
    public final void i() {
        eD();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = this.b.e;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean onCreatePanelMenu(int i, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ View onCreatePanelView(int i) {
        return null;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4 || !keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        f();
        return true;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean onMenuOpened(int i, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean onPreparePanel(int i, View view, Menu menu) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.jpg
    public final void p() {
        B();
    }

    @Override // defpackage.jpg
    public final void q() {
        g();
        this.b.e = true;
    }

    @Override // defpackage.jpg
    public final void r() {
        h();
    }

    @Override // defpackage.jpg
    public final void s(Intent intent) {
        j(intent);
    }

    @Override // defpackage.jpg
    public final void t() {
        ViewGroup decorView = this.b.getDecorView();
        ((WindowManager.LayoutParams) decorView.getLayoutParams()).flags |= 8;
        if (decorView.getParent() != null) {
            this.e.f(decorView, decorView.getLayoutParams());
        }
        k();
    }

    @Override // defpackage.jpg
    public final void u() {
        C();
    }

    @Override // defpackage.jpg
    public final void v() {
        m();
        ViewGroup decorView = this.b.getDecorView();
        int i = ((WindowManager.LayoutParams) decorView.getLayoutParams()).flags;
        if ((i & 8) > 0) {
            ((WindowManager.LayoutParams) decorView.getLayoutParams()).flags = i & (-9);
            this.e.f(decorView, decorView.getLayoutParams());
        }
    }

    @Override // defpackage.jpg
    public final void w() {
        n();
    }

    @Override // defpackage.jpg
    public final void x() {
        o();
    }

    public final void y() {
        exh exhVar = this.c;
        if (exhVar != null) {
            exhVar.k();
        }
    }

    public final void z() {
        exh exhVar = this.c;
        if (exhVar != null) {
            exhVar.m();
        }
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return null;
    }

    protected void B() {
    }

    protected void C() {
    }

    protected void g() {
    }

    protected void h() {
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void o() {
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    protected void j(Intent intent) {
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // android.view.Window.Callback
    public final /* synthetic */ void onPanelClosed(int i, Menu menu) {
    }
}
