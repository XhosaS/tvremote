package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hle extends FrameLayout {
    hlb a;
    public hls b;
    public boolean c;
    public View d;
    public hlc e;
    boolean f;

    public hle(Context context) {
        super(context, null);
        this.a = null;
        this.b = null;
        this.e = null;
    }

    public final int a() {
        View view = this.d;
        if (view == null) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public final void b(View view) {
        hlb hlbVar = this.a;
        if (hlbVar != null) {
            view.getClass();
            View view2 = hlbVar.a;
            if (view2 == view) {
                hlbVar.a();
                if (view2.getMeasuredHeight() != 8388608) {
                    hlbVar.onGlobalLayout();
                }
            }
        }
    }

    public void c(int i) {
        View view = this.d;
        if (view != null) {
            this.a = new hlb(this, this, view);
            getViewTreeObserver().addOnGlobalLayoutListener(this.a);
        }
    }

    public final void d() {
        hlc hlcVar = this.e;
        if (hlcVar != null) {
            hlcVar.a();
            this.e = null;
        }
    }

    public void e() {
        this.e = null;
        this.f = true;
    }

    public void f() {
        if (this.a != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.a);
            this.a = null;
        }
    }

    public boolean getAllowLeanbackMotion() {
        return this.c;
    }

    public Animator getFadeInAnimator() throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.motion_replace_fade_in);
        animatorLoadAnimator.setTarget(this);
        return animatorLoadAnimator;
    }

    public View getFragmentView() {
        return this.d;
    }

    public Animator getLaunchingAnimator() throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.launch_compact_content);
        if (!this.c) {
            animatorLoadAnimator.setTarget(this);
            return animatorLoadAnimator;
        }
        View viewFindViewById = findViewById(R.id.lb_row_container_header_dock);
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.row_header);
        }
        View viewFindViewById2 = findViewById(R.id.row_content);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            animatorLoadAnimator.setTarget(this);
            return animatorLoadAnimator;
        }
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.launch_compact_header);
        animatorLoadAnimator2.setTarget(viewFindViewById);
        animatorLoadAnimator.setTarget(viewFindViewById2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorLoadAnimator2).with(animatorLoadAnimator);
        return animatorSet;
    }

    @Override // android.view.View
    public final boolean hasFocusable() {
        if (super.hasFocusable()) {
            return true;
        }
        View view = this.d;
        if (view != null) {
            return view.hasFocusable() || this.d.isFocusable();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e == null || (getParent() instanceof hla)) {
            return;
        }
        c(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        f();
        hls hlsVar = this.b;
        if (hlsVar != null) {
            hlsVar.j(this);
        }
        super.onDetachedFromWindow();
        if (this.f) {
            this.d = null;
            removeAllViews();
        }
    }
}
