package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bs extends t {
    private bv p;

    public bs() {
        J().d("androidx:appcompat", new ab(this, 2));
        h(new br(this, 0));
    }

    @Override // defpackage.kk, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        f().d(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:432:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void attachBaseContext(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        e();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.bh, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        e();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final bk e() {
        return f().b();
    }

    public final bv f() {
        if (this.p == null) {
            int i = bv.b;
            this.p = new cj(this, null, this);
        }
        return this.p;
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return f().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cj cjVar = (cj) f();
        if (cjVar.n == null) {
            cjVar.D();
            bk bkVar = cjVar.m;
            cjVar.n = new de(bkVar != null ? bkVar.a() : cjVar.k);
        }
        return cjVar.n;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        f().f();
    }

    @Override // defpackage.kk, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, PackageManager.NameNotFoundException, IllegalArgumentException {
        bk bkVarB;
        super.onConfigurationChanged(configuration);
        cj cjVar = (cj) f();
        if (cjVar.w && cjVar.u && (bkVarB = cjVar.b()) != null) {
            ct ctVar = (ct) bkVarB;
            ii.I(ctVar.a);
            ctVar.k();
        }
        Context context = cjVar.k;
        fm.d().e(context);
        cjVar.E = new Configuration(context.getResources().getConfiguration());
        cjVar.P(false, false);
    }

    @Override // defpackage.t, android.app.Activity
    protected final void onDestroy() throws Exception {
        super.onDestroy();
        f().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.t, defpackage.kk, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentA;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        bk bkVarE = e();
        if (menuItem.getItemId() != 16908332 || bkVarE == null || (((ct) bkVarE).p.b & 4) == 0 || (intentA = ii.A(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentA)) {
            navigateUpTo(intentA);
            return true;
        }
        ne neVar = new ne(this);
        Intent intentA2 = ii.A(this);
        if (intentA2 == null) {
            intentA2 = ii.A(this);
        }
        if (intentA2 != null) {
            ComponentName component = intentA2.getComponent();
            if (component == null) {
                component = intentA2.resolveActivity(neVar.b.getPackageManager());
            }
            ArrayList arrayList = neVar.a;
            int size = arrayList.size();
            try {
                Context context = neVar.b;
                for (Intent intentB = ii.B(context, component); intentB != null; intentB = ii.B(context, intentB.getComponent())) {
                    arrayList.add(size, intentB);
                }
                arrayList.add(intentA2);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        ArrayList arrayList2 = neVar.a;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        neVar.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((cj) f()).C();
    }

    @Override // defpackage.t, android.app.Activity
    protected final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        bk bkVarB = ((cj) f()).b();
        if (bkVarB != null) {
            bkVarB.e(true);
        }
    }

    @Override // defpackage.t, android.app.Activity
    protected final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        super.onStart();
        ((cj) f()).P(true, false);
    }

    @Override // defpackage.t, android.app.Activity
    protected final void onStop() {
        super.onStop();
        f().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        f().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        e();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.kk, android.app.Activity
    public final void setContentView(int i) {
        j();
        f().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((cj) f()).F = i;
    }

    @Override // defpackage.kk, android.app.Activity
    public final void setContentView(View view) {
        j();
        f().k(view);
    }

    @Override // defpackage.kk, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        f().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
