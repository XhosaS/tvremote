package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class al extends ei {
    public final aj a;
    private AnimatorSet b;

    public al(aj ajVar) {
        ajVar.getClass();
        this.a = ajVar;
    }

    @Override // defpackage.ei
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        en enVar = this.a.a;
        if (enVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (de.S(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(enVar);
            sb.append(" has been canceled");
            sb.append(true != enVar.d ? "." : " with seeking.");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.ei
    public final void b(ViewGroup viewGroup) {
        en enVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            enVar.f(this);
            return;
        }
        animatorSet.start();
        if (de.S(2)) {
            Log.v("FragmentManager", a.c(enVar, "Animator from operation ", " has started."));
        }
    }

    @Override // defpackage.ei
    public final void c(ViewGroup viewGroup) throws Resources.NotFoundException {
        al alVar;
        aj ajVar = this.a;
        if (ajVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        bx bxVarA = ajVar.a(context);
        this.b = bxVarA != null ? bxVarA.b : null;
        en enVar = ajVar.a;
        boolean z = enVar.h == 3;
        View view = enVar.a.R;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            alVar = this;
            animatorSet.addListener(new ak(viewGroup, view, z, enVar, alVar));
        } else {
            alVar = this;
        }
        AnimatorSet animatorSet2 = alVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.ei
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ei
    public final void e(ta taVar) {
        en enVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            enVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !enVar.a.u) {
            return;
        }
        if (de.S(2)) {
            Objects.toString(enVar);
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(enVar.toString()));
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (taVar.a * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (de.S(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + enVar);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}
