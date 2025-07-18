package defpackage;

import android.view.animation.Animation;
import com.google.android.play.search.PlaySearch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgv implements Animation.AnimationListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ PlaySearch b;

    public tgv(PlaySearch playSearch, boolean z) {
        this.a = z;
        this.b = playSearch;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.a) {
            return;
        }
        this.b.d.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
