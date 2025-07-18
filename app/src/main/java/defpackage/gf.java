package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gf extends bw implements gg, abq {
    private gl l;

    public gf() {
        this.g.c.a("androidx:appcompat", new gd(this));
        this.f.a(new ge(this));
    }

    @Override // defpackage.tt, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        dl();
        cT().c(view, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:432:0x02e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [org.xmlpull.v1.XmlSerializer] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void attachBaseContext(final android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf.attachBaseContext(android.content.Context):void");
    }

    @Override // defpackage.abq
    public final Intent cS() {
        return aba.a(this);
    }

    public final gl cT() {
        if (this.l == null) {
            int i = gl.b;
            this.l = new hf(this, null, this, this);
        }
        return this.l;
    }

    public boolean cV() {
        Intent intentA = aba.a(this);
        if (intentA == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentA)) {
            navigateUpTo(intentA);
            return true;
        }
        abr abrVar = new abr(this);
        Intent intentCS = cS();
        if (intentCS == null) {
            intentCS = aba.a(this);
        }
        if (intentCS != null) {
            ComponentName component = intentCS.getComponent();
            if (component == null) {
                component = intentCS.resolveActivity(abrVar.b.getPackageManager());
            }
            ArrayList arrayList = abrVar.a;
            int size = arrayList.size();
            try {
                Context context = abrVar.b;
                for (Intent intentB = aba.b(context, component); intentB != null; intentB = aba.b(context, intentB.getComponent())) {
                    arrayList.add(size, intentB);
                }
                arrayList.add(intentCS);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        ArrayList arrayList2 = abrVar.a;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        abrVar.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        hf hfVar = (hf) cT();
        hfVar.B();
        fs fsVar = hfVar.n;
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.eq, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        hf hfVar = (hf) cT();
        hfVar.B();
        fs fsVar = hfVar.n;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return cT().b(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        hf hfVar = (hf) cT();
        if (hfVar.o == null) {
            hfVar.B();
            fs fsVar = hfVar.n;
            hfVar.o = new ip(fsVar != null ? fsVar.a() : hfVar.k);
        }
        return hfVar.o;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        cT().e();
    }

    @Override // defpackage.tt, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hf hfVar = (hf) cT();
        if (hfVar.y && hfVar.w) {
            hfVar.B();
            fs fsVar = hfVar.n;
            if (fsVar != null) {
                hr hrVar = (hr) fsVar;
                hrVar.m(ih.b(hrVar.a));
            }
        }
        Context context = hfVar.k;
        ll.d().e(context);
        hfVar.G = new Configuration(context.getResources().getConfiguration());
        hfVar.J(false, false);
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        cT().f();
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        hf hfVar = (hf) cT();
        hfVar.B();
        fs fsVar = hfVar.n;
        if (menuItem.getItemId() != 16908332 || fsVar == null || (((hr) fsVar).d.a() & 4) == 0) {
            return false;
        }
        return cV();
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((hf) cT()).A();
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        hf hfVar = (hf) cT();
        hfVar.B();
        fs fsVar = hfVar.n;
        if (fsVar != null) {
            fsVar.e(true);
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((hf) cT()).J(true, false);
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onStop() {
        super.onStop();
        cT().g();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        cT().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        hf hfVar = (hf) cT();
        hfVar.B();
        fs fsVar = hfVar.n;
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.tt, android.app.Activity
    public final void setContentView(int i) {
        dl();
        cT().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((hf) cT()).H = i;
    }

    @Override // defpackage.tt, android.app.Activity
    public final void setContentView(View view) {
        dl();
        cT().j(view);
    }

    @Override // defpackage.tt, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        dl();
        cT().k(view, layoutParams);
    }

    protected void cW() {
    }

    protected void cX() {
    }

    @Override // defpackage.gg
    public void cY() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.gg
    public void cU(ij ijVar) {
    }
}
