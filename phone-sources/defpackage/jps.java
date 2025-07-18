package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jps extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public View.OnClickListener e;
    public View.OnClickListener g;
    public boolean h;
    public int i;
    public wlx j;
    public boolean k;
    public wfo l;
    public wfo m;
    private final int p;
    private final yfo q;
    public sco f = sco.a;
    public boolean n = true;
    private int r = 0;
    public final Set o = new HashSet();

    public jps(yfo yfoVar, int i) {
        this.q = yfoVar;
        this.p = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.p;
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
        jps jpsVar = (jps) scfVar;
        long j = true != yks.e(this.c, jpsVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jpsVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jpsVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jpsVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jpsVar.g)) {
            j |= 16;
        }
        if (!yks.e(Boolean.valueOf(this.h), Boolean.valueOf(jpsVar.h))) {
            j |= 32;
        }
        if (!a.r(this.i, jpsVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, jpsVar.j)) {
            j |= 128;
        }
        if (!yks.e(Boolean.valueOf(this.k), Boolean.valueOf(jpsVar.k))) {
            j |= 256;
        }
        if (!yks.e(this.l, jpsVar.l)) {
            j |= 512;
        }
        return !yks.e(this.m, jpsVar.m) ? j | 1024 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.q.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        wfo wfoVar2;
        jpr jprVar = (jpr) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(jprVar, this.c, R.id.title, 8);
        }
        if (j == 0 || (j & 2) != 0) {
            jwq.j(jprVar, this.d, R.id.subtitle, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                jprVar.r(R.id.dismiss, this.e);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dismiss", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
            }
        }
        if (j == 0 || (j & 8) != 0) {
            try {
                jprVar.w(R.id.info_banner_card_cta, this.f.a(jprVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_banner_card_cta", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
            }
        }
        if (j == 0 || (j & 16) != 0) {
            try {
                jprVar.r(R.id.info_banner_card_cta, this.g);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_banner_card_cta", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            jprVar.a().setVisibility(true != this.h ? 8 : 0);
        }
        if (j == 0 || (j & 64) != 0) {
            int i = this.i;
            if (i != 0) {
                jprVar.d().setVisibility(0);
                jprVar.d().setImageResource(i);
            } else {
                jprVar.d().setVisibility(8);
            }
        }
        if (j == 0 || (j & 128) != 0) {
            jprVar.h.t(jprVar, this.j, R.id.image, -1, 8, false, false, false);
        }
        if (j == 0 || (j & 256) != 0) {
            boolean z = this.k;
            View view = jprVar.g;
            if (view == null) {
                yks.c("cta");
                view = null;
            }
            view.setVisibility(true == z ? 0 : 8);
        }
        if ((j == 0 || (j & 512) != 0) && (wfoVar = this.l) != null) {
            ImageView imageView = jprVar.a;
            if (imageView == null) {
                yks.c("icon");
                imageView = null;
            }
            imageView.setColorFilter(wfoVar.h());
            jprVar.e().setTextColor(wfoVar.h());
            View viewA = jprVar.a();
            MaterialButton materialButton = viewA instanceof MaterialButton ? (MaterialButton) viewA : null;
            if (materialButton != null) {
                materialButton.n(ColorStateList.valueOf(wfoVar.h()));
                materialButton.setBackgroundColor(wfoVar.p());
            }
            View viewB = jprVar.b();
            MaterialCardView materialCardView = viewB instanceof MaterialCardView ? (MaterialCardView) viewB : null;
            if (materialCardView != null) {
                materialCardView.c(wfoVar.o());
            }
        }
        if ((j == 0 || (j & 1024) != 0) && (wfoVar2 = this.m) != null) {
            jprVar.e().setTextColor(wfoVar2.h());
            TextView textView = jprVar.c;
            if (textView == null) {
                yks.c("subtitle");
                textView = null;
            }
            textView.setTextColor(wfoVar2.h());
            View viewB2 = jprVar.b();
            MaterialCardView materialCardView2 = viewB2 instanceof MaterialCardView ? (MaterialCardView) viewB2 : null;
            if (materialCardView2 != null) {
                materialCardView2.c(wfoVar2.o());
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), this.l, this.m);
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
        return this.n;
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
        this.o.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.o.remove(sddVar);
    }

    public final String toString() {
        return String.format("InfoBannerCardViewModel{title=%s, subtitle=%s, onDismissListener=%s, ctaText=%s, onCtaClickListener=%s, showDismissButton=%s, iconDrawable=%s, iconImage=%s, ctaVisibility=%s, applyDynamicSchemeToFirstTimeInfoBanner=%s, applyDynamicSchemeToUnavailableContentInfoBanner=%s}", this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), this.l, this.m);
    }
}
