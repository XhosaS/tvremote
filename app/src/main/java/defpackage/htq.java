package defpackage;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public class htq extends hth implements hmv {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/textresponse/PreviewTextResponseFragment");
    private static final Duration aA = Duration.ofMillis(100);
    static final Duration b = Duration.ofSeconds(5);
    private boolean aB;
    private LogoView aC;
    private int aD;
    public int ah;
    public ViewTreeObserver.OnPreDrawListener ai;
    hzw aj;
    hzx ak;
    SuggestionChipList al;
    public fev am;
    public hkz an;
    public final Handler c;
    public final fej d;
    public final Runnable e;
    ScrollView f;

    public htq() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = handler;
        this.d = new fej(handler, aA, new htm(this));
        this.e = new Runnable() { // from class: htn
            @Override // java.lang.Runnable
            public final void run() {
                fej fejVar = this.a.d;
                fejVar.a();
                Handler handler2 = fejVar.a;
                if (handler2.getLooper().getThread() == Thread.currentThread()) {
                    fejVar.b.run();
                } else {
                    handler2.post(fejVar.b);
                }
            }
        };
        this.aD = 10;
    }

    private final void aH(final View view) {
        if (this.ai == null) {
            this.c.removeCallbacks(this.e);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: hto
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    TextView textView;
                    htq htqVar = this.a;
                    if (htqVar.f != null && (textView = htqVar.aq) != null) {
                        if (textView.isLayoutRequested() || htqVar.f.isLayoutRequested()) {
                            return false;
                        }
                        if (htqVar.f.getHeight() >= htqVar.aq.getMeasuredHeight()) {
                            hzw hzwVar = htqVar.aj;
                            if (hzwVar != null && hzwVar.getHasSuggestions()) {
                                htqVar.aG(htqVar.f, htqVar.aq.getMeasuredHeight());
                            }
                        } else if (htqVar.f.getHeight() >= htqVar.ah) {
                            feq.e(htqVar.c, htq.b, htqVar.e);
                        } else {
                            int measuredHeight = htqVar.aq.getMeasuredHeight();
                            int i = htqVar.ah;
                            if (measuredHeight >= i) {
                                htqVar.aG(htqVar.f, i);
                                return false;
                            }
                            htqVar.aG(htqVar.f, htqVar.aq.getMeasuredHeight());
                        }
                    }
                    view.getViewTreeObserver().removeOnPreDrawListener(htqVar.ai);
                    htqVar.ai = null;
                    return true;
                }
            };
            this.ai = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    private final void aK(SuggestionChipList suggestionChipList, hzw hzwVar, hzx hzxVar) {
        hzxVar.e();
        SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) hzwVar;
        suggestionsScrollView.i();
        suggestionsScrollView.h(suggestionChipList);
        if (hzwVar.getHasSuggestions()) {
            hzwVar.d();
        }
        View view = this.R;
        if (view != null) {
            aH(view);
        }
    }

    private final void aL(int i) {
        LogoView logoView = this.aC;
        if (logoView == null) {
            return;
        }
        logoView.d(i, true);
    }

    @Override // defpackage.htu, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hld hldVar = new hld(layoutInflater);
        hldVar.b(R.layout.preview_text_response_container);
        hldVar.b.e = new hlc() { // from class: htk
            @Override // defpackage.hlc
            public final void a() {
                htq htqVar = this.a;
                htqVar.an.a();
                gmd gmdVar = htqVar.av;
                gmc gmcVar = gmc.D;
                gmc gmcVar2 = gmc.J;
                gmdVar.q(gmcVar, gmcVar2, htqVar.ax.a(), hkb.c(htqVar));
                htqVar.ay.C(gmcVar2, Instant.EPOCH);
                htqVar.au.y(gma.i);
                if (((Boolean) htqVar.aw.a()).booleanValue()) {
                    ((gfn) htqVar.as.a()).a(rpm.co()).b().c();
                } else {
                    htqVar.at.a(rpm.co(), abqb.OK, null, null);
                }
                if (((Boolean) htqVar.ar.a()).booleanValue() && htqVar.ax.b() != null) {
                    String strB = htqVar.ax.b();
                    gfl gflVarA = ((gfn) htqVar.as.a()).a(rpm.cR()).a(strB);
                    gflVarA.h(strB);
                    gflVarA.c();
                    gfg gfgVarA = ((gfn) htqVar.as.a()).c(rpm.dX()).a(htqVar.ax.b());
                    gfgVarA.g(strB);
                    gfgVarA.c(abqb.OK);
                }
                htqVar.az.af();
                ((zdv) ((zdv) htq.a.b()).q("com/google/android/apps/tvsearch/results/textresponse/PreviewTextResponseFragment", "onCreateView", 176, "PreviewTextResponseFragment.java")).u("Result displayed text.");
            }
        };
        return hldVar.a();
    }

    @Override // defpackage.htu
    public final void aB(String str) {
        super.aB(str);
        View view = this.R;
        if (view != null) {
            aH(view);
        }
    }

    @Override // defpackage.htu
    public final void aD(SuggestionChipList suggestionChipList) {
        hzw hzwVar;
        hzx hzxVar = this.ak;
        if (hzxVar == null || (hzwVar = this.aj) == null) {
            if (suggestionChipList.f) {
                this.al = null;
                return;
            } else {
                this.al = suggestionChipList;
                return;
            }
        }
        if (!suggestionChipList.f) {
            aK(suggestionChipList, hzwVar, hzxVar);
            return;
        }
        htp htpVar = new htp(this);
        SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) hzxVar;
        suggestionsScrollView.f();
        AnimatorSet animatorSet = suggestionsScrollView.b;
        if (animatorSet != null) {
            animatorSet.addListener(htpVar);
        }
    }

    public final void aE() {
        ScrollView scrollView = this.f;
        if (scrollView != null && this.aq != null && scrollView.getScrollY() + this.f.getHeight() < this.aq.getMeasuredHeight()) {
            this.f.scrollBy(0, 2);
            return;
        }
        Handler handler = this.c;
        fej fejVar = this.d;
        fejVar.getClass();
        handler.post(new htj(fejVar));
    }

    @Override // defpackage.htu
    public final void aF(jov jovVar) {
        int i = ((job) jovVar).a;
        if (i == 4) {
            this.aD = 11;
            aL(11);
        } else if (i == 5) {
            this.aD = 10;
            aL(10);
        } else if (i == 3) {
            this.aD = 4;
            aL(4);
        }
    }

    public final void aG(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.hmv
    public final boolean aI() {
        return false;
    }

    @Override // defpackage.hmv
    public final boolean aJ() {
        return this.aB;
    }

    @Override // defpackage.htu, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        hzx hzxVar;
        hzw hzwVar;
        super.aa(view, bundle);
        LogoView logoView = (LogoView) view.findViewById(R.id.preview_logo_view);
        this.aC = logoView;
        hvh.a(logoView);
        aL(this.aD);
        if (view instanceof hle) {
            view.getLayoutParams().height = -1;
        }
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.preview_scroll_container);
        this.f = scrollView;
        if (scrollView != null) {
            scrollView.requestFocus();
        }
        this.ah = (int) view.getResources().getDimension(R.dimen.long_response_height);
        this.aB = true;
        SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) view.findViewById(R.id.suggestions_scrollview);
        this.aj = suggestionsScrollView;
        this.ak = suggestionsScrollView;
        suggestionsScrollView.d = new hsu() { // from class: htl
            @Override // defpackage.hsu
            public final void a(SuggestionChipItem suggestionChipItem, View view2) {
                htq htqVar = this.a;
                htqVar.at.b(rpm.E(), null, null);
                htqVar.az.d(view2, suggestionChipItem);
                htqVar.az.E(6);
                ghr ghrVar = htqVar.az;
                String str = suggestionChipItem.a;
                ghrVar.ad(str, 4, 1);
                htqVar.am.f(str);
            }
        };
        SuggestionChipList suggestionChipList = this.al;
        if (suggestionChipList != null && (hzxVar = this.ak) != null && (hzwVar = this.aj) != null) {
            aK(suggestionChipList, hzwVar, hzxVar);
        }
        aH(view);
    }

    @Override // defpackage.htu, defpackage.bq
    public final void e() {
        fej fejVar = this.d;
        fejVar.getClass();
        this.c.post(new htj(fejVar));
        super.e();
    }
}
