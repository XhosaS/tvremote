package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hrt {
    static final Duration b = Duration.ofMillis(500);
    private Animator a;
    int c = 0;
    public final ViewGroup d;
    public final View e;
    public View f;
    private Animator g;

    protected hrt(View view) throws Resources.NotFoundException {
        this.e = view;
        ViewGroup viewGroup = view == null ? null : (ViewGroup) view.getParent();
        this.d = viewGroup;
        if (viewGroup == null) {
            b();
            return;
        }
        Context context = viewGroup.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.on_device_loading, viewGroup, false);
        this.f = viewInflate;
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, R.animator.replace_fade_in);
        this.a = animatorLoadAnimator;
        animatorLoadAnimator.setTarget(view);
        this.a.addListener(new hrr(this));
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.result_fade_out);
        this.g = animatorLoadAnimator2;
        animatorLoadAnimator2.setTarget(this.f);
        this.g.addListener(new hrs(this));
        viewGroup.addView(this.f);
        view.setVisibility(4);
        feq.e(a(), b, new Runnable() { // from class: hrq
            @Override // java.lang.Runnable
            public final void run() {
                hrt hrtVar = this.a;
                int i = hrtVar.c;
                if (i == 0) {
                    hrtVar.c = 2;
                } else {
                    if (i != 1) {
                        return;
                    }
                    hrtVar.c();
                }
            }
        });
    }

    protected abstract Handler a();

    protected abstract void b();

    public final void c() {
        if (this.f != null && !this.g.isRunning()) {
            this.a.start();
            this.g.start();
        }
        b();
    }
}
