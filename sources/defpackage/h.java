package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class h extends bc {
    public final i a;

    public h(i iVar) {
        iVar.getClass();
        this.a = iVar;
    }

    @Override // defpackage.bc
    public final void a(ViewGroup viewGroup) {
        be beVar = this.a.a;
        View view = beVar.a.L;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        beVar.f(this);
        if (am.S(2)) {
            Log.v("FragmentManager", b.b(beVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.bc
    public final void b(ViewGroup viewGroup) {
        Object obj;
        i iVar = this.a;
        if (iVar.b()) {
            iVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        be beVar = iVar.a;
        View view = beVar.a.L;
        context.getClass();
        awy awyVarA = iVar.a(context);
        if (awyVarA == null || (obj = awyVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (beVar.h != 1) {
            view.startAnimation((Animation) obj);
            beVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        u uVar = new u((Animation) obj, viewGroup, view);
        uVar.setAnimationListener(new g(beVar, viewGroup, view, this));
        view.startAnimation(uVar);
        if (am.S(2)) {
            Log.v("FragmentManager", b.b(beVar, "Animation from operation ", " has started."));
        }
    }
}
