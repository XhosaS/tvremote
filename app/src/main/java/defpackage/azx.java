package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azx extends azm {
    public azu e;
    public boolean f;

    public azx() {
        azu azuVar = new azu(null);
        this.e = azuVar;
        this.f = true;
        azuVar.b = true;
    }

    private final void c(azw azwVar, View view) {
        azwVar.l = true != azwVar.n ? 2 : 1;
        azwVar.c(view);
    }

    private final void l(azw azwVar) {
        if (this.e == null || azwVar.i == null) {
            return;
        }
        ((azs) azwVar.h.g).a.setVisibility(true != azwVar.n ? 8 : 0);
    }

    protected void A(azw azwVar) {
        azt aztVar = azwVar.i;
        if (aztVar != null) {
            this.e.w(aztVar);
        }
        r(azwVar.g);
    }

    public final void B(azk azkVar, boolean z) {
        azw azwVarY = y(azkVar);
        azwVarY.n = z;
        h(azwVarY, z);
    }

    public final void C(azk azkVar, float f) {
        azw azwVarY = y(azkVar);
        azwVarY.p = f;
        j(azwVarY);
    }

    protected abstract azw b(ViewGroup viewGroup);

    protected void d(azw azwVar, boolean z) {
        awl awlVar;
        if (!z || (awlVar = azwVar.r) == null) {
            return;
        }
        awlVar.f(null, azwVar, azwVar.k);
    }

    protected void f(azw azwVar) {
        azwVar.o = true;
        View view = azwVar.g;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        azv azvVar = azwVar.h;
        if (azvVar != null) {
            ((ViewGroup) azvVar.g).setClipChildren(false);
        }
    }

    protected void g(azw azwVar, Object obj) {
        azwVar.k = obj;
        azwVar.j = obj instanceof azr ? (azr) obj : null;
        azt aztVar = azwVar.i;
        if (aztVar == null || azwVar.j == null) {
            return;
        }
        this.e.s(aztVar, obj);
    }

    protected void h(azw azwVar, boolean z) {
        l(azwVar);
        c(azwVar, azwVar.g);
    }

    public void i(azw azwVar, boolean z) {
        d(azwVar, z);
        l(azwVar);
        c(azwVar, azwVar.g);
    }

    protected void j(azw azwVar) {
        if (this.f) {
            aty atyVar = azwVar.q;
            atyVar.a(azwVar.p);
            azt aztVar = azwVar.i;
            if (aztVar != null) {
                azu azuVar = this.e;
                aztVar.a = azwVar.p;
                azuVar.b(aztVar);
            }
            if (o()) {
                azs azsVar = (azs) azwVar.h.g;
                int color = atyVar.a.getColor();
                Drawable drawable = azsVar.b;
                if (!(drawable instanceof ColorDrawable)) {
                    azsVar.setForeground(new ColorDrawable(color));
                } else {
                    ((ColorDrawable) drawable.mutate()).setColor(color);
                    azsVar.invalidate();
                }
            }
        }
    }

    protected void k(azw azwVar) {
        azt aztVar = azwVar.i;
        if (aztVar != null) {
            this.e.u(aztVar);
        }
        azwVar.j = null;
        azwVar.k = null;
    }

    public void m(azw azwVar, boolean z) {
        azt aztVar = azwVar.i;
        if (aztVar == null || aztVar.g.getVisibility() == 8) {
            return;
        }
        azwVar.i.g.setVisibility(true != z ? 4 : 0);
    }

    public boolean o() {
        return true;
    }

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        azk azvVar;
        azw azwVarB = b(viewGroup);
        azwVarB.o = false;
        if (this.e != null || (o() && this.f)) {
            azs azsVar = new azs(viewGroup.getContext());
            azu azuVar = this.e;
            if (azuVar != null) {
                azwVarB.i = (azt) azuVar.q((ViewGroup) azwVarB.g);
            }
            azvVar = new azv(azsVar, azwVarB);
        } else {
            azvVar = azwVarB;
        }
        f(azwVarB);
        if (azwVarB.o) {
            return azvVar;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // defpackage.azm
    public final void s(azk azkVar, Object obj) {
        g(y(azkVar), obj);
    }

    @Override // defpackage.azm
    public final void u(azk azkVar) {
        k(y(azkVar));
    }

    @Override // defpackage.azm
    public final void v(azk azkVar) {
        z(y(azkVar));
    }

    @Override // defpackage.azm
    public final void w(azk azkVar) {
        A(y(azkVar));
    }

    public final azw y(azk azkVar) {
        return azkVar instanceof azv ? ((azv) azkVar).a : (azw) azkVar;
    }

    protected void z(azw azwVar) {
        azt aztVar = azwVar.i;
        if (aztVar != null) {
            this.e.v(aztVar);
        }
    }

    public void e(azw azwVar, boolean z) {
    }
}
