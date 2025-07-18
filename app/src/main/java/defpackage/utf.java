package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.card.textarea.ImageWithTextCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utf implements View.OnFocusChangeListener {
    private final View a;
    private final View b;
    private final ImageWithTextCardView c;
    private final uth d;
    private final Animator e;
    private final ute f = new ute(this);
    private final int g;
    private boolean h;

    private utf(View view, View view2, boolean z, int i, int i2) throws Resources.NotFoundException {
        this.a = view;
        this.b = view2;
        this.c = view2 == null ? (ImageWithTextCardView) view : null;
        this.g = 192;
        Context context = view.getContext();
        uth uthVar = new uth(context.getResources().getDimensionPixelSize(e(context, R.attr.cardFrameWidth, R.dimen.card_focused_frame_outer_stroke_width)), i2, i, z);
        this.d = uthVar;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, R.animator.focused_frame_animator);
        this.e = animatorLoadAnimator;
        if (animatorLoadAnimator != null) {
            animatorLoadAnimator.setTarget(uthVar);
        }
        view.addOnAttachStateChangeListener(new utd(this));
        a();
    }

    public static utf c(View view, View view2) {
        Context context = view.getContext();
        return d(view, view2, true, context.getResources().getDimensionPixelSize(e(context, R.attr.cardRoundCornerRadius, R.dimen.card_rounded_corner_radius)), context.getColor(e(context, R.attr.cardFrameColor, R.color.card_focused_foreground_frame_outer_color)));
    }

    public static utf d(View view, View view2, boolean z, int i, int i2) {
        utf utfVar = (utf) view.getTag(R.animator.focused_frame_animator);
        if (utfVar != null) {
            return utfVar;
        }
        utf utfVar2 = new utf(view, view2, z, i, i2);
        view.setTag(R.animator.focused_frame_animator, utfVar2);
        return utfVar2;
    }

    private static int e(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i3 = typedValue.resourceId;
        return i3 == 0 ? i2 : i3;
    }

    private final void f(Drawable drawable) {
        ImageWithTextCardView imageWithTextCardView = this.c;
        if (imageWithTextCardView == null) {
            this.b.setForeground(drawable);
            return;
        }
        Drawable drawable2 = imageWithTextCardView.e;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        imageWithTextCardView.e = drawable;
        if (drawable != null) {
            imageWithTextCardView.e.setCallback(imageWithTextCardView);
            imageWithTextCardView.e.setState(imageWithTextCardView.getDrawableState());
            View view = imageWithTextCardView.d;
            if (view != null) {
                imageWithTextCardView.e.setBounds(view.getLeft(), imageWithTextCardView.d.getTop(), imageWithTextCardView.d.getRight(), imageWithTextCardView.d.getBottom());
            }
        }
        imageWithTextCardView.invalidate();
    }

    public final void a() {
        View view = this.a;
        if (view.hasFocus() && view.isAttachedToWindow()) {
            if (this.h) {
                return;
            }
            this.h = true;
            view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f);
            return;
        }
        if (this.h) {
            this.h = false;
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f);
        }
    }

    public final void b() {
        Animator animator = this.e;
        if (animator == null) {
            return;
        }
        View view = this.a;
        if (!view.hasFocus() || !view.isAttachedToWindow() || !view.hasWindowFocus()) {
            if (animator.getDuration() > 0) {
                uth uthVar = this.d;
                uthVar.a = false;
                uthVar.invalidateSelf();
                animator.cancel();
                return;
            }
            return;
        }
        uth uthVar2 = this.d;
        uthVar2.setAlpha(this.g);
        if (animator.getDuration() > 0) {
            uthVar2.a = true;
            uthVar2.invalidateSelf();
            animator.start();
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            f(this.d);
        } else {
            f(null);
        }
        a();
        b();
    }
}
