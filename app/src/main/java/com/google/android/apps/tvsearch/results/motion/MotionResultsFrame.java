package com.google.android.apps.tvsearch.results.motion;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;
import com.google.android.katniss.R;
import defpackage.hla;
import defpackage.hle;
import defpackage.hlg;
import defpackage.hlh;
import defpackage.hli;
import defpackage.hlj;
import defpackage.hlk;
import defpackage.hll;
import defpackage.hlm;
import defpackage.hln;
import defpackage.hls;
import defpackage.zdv;
import defpackage.zdy;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MotionResultsFrame extends FrameLayout implements hla, hls {
    private static final zdy k = zdy.h("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame");
    public hln a;
    float b;
    float c;
    public hle d;
    public hle e;
    public hle f;
    int g;
    Animator h;
    ViewTreeObserver.OnPreDrawListener i;
    public View j;

    public MotionResultsFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = hln.INITIAL;
        this.b = 1.0f;
        this.c = -2.0f;
    }

    private final ObjectAnimator m() throws Resources.NotFoundException {
        int integer = getResources().getInteger(R.integer.shadow_enter_alpha_duration_ms);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.j, "alpha", 0.0f);
        objectAnimatorOfFloat.setDuration(integer);
        objectAnimatorOfFloat.addListener(new hlk(this));
        return objectAnimatorOfFloat;
    }

    private final void n() {
        o();
        requestLayout();
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private final void o() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = hln.INITIAL;
        this.b = 1.0f;
        this.c = -2.0f;
        getLayoutParams().height = -2;
    }

    @Override // defpackage.hla
    public final void a(View view) throws Resources.NotFoundException {
        if (view instanceof hle) {
            hle hleVar = (hle) view;
            hleVar.a();
            if (indexOfChild(view) < 0) {
                ((zdv) ((zdv) k.d()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onChildHeightUpdated", 566, "MotionResultsFrame.java")).x("Unknown View sent height change in %s state", this.a);
                hleVar.f();
            }
            switch (this.a.ordinal()) {
                case 0:
                case 2:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case 15:
                case 16:
                    ((zdv) ((zdv) k.d()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onChildHeightUpdated", 578, "MotionResultsFrame.java")).x("Unexpected View height change in %s state", this.a);
                    hleVar.f();
                    break;
                case 1:
                case 7:
                case 8:
                default:
                    int iA = hleVar.a();
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 1) {
                        this.a = hln.REPLACING;
                        this.e = this.d;
                        Animator animatorE = e(iA);
                        this.h = animatorE;
                        animatorE.start();
                        break;
                    } else if (iOrdinal == 7) {
                        this.a = hln.REPLACING;
                        this.e = this.d;
                        Animator animatorE2 = e(iA);
                        this.h = animatorE2;
                        animatorE2.start();
                        this.e.getFadeInAnimator().start();
                        break;
                    } else if (iOrdinal == 8) {
                        this.h.cancel();
                        this.a = hln.REPLACING;
                        Animator animatorE3 = e(iA);
                        this.h = animatorE3;
                        animatorE3.start();
                        break;
                    } else {
                        ((zdv) ((zdv) k.c()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onChildHeightUpdated", 657, "MotionResultsFrame.java")).x("Unexpected View Updated in %s. No motion changes", this.a);
                        break;
                    }
                case 3:
                    this.a = hln.LAUNCHING;
                    ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: hlf
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            MotionResultsFrame motionResultsFrame = this.a;
                            motionResultsFrame.getHeight();
                            motionResultsFrame.isLayoutRequested();
                            int i = motionResultsFrame.getLayoutParams().height;
                            if (motionResultsFrame.isLayoutRequested()) {
                                return false;
                            }
                            motionResultsFrame.h();
                            return true;
                        }
                    };
                    this.i = onPreDrawListener;
                    viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                    this.e = this.d;
                    Animator animatorD = d();
                    this.h = animatorD;
                    animatorD.start();
                    break;
                case 4:
                case 6:
                    break;
                case 5:
                    this.a = hln.LAUNCHING_2;
                    ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() { // from class: hlf
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            MotionResultsFrame motionResultsFrame = this.a;
                            motionResultsFrame.getHeight();
                            motionResultsFrame.isLayoutRequested();
                            int i = motionResultsFrame.getLayoutParams().height;
                            if (motionResultsFrame.isLayoutRequested()) {
                                return false;
                            }
                            motionResultsFrame.h();
                            return true;
                        }
                    };
                    this.i = onPreDrawListener2;
                    viewTreeObserver2.addOnPreDrawListener(onPreDrawListener2);
                    this.e = this.d;
                    Animator animatorD2 = d();
                    this.h = animatorD2;
                    animatorD2.start();
                    break;
                case 9:
                    this.a = hln.REPLACING_2;
                    break;
                case 10:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (view != this.d) {
                        ((zdv) ((zdv) k.d()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onChildHeightUpdated", 607, "MotionResultsFrame.java")).x("Unexpected View sent height change in %s state", this.a);
                        hleVar.f();
                        break;
                    }
                    break;
                case 11:
                    this.a = hln.REPLACING_RM;
                    break;
            }
        }
    }

    public final Animator b(View view, int i, boolean z) {
        Resources resources = getResources();
        Context context = getContext();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setStartDelay(resources.getInteger(R.integer.compact_alpha_exit_delay_ms));
        objectAnimatorOfFloat.setDuration(resources.getInteger(R.integer.compact_alpha_exit_duration_ms));
        objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, R.anim.motion_alpha_curve));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, getMeasuredHeight() + i);
        objectAnimatorOfFloat2.setDuration(resources.getInteger(R.integer.compact_exit_duration_ms));
        objectAnimatorOfFloat2.setInterpolator(AnimationUtils.loadInterpolator(context, R.anim.motion_exit_curve));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.addListener(new hlm(z, view));
        return animatorSet;
    }

    final Animator c() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "motionHeight", getHeight(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(getContext(), R.anim.scale_height_curve));
        objectAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.compact_exit_duration_ms));
        objectAnimatorOfFloat.addListener(new hlj(this));
        if (this.j == null) {
            return objectAnimatorOfFloat;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(m());
        return animatorSet;
    }

    final Animator d() throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.launch_compact_parent);
        animatorLoadAnimator.setTarget(this);
        animatorLoadAnimator.addListener(new hlh(this));
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(animatorLoadAnimator);
        hle hleVar = this.e;
        if (hleVar != null) {
            builderPlay.with(hleVar.getLaunchingAnimator());
        }
        if (this.j != null) {
            int integer = getResources().getInteger(R.integer.shadow_enter_alpha_duration_ms);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.j, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration(integer);
            objectAnimatorOfFloat.addListener(new hll(this));
            builderPlay.with(objectAnimatorOfFloat);
        }
        return animatorSet;
    }

    final Animator e(float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "motionHeight", getHeight(), f);
        objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(getContext(), R.anim.scale_height_curve));
        objectAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.parent_update_height_duration_ms));
        objectAnimatorOfFloat.addListener(new hli(this));
        return objectAnimatorOfFloat;
    }

    public final void f() {
        Animator animator = this.h;
        if (animator != null) {
            animator.cancel();
            this.h = null;
            this.e = null;
        }
    }

    final void g() {
        f();
        this.b = 1.0f;
    }

    public float getMotionHeight() {
        return this.c;
    }

    public float getScaleHeight() {
        return this.b;
    }

    public final void h() {
        if (this.i != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.i);
            this.i = null;
        }
    }

    @Override // android.view.View
    public final boolean hasFocusable() {
        if (super.hasFocusable()) {
            return true;
        }
        hle hleVar = this.d;
        if (hleVar != null) {
            return hleVar.hasFocusable() || this.d.isFocusable();
        }
        return false;
    }

    public final void i() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 4) {
            this.c = getLayoutParams().height;
            this.e.d();
            this.e = null;
            this.h = null;
            this.a = hln.IDLE;
            return;
        }
        if (iOrdinal == 6) {
            ((zdv) ((zdv) k.c()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onAnimationCompleted", 418, "MotionResultsFrame.java")).u("Unable to handle more than two results concurrently");
            this.c = getLayoutParams().height;
            this.e.d();
            this.e = null;
            this.h = null;
            this.a = hln.IDLE;
            return;
        }
        if (iOrdinal == 8) {
            this.e.d();
            this.e = null;
            this.h = null;
            this.a = hln.IDLE;
            return;
        }
        if (iOrdinal != 14) {
            return;
        }
        this.e = null;
        this.h = null;
        n();
    }

    @Override // defpackage.hls
    public final void j(View view) {
        ((hle) view).b = null;
        switch (this.a.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
                ((zdv) ((zdv) k.d()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onChildDetachedFromWindow", 402, "MotionResultsFrame.java")).x("View detached in %s state", this.a);
                break;
            case 2:
                this.f = null;
                this.a = hln.IDLE;
                break;
            case 11:
                this.f = null;
                this.a = hln.REPLACING_0;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a = hln.REPLACING;
                this.f = null;
                this.e = this.d;
                Animator animatorE = e(r5.a());
                this.h = animatorE;
                animatorE.start();
                this.e.getFadeInAnimator().start();
                break;
        }
    }

    public final void k(Animator animator) {
        hln hlnVar;
        hln hlnVar2;
        hln hlnVar3 = this.a;
        if (hlnVar3 == hln.DESTROYED || hlnVar3 == (hlnVar = hln.FINISHING) || hlnVar3 == (hlnVar2 = hln.FINISHING_NULL)) {
            return;
        }
        f();
        if (animator != null) {
            this.a = hlnVar;
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder builderPlay = animatorSet.play(animator);
            if (this.j != null) {
                builderPlay.with(m());
            }
            animatorSet.addListener(new hlg(this));
            this.h = animatorSet;
            animatorSet.start();
        }
        if (this.d == null) {
            n();
            return;
        }
        switch (this.a.ordinal()) {
            case 0:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.d.f();
                n();
                break;
            case 1:
            case 4:
            case 6:
            case 8:
            case 10:
                this.a = hlnVar2;
                break;
            case 2:
                this.a = hlnVar;
                this.e = this.d;
                Animator animatorC = c();
                this.h = animatorC;
                animatorC.start();
                break;
            case 3:
            case 5:
            case 7:
            case 9:
                this.d.f();
                this.a = hlnVar2;
                break;
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.d.f();
                this.a = hlnVar;
                this.e = this.d;
                Animator animatorC2 = c();
                this.h = animatorC2;
                animatorC2.start();
                break;
        }
    }

    public final void l(float f) {
        int measuredHeight;
        hle hleVar = this.e;
        if (hleVar != null && (measuredHeight = hleVar.getMeasuredHeight() + ((FrameLayout.LayoutParams) hleVar.getLayoutParams()).topMargin + ((FrameLayout.LayoutParams) hleVar.getLayoutParams()).bottomMargin) > 0) {
            getLayoutParams().height = (int) (f * measuredHeight);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (this.h != null && View.MeasureSpec.getMode(i3) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.g, Integer.MIN_VALUE);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.g == 0 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            this.g = View.MeasureSpec.getSize(i2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewAdded(android.view.View r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.results.motion.MotionResultsFrame.onViewAdded(android.view.View):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        hln hlnVar;
        super.onViewRemoved(view);
        if (this.j == view) {
            this.j = null;
        }
        if (view instanceof hle) {
            hle hleVar = (hle) view;
            hleVar.f();
            hln hlnVar2 = this.a;
            if (hlnVar2 == hln.DESTROYED || hlnVar2 == (hlnVar = hln.FINISHING) || hlnVar2 == hln.INITIAL) {
                return;
            }
            if (view != this.d && (hlnVar2 == hln.IDLE || hlnVar2 == hln.REPLACING || hlnVar2 == hln.LAUNCHING || hlnVar2 == hln.REPLACING_0 || hlnVar2 == hln.LAUNCHING_0 || hlnVar2 == hln.FINISHING_NULL)) {
                ((zdv) ((zdv) k.d()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onViewRemoved", 263, "MotionResultsFrame.java")).x("Unmatched view removed in %s state, no action", this.a);
                return;
            }
            int iOrdinal = hlnVar2.ordinal();
            if (iOrdinal == 1) {
                if (view.isAttachedToWindow()) {
                    this.a = hln.IDLE_RM;
                    this.f = hleVar;
                    hleVar.b = this;
                }
                this.d = null;
                return;
            }
            if (iOrdinal == 13) {
                if (this.d == view) {
                    this.d = null;
                    return;
                }
                return;
            }
            if (iOrdinal == 15) {
                if (!this.d.isAttachedToWindow()) {
                    n();
                    return;
                }
                this.a = hlnVar;
                this.e = this.d;
                Animator animatorC = c();
                this.h = animatorC;
                animatorC.start();
                return;
            }
            switch (iOrdinal) {
                case 3:
                    o();
                    break;
                case 4:
                    g();
                    this.c = getLayoutParams().height;
                    h();
                    if (view.isAttachedToWindow()) {
                        this.a = hln.IDLE_RM;
                        this.f = hleVar;
                        hleVar.b = this;
                    } else {
                        this.a = hln.IDLE;
                    }
                    this.d = null;
                    break;
                case 5:
                    this.a = hln.LAUNCHING_0;
                    break;
                case 6:
                    this.a = hln.LAUNCHING;
                    break;
                case 7:
                case 8:
                    f();
                    if (view.isAttachedToWindow()) {
                        this.a = hln.IDLE_RM;
                        this.f = hleVar;
                        hleVar.b = this;
                    } else {
                        this.a = hln.IDLE;
                    }
                    this.d = null;
                    break;
                case 9:
                    if (!view.isAttachedToWindow()) {
                        this.a = hln.REPLACING_0;
                        break;
                    } else {
                        this.a = hln.REPLACING_RM_0;
                        this.f = hleVar;
                        hleVar.b = this;
                        break;
                    }
                case 10:
                    if (!view.isAttachedToWindow()) {
                        this.a = hln.REPLACING;
                        this.e = this.d;
                        Animator animatorE = e(r9.a());
                        this.h = animatorE;
                        animatorE.start();
                        this.d.getFadeInAnimator().start();
                        break;
                    } else {
                        this.a = hln.REPLACING_RM;
                        hleVar.b = this;
                        this.f = hleVar;
                        break;
                    }
                default:
                    ((zdv) ((zdv) k.c()).q("com/google/android/apps/tvsearch/results/motion/MotionResultsFrame", "onViewRemoved", 353, "MotionResultsFrame.java")).x("Unexpected view removed in %s state", this.a);
                    break;
            }
        }
    }

    public void setMotionHeight(float f) {
        getLayoutParams().height = (int) f;
        requestLayout();
        this.c = f;
    }

    public void setScaleHeight(float f) {
        l(f);
        this.b = f;
    }
}
