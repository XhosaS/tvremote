package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiv extends scf implements scl {
    public scg a;
    public sck b;
    public boolean c;
    public CompoundButton.OnCheckedChangeListener d;
    public View.OnClickListener e;
    public View.OnClickListener f;
    private boolean i;
    private boolean j;
    public boolean g = true;
    private int k = 0;
    public final Set h = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.family_library_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.k;
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
        jiv jivVar = (jiv) scfVar;
        long j = true != yks.e(Boolean.valueOf(this.i), Boolean.valueOf(jivVar.i)) ? 1L : 0L;
        if (!yks.e(Boolean.valueOf(this.c), Boolean.valueOf(jivVar.c))) {
            j |= 2;
        }
        if (!yks.e(this.d, jivVar.d)) {
            j |= 4;
        }
        if (!yks.e(Boolean.valueOf(this.j), Boolean.valueOf(jivVar.j))) {
            j |= 8;
        }
        if (!yks.e(this.e, jivVar.e)) {
            j |= 16;
        }
        return !yks.e(this.f, jivVar.f) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jiu();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.familylibrary.FamilyLibraryViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws Resources.NotFoundException {
        boolean z;
        jiu jiuVar = (jiu) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jiuVar.a().setEnabled(this.i);
        }
        if ((j == 0 || (2 & j) != 0) && (z = this.c) != jiuVar.a().isChecked()) {
            jiuVar.a().setChecked(z);
        }
        if (j == 0 || (4 & j) != 0) {
            jiuVar.a().setOnCheckedChangeListener(this.d);
        }
        if (j == 0 || (8 & j) != 0) {
            boolean z2 = this.j;
            View view = jiuVar.b;
            if (view == null) {
                yks.c("cardView");
                view = null;
            }
            view.setVisibility(true != z2 ? 8 : 0);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jiuVar.r(R.id.show_sharing_add_button, this.e);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "show_sharing_add_button", "com.google.android.apps.googletv.app.presentation.components.entity.familylibrary.FamilyLibraryViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                jiuVar.r(R.id.show_sharing_remove_all_button, this.f);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "show_sharing_remove_all_button", "com.google.android.apps.googletv.app.presentation.components.entity.familylibrary.FamilyLibraryViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.i), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.j), this.e, this.f);
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
        return this.g;
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
        this.h.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.h.remove(sddVar);
    }

    public final void r(boolean z) {
        if (yks.e(Boolean.valueOf(this.j), Boolean.valueOf(z))) {
            return;
        }
        this.j = z;
        G(3);
    }

    public final void s(boolean z) {
        if (yks.e(Boolean.valueOf(this.c), Boolean.valueOf(z))) {
            return;
        }
        this.c = z;
        G(1);
    }

    public final void t(boolean z) {
        if (yks.e(Boolean.valueOf(this.i), Boolean.valueOf(z))) {
            return;
        }
        this.i = z;
        G(0);
    }

    public final String toString() {
        return String.format("FamilyLibraryViewModel{switchEnabled=%s, switchChecked=%s, onSwitchChecked=%s, shareMoreCardVisibility=%s, addClickListener=%s, removeAllClickListener=%s}", Boolean.valueOf(this.i), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.j), this.e, this.f);
    }
}
