package com.google.android.apps.tvsearch.results.activity.keyboard;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.layout.FocusListenerConstraintLayout;
import defpackage.a;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.aejl;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.cy;
import defpackage.de;
import defpackage.etb;
import defpackage.eup;
import defpackage.ewo;
import defpackage.exl;
import defpackage.eyy;
import defpackage.ffn;
import defpackage.fyq;
import defpackage.fyr;
import defpackage.gfr;
import defpackage.ghr;
import defpackage.gtu;
import defpackage.gzu;
import defpackage.hgu;
import defpackage.hgv;
import defpackage.hgx;
import defpackage.hhb;
import defpackage.hhd;
import defpackage.hyi;
import defpackage.jbd;
import defpackage.jru;
import defpackage.tt;
import defpackage.wgr;
import defpackage.wgs;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wiq;
import defpackage.wji;
import defpackage.wsv;
import defpackage.wsw;
import defpackage.wsx;
import defpackage.wsz;
import defpackage.wum;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wyo;
import defpackage.wzg;
import defpackage.xag;
import defpackage.zdv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyboardSearchActivity extends hgu implements wgt, wgr, wip {
    private hhd m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public KeyboardSearchActivity() {
        this.f.a(new hgv(this));
    }

    @Override // defpackage.hgu
    public final /* synthetic */ aeia D() {
        return new wji(this);
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        hhd hhdVar = this.m;
        if (hhdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return hhdVar;
    }

    public final void M() {
        Throwable th;
        if (this.m != null) {
            return;
        }
        if (!this.o) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.s && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        wvx wvxVarF = wzg.f("CreateComponent", wwb.a, true);
        try {
            cO().dN();
            wvxVarF.close();
            wvx wvxVarF2 = wzg.f("CreatePeer", wwb.a, true);
            try {
                try {
                    try {
                        Object objDN = cO().dN();
                        eup eupVar = ((etb) objDN).c;
                        ActivityManager activityManager = (ActivityManager) eupVar.V.a();
                        ahbt ahbtVar = (ahbt) eupVar.q.a();
                        aejl aejlVar = eupVar.fA;
                        gzu gzuVar = (gzu) eupVar.R.a();
                        fyr fyrVarAM = eupVar.aM();
                        ewo ewoVar = new ewo();
                        jru jruVarCB = eupVar.cB();
                        InputMethodManager inputMethodManagerV = eupVar.v();
                        exl exlVarC = eupVar.C();
                        aejl aejlVar2 = eupVar.fM;
                        gtu gtuVar = (gtu) eupVar.bE.a();
                        aejl aejlVar3 = eupVar.cp;
                        gfr gfrVar = (gfr) eupVar.cu.a();
                        eyy eyyVar = (eyy) eupVar.hl.a();
                        Activity activity = ((etb) objDN).a;
                        aeiv.a(activity);
                        if (!(activity instanceof KeyboardSearchActivity)) {
                            throw new IllegalStateException(a.w((tt) activity, hhd.class));
                        }
                        this.m = new hhd(activityManager, ahbtVar, aejlVar, gzuVar, fyrVarAM, ewoVar, jruVarCB, inputMethodManagerV, exlVarC, aejlVar2, gtuVar, aejlVar3, gfrVar, eyyVar, (KeyboardSearchActivity) activity, eupVar.mv, (jbd) eupVar.fj.a(), (ghr) eupVar.fg.a(), ((etb) objDN).f, eupVar.fi);
                        wvxVarF2.close();
                        this.m.a = this;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    try {
                        wvxVarF2.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                wvxVarF2.close();
                throw th;
            }
        } finally {
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.p;
        }
        xag.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.gf, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.p = context;
        xag.a(context);
        super.attachBaseContext(context);
        this.p = null;
    }

    @Override // defpackage.gf
    public final boolean cV() {
        wwt wwtVarL = this.n.l();
        try {
            boolean zCV = super.cV();
            wwtVarL.close();
            return zCV;
        } catch (Throwable th) {
            try {
                wwtVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eq, defpackage.bcl
    public final bcg ek() {
        if (this.r == null) {
            this.r = new wiq(this);
        }
        return this.r;
    }

    @Override // android.app.Activity
    public final void finish() {
        wwt wwtVarA = this.n.a();
        try {
            super.finish();
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, android.app.Activity
    public final void invalidateOptionsMenu() {
        wwt wwtVarI = wum.i();
        try {
            cT().e();
            wwtVarI.close();
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        wwt wwtVarU = this.n.u();
        try {
            super.onActivityResult(i, i2, intent);
            wwtVarU.close();
        } catch (Throwable th) {
            try {
                wwtVarU.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        wwt wwtVarB = this.n.b();
        try {
            super.onAttachedToWindow();
            wwtVarB.close();
        } catch (Throwable th) {
            try {
                wwtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    public final void onBackPressed() {
        cy cyVar;
        wwt wwtVarC = this.n.c();
        try {
            M();
            hhd hhdVar = this.m;
            de deVar = hhdVar.q;
            int iA = deVar.a() - 2;
            while (true) {
                if (iA < 0) {
                    cyVar = null;
                    break;
                }
                if (iA == deVar.c.size()) {
                    cyVar = deVar.f;
                    if (cyVar == null) {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    cyVar = (cy) deVar.c.get(iA);
                }
                cyVar.getClass();
                if (!agvy.c("loading-backstack-entry", cyVar.b())) {
                    break;
                } else {
                    iA--;
                }
            }
            if (cyVar != null) {
                int iA2 = cyVar.a();
                if (iA2 < 0) {
                    throw new IllegalArgumentException(a.b(iA2, "Bad id: "));
                }
                deVar.Z(null, iA2, 0);
            } else {
                hhdVar.f.finish();
            }
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.tt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        wwt wwtVarN = this.n.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
            wwtVarN.close();
        } catch (Throwable th) {
            try {
                wwtVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.hgu, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EditText editText;
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            M();
            final hhd hhdVar = this.m;
            hhdVar.t.a(hhdVar);
            KeyboardSearchActivity keyboardSearchActivity = hhdVar.f;
            Intent intent = keyboardSearchActivity.getIntent();
            intent.getClass();
            if (hhdVar.J(intent)) {
                ((zdv) hhd.b.d().q("com/google/android/apps/tvsearch/results/activity/keyboard/KeyboardSearchActivityPeer", "onCreate", 186, "KeyboardSearchActivityPeer.kt")).u("Failed intent error-checking");
                keyboardSearchActivity.finish();
            } else {
                hyi hyiVar = null;
                if (!((Boolean) hhdVar.j.a()).booleanValue()) {
                    ahal.e(hhdVar.c, null, 0, new hhb(hhdVar, null), 3);
                }
                keyboardSearchActivity.setContentView(R.layout.keyboard_search_main);
                View viewRequireViewById = keyboardSearchActivity.requireViewById(R.id.search_content_root);
                viewRequireViewById.getClass();
                FocusListenerConstraintLayout focusListenerConstraintLayout = (FocusListenerConstraintLayout) viewRequireViewById;
                focusListenerConstraintLayout.h = new hgx(hhdVar);
                hhdVar.m = focusListenerConstraintLayout;
                Resources resources = keyboardSearchActivity.getResources();
                hhdVar.n = keyboardSearchActivity.requireViewById(R.id.keyboard_input_container);
                hhdVar.r = resources.getDimensionPixelSize(R.dimen.entry_bar_vertical_margin) + resources.getDimensionPixelSize(R.dimen.entry_bar_vertical_height);
                hhdVar.o = (EditText) keyboardSearchActivity.requireViewById(R.id.keyboard_input);
                EditText editText2 = hhdVar.o;
                if (editText2 == null) {
                    agvy.b("textEntry");
                    editText2 = null;
                }
                Context context = editText2.getContext();
                context.getClass();
                fyq fyqVar = hhdVar.d;
                InputMethodManager inputMethodManager = hhdVar.e;
                EditText editText3 = hhdVar.o;
                if (editText3 == null) {
                    agvy.b("textEntry");
                    editText = null;
                } else {
                    editText = editText3;
                }
                Object objA = hhdVar.g.a();
                objA.getClass();
                hhdVar.l = new hyi(null, context, fyqVar, false, inputMethodManager, editText, ((Boolean) objA).booleanValue());
                final EditText editText4 = hhdVar.o;
                if (editText4 == null) {
                    agvy.b("textEntry");
                    editText4 = null;
                }
                editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hgy
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        textView.getClass();
                        hhd hhdVar2 = hhdVar;
                        if (i == 3) {
                            hhdVar2.G();
                            hhdVar2.H((EditText) textView);
                            return true;
                        }
                        if (i != 0 || keyEvent == null) {
                            return false;
                        }
                        if (keyEvent.getDeviceId() >= 0) {
                            if (keyEvent.getAction() != 0) {
                                return false;
                            }
                            hhdVar2.G();
                            hhdVar2.H((EditText) textView);
                            return true;
                        }
                        hrw hrwVarF = hhdVar2.F();
                        if (true != (hrwVarF instanceof bq)) {
                            hrwVarF = null;
                        }
                        View view = hrwVarF != null ? hrwVarF.R : null;
                        if (view == null) {
                            return false;
                        }
                        view.requestFocus();
                        return true;
                    }
                });
                editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hgz
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        if (z) {
                            return;
                        }
                        hhdVar.G();
                    }
                });
                editText4.setPrivateImeOptions("escapeNorth");
                hyi hyiVar2 = hhdVar.l;
                if (hyiVar2 == null) {
                    agvy.b("keyboardTextChangedListener");
                } else {
                    hyiVar = hyiVar2;
                }
                editText4.addTextChangedListener(hyiVar);
                editText4.setOnClickListener(new View.OnClickListener() { // from class: hha
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final EditText editText5 = editText4;
                        final int selectionStart = editText5.getSelectionStart();
                        Looper looperMyLooper = Looper.myLooper();
                        if (looperMyLooper == null) {
                            looperMyLooper = Looper.getMainLooper();
                        }
                        hhd hhdVar2 = hhdVar;
                        hhdVar2.e.showSoftInput(view, 2, new ResultReceiver(new Handler(looperMyLooper)) { // from class: com.google.android.apps.tvsearch.results.activity.keyboard.KeyboardSearchActivityPeer$contentSetup$2$3$1
                            @Override // android.os.ResultReceiver
                            protected final void onReceiveResult(int i, Bundle bundle2) {
                                super.onReceiveResult(i, bundle2);
                                editText5.setSelection(selectionStart);
                            }
                        });
                    }
                });
                hhdVar.k = (ViewGroup) keyboardSearchActivity.requireViewById(R.id.fullscreen_results_container);
            }
            this.o = false;
            wszVar.o();
            ((wsx) wwtVarV).a.t();
        } finally {
        }
    }

    @Override // defpackage.tt, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        wwt wwtVarW = this.n.w();
        try {
            super.onCreatePanelMenu(i, menu);
            wwtVarW.close();
            return true;
        } catch (Throwable th) {
            try {
                wwtVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.hgu, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        wwt wwtVarD = this.n.d();
        try {
            super.onDestroy();
            M();
            hhd hhdVar = this.m;
            hhdVar.t.d();
            hhdVar.u.b(hhdVar.f);
            EditText editText = hhdVar.o;
            hyi hyiVar = null;
            if (editText == null) {
                agvy.b("textEntry");
                editText = null;
            }
            hyi hyiVar2 = hhdVar.l;
            if (hyiVar2 == null) {
                agvy.b("keyboardTextChangedListener");
            } else {
                hyiVar = hyiVar2;
            }
            editText.removeTextChangedListener(hyiVar);
            this.s = true;
            wsz.p(((wsw) wwtVarD).a);
        } catch (Throwable th) {
            try {
                wsz.p(((wsw) wwtVarD).a);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        wwt wwtVarE = this.n.e(intent);
        try {
            super.onNewIntent(intent);
            M();
            hhd hhdVar = this.m;
            intent.getClass();
            if (hhdVar.J(intent)) {
                ((zdv) hhd.b.d().q("com/google/android/apps/tvsearch/results/activity/keyboard/KeyboardSearchActivityPeer", "onNewIntent", 221, "KeyboardSearchActivityPeer.kt")).u("Failed intent error-checking");
                hhdVar.f.finish();
            } else {
                hhdVar.f.setIntent(intent);
                hhdVar.I(intent);
            }
            ((wsx) wwtVarE).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarE).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        wwt wwtVarY = this.n.y();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            wwtVarY.close();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            try {
                wwtVarY.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onPause() {
        wwt wwtVarF = this.n.f();
        try {
            super.onPause();
            M();
            ((ffn) this.m.i.a()).N();
            wsz wszVar = ((wsv) wwtVarF).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarF).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        wwt wwtVarZ = this.n.z();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            wwtVarZ.close();
        } catch (Throwable th) {
            try {
                wwtVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        wwt wwtVarA = this.n.A();
        try {
            super.onPostCreate(bundle);
            M();
            hhd hhdVar = this.m;
            KeyboardSearchActivity keyboardSearchActivity = hhdVar.f;
            Intent intent = keyboardSearchActivity.getIntent();
            intent.getClass();
            hhdVar.I(intent);
            hhdVar.u.a(keyboardSearchActivity, hhdVar.p);
            ((wsx) wwtVarA).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarA).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onPostResume() {
        wwt wwtVarG = this.n.g();
        try {
            super.onPostResume();
            wwtVarG.close();
        } catch (Throwable th) {
            try {
                wwtVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        wwt wwtVarI = wum.i();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            wwtVarI.close();
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        wwt wwtVarN = this.n.n("onRequestPermissionsResult", null);
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            wwtVarN.close();
        } catch (Throwable th) {
            try {
                wwtVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        wwt wwtVarH = this.n.h();
        try {
            super.onRestart();
            ((wsx) wwtVarH).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarH).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onResume() {
        wwt wwtVarI = this.n.i();
        try {
            super.onResume();
            M();
            ((ffn) this.m.i.a()).O();
            ((wsx) wwtVarI).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarI).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        wwt wwtVarB = this.n.B();
        try {
            super.onSaveInstanceState(bundle);
            wsz wszVar = ((wsv) wwtVarB).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarB).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStart() {
        wwt wwtVarJ = this.n.j();
        try {
            super.onStart();
            M();
            hhd hhdVar = this.m;
            hhdVar.s = true;
            ((ffn) hhdVar.i.a()).P();
            ((wsx) wwtVarJ).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarJ).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStop() {
        wwt wwtVarK = this.n.k();
        try {
            super.onStop();
            M();
            hhd hhdVar = this.m;
            hhdVar.s = false;
            ((ffn) hhdVar.i.a()).Q(true);
            wsz wszVar = ((wsv) wwtVarK).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarK).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        wwt wwtVarM = this.n.m();
        try {
            super.onUserInteraction();
            wwtVarM.close();
        } catch (Throwable th) {
            try {
                wwtVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (wgs.a(intent, getApplicationContext())) {
            wyo.k(intent);
        }
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (wgs.a(intent, getApplicationContext())) {
            wyo.k(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.gf
    protected final void cW() {
    }

    @Override // defpackage.gf
    protected final void cX() {
    }
}
