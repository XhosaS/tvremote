package com.google.android.apps.tvsearch.results.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.media.MediaPlayer;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.layout.FocusListenerConstraintLayout;
import defpackage.ab;
import defpackage.abnb;
import defpackage.abqb;
import defpackage.agow;
import defpackage.agpc;
import defpackage.agpn;
import defpackage.agrd;
import defpackage.agum;
import defpackage.agvy;
import defpackage.agyv;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.ahdl;
import defpackage.bq;
import defpackage.bqs;
import defpackage.bw;
import defpackage.de;
import defpackage.dp;
import defpackage.ewd;
import defpackage.ewg;
import defpackage.ewi;
import defpackage.ewm;
import defpackage.ewo;
import defpackage.exj;
import defpackage.exk;
import defpackage.exl;
import defpackage.eyy;
import defpackage.ezb;
import defpackage.ezc;
import defpackage.far;
import defpackage.feq;
import defpackage.few;
import defpackage.fex;
import defpackage.ffl;
import defpackage.ffm;
import defpackage.ffn;
import defpackage.ffp;
import defpackage.fgt;
import defpackage.fyb;
import defpackage.gbw;
import defpackage.gfl;
import defpackage.gfn;
import defpackage.gfq;
import defpackage.gfr;
import defpackage.ghr;
import defpackage.gmb;
import defpackage.gmc;
import defpackage.gmd;
import defpackage.gmu;
import defpackage.gmw;
import defpackage.gnj;
import defpackage.gph;
import defpackage.gpx;
import defpackage.hcc;
import defpackage.heu;
import defpackage.hev;
import defpackage.hew;
import defpackage.hex;
import defpackage.hey;
import defpackage.hfb;
import defpackage.hfc;
import defpackage.hfd;
import defpackage.hfe;
import defpackage.hff;
import defpackage.hfg;
import defpackage.hfi;
import defpackage.hfo;
import defpackage.hgb;
import defpackage.hgc;
import defpackage.hgi;
import defpackage.hgj;
import defpackage.hgl;
import defpackage.hgm;
import defpackage.hgn;
import defpackage.hgo;
import defpackage.hgp;
import defpackage.hgq;
import defpackage.hgs;
import defpackage.hhh;
import defpackage.hhw;
import defpackage.hhz;
import defpackage.hia;
import defpackage.hjx;
import defpackage.hjy;
import defpackage.hka;
import defpackage.hkb;
import defpackage.hkn;
import defpackage.hkx;
import defpackage.hky;
import defpackage.hle;
import defpackage.hln;
import defpackage.hlx;
import defpackage.hml;
import defpackage.hmt;
import defpackage.hmu;
import defpackage.hmv;
import defpackage.hmx;
import defpackage.hmy;
import defpackage.hmz;
import defpackage.hna;
import defpackage.hqn;
import defpackage.hqq;
import defpackage.hqw;
import defpackage.hrw;
import defpackage.hsu;
import defpackage.htq;
import defpackage.hts;
import defpackage.htu;
import defpackage.huf;
import defpackage.iaj;
import defpackage.ikl;
import defpackage.iwk;
import defpackage.jby;
import defpackage.jca;
import defpackage.job;
import defpackage.jov;
import defpackage.jpr;
import defpackage.jrs;
import defpackage.jrv;
import defpackage.pan;
import defpackage.paq;
import defpackage.rpm;
import defpackage.rqs;
import defpackage.xoa;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zfc;
import defpackage.zr;
import defpackage.zyg;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchResultActivity extends hfi implements hka, few, ezb, ezc, hhh, hjy, ffm, jpr, huf {
    private static final hgi ac = new hgi();
    public static final zdy m = zdy.h("com/google/android/apps/tvsearch/results/activity/SearchResultActivity");
    public ffp A;
    public agow B;
    public gfr C;
    public gmd D;
    public zyg E;
    public Supplier F;
    public agow G;
    public hcc H;
    public fex I;
    public agow J;
    public agow K;
    public iwk L;
    public ghr M;
    public ffn N;
    public agow O;
    public gnj P;
    public jca Q;
    public boolean R;
    public ewg S;
    public FocusListenerConstraintLayout T;
    public hgp U;
    public boolean V;
    public eyy X;
    public iaj Y;
    public hjx Z;
    public fyb aa;
    public ewo ab;
    private boolean ad;
    private boolean af;
    private Handler ag;
    private boolean ah;
    private hfo ai;
    private MediaPlayer ak;
    private int am;
    private boolean an;
    private jrv ap;
    public AccessibilityManager n;
    public Supplier o;
    public Context p;
    public ahbt q;
    public ahbt r;
    public DisplayManager s;
    public agow t;
    public agow u;
    public gph v;
    public fgt w;
    public jrs x;
    public exl y;
    public agow z;
    private Runnable ae = new Runnable() { // from class: hge
        @Override // java.lang.Runnable
        public final void run() {
            SearchResultActivity searchResultActivity = this.a;
            searchResultActivity.R = true;
            if (searchResultActivity.aI()) {
                searchResultActivity.aF();
                if (searchResultActivity.B() || searchResultActivity.aH()) {
                    searchResultActivity.R = false;
                } else {
                    searchResultActivity.finish();
                }
            }
            if (searchResultActivity.isFinishing() || !searchResultActivity.R) {
                return;
            }
            if (!(searchResultActivity.M() instanceof hmy)) {
                searchResultActivity.finish();
                return;
            }
            if (searchResultActivity.aH()) {
                searchResultActivity.az(true);
            }
            searchResultActivity.R = false;
        }
    };
    public int W = 1;
    private final String aj = "searchActivityKey";
    private final hgm al = new hgm(this);
    private List ao = agrd.a;
    private final agpc aq = new agpn(new agum() { // from class: hgf
        @Override // defpackage.agum
        public final Object a() {
            View viewRequireViewById = this.a.requireViewById(R.id.compact_results_container);
            viewRequireViewById.getClass();
            return (MotionResultsFrame) viewRequireViewById;
        }
    });
    private final agpc ar = new agpn(new agum() { // from class: hgg
        @Override // defpackage.agum
        public final Object a() {
            SearchResultActivity searchResultActivity = this.a;
            if (searchResultActivity.ai() == gph.a) {
                searchResultActivity.getLayoutInflater().inflate(R.layout.fullscreen_results_container_amati, (ViewGroup) searchResultActivity.ar(), true);
            } else {
                searchResultActivity.getLayoutInflater().inflate(R.layout.fullscreen_results_container_watson, (ViewGroup) searchResultActivity.ar(), true);
            }
            View viewRequireViewById = searchResultActivity.ar().requireViewById(R.id.fullscreen_results_container);
            FrameLayout frameLayout = (FrameLayout) viewRequireViewById;
            searchResultActivity.ar().removeView(frameLayout);
            searchResultActivity.ar().addView(frameLayout, 0, frameLayout.getLayoutParams());
            if (searchResultActivity.aK().a()) {
                frameLayout.setBackground(searchResultActivity.getDrawable(R.drawable.search_pop_up_translucent_bg));
            }
            viewRequireViewById.getClass();
            return frameLayout;
        }
    });
    private final agpc as = new agpn(new agum() { // from class: hgh
        @Override // defpackage.agum
        public final Object a() {
            View viewRequireViewById = this.a.requireViewById(R.id.gradient_protection);
            viewRequireViewById.getClass();
            return viewRequireViewById;
        }
    });
    private final agpc at = new agpn(new agum() { // from class: hfq
        @Override // defpackage.agum
        public final Object a() {
            SearchResultActivity searchResultActivity = this.a;
            searchResultActivity.getLayoutInflater().inflate(R.layout.overlay_container, (ViewGroup) searchResultActivity.ar(), true);
            View viewRequireViewById = searchResultActivity.ar().requireViewById(R.id.overlay_container);
            ViewGroup viewGroup = (ViewGroup) viewRequireViewById;
            searchResultActivity.ar().bringChildToFront(viewGroup);
            viewRequireViewById.getClass();
            return viewGroup;
        }
    });
    private final agpc au = new agpn(new agum() { // from class: hfr
        @Override // defpackage.agum
        public final Object a() {
            SearchResultActivity searchResultActivity = this.a;
            searchResultActivity.getLayoutInflater().inflate(R.layout.preview_container, (ViewGroup) searchResultActivity.ar(), true);
            View viewRequireViewById = searchResultActivity.ar().requireViewById(R.id.preview_container);
            viewRequireViewById.getClass();
            return (ViewGroup) viewRequireViewById;
        }
    });
    private final agpc av = new agpn(new agum() { // from class: hfs
        @Override // defpackage.agum
        public final Object a() {
            View viewRequireViewById = this.a.requireViewById(R.id.suggestions_bar);
            viewRequireViewById.getClass();
            return viewRequireViewById;
        }
    });
    private final agpc aw = new agpn(new agum() { // from class: hft
        @Override // defpackage.agum
        public final Object a() {
            return new hex(this.a);
        }
    });

    private final View aO() {
        return (View) this.av.a();
    }

    private final WebView aP() {
        WebView webView = new WebView(ar().getContext());
        hhw.aE(webView);
        webView.setFocusable(false);
        return webView;
    }

    private final hex aQ() {
        return (hex) this.aw.a();
    }

    private final hmy aR() {
        bqs bqsVarL = L();
        if (bqsVarL instanceof hmy) {
            return (hmy) bqsVarL;
        }
        bqs bqsVarM = M();
        if (bqsVarM instanceof hmy) {
            return (hmy) bqsVarM;
        }
        return null;
    }

    private final abnb aS() {
        abnb abnbVarDJ;
        bqs bqsVarL = L();
        if (bqsVarL == null) {
            bqsVarL = M();
        }
        hna hnaVar = bqsVarL instanceof hna ? (hna) bqsVarL : null;
        return (hnaVar == null || (abnbVarDJ = hnaVar.dJ()) == null) ? abnb.SEARCH_RESULT_PAGE : abnbVarDJ;
    }

    private final void aT() {
        bqs bqsVarM = M();
        hmz hmzVar = bqsVarM instanceof hmz ? (hmz) bqsVarM : null;
        if (hmzVar == null || !hmzVar.M()) {
            if (!bk(M())) {
                finish();
                return;
            }
            de deVar = ((bw) this).a.a.e;
            deVar.Y();
            deVar.ac();
            if (M() == null) {
                finish();
            } else {
                be();
            }
        }
    }

    private final void aU() {
        aV(L());
        aV(M());
    }

    private final void aV(bq bqVar) {
        View view;
        if (bqVar == null || (view = bqVar.R) == null) {
            return;
        }
        view.animate().cancel();
        view.animate().withLayer().alpha(1.0f).setDuration(100L).setInterpolator(AnimationUtils.loadInterpolator(this, R.anim.alpha_curve)).start();
    }

    private final void aW() {
        de deVar = ((bw) this).a.a.e;
        if (deVar.a() > 0) {
            deVar.ad(null);
        }
    }

    private final void aX() {
        bb(R.id.m1_warning);
        bb(R.id.m3_warning);
    }

    private final void aY() {
        FocusListenerConstraintLayout focusListenerConstraintLayout = (FocusListenerConstraintLayout) requireViewById(R.id.search_content_root);
        focusListenerConstraintLayout.getClass();
        this.T = focusListenerConstraintLayout;
        paq.c(ar(), new pan(13973));
        this.am = getResources().getDimensionPixelSize(R.dimen.window_key_line);
    }

    private final void aZ(bq bqVar) {
        View view;
        if (bqVar == null || (view = bqVar.R) == null) {
            return;
        }
        view.animate().cancel();
        view.animate().withLayer().alpha(0.35f).setDuration(100L).setInterpolator(AnimationUtils.loadInterpolator(this, R.anim.alpha_curve)).start();
    }

    private final void ba() {
        if (ai() == gph.a || ai() == gph.c) {
            ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "hidePeekView", 1417, "SearchResultActivity.kt")).u("hidePeekView called when experience is AMATI or WATSON23");
            return;
        }
        if (this.W == 2) {
            ad().t(2);
        }
        this.W = 1;
        ak().c();
        if (U().getVisibility() == 0) {
            aL().a(U()).start();
        }
        aX();
    }

    private final void bb(int i) {
        TextView textView = (TextView) cT().b(i);
        if (textView == null) {
            return;
        }
        ViewParent parent = textView.getParent();
        parent.getClass();
        final ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup.getVisibility() != 8) {
            hex hexVarAQ = aQ();
            AnimatorSet animatorSet = hexVarAQ.f;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f);
            long j = hexVarAQ.a;
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.setInterpolator(hexVarAQ.c);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(hexVarAQ.e, 0);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: het
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    View view = viewGroup;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = iIntValue;
                    view.setLayoutParams(layoutParams);
                }
            });
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.setInterpolator(hexVarAQ.d);
            hexVarAQ.f = new AnimatorSet();
            hexVarAQ.f.play(objectAnimatorOfFloat).with(valueAnimatorOfInt);
            hexVarAQ.f.addListener(new hew(hexVarAQ, viewGroup));
            hexVarAQ.f.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bc(bq bqVar) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        hfo hfoVar = this.ai;
        if (hfoVar != null) {
            hmt hmtVar = bqVar instanceof hmt ? (hmt) bqVar : null;
            if (hmtVar == null || !hmtVar.a() || (animatorSet2 = hfoVar.d) == (animatorSet = hfoVar.c)) {
                return;
            }
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                hfoVar.d.cancel();
            }
            hfoVar.d = animatorSet;
            if (hfoVar.b.getVisibility() != 0) {
                hfoVar.d.start();
            }
        }
    }

    private final void bd() {
        if (cT().b(R.id.web_view_performance) != null) {
            return;
        }
        try {
            WebView webViewAP = aP();
            webViewAP.loadUrl("about:blank");
            webViewAP.setId(R.id.web_view_performance);
            zr zrVar = new zr(-1, 1);
            zrVar.l = 0;
            ar().addView(webViewAP, 0, zrVar);
            ((zdv) m.b().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "maybeAddWebView", 1525, "SearchResultActivity.kt")).u("maybeAddWebView created performance WebView");
        } catch (AndroidRuntimeException e) {
            ((zdv) ((zdv) m.d()).p(e).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "maybeAddWebView", 1517, "SearchResultActivity.kt")).u("failed to create WebView");
        }
    }

    private final void be() {
        ac().S();
    }

    private final void bf() {
        FrameLayout frameLayoutZ = Z();
        frameLayoutZ.setFocusable(false);
        frameLayoutZ.setDescendantFocusability(393216);
    }

    private final void bg() {
        bq bqVarO = O();
        if (bqVarO != null) {
            ab abVar = new ab(((bw) this).a.a.e);
            abVar.k(bqVarO);
            abVar.e();
            W().setVisibility(8);
        }
    }

    private final void bh() {
        FrameLayout frameLayoutZ = Z();
        frameLayoutZ.setFocusable(true);
        frameLayoutZ.setDescendantFocusability(262144);
        frameLayoutZ.requestFocus();
    }

    private final void bi(xoa xoaVar) {
        hmy hmyVarAR = aR();
        if (hmyVarAR == null) {
            return;
        }
        hmyVarAR.I(xoaVar);
        SuggestionChipList suggestionChipListG = hmyVarAR.G();
        if (suggestionChipListG != null) {
            z(suggestionChipListG);
        }
    }

    private final void bj(boolean z) {
        ad().p(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean bk(bq bqVar) {
        hmx hmxVar = bqVar instanceof hmx ? (hmx) bqVar : null;
        return hmxVar != null && hmxVar.aF();
    }

    private final boolean bl() {
        int i = this.W;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            ac().R();
            ad().t(2);
            this.W = 1;
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        ac().U(true);
        ad().t(27);
        this.W = 1;
        aU();
        return true;
    }

    private final boolean bm(int i, CharSequence charSequence) {
        TextView textView = (TextView) cT().b(i);
        if (textView == null) {
            return false;
        }
        ViewParent parent = textView.getParent();
        parent.getClass();
        final ViewGroup viewGroup = (ViewGroup) parent;
        hex hexVarAQ = aQ();
        AnimatorSet animatorSet = hexVarAQ.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        if (viewGroup.getVisibility() == 8) {
            textView.setText(charSequence);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f);
            long j = hexVarAQ.a;
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.setInterpolator(hexVarAQ.c);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, hexVarAQ.e);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hes
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    View view = viewGroup;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = iIntValue;
                    view.setLayoutParams(layoutParams);
                }
            });
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.setInterpolator(hexVarAQ.d);
            hexVarAQ.f = new AnimatorSet();
            hexVarAQ.f.play(objectAnimatorOfFloat).with(valueAnimatorOfInt);
            hexVarAQ.f.addListener(new hev(viewGroup));
            hexVarAQ.f.start();
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 0.0f);
            objectAnimatorOfFloat2.setDuration(hexVarAQ.b);
            Interpolator interpolator = hexVarAQ.c;
            objectAnimatorOfFloat2.setInterpolator(interpolator);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f);
            objectAnimatorOfFloat3.setDuration(hexVarAQ.a);
            objectAnimatorOfFloat3.setInterpolator(interpolator);
            hexVarAQ.f = new AnimatorSet();
            hexVarAQ.f.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            objectAnimatorOfFloat3.addListener(new heu(textView, charSequence));
            hexVarAQ.f.start();
        }
        return true;
    }

    private final boolean bn() {
        return ak().i();
    }

    private final boolean bo() {
        bqs bqsVarO = O();
        hmv hmvVar = bqsVarO instanceof hmv ? (hmv) bqsVarO : null;
        return hmvVar != null && hmvVar.aJ();
    }

    @Override // defpackage.ffm
    public final void A(Duration duration) {
        duration.getClass();
        if (!duration.isNegative() && !X().isTouchExplorationEnabled()) {
            aa().a(this.ae, duration);
        } else if (agvy.c(duration, ffl.a)) {
            aa().e();
        }
    }

    @Override // defpackage.ffm
    public final boolean B() {
        if (M() == null) {
            return (O() instanceof hmv) && !bo();
        }
        return true;
    }

    @Override // defpackage.ffm
    public final void C(bq bqVar) {
        ab abVar = new ab(((bw) this).a.a.e);
        abVar.m(bqVar, "on_device_loading_tag");
        abVar.e();
    }

    @Override // defpackage.ffm
    public final bq D() {
        de deVar = ((bw) this).a.a.e;
        bq bqVarD = deVar.b.d("on_device_loading_tag");
        if (bqVarD == null) {
            return null;
        }
        ab abVar = new ab(deVar);
        abVar.k(bqVarD);
        abVar.e();
        return bqVarD;
    }

    public final bq L() {
        return ((bw) this).a.a.e.b.c(R.id.compact_results_container);
    }

    public final bq M() {
        return ((bw) this).a.a.e.b.c(R.id.fullscreen_results_container);
    }

    public final bq N() {
        return ((bw) this).a.a.e.b.c(R.id.overlay_container);
    }

    public final bq O() {
        return ((bw) this).a.a.e.b.c(R.id.preview_container);
    }

    @Override // defpackage.hka
    public final bq P() {
        if (ai() == gph.a) {
            return new ikl();
        }
        ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "newActionablePuntFragment", 1667, "SearchResultActivity.kt")).u("ActionablePuntAmatiFragment should not be called in Watson");
        return null;
    }

    @Override // defpackage.hka
    public final bq Q(boolean z) {
        hhw hhwVar = new hhw();
        if (this.V) {
            hkb.e(hhwVar);
            return hhwVar;
        }
        gph gphVarAi = ai();
        gph gphVar = gph.a;
        if (gphVarAi == gphVar) {
            if (z) {
                hkb.f(hhwVar);
                return hhwVar;
            }
        } else if (z) {
            hkb.e(hhwVar);
            return hhwVar;
        }
        if (ai() != gphVar && ai() != gph.c) {
            return hhwVar;
        }
        hkb.e(hhwVar);
        return hhwVar;
    }

    @Override // defpackage.hka
    public final /* synthetic */ bq R() {
        return new hia();
    }

    @Override // defpackage.hka
    public final /* synthetic */ bq S() {
        return new hml();
    }

    public final dp T(boolean z) {
        ab abVar = new ab(((bw) this).a.a.e);
        int i = true != z ? 0 : R.animator.replace_fade_in;
        abVar.r(i, R.animator.result_fade_out, i, R.animator.result_fade_out);
        return abVar;
    }

    public final View U() {
        return (View) this.as.a();
    }

    public final ViewGroup V() {
        return (ViewGroup) this.at.a();
    }

    public final ViewGroup W() {
        return (ViewGroup) this.au.a();
    }

    public final AccessibilityManager X() {
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        agvy.b("accessibilityManager");
        return null;
    }

    @Override // defpackage.huf
    public final WebView Y() {
        int iIndexOfChild;
        WebView webView = (WebView) cT().b(R.id.web_view_performance);
        if (webView == null || (iIndexOfChild = ar().indexOfChild(webView)) < 0) {
            return aP();
        }
        ar().removeViewAt(iIndexOfChild);
        webView.setId(-1);
        return webView;
    }

    public final FrameLayout Z() {
        return (FrameLayout) this.ar.a();
    }

    @Override // defpackage.ezb, defpackage.ffm
    public final void a() {
        finish();
    }

    public final void aA() {
        String stringExtra;
        if (getIntent().hasExtra("get_screenshot") && (stringExtra = getIntent().getStringExtra("get_screenshot")) != null) {
            ahbt ahbtVar = this.r;
            if (ahbtVar == null) {
                agvy.b("coroutineScopeUi");
                ahbtVar = null;
            }
            ahal.e(ahbtVar, null, 0, new hgl(this, stringExtra, null), 3);
        }
    }

    @Override // defpackage.hjy
    public final void aB(bq bqVar) {
        bc(bqVar);
    }

    @Override // defpackage.hhh
    public final void aC(int i) {
        if (aR() instanceof hqn) {
            float f = -Math.min(this.am, i);
            if (f > 0.0f) {
                f = 0.0f;
            }
            boolean z = f == 0.0f;
            if (z && !this.an) {
                aq().c();
            } else if (!z && this.an) {
                aq().d(aS());
            }
            this.an = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // defpackage.jpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aD(int r4) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            if (r4 == r1) goto Le
            if (r4 == r0) goto Le
            r2 = 96
            if (r4 == r2) goto Le
            switch(r4) {
                case 19: goto Le;
                case 20: goto Le;
                case 21: goto Le;
                case 22: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L22
        Le:
            int r2 = r3.W
            if (r2 != r0) goto L22
            ffp r2 = r3.ad()
            r2.t(r0)
            r3.W = r1
            ffn r0 = r3.ac()
            r0.U(r1)
        L22:
            r0 = 20
            if (r4 != r0) goto L58
            bq r4 = r3.M()
            boolean r0 = r4 instanceof defpackage.hmz
            if (r0 == 0) goto L31
            hmz r4 = (defpackage.hmz) r4
            goto L32
        L31:
            r4 = 0
        L32:
            if (r4 == 0) goto L37
            r4.L()
        L37:
            gph r4 = r3.ai()
            gph r0 = defpackage.gph.a
            if (r4 == r0) goto L51
            gph r4 = r3.ai()
            gph r0 = defpackage.gph.c
            if (r4 == r0) goto L51
            com.google.android.apps.tvsearch.results.motion.MotionResultsFrame r4 = r3.al()
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L58
        L51:
            hgp r4 = r3.ak()
            r4.d()
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.results.activity.SearchResultActivity.aD(int):void");
    }

    public final void aF() {
        if (N() == null || !this.ad) {
            return;
        }
        de deVar = ((bw) this).a.a.e;
        deVar.ad("overlayFragment");
        deVar.ac();
        if (!isFinishing()) {
            Handler handler = this.ag;
            if (handler == null) {
                agvy.b("handler");
                handler = null;
            }
            Duration durationOfMillis = Duration.ofMillis(getResources().getInteger(R.integer.result_fade_out_duration_ms));
            durationOfMillis.getClass();
            feq.e(handler, durationOfMillis, new Runnable() { // from class: hfw
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.V().setVisibility(8);
                }
            });
        }
        if (M() != null) {
            bh();
        }
        if (O() != null) {
            ViewGroup viewGroupW = W();
            viewGroupW.setFocusable(true);
            viewGroupW.setDescendantFocusability(262144);
            viewGroupW.requestFocus();
        }
    }

    public final void aG(final boolean z) {
        jca jcaVar = this.Q;
        if (jcaVar == null) {
            agvy.b("voiceInteractionController");
            jcaVar = null;
        }
        jcaVar.b(new jby() { // from class: hfy
            @Override // defpackage.jby
            public final void a(jdq jdqVar) {
                boolean z2 = z;
                if (jdqVar != null) {
                    try {
                        jdqVar.e(z2);
                    } catch (RemoteException e) {
                        ((zdv) ((zdv) SearchResultActivity.m.c()).p(e).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "setIsAssistantResponding$lambda$51", 2252, "SearchResultActivity.kt")).u("Error calling #isAssistantResponding");
                    }
                }
            }
        });
    }

    public final boolean aH() {
        return L() != null;
    }

    public final boolean aI() {
        return N() != null;
    }

    public final eyy aJ() {
        eyy eyyVar = this.X;
        if (eyyVar != null) {
            return eyyVar;
        }
        agvy.b("katnissLifeCycleController");
        return null;
    }

    public final hjx aK() {
        hjx hjxVar = this.Z;
        if (hjxVar != null) {
            return hjxVar;
        }
        agvy.b("translucencyOnFullScreenExperience");
        return null;
    }

    public final iaj aL() {
        iaj iajVar = this.Y;
        if (iajVar != null) {
            return iajVar;
        }
        agvy.b("searchBarAnimators");
        return null;
    }

    public final int aM() {
        boolean zBn = bn();
        boolean zAH = aH();
        boolean zB = B();
        boolean zBo = bo();
        boolean zAI = aI();
        if (!zBn && !zAH && !zB && !zBo) {
            return 0;
        }
        if (zBo && !zAI) {
            return 10;
        }
        if (zBn && !zAH && !zB) {
            return 1;
        }
        if (zAH && !zBn) {
            ((zdv) m.d().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "getUiState", 416, "SearchResultActivity.kt")).u("Compact showing without suggestions bar");
        }
        if (!zAI) {
            return zAH ? zB ? 5 : 2 : !zBn ? 3 : 4;
        }
        if (zAH && !zB) {
            return 6;
        }
        if (zBn || zAH) {
            return zBo ? 9 : 8;
        }
        return 7;
    }

    public final ewo aN() {
        ewo ewoVar = this.ab;
        if (ewoVar != null) {
            return ewoVar;
        }
        agvy.b("homeKeyPressedMonitor");
        return null;
    }

    public final ewg aa() {
        ewg ewgVar = this.S;
        if (ewgVar != null) {
            return ewgVar;
        }
        agvy.b("finishOnTalkingDone");
        return null;
    }

    public final fex ab() {
        fex fexVar = this.I;
        if (fexVar != null) {
            return fexVar;
        }
        agvy.b("resultProvider");
        return null;
    }

    public final ffn ac() {
        ffn ffnVar = this.N;
        if (ffnVar != null) {
            return ffnVar;
        }
        agvy.b("uiEventReceiver");
        return null;
    }

    public final ffp ad() {
        ffp ffpVar = this.A;
        if (ffpVar != null) {
            return ffpVar;
        }
        agvy.b("interactorProcessClient");
        return null;
    }

    public final fgt ae() {
        fgt fgtVar = this.w;
        if (fgtVar != null) {
            return fgtVar;
        }
        agvy.b("fragmentViewManagerBridge");
        return null;
    }

    public final gfr af() {
        gfr gfrVar = this.C;
        if (gfrVar != null) {
            return gfrVar;
        }
        agvy.b("katnissAppFlowLogger");
        return null;
    }

    public final ghr ag() {
        ghr ghrVar = this.M;
        if (ghrVar != null) {
            return ghrVar;
        }
        agvy.b("tvLogger");
        return null;
    }

    public final gmd ah() {
        gmd gmdVar = this.D;
        if (gmdVar != null) {
            return gmdVar;
        }
        agvy.b("latencyLogger");
        return null;
    }

    public final gph ai() {
        gph gphVar = this.v;
        if (gphVar != null) {
            return gphVar;
        }
        agvy.b("experience");
        return null;
    }

    public final hcc aj() {
        hcc hccVar = this.H;
        if (hccVar != null) {
            return hccVar;
        }
        agvy.b("previewerHelper");
        return null;
    }

    public final hgp ak() {
        hgp hgpVar = this.U;
        if (hgpVar != null) {
            return hgpVar;
        }
        agvy.b("suggestionsBarManager");
        return null;
    }

    public final MotionResultsFrame al() {
        return (MotionResultsFrame) this.aq.a();
    }

    @Override // defpackage.hka
    public final hrw am() {
        hrw hqnVar = (ai() == gph.a || this.V) ? new hqn() : new hqw();
        hkb.e(hqnVar);
        return hqnVar;
    }

    @Override // defpackage.hka
    public final hrw an(boolean z) {
        if ((this.ah || this.V || X().isTouchExplorationEnabled()) && z) {
            return am();
        }
        if (this.V) {
            ((zdv) m.d().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "newSearchRowsFragment", 1707, "SearchResultActivity.kt")).u("Unable to create full screen result");
        }
        return new hqq();
    }

    @Override // defpackage.hka
    public final hrw ao() {
        hqn hqnVar = new hqn();
        hkb.e(hqnVar);
        hkb.b(hqnVar).putBoolean("shimmer", true);
        return hqnVar;
    }

    @Override // defpackage.hka
    public final htu ap(String str) {
        if (ai() == gph.a || ai() == gph.c) {
            htq htqVar = new htq();
            hts.sw.a(htqVar, str);
            return htqVar;
        }
        htu htuVar = new htu();
        hts.sw.a(htuVar, str);
        if (!this.V) {
            return htuVar;
        }
        hkb.e(htuVar);
        return htuVar;
    }

    public final iwk aq() {
        iwk iwkVar = this.L;
        if (iwkVar != null) {
            return iwkVar;
        }
        agvy.b("suggestedQueriesController");
        return null;
    }

    public final FocusListenerConstraintLayout ar() {
        FocusListenerConstraintLayout focusListenerConstraintLayout = this.T;
        if (focusListenerConstraintLayout != null) {
            return focusListenerConstraintLayout;
        }
        agvy.b("rootView");
        return null;
    }

    public final agow as() {
        agow agowVar = this.B;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("katnissAppFlowEventLogger");
        return null;
    }

    public final agow at() {
        agow agowVar = this.G;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("migrateKatnissAppFlowInteractionEvents");
        return null;
    }

    public final agow au() {
        agow agowVar = this.J;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("searchableSourcesSystem");
        return null;
    }

    public final agow av() {
        agow agowVar = this.O;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("updateSourcesInInitTask");
        return null;
    }

    public final agow aw() {
        agow agowVar = this.z;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("isASDebuggerPreviewer");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ax(boolean z) {
        SuggestionChipList suggestionChipListG;
        int iAM = aM();
        if (iAM == 0) {
            finish();
        }
        switch (iAM - 1) {
            case 0:
                if (!z) {
                    gbw.a(this);
                }
                finish();
                break;
            case 1:
                aX();
                if (!bl()) {
                    hfo hfoVar = this.ai;
                    if (hfoVar != null) {
                        hfoVar.c();
                    }
                    if (!bk(L())) {
                        finish();
                        break;
                    } else {
                        de deVar = ((bw) this).a.a.e;
                        deVar.Y();
                        deVar.ac();
                        bq bqVarL = L();
                        if (bqVarL != 0) {
                            bc(bqVarL);
                            be();
                            hmy hmyVar = bqVarL instanceof hmy ? (hmy) bqVarL : null;
                            if (hmyVar != null && (suggestionChipListG = hmyVar.G()) != null) {
                                z(suggestionChipListG);
                                break;
                            }
                        } else {
                            finish();
                            break;
                        }
                    }
                }
                break;
            case 2:
                aT();
                break;
            case 3:
                bl();
                ba();
                if (!z) {
                    aT();
                    break;
                }
                break;
            case 4:
            default:
                if (!bl()) {
                    az(true);
                    be();
                    break;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                aF();
                break;
            case 9:
                finish();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ay(boolean z) {
        if (this.ad) {
            if (ai() == gph.a || ai() == gph.c) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromCompact", 1214, "SearchResultActivity.kt")).u("goToFullScreenFromCompact called when experience is AMATI or WATSON23");
                return;
            }
            bq bqVarL = L();
            if (!(bqVarL instanceof hmz)) {
                hfo hfoVar = this.ai;
                if (hfoVar != null) {
                    hfoVar.c();
                }
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromCompact", 1226, "SearchResultActivity.kt")).u("Received go to full screen signal but compact fragment is not expandable!");
                return;
            }
            this.ah = true;
            Z().setVisibility(0);
            if (!aK().a() && Build.VERSION.SDK_INT >= 30) {
                setTranslucent(false);
            }
            bq bqVarK = ac().K(((hmy) bqVarL).F(), ((hmz) bqVarL).K());
            if (!(bqVarK instanceof hmu)) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromCompact", 1250, "SearchResultActivity.kt")).u("Could not create full screen fragment!");
                return;
            }
            if (bqVarK.ao()) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromCompact", 1257, "SearchResultActivity.kt")).u("Should not call add a fragment that is already added");
                return;
            }
            hgi hgiVar = ac;
            Bundle bundleB = hkb.b(bqVarK);
            hgiVar.a(bundleB, bqVarL.n);
            bundleB.putBoolean("expand_to_second_row", z);
            bqVarK.ae(bundleB);
            hmu hmuVar = (hmu) bqVarK;
            hmuVar.d(bqVarL);
            final hff hffVar = new hff(this.ai, U(), al(), hmuVar, Z(), aL(), ak());
            MotionResultsFrame motionResultsFrameAl = al();
            hln hlnVar = motionResultsFrameAl.a;
            motionResultsFrameAl.f();
            motionResultsFrameAl.a = hln.DISABLED;
            aW();
            bq bqVarL2 = L();
            if (bqVarL2 != null && bqVarL2.ao()) {
                ab abVar = new ab(((bw) this).a.a.e);
                abVar.k(bqVarL2);
                abVar.e();
            }
            dp dpVarT = T(false);
            dpVarT.q(R.id.fullscreen_results_container, bqVarK, null);
            if (bk(bqVarK)) {
                dpVarT.n(null);
            }
            dpVarT.e();
            ((bw) this).a.a.e.ac();
            aU();
            hmu hmuVar2 = hffVar.h;
            FrameLayout frameLayout = hffVar.a;
            hfg hfgVar = new hfg(hmuVar2, frameLayout, hffVar.d);
            final float f = hffVar.c;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "translationY", f, 0.0f);
            objectAnimatorOfFloat.setDuration(frameLayout.getResources().getInteger(R.integer.launch_full_screen_duration_ms));
            objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(frameLayout.getContext(), R.anim.enter_curve));
            objectAnimatorOfFloat.addListener(new hfc(hffVar));
            AnimatorSet animatorSet = hfgVar.a;
            AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
            builderPlay.with(hfo.b(hffVar.g));
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hfa
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    hff hffVar2 = hffVar;
                    float translationY = hffVar2.a.getTranslationY() - f;
                    hfo hfoVar2 = hffVar2.f;
                    if (hfoVar2 != null) {
                        hfoVar2.d(translationY);
                    }
                    hffVar2.g.setTranslationY(translationY);
                }
            });
            objectAnimatorOfFloat.addListener(new hfd(hffVar));
            View viewFindViewById = hffVar.b.findViewById(R.id.search_shadow);
            if (viewFindViewById != null && viewFindViewById.getLayoutParams() != null) {
                final View view = new View(frameLayout.getContext());
                view.setBackgroundResource(R.drawable.search_shadow);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewFindViewById.getLayoutParams());
                layoutParams.setMargins(0, 0, 0, hffVar.e);
                layoutParams.gravity = 80;
                Animator animatorA = hffVar.j.a(view);
                animatorA.addListener(new hfe(hffVar, view, layoutParams));
                builderPlay.with(animatorA);
                objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hez
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view.setTranslationY(-hffVar.a.getTranslationY());
                    }
                });
            }
            animatorSet.addListener(new hfb(hffVar));
            hfgVar.b.c();
            hfgVar.c.getViewTreeObserver().addOnPreDrawListener(new hey(hfgVar));
            aX();
            az(false);
        }
    }

    public final void az(boolean z) {
        if (ai() == gph.a || ai() == gph.c) {
            ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "hideCompactView", 1387, "SearchResultActivity.kt")).u("hideCompactView called when experience is AMATI or WATSON23");
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ad().t(23);
        int measuredHeight = aO().getMeasuredHeight();
        MotionResultsFrame motionResultsFrameAl = al();
        animatorSet.play(motionResultsFrameAl.b(aO(), measuredHeight, true)).with(motionResultsFrameAl.b(U(), measuredHeight, true)).with(motionResultsFrameAl.b(motionResultsFrameAl, measuredHeight, false));
        if (aH()) {
            bq bqVarL = L();
            if (bqVarL != null) {
                al().k(animatorSet);
                dp dpVarT = T(false);
                dpVarT.k(bqVarL);
                ((ab) dpVarT).j(true, true);
                if (z) {
                    ((bw) this).a.a.e.ac();
                }
            }
        } else {
            animatorSet.start();
        }
        if (B()) {
            bh();
        }
        aX();
    }

    @Override // defpackage.ezb
    public final void b() {
        if (X().isTouchExplorationEnabled()) {
            return;
        }
        this.ae = new Runnable() { // from class: hfp
            @Override // java.lang.Runnable
            public final void run() {
                SearchResultActivity searchResultActivity = this.a;
                searchResultActivity.R = true;
                searchResultActivity.finish();
            }
        };
        aa().a(this.ae, ffl.b);
        this.af = true;
    }

    @Override // defpackage.ezc
    public final String c() {
        return this.aj;
    }

    @Override // defpackage.few
    public final void d() {
        ax(false);
    }

    @Override // defpackage.few
    public final void e(String str) {
        q(str, null);
    }

    @Override // defpackage.few
    public final void f() {
        aa().b();
    }

    @Override // defpackage.few
    public final void g() {
        if (L() instanceof hmt) {
            ay(false);
        }
    }

    @Override // defpackage.few
    public final void h(hlx hlxVar) {
        if (this.ad) {
            if (aI()) {
                Intent intentA = hlxVar.a();
                exl exlVar = this.y;
                if (exlVar == null) {
                    agvy.b("intentStarter");
                    exlVar = null;
                }
                exlVar.b(intentA, exj.c, exk.a, 2, new hgo());
                return;
            }
            bq bqVarB = hlxVar.b();
            if (bqVarB.ao()) {
                ((zdv) m.d().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "onDisplayOverlay", 1828, "SearchResultActivity.kt")).u("Should not call display overlay fragment with null fragment or with fragment is added");
            } else {
                hkb.f(bqVarB);
                r(bqVarB);
            }
        }
    }

    @Override // defpackage.few
    public final void i() {
        this.ao = agrd.a;
        aq().c();
        if (this.an) {
            return;
        }
        aq().d(aS());
    }

    @Override // defpackage.few
    public final void j() {
        bq bqVarO = O();
        if (bqVarO instanceof hia) {
            hia hiaVar = (hia) bqVarO;
            hiaVar.aA.animate().alpha(0.0f).setDuration(200L).setListener(new hhz(hiaVar));
            return;
        }
        if (bqVarO instanceof hml) {
            if (!this.ad) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromPreview", 1326, "SearchResultActivity.kt")).u("Cannot switch to full screen when stopped.");
                return;
            }
            bq bqVarO2 = O();
            hml hmlVar = bqVarO2 instanceof hml ? (hml) bqVarO2 : null;
            if (hmlVar == null) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromPreview", 1334, "SearchResultActivity.kt")).u("Received go to full screen signal but preview fragment is not expandable");
                return;
            }
            hkx hkxVar = hmlVar.am;
            if (hkxVar == null) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromPreview", 1344, "SearchResultActivity.kt")).u("Received go to full screen signal but preview fragment has no ResponseWrapper");
                return;
            }
            bq bqVarK = ac().K(hkxVar, agrd.a);
            if (bqVarK == null) {
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "goToFullScreenFromPreview", 1353, "SearchResultActivity.kt")).u("fullScreen is null");
                return;
            }
            hgi hgiVar = ac;
            Bundle bundleB = hkb.b(bqVarK);
            hgiVar.a(bundleB, hmlVar.n);
            bqVarK.ae(bundleB);
            r(bqVarK);
        }
    }

    @Override // defpackage.few
    public final void k() {
        this.ao = agrd.a;
        aq().c();
    }

    @Override // defpackage.few
    public final void l() {
        this.an = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    @Override // defpackage.few, defpackage.ffm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.CharSequence r3) {
        /*
            r2 = this;
            r3.getClass()
            r2.aM()
            int r0 = r2.aM()
            if (r0 != 0) goto Ld
            goto L2f
        Ld:
            int r0 = r0 + (-1)
            if (r0 == 0) goto L25
            r1 = 1
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 == r1) goto L1b
            goto L2f
        L1b:
            r0 = 2131428002(0x7f0b02a2, float:1.8477636E38)
            boolean r0 = r2.bm(r0, r3)
            if (r0 == 0) goto L2f
            goto L2e
        L25:
            r0 = 2131428001(0x7f0b02a1, float:1.8477634E38)
            boolean r0 = r2.bm(r0, r3)
            if (r0 == 0) goto L2f
        L2e:
            return
        L2f:
            jrs r0 = r2.x
            if (r0 != 0) goto L39
            java.lang.String r0 = "hoverToast"
            defpackage.agvy.b(r0)
            r0 = 0
        L39:
            j$.time.Duration r1 = defpackage.jru.a
            jru r0 = (defpackage.jru) r0
            r0.d(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.results.activity.SearchResultActivity.m(java.lang.CharSequence):void");
    }

    @Override // defpackage.few
    public final void n() {
        ac().B();
    }

    @Override // defpackage.ffm
    public final void o(List list) {
        this.ao = list;
    }

    @Override // defpackage.hfi, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Bundle extras;
        Supplier supplier;
        getIntent();
        gmw gmwVar = gmw.a;
        gmwVar.d = Instant.now();
        gmwVar.f = Duration.ofNanos(gmwVar.b.b());
        super.onCreate(bundle);
        ah().f(gmb.b);
        fyb fybVar = this.aa;
        if (fybVar == null) {
            agvy.b("fcmRegistration");
            fybVar = null;
        }
        fybVar.a(this);
        bj(false);
        this.ag = new Handler(getMainLooper());
        aJ().a(this);
        ae().a = this;
        aq().a(this);
        if (ai() == gph.a || ai() == gph.c) {
            setContentView(R.layout.search_main_amati);
            aY();
            this.U = new hgq();
        } else {
            setContentView(R.layout.search_main_watson);
            aY();
            View viewRequireViewById = requireViewById(R.id.search_bar_container);
            viewRequireViewById.getClass();
            ViewGroup viewGroup = (ViewGroup) viewRequireViewById;
            Supplier supplier2 = this.o;
            if (supplier2 == null) {
                agvy.b("assistantSupported");
                supplier = null;
            } else {
                supplier = supplier2;
            }
            this.U = new hgs(supplier, ad(), viewGroup, aL(), new hgc(this), new hsu() { // from class: hgd
                @Override // defpackage.hsu
                public final void a(SuggestionChipItem suggestionChipItem, View view) {
                    suggestionChipItem.getClass();
                    view.getClass();
                    SearchResultActivity searchResultActivity = this.a;
                    searchResultActivity.aa().e();
                    agow agowVar = searchResultActivity.u;
                    if (agowVar == null) {
                        agvy.b("enableInvocationAppFlowLogging");
                        agowVar = null;
                    }
                    if (((Boolean) agowVar.a()).booleanValue()) {
                        ((gfn) searchResultActivity.as().a()).b(rpm.s()).b().c();
                    }
                    searchResultActivity.af().b(rpm.E(), null, null);
                    if (((Boolean) searchResultActivity.at().a()).booleanValue()) {
                        ((gfn) searchResultActivity.as().a()).a(rpm.cO()).b().c();
                    } else {
                        searchResultActivity.af().a(rpm.cO(), abqb.OK, null, null);
                    }
                    ffn ffnVarAc = searchResultActivity.ac();
                    String str = suggestionChipItem.a;
                    ffnVarAc.f(str);
                    searchResultActivity.ag().d(view, suggestionChipItem);
                    searchResultActivity.ag().E(6);
                    searchResultActivity.ag().ad(str, 4, 1);
                }
            });
            ah().b(gmc.au);
            af().b(rpm.cs(), null, null);
            this.ai = new hfo(ar(), viewGroup, new hgj(this));
        }
        getWindow().addFlags(2097152);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("android.katniss.search.extra.SHOULD_WARM_UP", false)) {
            bd();
        }
        Handler handler = this.ag;
        if (handler == null) {
            agvy.b("handler");
            handler = null;
        }
        this.S = new ewi(handler);
        if (!((Boolean) av().a()).booleanValue()) {
            ahbt ahbtVar = this.q;
            if (ahbtVar == null) {
                agvy.b("coroutineScopeLightweight");
                ahbtVar = null;
            }
            ahal.e(ahbtVar, null, 0, new hgn(this, null), 3);
        }
        if (((Boolean) aw().a()).booleanValue()) {
            aA();
        }
        dc().b(this, this.al);
    }

    @Override // defpackage.hfi, defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onDestroy() throws IllegalStateException {
        aJ().d();
        ae().a = null;
        aq().f();
        if (ai() == gph.b) {
            MotionResultsFrame motionResultsFrameAl = al();
            hln hlnVar = motionResultsFrameAl.a;
            motionResultsFrameAl.a = hln.DESTROYED;
            motionResultsFrameAl.f();
            hle hleVar = motionResultsFrameAl.f;
            if (hleVar != null) {
                hleVar.b = null;
                motionResultsFrameAl.f = null;
            }
            hle hleVar2 = motionResultsFrameAl.d;
            if (hleVar2 != null) {
                hleVar2.f();
                motionResultsFrameAl.d = null;
            }
            motionResultsFrameAl.removeAllViews();
        }
        bj(false);
        MediaPlayer mediaPlayer = this.ak;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        this.ak = null;
        ad().c("led_to_idle_state");
        HttpResponseCache installed = HttpResponseCache.getInstalled();
        if (installed != null) {
            installed.flush();
        }
        aa().e();
        if (!((Boolean) av().a()).booleanValue()) {
            Object objA = au().a();
            gpx gpxVar = objA instanceof gpx ? (gpx) objA : null;
            if (gpxVar != null) {
                AtomicBoolean atomicBoolean = gpxVar.d;
                if (atomicBoolean.get()) {
                    gpxVar.b.unregisterReceiver(gpxVar.a());
                    atomicBoolean.set(false);
                }
                ahdl ahdlVar = gpxVar.e;
                if (ahdlVar != null) {
                    ahdlVar.s(null);
                }
            }
        }
        this.ai = null;
        aN().b(this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r9
  0x0027: PHI (r9v1 int) = (r9v0 int), (r9v0 int), (r9v14 int), (r9v0 int) binds: [B:3:0x000d, B:8:0x0018, B:11:0x0020, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            r10.getClass()
            r8.aD(r9)
            hfo r0 = r8.ai
            r1 = 19
            r2 = 20
            r3 = 1
            if (r0 == 0) goto L27
            if (r9 != r1) goto L18
            boolean r0 = r0.f()
            if (r0 == 0) goto L27
            goto L22
        L18:
            if (r9 != r2) goto L27
            boolean r9 = r0.e()
            if (r9 != 0) goto L22
            r9 = r2
            goto L27
        L22:
            r10.startTracking()
            goto L97
        L27:
            boolean r0 = super.onKeyDown(r9, r10)
            if (r0 != 0) goto L97
            com.google.android.libraries.tv.widgets.layout.FocusListenerConstraintLayout r0 = r8.ar()
            android.view.View r0 = r0.findFocus()
            com.google.android.libraries.tv.widgets.layout.FocusListenerConstraintLayout r4 = r8.ar()
            boolean r4 = defpackage.agvy.c(r0, r4)
            r5 = 0
            if (r3 != r4) goto L41
            r0 = r5
        L41:
            android.view.FocusFinder r4 = android.view.FocusFinder.getInstance()
            com.google.android.libraries.tv.widgets.layout.FocusListenerConstraintLayout r6 = r8.ar()
            r7 = 33
            android.view.View r0 = r4.findNextFocus(r6, r0, r7)
            if (r0 == 0) goto L52
            goto L95
        L52:
            gph r0 = r8.ai()
            gph r4 = defpackage.gph.a
            if (r0 == r4) goto L7c
            gph r0 = r8.ai()
            gph r4 = defpackage.gph.c
            if (r0 != r4) goto L63
            goto L7c
        L63:
            if (r9 != r1) goto L95
            bq r9 = r8.L()
            boolean r0 = r9 instanceof defpackage.hmt
            if (r0 == 0) goto L70
            r5 = r9
            hmt r5 = (defpackage.hmt) r5
        L70:
            if (r5 == 0) goto L95
            boolean r9 = r5.b()
            if (r9 != r3) goto L95
            r10.startTracking()
            goto L97
        L7c:
            if (r9 != r2) goto L95
            bq r9 = r8.O()
            boolean r0 = r9 instanceof defpackage.hmv
            if (r0 == 0) goto L89
            r5 = r9
            hmv r5 = (defpackage.hmv) r5
        L89:
            if (r5 == 0) goto L95
            boolean r9 = r5.aI()
            if (r9 != r3) goto L95
            r10.startTracking()
            goto L97
        L95:
            r9 = 0
            return r9
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.results.activity.SearchResultActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[PHI: r7
  0x0065: PHI (r7v1 int) = (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v9 int), (r7v0 int) binds: [B:3:0x0012, B:5:0x0018, B:7:0x001e, B:12:0x0042, B:16:0x0064, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyUp(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            r8.getClass()
            ewg r0 = r6.aa()
            r0.b()
            hfo r0 = r6.ai
            r1 = 19
            r2 = 0
            r3 = 20
            r4 = 1
            if (r0 == 0) goto L65
            boolean r5 = r8.isTracking()
            if (r5 == 0) goto L65
            boolean r5 = r8.isCanceled()
            if (r5 != 0) goto L65
            if (r7 != r1) goto L42
            boolean r5 = r0.f()
            if (r5 == 0) goto L65
            hgj r7 = r0.e
            com.google.android.apps.tvsearch.results.activity.SearchResultActivity r7 = r7.a
            ghr r8 = r7.ag()
            zpg r0 = defpackage.zpg.OPA_TV_CLICK_CHEVRON_BUTTON
            fex r1 = r7.ab()
            java.lang.String r1 = r1.b()
            r8.j(r0, r1)
            r7.ay(r2)
            goto Ldf
        L42:
            if (r7 != r3) goto L65
            boolean r7 = r0.e()
            if (r7 == 0) goto L64
            hgj r7 = r0.e
            com.google.android.apps.tvsearch.results.activity.SearchResultActivity r7 = r7.a
            ghr r8 = r7.ag()
            zpg r0 = defpackage.zpg.OPA_TV_CLICK_CHEVRON_BUTTON
            fex r1 = r7.ab()
            java.lang.String r1 = r1.b()
            r8.j(r0, r1)
            r7.ay(r4)
            goto Ldf
        L64:
            r7 = r3
        L65:
            boolean r0 = super.onKeyUp(r7, r8)
            if (r0 != 0) goto Ldf
            boolean r0 = r8.isCanceled()
            if (r0 != 0) goto Lde
            boolean r8 = r8.isTracking()
            if (r8 != 0) goto L78
            goto Lde
        L78:
            gph r8 = r6.ai()
            gph r0 = defpackage.gph.a
            r5 = 0
            if (r8 == r0) goto Lb4
            gph r8 = r6.ai()
            gph r0 = defpackage.gph.c
            if (r8 != r0) goto L8a
            goto Lb4
        L8a:
            if (r7 != r1) goto Lde
            bq r7 = r6.L()
            boolean r8 = r7 instanceof defpackage.hmt
            if (r8 == 0) goto L97
            r5 = r7
            hmt r5 = (defpackage.hmt) r5
        L97:
            if (r5 == 0) goto Lde
            boolean r7 = r5.b()
            if (r7 != r4) goto Lde
            ghr r7 = r6.ag()
            zpg r8 = defpackage.zpg.OPA_TV_CLICK_UP_FROM_ENTITY_BAR
            fex r0 = r6.ab()
            java.lang.String r0 = r0.b()
            r7.j(r8, r0)
            r6.finish()
            goto Ldf
        Lb4:
            if (r7 != r3) goto Lde
            bq r7 = r6.O()
            boolean r8 = r7 instanceof defpackage.hmv
            if (r8 == 0) goto Lc1
            r5 = r7
            hmv r5 = (defpackage.hmv) r5
        Lc1:
            if (r5 == 0) goto Lde
            boolean r7 = r5.aI()
            if (r7 != r4) goto Lde
            ghr r7 = r6.ag()
            zpg r8 = defpackage.zpg.OPA_TV_CLICK_UP_FROM_ENTITY_BAR
            fex r0 = r6.ab()
            java.lang.String r0 = r0.b()
            r7.j(r8, r0)
            r6.finish()
            goto Ldf
        Lde:
            return r2
        Ldf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.results.activity.SearchResultActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // defpackage.tt, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        intent.getAction();
        super.onNewIntent(intent);
        if (!this.ad) {
            aW();
        }
        setIntent(intent);
        if (((Boolean) aw().a()).booleanValue()) {
            aA();
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onPause() {
        ac().N();
        super.onPause();
    }

    @Override // defpackage.gf, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        aN().a(this, new ewm() { // from class: hfx
            @Override // defpackage.ewm
            public final void a() {
                this.a.finish();
            }
        });
        if (ai() == gph.b && U().getVisibility() == 8) {
            aL().b(U()).start();
        }
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        aW();
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onResume() {
        super.onResume();
        ah().e(gmb.b);
        agow agowVar = null;
        if (((Boolean) aw().a()).booleanValue()) {
            Handler handler = this.ag;
            if (handler == null) {
                agvy.b("handler");
                handler = null;
            }
            handler.post(new Runnable() { // from class: hfv
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.ac().O();
                }
            });
        } else {
            ac().O();
        }
        aU();
        gmw gmwVar = gmw.a;
        agow agowVar2 = this.K;
        if (agowVar2 == null) {
            agvy.b("searchResultLogger");
        } else {
            agowVar = agowVar2;
        }
        gmu gmuVar = (gmu) agowVar.a();
        gmuVar.E(gmwVar.c, gmwVar.e);
        gmuVar.F(gmwVar.d, gmwVar.f);
        gmwVar.a();
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStart() {
        ((zdv) m.b().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "onStart", 544, "SearchResultActivity.kt")).u("#onStart");
        super.onStart();
        this.ad = true;
        gnj gnjVar = null;
        if (((Boolean) aw().a()).booleanValue()) {
            Handler handler = this.ag;
            if (handler == null) {
                agvy.b("handler");
                handler = null;
            }
            handler.post(new Runnable() { // from class: hga
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.ac().P();
                }
            });
        } else {
            ac().P();
        }
        gnj gnjVar2 = this.P;
        if (gnjVar2 == null) {
            agvy.b("userBehaviorLogManager");
        } else {
            gnjVar = gnjVar2;
        }
        gnjVar.d();
        jrv jrvVarA = jrv.a(this);
        jrvVarA.d = new hgb(this);
        this.ap = jrvVarA;
        this.R = false;
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("search_tab_pivots", false)) {
            return;
        }
        getIntent().removeExtra("search_tab_pivots");
        ac().M();
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStop() {
        ((zdv) m.b().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "onStop", 609, "SearchResultActivity.kt")).u("#onStop");
        this.ao = agrd.a;
        aq().c();
        this.ad = false;
        ad().w();
        if (!isFinishing() || this.R) {
            ac().Q(false);
            if (!this.R && this.af) {
                if (((ewi) aa()).b != 3) {
                    aa().c();
                }
                aa().d();
            }
        } else {
            ac().Q(true);
        }
        jrv jrvVar = this.ap;
        if (jrvVar != null) {
            unregisterReceiver(jrvVar);
            this.ap = null;
        }
        super.onStop();
    }

    @Override // defpackage.ffm
    public final void p(far farVar) {
        farVar.h = aS();
        farVar.i = this.ao;
        hmy hmyVarAR = aR();
        if (hmyVarAR != null) {
            hmyVarAR.H(farVar);
        }
    }

    @Override // defpackage.ffm
    public final void q(String str, String str2) {
        hkn hknVar = new hkn();
        Bundle bundleB = hkb.b(hknVar);
        if (str != null) {
            bundleB.putString("term_label", str);
        }
        if (str2 != null) {
            bundleB.putString("package_label", str2);
        }
        if (ai() == gph.a || ai() == gph.c) {
            hkb.e(hknVar);
        } else if (aH()) {
            bundleB.putInt("height", al().getHeight());
        }
        r(hknVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffm
    public final void r(bq bqVar) {
        bq bqVarM;
        rqs rqsVarCW;
        bqVar.getClass();
        if (!this.ad) {
            ((zdv) m.d().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "displayResponse", 1030, "SearchResultActivity.kt")).u("Should not call displayResponse when Activity is not started.");
            return;
        }
        if (bqVar.ao()) {
            ((zdv) m.d().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "displayResponse", 1035, "SearchResultActivity.kt")).u("Should not call display fragment with a fragment already added");
            return;
        }
        this.an = false;
        aq().g(ab().b());
        bj(true);
        aU();
        aX();
        if (aI()) {
            aF();
        }
        hkb.b(bqVar).putInt("search_bar_container_height", this.am);
        boolean z = bqVar instanceof hmv;
        Bundle bundle = bqVar.n;
        boolean z2 = bundle != null ? bundle.getBoolean("overlay_screen", false) : false;
        boolean zI = hkb.i(bqVar);
        int i = z ? R.id.preview_container : z2 ? R.id.overlay_container : zI ? R.id.fullscreen_results_container : R.id.compact_results_container;
        gph gphVarAi = ai();
        gph gphVar = gph.a;
        if ((gphVarAi == gphVar || ai() == gph.c) && i == R.id.compact_results_container) {
            ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "displayResponse", 1076, "SearchResultActivity.kt")).u("Should not display compact result in Amati or Watson23 build!");
            return;
        }
        if (zI) {
            this.ah = true;
            Z().setVisibility(0);
            if (!aK().a() && Build.VERSION.SDK_INT >= 30) {
                setTranslucent(false);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            setTranslucent(true);
        }
        if (z) {
            W().setVisibility(0);
        } else if (z2) {
            V().setVisibility(0);
        } else if (O() != null) {
            bg();
        }
        agow agowVar = null;
        if (ai() == gphVar) {
            hmx hmxVar = bqVar instanceof hmx ? (hmx) bqVar : null;
            if (hmxVar != null) {
                hmxVar.aD(M());
            }
        }
        dp dpVarT = T(zI || z2);
        dpVarT.q(i, bqVar, null);
        if (z2) {
            dpVarT.n("overlayFragment");
        } else if (bk(bqVar)) {
            dpVarT.n(null);
        } else if (zI || z || !B()) {
            aW();
            if (z && (bqVarM = M()) != null) {
                dpVarT.k(bqVarM);
                Handler handler = this.ag;
                if (handler == null) {
                    agvy.b("handler");
                    handler = null;
                }
                Duration durationOfMillis = Duration.ofMillis(getResources().getInteger(R.integer.result_fade_out_duration_ms));
                durationOfMillis.getClass();
                feq.e(handler, durationOfMillis, new Runnable() { // from class: hfu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.Z().setVisibility(8);
                    }
                });
            }
        } else {
            bq bqVarL = L();
            if (bqVarL != null) {
                dpVarT.k(bqVarL);
            }
        }
        ((ab) dpVarT).j(true, true);
        hfo hfoVar = this.ai;
        if (hfoVar != null) {
            hfoVar.c();
        }
        if (zI || z) {
            if (aH()) {
                az(false);
            } else if (bn()) {
                ba();
            } else if (ai() == gph.b && U().getVisibility() == 0) {
                aL().a(U()).start();
            }
        }
        ((bw) this).a.a.e.ac();
        gmd gmdVarAh = ah();
        gmdVarAh.m(gmc.K);
        gmdVarAh.m(gmc.O);
        gmdVarAh.m(gmc.L);
        gmdVarAh.m(gmc.N);
        gmdVarAh.m(gmc.M);
        boolean z3 = bqVar instanceof hhw;
        if (z3) {
            gfq.a(af(), rpm.eF(), abqb.OK, 8);
        } else if (bqVar instanceof hmy) {
            gfr gfrVarAf = af();
            hkx hkxVarF = ((hmy) bqVar).F();
            rqs rqsVarDl = (hkxVarF != null ? ((hky) hkxVarF).o : null) != null ? rpm.dl() : rpm.dj();
            abqb abqbVar = abqb.OK;
            gfrVarAf.a(rqsVarDl, abqbVar, null, null);
            gfq.a(af(), rpm.eG(), abqbVar, 8);
        } else if (bqVar instanceof htu) {
            gfq.a(af(), rpm.eH(), abqb.OK, 8);
        }
        agow agowVar2 = this.t;
        if (agowVar2 == null) {
            agvy.b("enableClientExecutionAppflowLogging");
        } else {
            agowVar = agowVar2;
        }
        if (((Boolean) agowVar.a()).booleanValue()) {
            if (z3) {
                rqsVarCW = rpm.ce();
            } else if (bqVar instanceof htu) {
                rqsVarCW = rpm.cW();
            }
            String strC = hkb.c(bqVar);
            if (agyv.n(strC)) {
                strC = ab().b();
            }
            if (strC != null) {
                gfl gflVarA = ((gfn) as().a()).a(rqsVarCW).a(strC);
                gflVarA.h(strC);
                gflVarA.c();
            }
        }
        if (!zI && !z2 && !z && B()) {
            bf();
            if (ai() == gph.b && al().hasFocusable()) {
                al().requestFocus();
            } else {
                ak().b();
            }
        } else if (z2) {
            bf();
        }
        if (!z2 || O() == null) {
            return;
        }
        ViewGroup viewGroupW = W();
        viewGroupW.setFocusable(false);
        viewGroupW.setDescendantFocusability(393216);
    }

    @Override // defpackage.ffm
    public final void s(xoa xoaVar) {
        aU();
        switch (xoaVar.ordinal()) {
            case 1:
                bqs bqsVarL = L();
                if ((bqsVarL instanceof hmz) && ((hmz) bqsVarL).J() > 0) {
                    bi(xoa.SCROLL_LEFT);
                    break;
                } else {
                    ax(false);
                    break;
                }
                break;
            case 2:
            case 4:
                ((zdv) ((zdv) m.c()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "navigateScreen", 1646, "SearchResultActivity.kt")).u("Unexpected call to navigateScreen(HOME or CLOSE)");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                bi(xoaVar);
                break;
        }
        if (aH()) {
            bc(L());
        }
    }

    @Override // defpackage.ffm
    public final void t() throws IllegalStateException {
        String string = getString(R.string.err_no_internet);
        string.getClass();
        r(ap(string));
        aG(true);
        if (this.ak != null) {
            return;
        }
        try {
            Supplier supplier = this.F;
            DisplayManager displayManager = null;
            if (supplier == null) {
                agvy.b("mediaPlayerErrNoInternet");
                supplier = null;
            }
            MediaPlayer mediaPlayer = (MediaPlayer) supplier.get();
            this.ak = mediaPlayer;
            if (mediaPlayer == null) {
                aG(false);
                return;
            }
            try {
                ffp ffpVarAd = ad();
                ewd ewdVar = ewd.a;
                DisplayManager displayManager2 = this.s;
                if (displayManager2 == null) {
                    agvy.b("displayManager");
                } else {
                    displayManager = displayManager2;
                }
                ffpVarAd.c(ewdVar.a(displayManager) ? "led_set_is_hotword_source_true" : "led_set_is_hotword_source_false");
                ad().c("led_responding");
                MediaPlayer mediaPlayer2 = this.ak;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: hfz
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer3) {
                            SearchResultActivity searchResultActivity = this.a;
                            searchResultActivity.ad().c("led_to_idle_state");
                            searchResultActivity.aG(false);
                        }
                    });
                }
                MediaPlayer mediaPlayer3 = this.ak;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
            } catch (IllegalStateException e) {
                ((zdv) ((zdv) m.c()).p(e).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "startNetworkOfflineTtsPlayer", 2108, "SearchResultActivity.kt")).u("Error playing offline TTS.");
                aG(false);
                ad().c("led_to_idle_state");
                MediaPlayer mediaPlayer4 = this.ak;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.release();
                }
            }
        } catch (RuntimeException e2) {
            ((zdv) ((zdv) m.c()).p(e2).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "playNetworkOfflineTts", 2083, "SearchResultActivity.kt")).u("Error creating MediaPlayer.");
            aG(false);
        }
    }

    @Override // defpackage.ffm
    public final void u() {
        aU();
    }

    @Override // defpackage.ffm
    public final void v() {
        ak().e();
    }

    @Override // defpackage.ffm
    public final void w() {
        ak().f();
    }

    @Override // defpackage.ffm
    public final void x() {
        ((zdv) m.b().q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity", "stopSearchActivity", 2321, "SearchResultActivity.kt")).u("#stopSearchActivity");
        if (ai() != gph.a && ai() != gph.c) {
            finish();
        } else if (aM() == 0) {
            finish();
        }
    }

    @Override // defpackage.ffm
    public final void y(jov jovVar) {
        int i = ((job) jovVar).a;
        if (i == 0) {
            aa().e();
            this.W = 2;
            return;
        }
        if (i == 1) {
            this.W = 2;
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.W = 3;
                hfo hfoVar = this.ai;
                if (hfoVar != null) {
                    hfoVar.c();
                }
                aZ(L());
                aZ(M());
                return;
            }
            if (i == 4) {
                this.W = 4;
                aa().c();
                return;
            }
            if (i == 5) {
                aa().d();
                this.W = 1;
                return;
            }
            if (i == 7) {
                aa().e();
                if (aI()) {
                    aF();
                }
                int iAM = aM();
                if (iAM != 0) {
                    int i2 = iAM - 1;
                    if (i2 == 2) {
                        ak().g();
                    } else if (i2 == 9) {
                        bg();
                    }
                }
                ad().t(7);
                if (ai() == gph.b && U().getVisibility() == 8) {
                    aL().b(U()).start();
                    return;
                }
                return;
            }
            if (i != 27) {
                return;
            }
        }
        this.W = 1;
    }

    @Override // defpackage.ffm
    public final void z(SuggestionChipList suggestionChipList) {
        ak().h(suggestionChipList);
    }

    @Override // defpackage.hhh
    public final void aE(int i) {
    }
}
