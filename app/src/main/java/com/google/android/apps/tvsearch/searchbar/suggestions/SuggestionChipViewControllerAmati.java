package com.google.android.apps.tvsearch.searchbar.suggestions;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.motion.ScalingAnimator;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.katniss.R;
import defpackage.hlu;
import defpackage.hzq;
import defpackage.hzs;
import defpackage.hzv;
import defpackage.iag;
import defpackage.zpk;

/* compiled from: PG */
/* loaded from: classes.dex */
final class SuggestionChipViewControllerAmati implements View.OnClickListener, View.OnFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, hzs, hlu {
    final ArgbEvaluator a = new ArgbEvaluator();
    final TextView b;
    final GradientDrawable c;
    private final Drawable d;
    private final hzq e;
    private final SuggestionChipItem f;
    private final hzv g;
    private final iag h;
    private ScalingAnimator i;
    private int j;
    private int k;
    private float l;
    private int m;

    public SuggestionChipViewControllerAmati(SuggestionChipItem suggestionChipItem, ViewGroup viewGroup, hzq hzqVar, iag iagVar, hzv hzvVar) throws Resources.NotFoundException {
        Drawable drawable;
        this.f = suggestionChipItem;
        this.h = iagVar;
        this.g = hzvVar;
        this.e = hzqVar;
        Context context = viewGroup.getContext();
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.suggestion_chip_amati, viewGroup, false);
        this.b = textView;
        textView.setText(suggestionChipItem.a);
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        this.c = gradientDrawable;
        gradientDrawable.mutate();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.suggestion_chip_drawable_padding);
        textView.setOnClickListener(this);
        switch (((zpk) suggestionChipItem.f.a.b).d) {
            case 157862:
                drawable = resources.getDrawable(R.drawable.quantum_gm_ic_search_white_24, null);
                break;
            case 157863:
                drawable = resources.getDrawable(R.drawable.quantum_gm_ic_history_white_24, null);
                break;
            default:
                drawable = null;
                break;
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setTint(hzqVar.g);
            int textSize = (int) (hzqVar.o * textView.getTextSize());
            drawable.setBounds(0, 0, textSize, textSize);
            textView.setCompoundDrawablesRelative(drawable, null, null, null);
            textView.setCompoundDrawablePadding(dimensionPixelSize);
            textView.setGravity(16);
        }
    }

    @Override // defpackage.hlu
    public final void a(float f) {
        hzq hzqVar = this.e;
        Integer numValueOf = Integer.valueOf(hzqVar.g);
        Integer numValueOf2 = Integer.valueOf(hzqVar.a);
        ArgbEvaluator argbEvaluator = this.a;
        int iIntValue = ((Integer) argbEvaluator.evaluate(f, numValueOf, numValueOf2)).intValue();
        this.b.setTextColor(iIntValue);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setTint(iIntValue);
        }
        this.c.setColor(((Integer) argbEvaluator.evaluate(f, Integer.valueOf(hzqVar.h), Integer.valueOf(hzqVar.b))).intValue());
        d(f);
    }

    @Override // defpackage.hzs
    public final View b() {
        return this.b;
    }

    @Override // defpackage.hzs
    public final void c() {
        TextView textView = this.b;
        textView.measure(0, 0);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    final void d(float f) {
        float fMin = this.i.b == 1.0f ? Math.min(1.0f, f + f) : f;
        TextView textView = this.b;
        hzq hzqVar = this.e;
        textView.setTextSize(0, hzqVar.k + (this.l * fMin));
        int iRound = this.j + Math.round((1.0f - f) * this.k);
        float f2 = fMin * hzqVar.l;
        int iRound2 = hzqVar.i + Math.round(f2);
        Drawable drawable = this.d;
        if (drawable != null) {
            int iRound3 = Math.round(hzqVar.o * textView.getTextSize());
            drawable.setBounds(0, 0, iRound3, iRound3);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        if (iRound == marginLayoutParams.getMarginStart() && iRound2 == marginLayoutParams.height) {
            return;
        }
        if (iRound2 != marginLayoutParams.height) {
            this.c.setGradientRadius(iRound2 / 2.0f);
            marginLayoutParams.height = iRound2;
        }
        int i = iRound + iRound;
        marginLayoutParams.setMarginStart(iRound);
        marginLayoutParams.setMarginEnd(iRound);
        if (drawable != null) {
            int i2 = hzqVar.f;
            textView.setPaddingRelative(Math.round(f2 / 2.0f) + i2, 0, 0, 0);
            marginLayoutParams.width = (this.m - i) - i2;
        } else {
            marginLayoutParams.width = this.m - i;
        }
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.g.a(view, this.f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "sizeScale", 1.0f, 0.5f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(this.e.e);
        objectAnimatorOfFloat.setDuration(r0.c);
        objectAnimatorOfFloat.start();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SuggestionChipViewControllerAmati suggestionChipViewControllerAmati;
        View bestChip = this.h.getBestChip();
        ScalingAnimator scalingAnimator = this.i;
        if (scalingAnimator == null) {
            suggestionChipViewControllerAmati = this;
            ScalingAnimator scalingAnimator2 = new ScalingAnimator(suggestionChipViewControllerAmati, r0.d, r0.c, this.e.e);
            suggestionChipViewControllerAmati.i = scalingAnimator2;
            if (!z) {
                scalingAnimator2.e();
                return;
            } else {
                scalingAnimator2.d();
                scalingAnimator2.b = 1.0f;
                scalingAnimator2.setScaleLevel(1.0f);
            }
        } else if (!z) {
            scalingAnimator.b();
            return;
        } else {
            scalingAnimator.c();
            suggestionChipViewControllerAmati = this;
        }
        TextView textView = suggestionChipViewControllerAmati.b;
        if (bestChip != textView) {
            suggestionChipViewControllerAmati.g.b(textView);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iRound;
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        float f = measuredWidth == 0 ? 0.1f : this.e.n / measuredWidth;
        if (f > 0.1f) {
            f = 0.1f;
        }
        hzq hzqVar = this.e;
        this.l = hzqVar.k * f;
        if (f != 0.1f || measuredWidth == 0) {
            iRound = hzqVar.j;
            this.k = iRound;
        } else {
            iRound = Math.round(f * measuredWidth);
            this.k = iRound;
            int i = hzqVar.j;
            if (iRound > i || iRound < (i = hzqVar.m)) {
                this.k = i;
                iRound = i;
            }
        }
        this.j = hzqVar.j - iRound;
        int i2 = measuredWidth + iRound + iRound + hzqVar.i;
        this.m = i2;
        int i3 = hzqVar.p;
        if (i2 < i3) {
            this.m = i3;
        }
        if (this.d != null) {
            textView.setPaddingRelative(hzqVar.f, 0, 0, 0);
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        textView.setOnFocusChangeListener(this);
        onFocusChange(textView, textView.hasFocus());
    }

    void setSizeScale(float f) {
        d(f);
    }
}
