package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.card.textarea.ImageWithTextCardView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class utg implements View.OnFocusChangeListener, View.OnKeyListener {
    private final ImageWithTextCardView a;
    private final View b;
    private final View c;
    private float d;
    private final float e;
    private final float f;
    private final int g;
    private boolean h;
    private final AnimatorSet i;
    private final AnimatorSet j;
    private final AnimatorSet k;
    private final AnimatorSet l;

    protected utg(View view, View view2, float f, float f2, float f3) throws Resources.NotFoundException {
        int i;
        char c;
        int i2;
        this.b = view;
        if (view2 == null) {
            this.a = (ImageWithTextCardView) view;
            this.c = null;
        } else {
            this.a = null;
            this.c = view2;
        }
        this.d = f;
        this.e = f2;
        this.f = f3;
        int integer = view.getResources().getInteger(R.integer.card_focused_animation_duration_ms);
        this.g = integer;
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        ImageWithTextCardView imageWithTextCardView = this.a;
        if (imageWithTextCardView != null) {
            c = 0;
            i = 2;
            animatorSet.playTogether(ObjectAnimator.ofFloat(imageWithTextCardView, "cardFrameScale", this.d), ObjectAnimator.ofFloat(this.a.getCardFrame(), "elevation", f3));
        } else {
            i = 2;
            c = 0;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.c, "scaleX", this.d), ObjectAnimator.ofFloat(this.c, "scaleY", this.d), ObjectAnimator.ofFloat(this.c, "elevation", f3));
        }
        animatorSet.setDuration(integer);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.j = animatorSet2;
        ImageWithTextCardView imageWithTextCardView2 = this.a;
        if (imageWithTextCardView2 != null) {
            Animator[] animatorArr = new Animator[i];
            float[] fArr = new float[1];
            fArr[c] = 1.0f;
            animatorArr[c] = ObjectAnimator.ofFloat(imageWithTextCardView2, "cardFrameScale", fArr);
            View cardFrame = this.a.getCardFrame();
            float[] fArr2 = new float[1];
            fArr2[c] = f2;
            animatorArr[1] = ObjectAnimator.ofFloat(cardFrame, "elevation", fArr2);
            animatorSet2.playTogether(animatorArr);
        } else {
            Animator[] animatorArr2 = new Animator[3];
            View view3 = this.c;
            float[] fArr3 = new float[1];
            fArr3[c] = 1.0f;
            animatorArr2[c] = ObjectAnimator.ofFloat(view3, "scaleX", fArr3);
            View view4 = this.c;
            float[] fArr4 = new float[1];
            fArr4[c] = 1.0f;
            animatorArr2[1] = ObjectAnimator.ofFloat(view4, "scaleY", fArr4);
            View view5 = this.c;
            float[] fArr5 = new float[1];
            fArr5[c] = f2;
            animatorArr2[2] = ObjectAnimator.ofFloat(view5, "elevation", fArr5);
            animatorSet2.playTogether(animatorArr2);
        }
        animatorSet2.setDuration(integer);
        int integer2 = view.getContext().getResources().getInteger(R.integer.card_key_animation_duration_ms);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.k = animatorSet3;
        ImageWithTextCardView imageWithTextCardView3 = this.a;
        if (imageWithTextCardView3 != null) {
            Animator[] animatorArr3 = new Animator[2];
            float[] fArr6 = new float[1];
            fArr6[c] = this.d;
            animatorArr3[c] = ObjectAnimator.ofFloat(imageWithTextCardView3, "cardFrameScale", fArr6);
            View cardFrame2 = this.a.getCardFrame();
            float[] fArr7 = new float[1];
            fArr7[c] = f3;
            animatorArr3[1] = ObjectAnimator.ofFloat(cardFrame2, "elevation", fArr7);
            animatorSet3.playTogether(animatorArr3);
            i2 = 2;
        } else {
            Animator[] animatorArr4 = new Animator[3];
            View view6 = this.c;
            float[] fArr8 = new float[1];
            fArr8[c] = this.d;
            animatorArr4[c] = ObjectAnimator.ofFloat(view6, "scaleX", fArr8);
            View view7 = this.c;
            float[] fArr9 = new float[1];
            fArr9[c] = this.d;
            animatorArr4[1] = ObjectAnimator.ofFloat(view7, "scaleY", fArr9);
            View view8 = this.c;
            float[] fArr10 = new float[1];
            fArr10[c] = f3;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view8, "elevation", fArr10);
            i2 = 2;
            animatorArr4[2] = objectAnimatorOfFloat;
            animatorSet3.playTogether(animatorArr4);
        }
        long j = integer2;
        animatorSet3.setDuration(j);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.l = animatorSet4;
        ImageWithTextCardView imageWithTextCardView4 = this.a;
        if (imageWithTextCardView4 != null) {
            Animator[] animatorArr5 = new Animator[i2];
            float[] fArr11 = new float[1];
            fArr11[c] = 1.0f;
            animatorArr5[c] = ObjectAnimator.ofFloat(imageWithTextCardView4, "cardFrameScale", fArr11);
            View cardFrame3 = this.a.getCardFrame();
            float[] fArr12 = new float[1];
            fArr12[c] = f2;
            animatorArr5[1] = ObjectAnimator.ofFloat(cardFrame3, "elevation", fArr12);
            animatorSet4.playTogether(animatorArr5);
        } else {
            Animator[] animatorArr6 = new Animator[3];
            View view9 = this.c;
            float[] fArr13 = new float[1];
            fArr13[c] = 1.0f;
            animatorArr6[c] = ObjectAnimator.ofFloat(view9, "scaleX", fArr13);
            View view10 = this.c;
            float[] fArr14 = new float[1];
            fArr14[c] = 1.0f;
            animatorArr6[1] = ObjectAnimator.ofFloat(view10, "scaleY", fArr14);
            View view11 = this.c;
            float[] fArr15 = new float[1];
            fArr15[c] = f2;
            animatorArr6[2] = ObjectAnimator.ofFloat(view11, "elevation", fArr15);
            animatorSet4.playTogether(animatorArr6);
        }
        animatorSet4.setDuration(j);
    }

    public static utg a(View view) {
        return (utg) view.getTag(R.id.card_scale_listener_id);
    }

    public static utg c(View view, View view2, float f) throws Resources.NotFoundException {
        utg utgVarA = a(view);
        if (utgVarA != null) {
            utgVarA.b(f);
            return utgVarA;
        }
        Resources resources = view.getResources();
        float dimension = resources.getDimension(R.dimen.card_base_elevation);
        float dimension2 = resources.getDimension(R.dimen.card_focused_elevation);
        utg utgVarA2 = a(view);
        if (utgVarA2 != null) {
            utgVarA2.b(f);
            return utgVarA2;
        }
        utg utgVar = new utg(view, view2, f, dimension, dimension2);
        view.setTag(R.id.card_scale_listener_id, utgVar);
        return utgVar;
    }

    private static void d(AnimatorSet animatorSet, float f) {
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        int size = childAnimations.size();
        for (int i = 0; i < size; i++) {
            Animator animator = childAnimations.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                if (propertyName.equals("scaleX") || propertyName.equals("scaleY") || propertyName.equals("cardFrameScale")) {
                    objectAnimator.setFloatValues(f);
                }
            }
        }
    }

    protected final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        d(this.i, f);
        d(this.j, 1.0f);
        d(this.k, f);
        d(this.l, 1.0f);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.j.cancel();
            AnimatorSet animatorSet = this.i;
            if (animatorSet.isStarted()) {
                return;
            }
            animatorSet.setupStartValues();
            animatorSet.start();
            return;
        }
        this.h = false;
        this.i.cancel();
        AnimatorSet animatorSet2 = this.j;
        if (animatorSet2.isStarted()) {
            return;
        }
        animatorSet2.setupStartValues();
        animatorSet2.start();
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 23 || i == 66) {
            if (keyEvent.getAction() == 0 && !this.h) {
                this.k.cancel();
                AnimatorSet animatorSet = this.l;
                if (!animatorSet.isStarted()) {
                    animatorSet.setupStartValues();
                    animatorSet.start();
                }
                this.h = true;
            } else if (keyEvent.getAction() == 1 && this.h) {
                this.l.cancel();
                AnimatorSet animatorSet2 = this.k;
                if (!animatorSet2.isStarted()) {
                    animatorSet2.setupStartValues();
                    animatorSet2.start();
                }
                this.h = false;
            }
        }
        return false;
    }
}
