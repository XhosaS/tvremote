package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juo extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public wlx e;
    public wlx f;
    public wlx g;
    public wlx h;
    public wlx i;
    public sco j;
    public sco k;
    public View.OnClickListener l;
    public View.OnClickListener m;
    public boolean n;
    public boolean o;
    public final Set p;
    private final yfo q;
    private int r;

    public juo(yfo yfoVar) {
        sco scoVar = sco.a;
        this.j = scoVar;
        this.k = scoVar;
        this.o = true;
        this.r = 0;
        this.p = new HashSet();
        this.q = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.setup_prompt_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.r;
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
        juo juoVar = (juo) scfVar;
        long j = true != yks.e(this.c, juoVar.c) ? 1L : 0L;
        if (!yks.e(this.d, juoVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, juoVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, juoVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, juoVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, juoVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, juoVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, juoVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, juoVar.k)) {
            j |= 256;
        }
        if (!yks.e(this.l, juoVar.l)) {
            j |= 512;
        }
        if (!yks.e(this.m, juoVar.m)) {
            j |= 1024;
        }
        return !yks.e(Boolean.valueOf(this.n), Boolean.valueOf(juoVar.n)) ? j | 2048 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.q.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jun junVar = (jun) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(junVar, this.c, R.id.title, 8);
        }
        if (j == 0 || (j & 2) != 0) {
            jwq.j(junVar, this.d, R.id.description, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            junVar.b.t(junVar, this.e, R.id.image1, -1, 8, true, false, false);
        }
        if (j == 0 || (j & 8) != 0) {
            junVar.c.t(junVar, this.f, R.id.image2, -1, 8, true, false, false);
        }
        if (j == 0 || (j & 16) != 0) {
            junVar.d.t(junVar, this.g, R.id.image3, -1, 8, true, false, false);
        }
        if (j == 0 || (j & 32) != 0) {
            junVar.e.t(junVar, this.h, R.id.image4, -1, 8, true, false, false);
        }
        if (j == 0 || (j & 64) != 0) {
            junVar.f.t(junVar, this.i, R.id.image5, -1, 8, true, false, false);
        }
        if (j == 0 || (j & 128) != 0) {
            try {
                junVar.w(R.id.setup_prompt_cta, this.j.a(junVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "setup_prompt_cta", "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable"));
            }
        }
        if (j == 0 || (j & 256) != 0) {
            try {
                junVar.w(R.id.additional_providers, this.k.a(junVar.o()), 8);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "additional_providers", "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable"));
            }
        }
        if (j == 0 || (j & 512) != 0) {
            try {
                junVar.r(R.id.setup_prompt_cta, this.l);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "setup_prompt_cta", "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable"));
            }
        }
        if (j == 0 || (j & 1024) != 0) {
            try {
                junVar.r(R.id.setup_dismiss, this.m);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "setup_dismiss", "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable"));
            }
        }
        if (j == 0 || (j & 2048) != 0) {
            boolean z = this.n;
            View view = junVar.a;
            if (view == null) {
                yks.c("dismissButton");
                view = null;
            }
            view.setVisibility(true == z ? 0 : 8);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Boolean.valueOf(this.n));
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
        this.r = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.o;
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
        this.p.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.p.remove(sddVar);
    }

    public final String toString() {
        return String.format("SetupPromptCardViewModel{title=%s, description=%s, firstImage=%s, secondImage=%s, thirdImage=%s, fourthImage=%s, fifthImage=%s, ctaText=%s, additionalProvidersText=%s, onCtaClickListener=%s, onDismissListener=%s, showDismissButton=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Boolean.valueOf(this.n));
    }
}
