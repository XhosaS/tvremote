package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlp {
    public static final Property a = new rlo(Float.class);
    public final ViewTreeObserver.OnScrollChangedListener b = new rln(this, 0);
    public final ViewTreeObserver.OnGlobalLayoutListener c = new iyo(this, 7, null);
    public final View d;
    private final ObjectAnimator e;
    private boolean f;

    public rlp(ExpandableDialogView expandableDialogView, Property property, View view) {
        this.f = true;
        this.d = view;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) property, 0.0f, 1.0f);
        this.e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(115L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        b();
        if (view.canScrollVertically(-1)) {
            return;
        }
        this.f = false;
    }

    public final void a() {
        if (this.f == this.d.canScrollVertically(-1)) {
            return;
        }
        this.f = !this.f;
        ObjectAnimator objectAnimator = this.e;
        objectAnimator.cancel();
        objectAnimator.setFloatValues(((Float) objectAnimator.getAnimatedValue()).floatValue(), true != this.f ? 0.0f : 1.0f);
        objectAnimator.start();
    }

    public final void b() {
        View view = this.d;
        view.getViewTreeObserver().addOnScrollChangedListener(this.b);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }
}
