package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import com.google.android.tv.remote.service.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kk extends bh implements xf, yc, wy, abk, kv, aba, ld, ng, nh, az, ba, pr {
    private final cry a;
    private final CopyOnWriteArrayList b;
    private boolean c;
    private boolean d;
    private final cry e;
    public final lc h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final kj n;
    private final cih p;
    private asv q;
    private final awy r;
    public final ky g = new ky();
    public final bzt o = new bzt(new ac(this, 20));

    public kk() {
        awy awyVarG = wz.g(this);
        this.r = awyVarG;
        this.n = new kj(this);
        this.a = new csc(new kh(this, 1));
        new AtomicInteger();
        this.h = new lc();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        xc xcVar = this.f;
        if (xcVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = 0;
        xcVar.a(new kg(this, i));
        int i2 = 2;
        this.f.a(new kg(this, i2));
        this.f.a(new kg((Object) this, 3));
        awyVarG.j();
        xu.a(this);
        J().d("android:support:activity-result", new ab(this, 3));
        h(new br(this, i2));
        this.e = new csc(new kh(this, i));
        this.p = o();
    }

    public static final void k(kk kkVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!dnx.aB(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!dnx.aB(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.abk
    public final adx J() {
        return (adx) this.r.a;
    }

    @Override // defpackage.yc
    public final asv K() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        i();
        asv asvVar = this.q;
        asvVar.getClass();
        return asvVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.addContentView(view, layoutParams);
    }

    public final void g(oy oyVar) {
        oyVar.getClass();
        this.i.add(oyVar);
    }

    public final void h(kz kzVar) {
        ky kyVar = this.g;
        if (kyVar.b != null) {
            kzVar.a();
        }
        kyVar.a.add(kzVar);
    }

    public final void i() {
        if (this.q == null) {
            apl aplVar = (apl) getLastNonConfigurationInstance();
            if (aplVar != null) {
                this.q = (asv) aplVar.a;
            }
            if (this.q == null) {
                this.q = new asv((short[]) null);
            }
        }
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        qr.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        qr.e(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        xo.d(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        mo.A(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        wz.c(decorView6, this);
    }

    public final bao l() {
        return (bao) this.a.a();
    }

    @Override // defpackage.wy
    public final yf n() {
        yf yfVar = new yf((char[]) null);
        if (getApplication() != null) {
            yfVar.a(xy.a, getApplication());
        }
        yfVar.a(xu.a, this);
        yfVar.a(xu.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            yfVar.a(xu.c, extras);
        }
        return yfVar;
    }

    public final cih o() {
        return (cih) this.e.a();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.c(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((aaz) this.p.b).c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((oy) it.next()).a(configuration);
        }
    }

    @Override // defpackage.bh, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.r.k(bundle);
        ky kyVar = this.g;
        kyVar.b = this;
        Iterator it = kyVar.a.iterator();
        while (it.hasNext()) {
            ((kz) it.next()).a();
        }
        super.onCreate(bundle);
        int i = xq.a;
        qq.d(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.o.k(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.o.m(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.c) {
            return;
        }
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((oy) it.next()).a(new bbj(z));
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((oy) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.o.b).iterator();
        while (it.hasNext()) {
            ((am) ((byj) it.next()).a).t(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.d) {
            return;
        }
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((oy) it.next()).a(new bbj(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.o.l(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.h.c(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        apl aplVar;
        Object obj = this.q;
        if (obj == null && (aplVar = (apl) getLastNonConfigurationInstance()) != null) {
            obj = aplVar.a;
        }
        if (obj == null) {
            return null;
        }
        apl aplVar2 = new apl();
        aplVar2.a = obj;
        return aplVar2;
    }

    @Override // defpackage.bh, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        xc xcVar = this.f;
        if (xcVar instanceof xc) {
            xcVar.getClass();
            xcVar.d(xb.c);
        }
        super.onSaveInstanceState(bundle);
        this.r.l(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((oy) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void p(final cih cihVar) {
        this.f.a(new xd() { // from class: kf
            @Override // defpackage.xd
            public final void a(xf xfVar, xa xaVar) {
                if (xaVar == xa.ON_CREATE) {
                    cih cihVar2 = cihVar;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    cihVar2.f(onBackInvokedDispatcher);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        boolean zBooleanValue;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                zBooleanValue = Trace.isEnabled();
            } else {
                zBooleanValue = false;
                try {
                    if (qk.d == null) {
                        qk.c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                        qk.d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                    }
                    Method method = qk.d;
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, Long.valueOf(qk.c));
                    objInvoke.getClass();
                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                } catch (Exception e) {
                    if (e instanceof InvocationTargetException) {
                        Throwable cause = e.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            throw new RuntimeException(cause);
                        }
                        throw cause;
                    }
                    Log.v("Trace", b.c("isTagEnabled", "Unable to call ", " via reflection"), e);
                }
            }
            if (zBooleanValue) {
                qk.p("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            bao baoVarL = l();
            synchronized (baoVarL.c) {
                baoVarL.b = true;
                ?? r0 = baoVarL.d;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    ((ctj) it.next()).a();
                }
                r0.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.c = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.c = false;
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((oy) it.next()).a(new bbj(z));
            }
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.d = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.d = false;
            Iterator it = this.m.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((oy) it.next()).a(new bbj(z));
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
