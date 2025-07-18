package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aik {
    public aij a;

    public aik(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new aii(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new aig(i, interpolator, j);
        }
    }

    public static void a(View view, aib aibVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new aih(aibVar));
            return;
        }
        Interpolator interpolator = aig.a;
        View.OnApplyWindowInsetsListener aifVar = new aif(view, aibVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aifVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(aifVar);
        }
    }

    public aik(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new aii(windowInsetsAnimation);
        }
    }
}
