package com.google.android.apps.tvsearch.searchbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.apps.tvsearch.searchbar.widget.StreamingTextView;
import com.google.android.apps.tvsearch.widget.bounded.BoundedHorizontalScrollView;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import defpackage.aehg;
import defpackage.agow;
import defpackage.agvy;
import defpackage.fex;
import defpackage.gfr;
import defpackage.ghr;
import defpackage.glq;
import defpackage.gmd;
import defpackage.gmu;
import defpackage.gph;
import defpackage.hsu;
import defpackage.hvh;
import defpackage.hvo;
import defpackage.hvp;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.hwy;
import defpackage.hxr;
import defpackage.hxv;
import defpackage.hyj;
import defpackage.hyk;
import defpackage.hzc;
import defpackage.hzd;
import defpackage.hzl;
import defpackage.hzw;
import defpackage.hzx;
import defpackage.iaj;
import defpackage.iak;
import defpackage.iam;
import defpackage.iao;
import defpackage.jbn;
import defpackage.jdt;
import defpackage.lu;
import defpackage.usd;
import defpackage.uta;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SearchBar extends ConstraintLayout implements hzc, hzd, hvu {
    public static final zdy h = zdy.h("com/google/android/apps/tvsearch/searchbar/SearchBar");
    public HorizontalScrollView A;
    public InputMethodManager B;
    public ImageView C;
    public lu D;
    public EditText E;
    public LogoView F;
    public TextView G;
    public TextView H;
    public iak I;
    public View J;
    public ViewTreeObserver.OnScrollChangedListener K;
    public SuggestionsScrollView L;
    public StreamingTextView M;
    public TextWatcher N;
    int O;
    public uta P;
    public ValueAnimator Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public iaj T;
    private jdt U;
    private jbn V;
    private hsu W;
    private hzl aa;
    private hwy ab;
    public final LayoutInflater i;
    public final hyk j;
    public AccessibilityManager k;
    public agow l;
    public hxv m;
    public agow n;
    public gfr o;
    public glq p;
    public gmd q;
    public agow r;
    public fex s;
    public gmu t;
    public ghr u;
    public ImageView v;
    public boolean w;
    public TextView x;
    TextView y;
    public gph z;

    public SearchBar(Context context) {
        this(context, null);
    }

    private final void x() {
        if (this.m.b()) {
            this.i.inflate(R.layout.search_bar_response_gemini, (ViewGroup) this, true);
        } else if (this.z == gph.a || this.z == gph.c) {
            this.i.inflate(R.layout.search_bar_response_amati, (ViewGroup) this, true);
        } else {
            this.i.inflate(R.layout.search_bar_response_watson, (ViewGroup) this, true);
        }
        this.H = (TextView) findViewById(R.id.response);
        this.y = (TextView) findViewById(R.id.response_exit_text);
    }

    private final void y() {
        if (this.z == gph.a || this.z == gph.c) {
            this.i.inflate(R.layout.search_bar_suggestions_scrollview_amati, (ViewGroup) this, true);
            this.D = (lu) findViewById(R.id.keyboard_icon);
            SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) findViewById(R.id.suggestions_scrollview);
            this.L = suggestionsScrollView;
            suggestionsScrollView.f = this.D;
        } else {
            this.i.inflate(R.layout.search_bar_suggestions_scrollview_watson, (ViewGroup) this, true);
            this.L = (SuggestionsScrollView) findViewById(R.id.suggestions_scrollview);
        }
        SuggestionsScrollView suggestionsScrollView2 = this.L;
        if (suggestionsScrollView2 == null) {
            return;
        }
        this.K = new ViewTreeObserver.OnScrollChangedListener() { // from class: hvk
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                SearchBar searchBar = this.a;
                if (searchBar.L.getScrollX() == 0) {
                    View view = searchBar.J;
                    if (view != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (searchBar.J == null) {
                    if (searchBar.z == gph.a || searchBar.z == gph.c) {
                        searchBar.i.inflate(R.layout.search_bar_suggestion_scroll_fade_amati, (ViewGroup) searchBar, true);
                        searchBar.J = searchBar.findViewById(R.id.suggestion_scroll_fade);
                        searchBar.J.setBackgroundResource(R.drawable.suggestion_scroll_fade_amati);
                    } else {
                        searchBar.i.inflate(R.layout.search_bar_suggestion_scroll_fade_watson, (ViewGroup) searchBar, true);
                        searchBar.J = searchBar.findViewById(R.id.suggestion_scroll_fade);
                        TextView promptText = searchBar.getPromptText();
                        promptText.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        int measuredWidth = promptText.getMeasuredWidth();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) promptText.getLayoutParams();
                        int marginStart = ((measuredWidth + marginLayoutParams.getMarginStart()) + marginLayoutParams.getMarginEnd()) - searchBar.getResources().getDimensionPixelSize(R.dimen.suggestion_chip_first_margin_start);
                        searchBar.getSuggestionsScrollView().setPaddingRelative(marginStart, 0, 0, 0);
                        ((ViewGroup.MarginLayoutParams) searchBar.J.getLayoutParams()).setMarginStart(marginStart + searchBar.getSuggestionsScrollView().getLeft());
                        searchBar.J.requestLayout();
                    }
                }
                searchBar.J.setVisibility(0);
            }
        };
        suggestionsScrollView2.getViewTreeObserver().addOnScrollChangedListener(this.K);
        this.L.d = this.W;
    }

    private final void z() {
        if (this.m.b()) {
            this.i.inflate(R.layout.search_bar_user_query_gemini, (ViewGroup) this, true);
        } else if (this.z == gph.a || this.z == gph.c) {
            this.i.inflate(R.layout.search_bar_user_query_amati, (ViewGroup) this, true);
        } else {
            this.i.inflate(R.layout.search_bar_user_query_watson, (ViewGroup) this, true);
        }
        this.M = (StreamingTextView) findViewById(R.id.user_query);
        this.A = (HorizontalScrollView) findViewById(R.id.user_query_container);
        if (this.m.b()) {
            StreamingTextView streamingTextView = this.M;
            if (streamingTextView != null) {
                streamingTextView.setPendingColor(getContext().getColor(R.color.search_bar_pending_text_gemini));
            }
            HorizontalScrollView horizontalScrollView = this.A;
            if (horizontalScrollView instanceof BoundedHorizontalScrollView) {
                ((BoundedHorizontalScrollView) horizontalScrollView).setMaximumWidth((int) (getResources().getDimension(R.dimen.search_bar_max_width_gemini) - getMeasuredHeight()));
            }
        }
        hvo hvoVar = new hvo(this);
        this.N = hvoVar;
        StreamingTextView streamingTextView2 = this.M;
        if (streamingTextView2 != null) {
            streamingTextView2.addTextChangedListener(hvoVar);
        }
        HorizontalScrollView horizontalScrollView2 = this.A;
        if (horizontalScrollView2 != null) {
            horizontalScrollView2.setFocusableInTouchMode(false);
            this.A.setFocusable(false);
        }
        if (this.H == null) {
            x();
        }
    }

    public final HorizontalScrollView e() {
        if (this.A == null) {
            z();
        }
        return this.A;
    }

    public final StreamingTextView f() {
        if (this.M == null) {
            z();
        }
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        SuggestionsScrollView suggestionsScrollView;
        super.focusableViewAvailable(view);
        if (this.ab != null && view == (suggestionsScrollView = this.L) && suggestionsScrollView.getHasSuggestions()) {
            hwy hwyVar = this.ab;
            zdy zdyVar = hxr.f;
            hxr hxrVar = hwyVar.a;
            gph gphVar = hxrVar.w;
            if ((gphVar == gph.a || gphVar == gph.c) && hxrVar.as == 2) {
                hvu hvuVar = hxrVar.ab;
                if (hvuVar == null) {
                    agvy.b("searchBarViewManager");
                    hvuVar = null;
                }
                ((SearchBar) hvuVar).getSuggestionsScrollView().requestFocus(33);
            }
        }
    }

    @Override // defpackage.hzd, defpackage.hvu
    public final void g() {
        if ((this.z == gph.a || this.z == gph.c) && this.E != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.E.setOnApplyWindowInsetsListener(null);
                if (this.E.getWindowInsetsController() != null) {
                    this.E.getWindowInsetsController().hide(WindowInsets.Type.ime());
                }
            } else {
                this.B.hideSoftInputFromWindow(this.E.getWindowToken(), 0);
            }
            ImageView imageView = this.C;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    public TextView getExitPrompt() {
        if (this.x == null) {
            if (this.m.b()) {
                this.x = (TextView) this.i.inflate(R.layout.search_bar_prompt_text_gemini, (ViewGroup) this, false);
            } else if (this.z == gph.a || this.z == gph.c) {
                this.x = (TextView) this.i.inflate(R.layout.search_bar_prompt_text_amati, (ViewGroup) this, false);
            } else {
                this.x = (TextView) this.i.inflate(R.layout.search_bar_prompt_text, (ViewGroup) this, false);
            }
            addView(this.x);
        }
        return this.x;
    }

    public TextView getExitResponse() {
        if (this.y == null) {
            x();
        }
        return this.y;
    }

    public int getHesitatedPromptId() {
        return getSuggestionChipsViewManager().getHasSuggestions() ? (this.z == gph.a || this.z == gph.c) ? R.string.assistant_try_saying_prompt_amati : R.string.assistant_try_saying_prompt : (this.z == gph.a || this.z == gph.c) ? R.string.assistant_empty_prompt : R.string.assistant_listening_prompt;
    }

    public int getIdlePromptId() {
        return (this.z == gph.a || this.z == gph.c || !getSuggestionChipsViewManager().getHasSuggestions()) ? this.U.U() ? this.m.b() ? R.string.hold_down_mic_button_prompt : R.string.assistant_hold_down_button_prompt : R.string.assistant_press_button_prompt : R.string.assistant_try_saying_prompt;
    }

    public InputMethodManager getInputMethodManager() {
        return this.B;
    }

    @Override // defpackage.hzc
    public lu getKeyboardIcon() {
        if (this.D == null && this.L == null) {
            y();
        }
        return this.D;
    }

    @Override // defpackage.hzc
    public EditText getKeyboardInputBox() throws Resources.NotFoundException {
        if ((this.z == gph.a || this.z == gph.c) && this.E == null) {
            EditText editText = (EditText) this.i.inflate(R.layout.search_bar_keyboard_input, (ViewGroup) this, false);
            this.E = editText;
            addView(editText);
            if (this.m.b()) {
                ViewGroup.LayoutParams layoutParams = this.E.getLayoutParams();
                if (layoutParams instanceof zr) {
                    zr zrVar = (zr) layoutParams;
                    float dimension = getResources().getDimension(R.dimen.search_bar_max_width_gemini);
                    float dimension2 = getResources().getDimension(R.dimen.search_bar_user_query_padding_start_end_gemini);
                    zrVar.width = (int) (dimension - (dimension2 + dimension2));
                    zrVar.l = 0;
                    zrVar.setMarginStart(0);
                    zrVar.topMargin = 0;
                }
            }
        }
        return this.E;
    }

    public TextView getPromptText() {
        if (this.G == null) {
            if (this.m.b()) {
                this.G = (TextView) this.i.inflate(R.layout.search_bar_prompt_text_gemini, (ViewGroup) this, false);
            } else if (this.z == gph.a || this.z == gph.c) {
                this.G = (TextView) this.i.inflate(R.layout.search_bar_prompt_text_amati, (ViewGroup) this, false);
            } else {
                this.G = (TextView) this.i.inflate(R.layout.search_bar_prompt_text, (ViewGroup) this, false);
            }
            addView(this.G);
        }
        return this.G;
    }

    public TextView getResponse() {
        if (this.H == null) {
            x();
        }
        return this.H;
    }

    public iak getSearchBarTextAnimation() {
        return this.I;
    }

    @Override // defpackage.hvu
    public hzw getSuggestionChipsViewManager() {
        return getSuggestionsScrollView();
    }

    @Override // defpackage.hzc
    public hzl getSuggestionsDistributor() {
        if (this.aa == null) {
            SuggestionsScrollView suggestionsScrollView = getSuggestionsScrollView();
            boolean z = true;
            if (this.z != gph.a && this.z != gph.c) {
                z = false;
            }
            this.aa = new hvv(suggestionsScrollView, z);
        }
        return this.aa;
    }

    public SuggestionsScrollView getSuggestionsScrollView() {
        if (this.L == null) {
            y();
        }
        return this.L;
    }

    @Override // defpackage.hzd
    public final void h() {
        iao iaoVar = (iao) getSearchBarTextAnimation();
        AnimatorSet animatorSet = iaoVar.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View view = iaoVar.b;
        if (view != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(iaoVar.f(view));
            animatorSet2.addListener(new iam(iaoVar));
            animatorSet2.start();
            iaoVar.a = animatorSet2;
        }
        iaoVar.b = null;
        if (this.m.b()) {
            this.P.c((LayerDrawable) getBackground());
        }
    }

    @Override // defpackage.hzd
    public final void i() {
        if (this.m.b()) {
            return;
        }
        k(getHesitatedPromptId(), false);
    }

    @Override // defpackage.hzd
    public final void j() {
        n(getHesitatedPromptId(), false);
    }

    public final void k(int i, boolean z) {
        if (this.m.b()) {
            this.P.b((LayerDrawable) getBackground());
        }
        TextView promptText = getPromptText();
        promptText.setText(i);
        promptText.setTag(R.id.prompt_id_tag, Long.valueOf(i));
        final CharSequence text = promptText.getText();
        if (z) {
            getSearchBarTextAnimation().b(promptText, 1.0f, new Runnable() { // from class: hvj
                @Override // java.lang.Runnable
                public final void run() {
                    SearchBar searchBar = this.a;
                    if (searchBar.k.isTouchExplorationEnabled() && searchBar.v()) {
                        CharSequence charSequence = text;
                        ((zdv) ((zdv) SearchBar.h.b()).q("com/google/android/apps/tvsearch/searchbar/SearchBar", "sendAccessibilityAnnouncement", 1224, "SearchBar.java")).x("#sendAccessibilityAnnouncement(%s)", charSequence);
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                        accessibilityEventObtain.getText().add(charSequence);
                        searchBar.k.sendAccessibilityEvent(accessibilityEventObtain);
                    }
                }
            });
        } else {
            getSearchBarTextAnimation().e(promptText);
        }
    }

    @Override // defpackage.hzd
    public final void l() {
        getSearchBarTextAnimation().c(getPromptText());
        if (this.m.b()) {
            this.P.c((LayerDrawable) getBackground());
        }
    }

    public final void m(int i) {
        TextView promptText = getPromptText();
        if (!(promptText.getTag(R.id.prompt_id_tag) instanceof Long)) {
            ((zdv) ((zdv) h.d()).q("com/google/android/apps/tvsearch/searchbar/SearchBar", "performPromptSwitch", 950, "SearchBar.java")).u("#performPromptSwitch cannot switch without a tag.");
            return;
        }
        int iIntValue = ((Long) promptText.getTag(R.id.prompt_id_tag)).intValue();
        if (i != iIntValue) {
            TextView exitPrompt = getExitPrompt();
            exitPrompt.setVisibility(0);
            exitPrompt.setText(iIntValue);
            getSearchBarTextAnimation().d(exitPrompt, promptText);
        }
    }

    public final void n(int i, boolean z) {
        TextView promptText = getPromptText();
        if (!(promptText.getTag(R.id.prompt_id_tag) instanceof Long)) {
            ((zdv) ((zdv) h.d()).q("com/google/android/apps/tvsearch/searchbar/SearchBar", "performRefreshPrompt", 979, "SearchBar.java")).u("#performRefreshPrompt cannot refresh without a tag.");
            k(i, z);
            return;
        }
        int iIntValue = ((Long) promptText.getTag(R.id.prompt_id_tag)).intValue();
        if (i != iIntValue) {
            TextView exitPrompt = getExitPrompt();
            exitPrompt.setVisibility(0);
            exitPrompt.setText(iIntValue);
            getSearchBarTextAnimation().d(exitPrompt, promptText);
            k(i, z);
        }
    }

    @Override // defpackage.hzd
    public final void o() {
        getSearchBarTextAnimation().c(getResponse());
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        LogoView logoView = (LogoView) findViewById(R.id.logo_view);
        this.F = logoView;
        if (logoView != null) {
            logoView.b(new hyj(), 5);
            if (this.z == gph.a || this.z == gph.c) {
                hvh.a(this.F);
            } else {
                this.F.c(53.58f, 17.86f);
            }
        }
        if (this.V.e()) {
            setImportantForAccessibility(0);
        } else {
            setImportantForAccessibility(2);
        }
    }

    @Override // defpackage.hzd
    public final void p(String str) {
        TextView response = getResponse();
        CharSequence text = response.getText();
        if (str.contentEquals(text)) {
            return;
        }
        TextView exitResponse = getExitResponse();
        exitResponse.setVisibility(0);
        exitResponse.setText(text);
        getSearchBarTextAnimation().d(exitResponse, response);
        response.setText(str);
        getSearchBarTextAnimation().e(response);
    }

    @Override // defpackage.hzd
    public final void q() {
        if (this.m.b()) {
            return;
        }
        hvv hvvVar = (hvv) getSuggestionsDistributor();
        if (hvvVar.b) {
            hvvVar.a.e();
            return;
        }
        hzx hzxVar = hvvVar.c;
        if (hzxVar != null) {
            hzxVar.e();
        }
    }

    @Override // defpackage.hzd
    public final void r() {
        if (this.m.b()) {
            return;
        }
        hvv hvvVar = (hvv) getSuggestionsDistributor();
        if (hvvVar.b) {
            hvvVar.a.f();
            return;
        }
        hzx hzxVar = hvvVar.c;
        if (hzxVar != null) {
            hzxVar.f();
        }
    }

    @Override // defpackage.hzd
    public final void s() {
        getSearchBarTextAnimation().c(e());
    }

    @Override // defpackage.hzd
    public final void t() throws Resources.NotFoundException {
        EditText keyboardInputBox = getKeyboardInputBox();
        if (keyboardInputBox != null) {
            keyboardInputBox.callOnClick();
        }
    }

    @Override // defpackage.hzd
    public final void u(int i, boolean z) {
        if (!this.m.b()) {
            LogoView logoView = this.F;
            if (logoView != null) {
                if (!this.w) {
                    if (i == 10) {
                        i = 7;
                    } else if (i == 11) {
                        i = 5;
                    }
                }
                logoView.d(i, z);
                return;
            }
            return;
        }
        if (i == this.O || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.P == null) {
            this.P = new uta();
        }
        if (i == 2) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.Q;
                valueAnimator2.end();
                valueAnimator2.removeAllUpdateListeners();
                ((View) getParent()).setLayerType(0, null);
            }
            ((View) getParent()).setLayerType(2, null);
            LayerDrawable layerDrawable = (LayerDrawable) getBackground();
            layerDrawable.getClass();
            Object drawable = layerDrawable.getDrawable(0);
            drawable.getClass();
            ValueAnimator valueAnimatorA = ((usd) drawable).a();
            valueAnimatorA.start();
            this.R = valueAnimatorA;
        } else if (i == 4) {
            ValueAnimator valueAnimator3 = this.R;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                ValueAnimator valueAnimator4 = this.R;
                valueAnimator4.end();
                valueAnimator4.removeAllUpdateListeners();
                ((View) getParent()).setLayerType(0, null);
            }
            ((View) getParent()).setLayerType(2, null);
            LayerDrawable layerDrawable2 = (LayerDrawable) getBackground();
            layerDrawable2.getClass();
            Object drawable2 = layerDrawable2.getDrawable(0);
            drawable2.getClass();
            ValueAnimator valueAnimatorC = ((usd) drawable2).c();
            valueAnimatorC.start();
            this.Q = valueAnimatorC;
        } else if (i != 11) {
            ValueAnimator valueAnimator5 = this.R;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                ValueAnimator valueAnimator6 = this.R;
                valueAnimator6.end();
                valueAnimator6.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator7 = this.Q;
            if (valueAnimator7 != null && valueAnimator7.isRunning()) {
                ValueAnimator valueAnimator8 = this.Q;
                valueAnimator8.end();
                valueAnimator8.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator9 = this.S;
            if (valueAnimator9 != null && valueAnimator9.isRunning()) {
                ValueAnimator valueAnimator10 = this.S;
                valueAnimator10.end();
                valueAnimator10.removeAllUpdateListeners();
            }
            ((View) getParent()).setLayerType(0, null);
        } else {
            ValueAnimator valueAnimator11 = this.Q;
            if (valueAnimator11 != null && valueAnimator11.isRunning()) {
                ValueAnimator valueAnimator12 = this.Q;
                valueAnimator12.end();
                valueAnimator12.removeAllUpdateListeners();
                ((View) getParent()).setLayerType(0, null);
            }
            ((View) getParent()).setLayerType(2, null);
            LayerDrawable layerDrawable3 = (LayerDrawable) getBackground();
            layerDrawable3.getClass();
            Object drawable3 = layerDrawable3.getDrawable(0);
            drawable3.getClass();
            ValueAnimator valueAnimatorB = ((usd) drawable3).b();
            valueAnimatorB.start();
            this.S = valueAnimatorB;
        }
        this.O = i;
    }

    @Override // defpackage.hvu
    public final boolean v() {
        return getVisibility() != 8;
    }

    @Override // defpackage.hvu
    public final void w(hwy hwyVar, hsu hsuVar) {
        this.ab = hwyVar;
        this.W = hsuVar;
        SuggestionsScrollView suggestionsScrollView = this.L;
        if (suggestionsScrollView != null) {
            suggestionsScrollView.d = hsuVar;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = true;
        this.O = 0;
        hvp hvpVar = (hvp) aehg.a(getContext().getApplicationContext(), hvp.class);
        this.k = hvpVar.u();
        this.U = hvpVar.cx();
        this.V = hvpVar.cv();
        this.l = hvpVar.gP();
        this.z = hvpVar.bj();
        this.m = hvpVar.bV();
        this.B = hvpVar.v();
        this.n = hvpVar.gQ();
        this.o = hvpVar.aX();
        this.p = hvpVar.bc();
        this.q = hvpVar.bd();
        this.r = hvpVar.gR();
        this.s = hvpVar.P();
        this.T = hvpVar.hr();
        this.t = hvpVar.be();
        this.u = hvpVar.aZ();
        this.j = new hyk();
        this.i = LayoutInflater.from(context);
        this.I = new iao(context);
    }
}
