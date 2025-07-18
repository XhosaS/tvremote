package defpackage;

import android.animation.Animator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thf implements tgx {
    public final /* synthetic */ PlaySearchToolbar a;
    private final /* synthetic */ int b;

    public thf(PlaySearchToolbar playSearchToolbar, int i) {
        this.b = i;
        this.a = playSearchToolbar;
    }

    @Override // defpackage.tgx
    public final void a(String str) {
        if (this.b != 0) {
            return;
        }
        this.a.c.i();
    }

    @Override // defpackage.tgx
    public final void b(tha thaVar) {
        if (this.b != 0) {
            return;
        }
        PlaySearchToolbar playSearchToolbar = this.a;
        playSearchToolbar.c.i();
        playSearchToolbar.c.i();
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        View view;
        if (this.b != 0) {
            return;
        }
        if (i == 1 || i == 2) {
            PlaySearch playSearch = this.a.c;
            tgs tgsVar = new tgs(new tci(this, 6, null));
            if (((View) playSearch.getParent()) == null || (view = playSearch.e) == null || !view.isAttachedToWindow()) {
                return;
            }
            Point pointC = playSearch.c();
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(playSearch.e, pointC.x, pointC.y, r0.getWidth(), 0.0f);
            animatorCreateCircularReveal.setDuration(300L);
            animatorCreateCircularReveal.addListener(new tgu(playSearch));
            animatorCreateCircularReveal.addListener(tgsVar);
            animatorCreateCircularReveal.start();
        }
    }

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
        if (this.b != 0) {
            PlaySearch playSearch = this.a.c;
            if (playSearch != null) {
                playSearch.f(str);
                return;
            }
            return;
        }
        PlaySearch playSearch2 = this.a.b;
        if (playSearch2 != null) {
            playSearch2.f(str);
        }
    }

    @Override // defpackage.tgx
    public final void m() {
    }
}
