package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ay extends dm {
    public final az a;

    public ay(az azVar) {
        azVar.getClass();
        this.a = azVar;
    }

    @Override // defpackage.dm
    public final void a(ViewGroup viewGroup) {
        C0038do c0038do = this.a.a;
        View view = c0038do.a.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        c0038do.f(this);
        if (cr.Y(2)) {
            Objects.toString(c0038do);
        }
    }

    @Override // defpackage.dm
    public final void b(ViewGroup viewGroup) throws Resources.NotFoundException {
        Object obj;
        az azVar = this.a;
        if (azVar.b()) {
            azVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        C0038do c0038do = azVar.a;
        View view = c0038do.a.mView;
        context.getClass();
        bhi bhiVarA = azVar.a(context);
        if (bhiVarA == null || (obj = bhiVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (c0038do.h != 1) {
            view.startAnimation((Animation) obj);
            c0038do.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        bz bzVar = new bz((Animation) obj, viewGroup, view);
        bzVar.setAnimationListener(new ax(c0038do, viewGroup, view, this));
        view.startAnimation(bzVar);
        if (cr.Y(2)) {
            Objects.toString(c0038do);
        }
    }
}
