package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhs extends scf {
    private final yfo a;
    private wls b;
    private wls c;
    private wls d;
    private String e;
    private View.OnClickListener f;
    private View.OnClickListener g;
    private Boolean h;
    private wfo i;

    public jhs(yfo yfoVar) {
        this.a = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.filled_button_layout;
    }

    public final void b(wfo wfoVar) {
        if (yks.e(this.i, wfoVar)) {
            return;
        }
        this.i = wfoVar;
        G(9);
    }

    public final void c(sch schVar) {
        this.g = new scc("R.id.bc25_button", this, schVar);
        G(5);
    }

    public final void d(wls wlsVar) {
        if (yks.e(this.c, wlsVar)) {
            return;
        }
        this.c = wlsVar;
        G(1);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhs jhsVar = (jhs) scfVar;
        long j = true != yks.e(this.b, jhsVar.b) ? 1L : 0L;
        if (!yks.e(this.c, jhsVar.c)) {
            j |= 2;
        }
        if (!yks.e(this.d, jhsVar.d)) {
            j |= 4;
        }
        if (!yks.e(this.e, jhsVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.f, jhsVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.g, jhsVar.g)) {
            j |= 32;
        }
        if (!yks.e(false, false)) {
            j |= 64;
        }
        if (!yks.e(null, null)) {
            j |= 128;
        }
        if (!yks.e(this.h, jhsVar.h)) {
            j |= 256;
        }
        return !yks.e(this.i, jhsVar.i) ? j | 512 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jhr();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws Resources.NotFoundException {
        wfo wfoVar;
        jhr jhrVar = (jhr) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jhrVar, this.b, R.id.button, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jhrVar, this.c, R.id.bc25_button_text, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jhrVar, this.d, R.id.button_annotation, 8);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.h(jhrVar, this.e, R.id.button_layout);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jhrVar.r(R.id.button, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
            }
        }
        if (j == 0 || (32 & j) != 0) {
            try {
                jhrVar.r(R.id.bc25_button, this.g);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
            }
        }
        ImageView imageView = null;
        if (j == 0 || (64 & j) != 0) {
            ConstraintLayout constraintLayout = jhrVar.g;
            if (constraintLayout == null) {
                yks.c("filledButtonLayout");
                constraintLayout = null;
            }
            int dimensionPixelSize = jhrVar.q().getResources().getDimensionPixelSize(R.dimen.cta_min_width);
            if (dimensionPixelSize != constraintLayout.d) {
                constraintLayout.d = dimensionPixelSize;
                constraintLayout.requestLayout();
            }
        }
        if (j == 0 || (128 & j) != 0) {
            jhrVar.b().m(null);
        }
        if (j == 0 || (256 & j) != 0) {
            if (yks.e(this.h, true)) {
                jhrVar.a().setVisibility(0);
                jhrVar.b().setVisibility(8);
            } else {
                jhrVar.a().setVisibility(8);
                jhrVar.b().setVisibility(0);
            }
        }
        if ((j == 0 || (j & 512) != 0) && (wfoVar = this.i) != null) {
            MaterialButton materialButton = jhrVar.d;
            if (materialButton == null) {
                yks.c("filledBc25Button");
                materialButton = null;
            }
            materialButton.setBackgroundColor(wfoVar.j());
            TextView textView = jhrVar.f;
            if (textView == null) {
                yks.c("filledBc25ButtonText");
                textView = null;
            }
            textView.setTextColor(wfoVar.d());
            View view = jhrVar.b;
            if (view == null) {
                yks.c("filledBc25ButtonIconContainer");
                view = null;
            }
            MaterialCardView materialCardView = view instanceof MaterialCardView ? (MaterialCardView) view : null;
            if (materialCardView != null) {
                materialCardView.c(wfoVar.k());
            }
            ImageView imageView2 = jhrVar.c;
            if (imageView2 == null) {
                yks.c("filledBc25ButtonIcon");
            } else {
                imageView = imageView2;
            }
            imageView.setColorFilter(wfoVar.e());
        }
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f, this.g, false, null, this.h, this.i);
    }

    public final void k(wls wlsVar) {
        if (yks.e(this.d, wlsVar)) {
            return;
        }
        this.d = wlsVar;
        G(2);
    }

    public final void l(sch schVar) {
        this.f = new scc("R.id.button", this, schVar);
        G(4);
    }

    public final void m(String str) {
        if (yks.e(this.e, str)) {
            return;
        }
        this.e = str;
        G(3);
    }

    public final void n(wls wlsVar) {
        if (yks.e(this.b, wlsVar)) {
            return;
        }
        this.b = wlsVar;
        G(0);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final void p(Boolean bool) {
        if (yks.e(this.h, bool)) {
            return;
        }
        this.h = bool;
        G(8);
    }

    public final String toString() {
        return String.format("FilledButtonViewModel{buttonText=%s, bc25ButtonText=%s, buttonAnnotationText=%s, buttonTag=%s, buttonClickListener=%s, bc25ButtonClickListener=%s, bigWidth=%s, icon=%s, showBc25Button=%s, applyDynamicScheme=%s}", this.b, this.c, this.d, this.e, this.f, this.g, false, null, this.h, this.i);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
