package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdv extends scf {
    public wlx a;
    public sco b = sco.a;
    public wls c;
    public wls d;
    private final yfo e;

    public kdv(yfo yfoVar) {
        this.e = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.provider_selection_menu_header_view_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kdv kdvVar = (kdv) scfVar;
        long j = true != yks.e(this.a, kdvVar.a) ? 1L : 0L;
        if (!yks.e(this.b, kdvVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, kdvVar.c)) {
            j |= 4;
        }
        return !yks.e(this.d, kdvVar.d) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.e.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionmenuheader.ProviderSelectionMenuHeaderViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kdu kduVar = (kdu) scaVar;
        if (j == 0 || (1 & j) != 0) {
            kduVar.a.t(kduVar, this.a, R.id.screenshot, R.drawable.gtv_tvm_card_default_background, -1, false, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kduVar.w(R.id.title, this.b.a(kduVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionmenuheader.ProviderSelectionMenuHeaderViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(kduVar, this.c, R.id.subtitle, 8);
        }
        if (j == 0 || (j & 8) != 0) {
            jwq.j(kduVar, this.d, R.id.synopsis, 8);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ProviderSelectionMenuHeaderViewModel{screenshot=%s, title=%s, subtitle=%s, synopsis=%s}", this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
