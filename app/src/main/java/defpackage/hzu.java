package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzu implements View.OnClickListener, View.OnFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, hzs {
    final TextView a;
    final GradientDrawable b;
    final iag c;
    float d = 1.0f;
    private final hzr e;
    private final SuggestionChipItem f;
    private final hzv g;

    public hzu(SuggestionChipItem suggestionChipItem, ViewGroup viewGroup, hzr hzrVar, iag iagVar, hzv hzvVar) {
        this.c = iagVar;
        this.f = suggestionChipItem;
        this.g = hzvVar;
        this.e = hzrVar;
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.suggestion_chip_watson, viewGroup, false);
        this.a = textView;
        textView.setText(suggestionChipItem.a);
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        this.b = gradientDrawable;
        gradientDrawable.mutate();
        textView.setOnClickListener(this);
    }

    @Override // defpackage.hzs
    public final View b() {
        return this.a;
    }

    @Override // defpackage.hzs
    public final void c() {
        TextView textView = this.a;
        textView.measure(0, 0);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.g.a(view, this.f);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        iag iagVar = this.c;
        View bestChip = iagVar.getBestChip();
        TextView textView = this.a;
        if (!z) {
            Animator animator = (Animator) textView.getTag(R.id.suggestion_flash_animator);
            if (animator != null) {
                if (animator.isRunning()) {
                    animator.cancel();
                }
                textView.setTag(R.id.suggestion_flash_animator, null);
            }
            textView.setScaleX(this.d);
            textView.setScaleY(0.9f);
            hzr hzrVar = this.e;
            textView.setTextColor(hzrVar.i);
            this.b.setColor(hzrVar.j);
            return;
        }
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        hzr hzrVar2 = this.e;
        textView.setTextColor(hzrVar2.d);
        if (bestChip != textView || iagVar.getKeyCodeDownSeen()) {
            final GradientDrawable gradientDrawable = this.b;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: hzt
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            };
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Integer numValueOf = Integer.valueOf(hzrVar2.j);
            Integer numValueOf2 = Integer.valueOf(hzrVar2.a);
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, numValueOf, numValueOf2);
            valueAnimatorOfObject.setDuration(hzrVar2.b);
            Interpolator interpolator = hzrVar2.f;
            valueAnimatorOfObject.setInterpolator(interpolator);
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), numValueOf2, Integer.valueOf(hzrVar2.e));
            valueAnimatorOfObject2.setDuration(hzrVar2.c);
            valueAnimatorOfObject2.setInterpolator(interpolator);
            valueAnimatorOfObject2.addUpdateListener(animatorUpdateListener);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfObject, valueAnimatorOfObject2);
            textView.setTag(R.id.suggestion_flash_animator, animatorSet);
            animatorSet.start();
            ((SuggestionsScrollView) this.g).g = false;
        } else if (textView.getTag(R.id.suggestion_flash_animator) == null) {
            this.b.setColor(hzrVar2.e);
        }
        if (bestChip != textView) {
            this.g.b(textView);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView = this.a;
        this.d = 1.0f - ((textView.getMeasuredHeight() * 0.100000024f) / textView.getMeasuredWidth());
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        textView.setOnFocusChangeListener(this);
        onFocusChange(textView, textView.hasFocus());
        hzr hzrVar = this.e;
        textView.setForeground(new jrq(hzrVar.g, hzrVar.h));
    }
}
