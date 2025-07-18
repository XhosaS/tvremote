package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhp extends scf {
    public wls a;
    public String b;
    public Drawable c;
    private final yfo d;
    private wls e;
    private View.OnClickListener f;
    private wfo g;

    public jhp(yfo yfoVar) {
        this.d = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.elevated_button_layout;
    }

    public final void b(wfo wfoVar) {
        if (yks.e(this.g, wfoVar)) {
            return;
        }
        this.g = wfoVar;
        G(5);
    }

    public final void c(sch schVar) {
        this.f = new scc("R.id.button", this, schVar);
        G(3);
    }

    public final void d(wls wlsVar) {
        if (yks.e(this.e, wlsVar)) {
            return;
        }
        this.e = wlsVar;
        G(0);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhp jhpVar = (jhp) scfVar;
        long j = true != yks.e(this.e, jhpVar.e) ? 1L : 0L;
        if (!yks.e(this.a, jhpVar.a)) {
            j |= 2;
        }
        if (!yks.e(this.b, jhpVar.b)) {
            j |= 4;
        }
        if (!yks.e(this.f, jhpVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.c, jhpVar.c)) {
            j |= 16;
        }
        return !yks.e(this.g, jhpVar.g) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jho();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ElevatedButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        jho jhoVar = (jho) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jhoVar, this.e, R.id.button, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jhoVar, this.a, R.id.button_annotation, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.h(jhoVar, this.b, R.id.button_layout);
        }
        if (j == 0 || (8 & j) != 0) {
            try {
                jhoVar.r(R.id.button, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ElevatedButtonViewBindable"));
            }
        }
        if (j == 0 || (16 & j) != 0) {
            jhoVar.a().m(this.c);
        }
        if ((j == 0 || (j & 32) != 0) && (wfoVar = this.g) != null) {
            jhoVar.a().setBackgroundColor(wfoVar.p());
            jhoVar.a().n(ColorStateList.valueOf(wfoVar.h()));
            jhoVar.a().setTextColor(wfoVar.h());
        }
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.a, this.b, this.f, this.c, this.g);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ElevatedButtonViewModel{buttonText=%s, buttonAnnotationText=%s, buttonTag=%s, buttonClickListener=%s, icon=%s, applyDynamicScheme=%s}", this.e, this.a, this.b, this.f, this.c, this.g);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
