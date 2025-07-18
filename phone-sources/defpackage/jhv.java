package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhv extends scf {
    public wls a;
    public wls b;
    private final yfo c;
    private wls d;
    private wlx e;
    private CharSequence f;
    private View.OnClickListener g;
    private String h;
    private wfo i;
    private Boolean j;

    public jhv(yfo yfoVar) {
        this.c = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.provider_icon_filled_button_layout;
    }

    public final void b(wfo wfoVar) {
        if (yks.e(this.i, wfoVar)) {
            return;
        }
        this.i = wfoVar;
        G(7);
    }

    public final void c(wls wlsVar) {
        if (yks.e(this.d, wlsVar)) {
            return;
        }
        this.d = wlsVar;
        G(2);
    }

    public final void d(sch schVar) {
        this.g = new scc("R.id.button", this, schVar);
        G(5);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhv jhvVar = (jhv) scfVar;
        long j = true != yks.e(this.a, jhvVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jhvVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.d, jhvVar.d)) {
            j |= 4;
        }
        if (!yks.e(this.e, jhvVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.f, jhvVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.g, jhvVar.g)) {
            j |= 32;
        }
        if (!yks.e(this.h, jhvVar.h)) {
            j |= 64;
        }
        if (!yks.e(this.i, jhvVar.i)) {
            j |= 128;
        }
        return !yks.e(this.j, jhvVar.j) ? j | 256 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.c.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        Boolean bool;
        jhu jhuVar = (jhu) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(jhuVar, this.a, R.id.button_title, 8);
        }
        if (j == 0 || (j & 2) != 0) {
            jwq.j(jhuVar, this.b, R.id.button_subtitle, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            jwq.j(jhuVar, this.d, R.id.button_annotation, 8);
        }
        if (j == 0 || (j & 8) != 0) {
            jhuVar.f.t(jhuVar, this.e, R.id.icon, -1, 8, true, false, false);
        }
        if (j == 0 || (j & 16) != 0) {
            try {
                jhuVar.s(R.id.button, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                jhuVar.r(R.id.button, this.g);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
            }
        }
        if (j == 0 || (j & 64) != 0) {
            jwq.h(jhuVar, this.h, R.id.button_layout);
        }
        if ((j == 0 || (j & 128) != 0) && (wfoVar = this.i) != null) {
            View view = jhuVar.a;
            if (view == null) {
                yks.c("buttonView");
                view = null;
            }
            MaterialButton materialButton = view instanceof MaterialButton ? (MaterialButton) view : null;
            if (materialButton != null) {
                materialButton.setBackgroundColor(wfoVar.j());
            }
            TextView textView = jhuVar.e;
            if (textView == null) {
                yks.c("providerButtonTitleView");
                textView = null;
            }
            textView.setTextColor(wfoVar.d());
            View viewA = jhuVar.a();
            MaterialCardView materialCardView = viewA instanceof MaterialCardView ? (MaterialCardView) viewA : null;
            if (materialCardView != null) {
                materialCardView.c(wfoVar.k());
            }
            ImageView imageView = jhuVar.d;
            if (imageView == null) {
                yks.c("iconShop");
                imageView = null;
            }
            imageView.setColorFilter(wfoVar.e());
        }
        if ((j == 0 || (j & 256) != 0) && (bool = this.j) != null) {
            ImageView imageView2 = jhuVar.b;
            if (imageView2 == null) {
                yks.c("icon");
                imageView2 = null;
            }
            bool.booleanValue();
            imageView2.setVisibility(8);
            View viewA2 = jhuVar.a();
            MaterialCardView materialCardView2 = viewA2 instanceof MaterialCardView ? (MaterialCardView) viewA2 : null;
            if (materialCardView2 != null) {
                bool.booleanValue();
                materialCardView2.setVisibility(0);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void k(CharSequence charSequence) {
        if (yks.e(this.f, charSequence)) {
            return;
        }
        this.f = charSequence;
        G(4);
    }

    public final void l(String str) {
        if (yks.e(this.h, str)) {
            return;
        }
        this.h = str;
        G(6);
    }

    public final void m(wls wlsVar) {
        if (yks.e(this.a, wlsVar)) {
            return;
        }
        this.a = wlsVar;
        G(0);
    }

    public final void n(wlx wlxVar) {
        if (yks.e(this.e, wlxVar)) {
            return;
        }
        this.e = wlxVar;
        G(3);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final void p(Boolean bool) {
        if (yks.e(this.j, bool)) {
            return;
        }
        this.j = bool;
        G(8);
    }

    public final String toString() {
        return String.format("ProviderIconFilledButtonViewModel{buttonTitle=%s, buttonSubtitle=%s, buttonAnnotationText=%s, icon=%s, buttonContentDescription=%s, buttonClickListener=%s, buttonTag=%s, applyDynamicScheme=%s, showShopIcon=%s}", this.a, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
