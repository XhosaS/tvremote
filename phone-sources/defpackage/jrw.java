package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrw extends scf implements scl {
    public scg a;
    public sck b;
    public boolean c;
    public wls d;
    public wls e;
    public View.OnClickListener f;
    public View.OnClickListener g;
    public wlx h;
    private final yfo i;
    private boolean j;
    private int k = 0;
    private final Set l = new HashSet();

    public jrw(yfo yfoVar) {
        this.i = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.media_provider_selection_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.k;
    }

    @Override // defpackage.scl
    public final int c() {
        return 1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jrw jrwVar = (jrw) scfVar;
        long j = true != yks.e(Boolean.valueOf(this.j), Boolean.valueOf(jrwVar.j)) ? 1L : 0L;
        if (!yks.e(Boolean.valueOf(this.c), Boolean.valueOf(jrwVar.c))) {
            j |= 2;
        }
        if (!yks.e(this.d, jrwVar.d)) {
            j |= 4;
        }
        if (!yks.e(this.e, jrwVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.f, jrwVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.g, jrwVar.g)) {
            j |= 32;
        }
        return !yks.e(this.h, jrwVar.h) ? j | 64 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.i.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.mediaproviderselectionitem.MediaProviderSelectionItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jrv jrvVar = (jrv) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jrvVar.a().setChecked(this.j);
        }
        if (j == 0 || (2 & j) != 0) {
            boolean z = this.c;
            jrvVar.a().setEnabled(!z);
            if (z) {
                jrvVar.a().setButtonTintList(ColorStateList.valueOf(jrvVar.o().getResources().getColor(R.color.disabled_checkbox_color)));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jrvVar, this.d, R.id.provider_title, -1);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jrvVar, this.e, R.id.checkbox_label, 8);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jrvVar.r(R.id.checkbox, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "checkbox", "com.google.android.apps.googletv.app.presentation.components.mediaproviderselectionitem.MediaProviderSelectionItemViewBindable"));
            }
        }
        if (j == 0 || (32 & j) != 0) {
            try {
                jrvVar.r(R.id.media_provider_selection_item_component, this.g);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_provider_selection_item_component", "com.google.android.apps.googletv.app.presentation.components.mediaproviderselectionitem.MediaProviderSelectionItemViewBindable"));
            }
        }
        if (j == 0 || (j & 64) != 0) {
            jrvVar.b.t(jrvVar, this.h, R.id.icon, -1, -1, true, false, false);
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.j), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h);
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
        this.k = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return true;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return true;
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

    public final void r(boolean z) {
        if (yks.e(Boolean.valueOf(this.j), Boolean.valueOf(z))) {
            return;
        }
        this.j = z;
        G(0);
    }

    public final String toString() {
        return String.format("MediaProviderSelectionItemViewModel{checkBoxChecked=%s, checkBoxDisabled=%s, providerTitle=%s, checkBoxLabel=%s, checkBoxClickListener=%s, viewClickListener=%s, icon=%s}", Boolean.valueOf(this.j), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h);
    }
}
