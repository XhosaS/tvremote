package com.google.android.apps.tvsearch.searchbar.suggestions;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.HorizontalScrollView;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.katniss.R;
import defpackage.aehg;
import defpackage.ahj;
import defpackage.ghr;
import defpackage.gph;
import defpackage.hsu;
import defpackage.hzq;
import defpackage.hzr;
import defpackage.hzs;
import defpackage.hzu;
import defpackage.hzv;
import defpackage.hzw;
import defpackage.hzx;
import defpackage.hzz;
import defpackage.iaa;
import defpackage.iab;
import defpackage.iac;
import defpackage.iad;
import defpackage.iae;
import defpackage.iaf;
import defpackage.iag;
import defpackage.jpq;
import defpackage.jpr;
import defpackage.lu;
import defpackage.pan;
import defpackage.paq;
import defpackage.zdy;
import defpackage.zoq;
import defpackage.zot;
import defpackage.zpg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuggestionsScrollView extends HorizontalScrollView implements hzw, hzv, hzx, iag {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/searchbar/suggestions/SuggestionsScrollView");
    public AnimatorSet b;
    public boolean c;
    public hsu d;
    public View e;
    public lu f;
    public boolean g;
    public boolean h;
    private AccessibilityManager i;
    private iad j;
    private gph k;
    private ghr l;
    private final LayoutInflater m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private boolean r;
    private ViewGroup s;
    private SuggestionChipList t;
    private hzq u;
    private hzr v;

    public SuggestionsScrollView(Context context) {
        this(context, null);
    }

    public static int g(View view) {
        if (view == null || !(view.getTag(R.id.chip_id_tag) instanceof Long)) {
            return -2;
        }
        return ((Long) view.getTag(R.id.chip_id_tag)).intValue();
    }

    private final Animator k(View view) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.suggest_enter);
        animatorLoadAnimator.setTarget(view);
        animatorLoadAnimator.addListener(new iaa(view));
        return animatorLoadAnimator;
    }

    private final Animator l(View view) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.suggest_exit);
        animatorLoadAnimator.setTarget(view);
        animatorLoadAnimator.addListener(new iab(view));
        return animatorLoadAnimator;
    }

    private final void m(SuggestionChipList suggestionChipList) {
        if (!suggestionChipList.f) {
            List list = suggestionChipList.d;
            switch (suggestionChipList.e) {
                case 41160:
                    this.l.q(zpg.OPA_TV_SEARCH_SUGGESTION_CHIPS, list, suggestionChipList.c);
                    break;
                case 67495:
                    this.l.f(this, zpg.OPA_TV_ZERO_STATE_SUGGESTION_CHIPS, list);
                    break;
                case 157862:
                    this.l.O(this, zpg.OPA_TV_KEYBOARD_SUGGESTION_CHIPS, list, suggestionChipList.c, 3);
                    break;
                case 157863:
                    this.l.O(this, zpg.OPA_TV_KEYBOARD_SUGGESTION_CHIPS, list, suggestionChipList.c, 2);
                    break;
            }
        }
    }

    @Override // defpackage.hzv
    public final void a(View view, SuggestionChipItem suggestionChipItem) {
        hsu hsuVar = this.d;
        if (hsuVar != null) {
            hsuVar.a(suggestionChipItem, view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i == 130 || i == 33) {
            if (j()) {
                arrayList.add(this.e);
            }
        } else {
            ViewGroup viewGroup = this.s;
            if (viewGroup != null) {
                viewGroup.addFocusables(arrayList, i, i2);
            }
        }
    }

    @Override // defpackage.hzv
    public final void b(View view) {
        this.e = view;
        smoothScrollTo(((view.getLeft() + view.getRight()) - getWidth()) / 2, 0);
    }

    @Override // defpackage.hzw
    public final void c() {
        i();
        this.c = false;
    }

    @Override // defpackage.hzw
    public final void d() {
        boolean z;
        hasFocus();
        if (j()) {
            this.e.requestFocus();
            z = false;
        } else {
            z = true;
        }
        this.c = z;
    }

    @Override // defpackage.hzx
    public final void e() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            if (this.r) {
                return;
            } else {
                this.b.cancel();
            }
        }
        if (getVisibility() != 0) {
            ViewGroup suggestionContainer = getSuggestionContainer();
            int childCount = suggestionContainer.getChildCount();
            if (childCount == 0) {
                setVisibility(0);
                lu luVar = this.f;
                if (luVar != null) {
                    luVar.setAlpha(0.0f);
                    this.f.setVisibility(0);
                    this.f.setFocusable(true);
                    return;
                }
                return;
            }
            int i = this.n;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.b = animatorSet2;
            this.r = true;
            animatorSet2.addListener(new hzz(this));
            int i2 = this.f != null ? -1 : 0;
            AnimatorSet.Builder builderPlay = null;
            while (i2 < childCount) {
                Animator animatorK = i2 == -1 ? k(this.f) : k(suggestionContainer.getChildAt(i2));
                animatorK.setStartDelay(i);
                i += this.o;
                if (builderPlay == null) {
                    builderPlay = this.b.play(animatorK);
                } else {
                    builderPlay.with(animatorK);
                }
                i2++;
            }
            this.b.start();
            SuggestionChipList suggestionChipList = this.t;
            if (suggestionChipList != null) {
                m(suggestionChipList);
            }
        }
    }

    @Override // defpackage.hzx
    public final void f() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            if (!this.r) {
                return;
            } else {
                this.b.cancel();
            }
        }
        if (getVisibility() == 8) {
            return;
        }
        ViewGroup suggestionContainer = getSuggestionContainer();
        int i = 0;
        if (suggestionContainer.getChildCount() == 0) {
            setVisibility(8);
            lu luVar = this.f;
            if (luVar != null) {
                luVar.setVisibility(8);
                this.f.setFocusable(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b = animatorSet2;
        this.r = false;
        animatorSet2.addListener(new iac(this));
        int i2 = this.f == null ? 0 : -1;
        AnimatorSet.Builder builderPlay = null;
        while (i2 < suggestionContainer.getChildCount()) {
            Animator animatorL = i2 == -1 ? l(this.f) : l(suggestionContainer.getChildAt(i2));
            animatorL.setStartDelay(i);
            i += this.p;
            if (builderPlay == null) {
                builderPlay = this.b.play(animatorL);
            } else {
                builderPlay.with(animatorL);
            }
            i2++;
        }
        this.b.start();
    }

    @Override // defpackage.iag
    public View getBestChip() {
        return this.e;
    }

    @Override // defpackage.hzw
    public boolean getHasSuggestions() {
        ViewGroup viewGroup = this.s;
        return (viewGroup != null && viewGroup.getChildCount() > 0) || this.h;
    }

    @Override // defpackage.iag
    public boolean getKeyCodeDownSeen() {
        return this.g;
    }

    public SuggestionChipList getSuggestionChipList() {
        return this.t;
    }

    public ViewGroup getSuggestionContainer() {
        ViewGroup viewGroup;
        if (this.s == null) {
            ViewGroup viewGroup2 = (ViewGroup) this.m.inflate(R.layout.suggestions_container, (ViewGroup) this, false);
            this.s = viewGroup2;
            addView(viewGroup2);
            if (this.i.isTouchExplorationEnabled() && (viewGroup = this.s) != null) {
                ahj.n(viewGroup, new iaf(this));
            }
        }
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(SuggestionChipList suggestionChipList) {
        SuggestionsScrollView suggestionsScrollView;
        hzs suggestionChipViewControllerAmati;
        lu luVar;
        this.t = suggestionChipList;
        int childCount = getSuggestionContainer().getChildCount();
        for (SuggestionChipItem suggestionChipItem : suggestionChipList.d) {
            Context context = getContext();
            ViewGroup suggestionContainer = getSuggestionContainer();
            int childCount2 = suggestionContainer.getChildCount();
            if (this.k == gph.a || this.k == gph.c) {
                suggestionsScrollView = this;
                if (suggestionsScrollView.u == null) {
                    suggestionsScrollView.u = new hzq(getContext().getResources(), getContext());
                }
                suggestionChipViewControllerAmati = new SuggestionChipViewControllerAmati(suggestionChipItem, suggestionContainer, suggestionsScrollView.u, suggestionsScrollView, this);
            } else {
                if (this.v == null) {
                    this.v = new hzr(getContext().getResources(), getContext());
                }
                suggestionsScrollView = this;
                suggestionChipViewControllerAmati = new hzu(suggestionChipItem, suggestionContainer, this.v, suggestionsScrollView, this);
            }
            pan panVar = suggestionChipItem.f;
            zoq zoqVar = panVar.b;
            View viewB = suggestionChipViewControllerAmati.b();
            if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zoqVar.y();
            }
            zot zotVar = (zot) zoqVar.b;
            zot zotVar2 = zot.a;
            zotVar.b |= 2;
            zotVar.d = childCount2;
            panVar.e(1);
            paq.c(viewB, panVar);
            if (suggestionsScrollView.i.isTouchExplorationEnabled()) {
                viewB.setTag(R.id.chip_id_tag, Long.valueOf(childCount2));
                viewB.setContentDescription(context.getResources().getString(R.string.suggestion_chip_description, suggestionChipItem.a));
                if (suggestionsScrollView.j == null) {
                    suggestionsScrollView.j = new iad(suggestionContainer);
                }
                ahj.n(viewB, suggestionsScrollView.j);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewB.getLayoutParams();
            if (childCount2 == 0) {
                marginLayoutParams.setMarginStart(suggestionsScrollView.q);
                lu luVar2 = suggestionsScrollView.f;
                if (luVar2 != null) {
                    k(luVar2).start();
                    suggestionsScrollView.f.setFocusable(true);
                } else {
                    viewB.setOnKeyListener(new jpq(context instanceof jpr ? (jpr) context : null));
                }
                childCount2 = 0;
            }
            suggestionContainer.addView(viewB, marginLayoutParams);
            suggestionChipViewControllerAmati.c();
            if (!j()) {
                suggestionsScrollView.e = viewB;
                if (suggestionsScrollView.c || ((luVar = suggestionsScrollView.f) != null && luVar.hasFocus())) {
                    hasFocus();
                    suggestionsScrollView.e.requestFocus();
                    suggestionsScrollView.c = false;
                }
            }
            if (getVisibility() == 0) {
                Animator animatorK = k(viewB);
                if (childCount2 > childCount) {
                    animatorK.setStartDelay((childCount2 - childCount) * suggestionsScrollView.o);
                }
                animatorK.start();
            }
        }
        if (getVisibility() == 0) {
            m(suggestionChipList);
        }
    }

    public final void i() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.b.cancel();
        }
        this.b = null;
        this.e = null;
        ViewGroup viewGroup = this.s;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            for (int i = 0; i < this.s.getChildCount(); i++) {
                View childAt = this.s.getChildAt(i);
                childAt.setOnClickListener(null);
                childAt.setOnFocusChangeListener(null);
            }
            this.s.removeAllViews();
        }
        lu luVar = this.f;
        if (luVar != null) {
            luVar.setAlpha(0.0f);
            this.f.setFocusable(false);
        }
        this.t = null;
        this.g = false;
        scrollTo(0, 0);
        this.h = false;
    }

    public final boolean j() {
        return this.e != null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setImportantForAccessibility(2);
    }

    public SuggestionsScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SuggestionsScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        iae iaeVar = (iae) aehg.a(getContext().getApplicationContext(), iae.class);
        this.i = iaeVar.u();
        this.k = iaeVar.bj();
        this.l = iaeVar.aZ();
        this.m = LayoutInflater.from(context);
        Resources resources = context.getResources();
        this.n = resources.getInteger(R.integer.search_bar_text_fade_out_duration_ms);
        this.o = resources.getInteger(R.integer.suggest_enter_alpha_delay_ms);
        this.p = resources.getInteger(R.integer.suggest_exit_alpha_delay_ms);
        this.q = resources.getDimensionPixelSize(R.dimen.suggestion_chip_first_margin_start);
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hzy
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                SuggestionsScrollView suggestionsScrollView = this.a;
                if (view == suggestionsScrollView && z) {
                    if (!suggestionsScrollView.j()) {
                        ((zdv) ((zdv) SuggestionsScrollView.a.b()).q("com/google/android/apps/tvsearch/searchbar/suggestions/SuggestionsScrollView", "<init>", 172, "SuggestionsScrollView.java")).u("Setting focus on SuggestionsScrollView.this");
                    } else {
                        suggestionsScrollView.e.requestFocus();
                        suggestionsScrollView.c = false;
                    }
                }
            }
        });
        paq.c(this, new pan(97159));
    }
}
