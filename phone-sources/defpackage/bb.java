package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bb extends dm {
    public final az a;
    private AnimatorSet b;

    public bb(az azVar) {
        azVar.getClass();
        this.a = azVar;
    }

    @Override // defpackage.dm
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        C0038do c0038do = this.a.a;
        if (!c0038do.d) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            animatorSet.reverse();
        }
        if (cr.Y(2)) {
            Objects.toString(c0038do);
            boolean z = c0038do.d;
        }
    }

    @Override // defpackage.dm
    public final void b(ViewGroup viewGroup) {
        C0038do c0038do = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            c0038do.f(this);
            return;
        }
        animatorSet.start();
        if (cr.Y(2)) {
            Objects.toString(c0038do);
        }
    }

    @Override // defpackage.dm
    public final void c(ViewGroup viewGroup) throws Resources.NotFoundException {
        bb bbVar;
        az azVar = this.a;
        if (azVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        bhi bhiVarA = azVar.a(context);
        this.b = (AnimatorSet) (bhiVarA != null ? bhiVarA.b : null);
        C0038do c0038do = azVar.a;
        boolean z = c0038do.h == 3;
        View view = c0038do.a.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            bbVar = this;
            animatorSet.addListener(new ba(viewGroup, view, z, c0038do, bbVar));
        } else {
            bbVar = this;
        }
        AnimatorSet animatorSet2 = bbVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.dm
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dm
    public final void e(fd fdVar) {
        C0038do c0038do = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            c0038do.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c0038do.a.mTransitioning) {
            return;
        }
        if (cr.Y(2)) {
            Objects.toString(c0038do);
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (fdVar.b * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (cr.Y(2)) {
            Objects.toString(animatorSet);
            Objects.toString(c0038do);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}
