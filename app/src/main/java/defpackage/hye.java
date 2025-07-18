package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hye {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/searchbar/keyboard/KeyboardSearchBar");
    public final int b;
    public final int c;
    public final ViewGroup d;
    public final Animator e;
    public final EditText f;
    public final ImageView g;
    private final InputMethodManager h;

    public hye(InputMethodManager inputMethodManager, LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        viewGroup.getClass();
        this.h = inputMethodManager;
        int color = viewGroup.getContext().getResources().getColor(R.color.G200, null);
        this.b = color;
        this.c = viewGroup.getContext().getResources().getColor(R.color.G200p60, null);
        View viewInflate = layoutInflater.inflate(R.layout.keyboard_search_bar, viewGroup, false);
        viewInflate.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        this.d = viewGroup2;
        View viewRequireViewById = viewGroup2.requireViewById(R.id.keyboard_input);
        final EditText editText = (EditText) viewRequireViewById;
        editText.setTextColor(color);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hya
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ((zdv) hye.a.b().q("com/google/android/apps/tvsearch/searchbar/keyboard/KeyboardSearchBar", "keyboardInput$lambda$1$lambda$0", 47, "KeyboardSearchBar.kt")).x("#OnFocusChangeListener hasFocus=%s", Boolean.valueOf(z));
                EditText editText2 = editText;
                hye hyeVar = this;
                if (!z) {
                    hyeVar.a();
                    editText2.setHintTextColor(hyeVar.c);
                    ImageView imageView = hyeVar.g;
                    imageView.setImageResource(R.drawable.quantum_ic_google_assistant_white_24);
                    imageView.setAlpha(0.6f);
                    return;
                }
                editText2.setHintTextColor(hyeVar.b);
                hyeVar.g.setAlpha(1.0f);
                if (TextUtils.isEmpty(editText2.getText())) {
                    Animator animator = hyeVar.e;
                    if (animator.isStarted()) {
                        return;
                    }
                    animator.start();
                }
            }
        });
        viewRequireViewById.getClass();
        this.f = editText;
        View viewRequireViewById2 = viewGroup2.requireViewById(R.id.opa_logo);
        viewRequireViewById2.getClass();
        this.g = (ImageView) viewRequireViewById2;
        Context context = viewGroup.getContext();
        context.getClass();
        long integer = context.getResources().getInteger(R.integer.search_tab_blank_hold_duration_ms);
        long integer2 = context.getResources().getInteger(R.integer.search_tab_hint_hold_duration_ms);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, R.animator.search_tab_hint_enter);
        animatorLoadAnimator.setTarget(editText);
        animatorLoadAnimator.setStartDelay(integer);
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.search_tab_hint_enter);
        animatorLoadAnimator2.setTarget(editText);
        animatorLoadAnimator2.setStartDelay(integer);
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(context, R.animator.fade_out_linear);
        animatorLoadAnimator3.addListener(new hyc(this));
        animatorLoadAnimator3.setTarget(editText);
        animatorLoadAnimator3.setStartDelay(integer2);
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(context, R.animator.fade_out_linear);
        animatorLoadAnimator4.addListener(new hyd(this));
        animatorLoadAnimator4.setTarget(editText);
        animatorLoadAnimator4.setStartDelay(integer2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorLoadAnimator3, animatorLoadAnimator2, animatorLoadAnimator4, animatorLoadAnimator);
        animatorSet.addListener(new hyb(this));
        this.e = animatorSet;
    }

    public final void a() {
        EditText editText = this.f;
        this.h.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        editText.setCursorVisible(false);
    }
}
