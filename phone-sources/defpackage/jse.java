package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jse extends scf implements scl {
    public scg a;
    public sck b;
    public wlx c;
    public wls d;
    public wls e;
    public wls f;
    public wls g;
    public View.OnClickListener h;
    public View.OnClickListener i;
    public boolean j;
    private final yfo m;
    public boolean k = true;
    private int n = 0;
    public final Set l = new HashSet();

    public jse(yfo yfoVar) {
        this.m = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.new_provider_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.n;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jse jseVar = (jse) scfVar;
        long j = true != yks.e(this.c, jseVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jseVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jseVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jseVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jseVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, jseVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, jseVar.i)) {
            j |= 64;
        }
        return !yks.e(Boolean.valueOf(this.j), Boolean.valueOf(jseVar.j)) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.m.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.newprovidercard.NewProviderCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jsd jsdVar = (jsd) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jsdVar.b.t(jsdVar, this.c, R.id.icon, -1, 8, true, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jsdVar, this.d, R.id.title, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jsdVar, this.e, R.id.subtitle, 8);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jsdVar, this.f, R.id.description, 8);
        }
        if (j == 0 || (16 & j) != 0) {
            jwq.j(jsdVar, this.g, R.id.annotation, 8);
        }
        if (j == 0 || (32 & j) != 0) {
            try {
                jsdVar.r(R.id.dismiss, this.h);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dismiss", "com.google.android.apps.googletv.app.presentation.components.newprovidercard.NewProviderCardViewBindable"));
            }
        }
        if (j == 0 || (64 & j) != 0) {
            try {
                jsdVar.r(R.id.new_provider_card_component, this.i);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "new_provider_card_component", "com.google.android.apps.googletv.app.presentation.components.newprovidercard.NewProviderCardViewBindable"));
            }
        }
        if (j == 0 || (j & 128) != 0) {
            boolean z = this.j;
            View view = jsdVar.a;
            if (view == null) {
                yks.c("dismissButton");
                view = null;
            }
            view.setVisibility(true == z ? 0 : 8);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j));
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.n = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.k;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return false;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.l.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.l.remove(sddVar);
    }

    public final String toString() {
        return String.format("NewProviderCardViewModel{icon=%s, title=%s, subtitle=%s, description=%s, annotation=%s, onDismissListener=%s, cardClickListener=%s, showDismissButton=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j));
    }
}
