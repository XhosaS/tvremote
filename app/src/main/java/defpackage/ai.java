package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ai extends ei {
    public final aj a;

    public ai(aj ajVar) {
        ajVar.getClass();
        this.a = ajVar;
    }

    @Override // defpackage.ei
    public final void a(ViewGroup viewGroup) {
        en enVar = this.a.a;
        View view = enVar.a.R;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        enVar.f(this);
        if (de.S(2)) {
            Log.v("FragmentManager", a.c(enVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.ei
    public final void b(ViewGroup viewGroup) throws Resources.NotFoundException {
        Animation animation;
        aj ajVar = this.a;
        if (ajVar.b()) {
            ajVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        en enVar = ajVar.a;
        View view = enVar.a.R;
        context.getClass();
        bx bxVarA = ajVar.a(context);
        if (bxVarA == null || (animation = bxVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (enVar.h != 1) {
            view.startAnimation(animation);
            enVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        by byVar = new by(animation, viewGroup, view);
        byVar.setAnimationListener(new ah(enVar, viewGroup, view, this));
        view.startAnimation(byVar);
        if (de.S(2)) {
            Log.v("FragmentManager", a.c(enVar, "Animation from operation ", " has started."));
        }
    }
}
