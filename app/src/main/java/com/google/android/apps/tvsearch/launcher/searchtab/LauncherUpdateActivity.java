package com.google.android.apps.tvsearch.launcher.searchtab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.abnb;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.bds;
import defpackage.bet;
import defpackage.beu;
import defpackage.etb;
import defpackage.eup;
import defpackage.ffp;
import defpackage.gbf;
import defpackage.gbg;
import defpackage.gbn;
import defpackage.gbo;
import defpackage.gfr;
import defpackage.ghr;
import defpackage.gmc;
import defpackage.gmd;
import defpackage.gtu;
import defpackage.hye;
import defpackage.rpm;
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

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LauncherUpdateActivity extends gbf implements wgt, wgr, wip {
    private gbo m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public LauncherUpdateActivity() {
        this.f.a(new gbg(this));
    }

    @Override // defpackage.gbf
    public final /* synthetic */ aeia D() {
        return new wji(this);
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        gbo gboVar = this.m;
        if (gboVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return gboVar;
    }

    public final void M() throws Throwable {
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
                        Activity activity = ((etb) objDN).a;
                        aeiv.a(activity);
                        if (!(activity instanceof LauncherUpdateActivity)) {
                            throw new IllegalStateException(a.w((tt) activity, gbo.class));
                        }
                        LauncherUpdateActivity launcherUpdateActivity = (LauncherUpdateActivity) activity;
                        eup eupVar = ((etb) objDN).c;
                        this.m = new gbo(launcherUpdateActivity, (ahbt) eupVar.q.a(), eupVar.fT, eupVar.fA, eupVar.aM(), eupVar.v(), eupVar.C(), (ffp) eupVar.by.a(), eupVar.fM, (gtu) eupVar.bE.a(), eupVar.cp, (gfr) eupVar.cu.a(), eupVar.mv, (gmd) eupVar.eV.a(), eupVar.t(), (ghr) eupVar.fg.a());
                        wvxVarF2.close();
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
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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

    @Override // defpackage.tt, defpackage.bbz
    public final bet em() {
        beu beuVar = new beu(super.em());
        beuVar.b(bds.c, new Bundle());
        return beuVar;
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
        wwt wwtVarC = this.n.c();
        try {
            this.j.a.c();
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

    @Override // defpackage.gbf, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            M();
            final gbo gboVar = this.m;
            gmd gmdVar = gboVar.o;
            gmdVar.c();
            hye hyeVar = null;
            gboVar.m.b(rpm.cu(), null, null);
            gmdVar.l(gmc.R);
            LauncherUpdateActivity launcherUpdateActivity = gboVar.b;
            launcherUpdateActivity.setContentView(R.layout.launcher_update);
            gboVar.u = (ViewGroup) launcherUpdateActivity.requireViewById(R.id.launcher_update_root);
            ViewGroup viewGroup = gboVar.u;
            if (viewGroup == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup = null;
            }
            View viewRequireViewById = viewGroup.requireViewById(R.id.action);
            viewRequireViewById.getClass();
            final TextView textView = (TextView) viewRequireViewById;
            textView.setOnClickListener(new View.OnClickListener() { // from class: gbh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    TextView textView2 = textView;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, "scaleX", 1.0f, 0.9f);
                    objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    objectAnimatorOfFloat.setRepeatCount(1);
                    objectAnimatorOfFloat.setRepeatMode(2);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, "scaleY", 1.0f, 0.9f);
                    objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    objectAnimatorOfFloat2.setRepeatCount(1);
                    objectAnimatorOfFloat2.setRepeatMode(2);
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.tv.launcherx"));
                    gbo gboVar2 = gboVar;
                    gboVar2.h.a(intent, new gbl(gboVar2));
                }
            });
            ViewGroup viewGroup2 = gboVar.u;
            if (viewGroup2 == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup2 = null;
            }
            View viewRequireViewById2 = viewGroup2.requireViewById(R.id.action);
            viewRequireViewById2.getClass();
            Resources resources = launcherUpdateActivity.getResources();
            final int color = resources.getColor(R.color.suggestion_chip_bg_focused_color, null);
            final int color2 = resources.getColor(R.color.G900, null);
            final float dimension = resources.getDimension(R.dimen.suggestion_chip_height);
            final int color3 = resources.getColor(R.color.suggestion_chip_bg_color, null);
            final int color4 = resources.getColor(R.color.G200, null);
            final float dimension2 = resources.getDimension(R.dimen.suggestion_chip_unfocused_height);
            int dimension3 = (int) resources.getDimension(R.dimen.suggestion_chip_margin);
            final float dimension4 = resources.getDimension(R.dimen.s3v3_text_size);
            final float f = (dimension - dimension2) / 2.0f;
            final float f2 = dimension3 - f;
            ((TextView) viewRequireViewById2).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gbi
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.getClass();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Drawable background = view.getBackground();
                    background.getClass();
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    if (z) {
                        gradientDrawable.setColor(color);
                    } else {
                        gradientDrawable.setColor(color3);
                    }
                    float f3 = dimension2;
                    float f4 = dimension;
                    float f5 = f2;
                    if (true == z) {
                        f3 = f4;
                    }
                    gradientDrawable.setGradientRadius(f3 / 2.0f);
                    int i = z ? (int) f : 0;
                    float f6 = dimension4;
                    marginLayoutParams.height = (int) f3;
                    int i2 = ((int) f5) + i;
                    marginLayoutParams.setMarginStart(i2);
                    marginLayoutParams.setMarginEnd(i2);
                    view.getClass();
                    TextView textView2 = (TextView) view;
                    textView2.setLayoutParams(marginLayoutParams);
                    if (z) {
                        int i3 = color2;
                        textView2.setTextSize(0, f6 * 1.1f);
                        textView2.setTextColor(i3);
                    } else {
                        int i4 = color4;
                        textView2.setTextSize(0, f6);
                        textView2.setTextColor(i4);
                    }
                }
            });
            InputMethodManager inputMethodManager = gboVar.g;
            LayoutInflater layoutInflater = gboVar.p;
            ViewGroup viewGroup3 = gboVar.u;
            if (viewGroup3 == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup3 = null;
            }
            gboVar.r = new hye(inputMethodManager, layoutInflater, viewGroup3);
            ViewGroup viewGroup4 = gboVar.u;
            if (viewGroup4 == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup4 = null;
            }
            hye hyeVar2 = gboVar.r;
            if (hyeVar2 == null) {
                agvy.b("keyboardSearchBar");
                hyeVar2 = null;
            }
            viewGroup4.addView(hyeVar2.d);
            hye hyeVar3 = gboVar.r;
            if (hyeVar3 == null) {
                agvy.b("keyboardSearchBar");
            } else {
                hyeVar = hyeVar3;
            }
            final EditText editText = hyeVar.f;
            editText.setOnClickListener(new View.OnClickListener() { // from class: gbj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final EditText editText2 = editText;
                    final int selectionStart = editText2.getSelectionStart();
                    final gbo gboVar2 = gboVar;
                    gboVar2.g.showSoftInput(view, 2, new ResultReceiver() { // from class: com.google.android.apps.tvsearch.launcher.searchtab.LauncherUpdateActivityPeer$initKeyboardInputListeners$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(null);
                        }

                        @Override // android.os.ResultReceiver
                        protected final void onReceiveResult(int i, Bundle bundle2) {
                            super.onReceiveResult(i, bundle2);
                            EditText editText3 = editText2;
                            int i2 = selectionStart;
                            editText3.setSelection(i2);
                            hye hyeVar4 = gboVar2.r;
                            if (hyeVar4 == null) {
                                agvy.b("keyboardSearchBar");
                                hyeVar4 = null;
                            }
                            hyeVar4.e.end();
                            hyeVar4.g.setImageResource(R.drawable.product_logo_assistant_color_24);
                            EditText editText4 = hyeVar4.f;
                            editText4.setCursorVisible(true);
                            editText4.setHintTextColor(hyeVar4.c);
                            editText3.setSelection(i2);
                        }
                    });
                    ahal.e(gboVar2.c, null, 0, new gbm(gboVar2, null), 3);
                }
            });
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gbk
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                    if (i == 3) {
                        textView2.getClass();
                        String string = ((EditText) textView2).getText().toString();
                        if (string.length() > 0) {
                            gbo gboVar2 = gboVar;
                            if (((Boolean) gboVar2.e.a()).booleanValue()) {
                                ((gfn) gboVar2.l.a()).b(rpm.t()).b().c();
                            }
                            if (((Boolean) gboVar2.j.a()).booleanValue()) {
                                ((gfn) gboVar2.l.a()).b(rpm.bv()).b().c();
                            } else {
                                gboVar2.m.b(rpm.bv(), null, null);
                            }
                            gboVar2.m.a(rpm.ay(), abqb.OK, null, null);
                            gboVar2.q.E(4);
                            gboVar2.i.o(string, jlv.INVOCATION_TYPE_TEXT_SEARCH);
                            gboVar2.a(string);
                            return true;
                        }
                    }
                    return false;
                }
            });
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

    @Override // defpackage.gbf, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        wwt wwtVarD = this.n.d();
        try {
            super.onDestroy();
            M();
            gbo gboVar = this.m;
            ahal.e(gboVar.c, null, 0, new gbn(gboVar, null), 3);
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
            gbo gboVar = this.m;
            intent.getClass();
            gboVar.b(intent);
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
            gbo gboVar = this.m;
            gboVar.q.y(abnb.ZERO_STATE_SEARCH_TAB);
            ViewGroup viewGroup = gboVar.u;
            hye hyeVar = null;
            if (viewGroup == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup = null;
            }
            View viewRequireViewById = viewGroup.requireViewById(R.id.on_search_loading);
            viewRequireViewById.getClass();
            if (viewRequireViewById.getVisibility() == 0) {
                gboVar.b.finish();
            }
            ViewGroup viewGroup2 = gboVar.u;
            if (viewGroup2 == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup2 = null;
            }
            viewGroup2.requireViewById(R.id.on_search_loading).setVisibility(8);
            ViewGroup viewGroup3 = gboVar.u;
            if (viewGroup3 == null) {
                agvy.b("launcherUpdateRoot");
                viewGroup3 = null;
            }
            ((TextView) viewGroup3.requireViewById(R.id.on_search_loading_message)).setText(gboVar.b.getResources().getString(R.string.assistant_empty_prompt));
            hye hyeVar2 = gboVar.r;
            if (hyeVar2 == null) {
                agvy.b("keyboardSearchBar");
            } else {
                hyeVar = hyeVar2;
            }
            hyeVar.a();
            hyeVar.g.setImageResource(R.drawable.quantum_ic_google_assistant_white_24);
            hyeVar.f.setHintTextColor(hyeVar.b);
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
            gbo gboVar = this.m;
            gboVar.b(gboVar.b.getIntent());
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
            this.m.q.x(abnb.ZERO_STATE_SEARCH_TAB);
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
            this.m.q.w(abnb.ZERO_STATE_SEARCH_TAB);
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
            this.m.q.v("", abnb.ZERO_STATE_SEARCH_TAB);
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
