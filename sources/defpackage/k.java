package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class k extends bc {
    public final i a;
    private AnimatorSet d;

    public k(i iVar) {
        iVar.getClass();
        this.a = iVar;
    }

    @Override // defpackage.bc
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        be beVar = this.a.a;
        if (!beVar.d) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            animatorSet.reverse();
        }
        if (am.S(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(beVar);
            sb.append(" has been canceled");
            sb.append(true != beVar.d ? "." : " with seeking.");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.bc
    public final void b(ViewGroup viewGroup) {
        be beVar = this.a.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            beVar.f(this);
            return;
        }
        animatorSet.start();
        if (am.S(2)) {
            Log.v("FragmentManager", b.b(beVar, "Animator from operation ", " has started."));
        }
    }

    @Override // defpackage.bc
    public final void c(ViewGroup viewGroup) {
        k kVar;
        i iVar = this.a;
        if (iVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        awy awyVarA = iVar.a(context);
        this.d = (AnimatorSet) (awyVarA != null ? awyVarA.b : null);
        be beVar = iVar.a;
        boolean z = beVar.h == 3;
        View view = beVar.a.L;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            kVar = this;
            animatorSet.addListener(new j(viewGroup, view, z, beVar, kVar));
        } else {
            kVar = this;
        }
        AnimatorSet animatorSet2 = kVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.bc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bc
    public final void e(ke keVar) {
        be beVar = this.a.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            beVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !beVar.a.o) {
            return;
        }
        if (am.S(2)) {
            Objects.toString(beVar);
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(beVar.toString()));
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (keVar.a * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (am.S(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + beVar);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}
