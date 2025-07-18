package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjy extends scf implements scl {
    public scg a;
    public sck b;
    private final yfo c;
    private View.OnClickListener d;
    private int f;
    private boolean g;
    private String h;
    private sco e = sco.a;
    private int i = 0;
    private final Set j = new HashSet();

    public kjy(yfo yfoVar) {
        this.c = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.menu_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.i;
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
        kjy kjyVar = (kjy) scfVar;
        long j = true != yks.e(this.d, kjyVar.d) ? 1L : 0L;
        if (!yks.e(this.e, kjyVar.e)) {
            j |= 2;
        }
        if (!a.r(this.f, kjyVar.f)) {
            j |= 4;
        }
        if (!yks.e(Boolean.valueOf(this.g), Boolean.valueOf(kjyVar.g))) {
            j |= 8;
        }
        return !yks.e(this.h, kjyVar.h) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kjx();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.menuitem.MenuItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kjx kjxVar = (kjx) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kjxVar.r(R.id.menu_item, this.d);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "menu_item", "com.google.android.apps.googletv.app.presentation.views.menuitem.MenuItemViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kjxVar.w(R.id.display_text, this.e.a(kjxVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "display_text", "com.google.android.apps.googletv.app.presentation.views.menuitem.MenuItemViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            kjxVar.a().setCompoundDrawablesWithIntrinsicBounds(this.f, 0, 0, 0);
        }
        if (j == 0 || (8 & j) != 0) {
            kjxVar.a().setSelected(this.g);
        }
        if (j == 0 || (j & 16) != 0) {
            jwq.h(kjxVar, this.h, R.id.menu_item);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), this.h);
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
        this.i = i;
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
        return false;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.j.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.j.remove(sddVar);
    }

    public final void r(sch schVar) {
        this.d = new scc("R.id.menu_item", this, schVar);
        G(0);
    }

    public final void s(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.e, scoVar)) {
            return;
        }
        this.e = scoVar;
        G(1);
    }

    public final void t(int i) {
        if (a.r(this.f, i)) {
            return;
        }
        this.f = i;
        G(2);
    }

    public final String toString() {
        return String.format("MenuItemViewModel{clickListener=%s, displayText=%s, icon=%s, selected=%s, tag=%s}", this.d, this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), this.h);
    }

    public final void u(boolean z) {
        if (yks.e(Boolean.valueOf(this.g), Boolean.valueOf(z))) {
            return;
        }
        this.g = z;
        G(3);
    }

    public final void v(String str) {
        if (yks.e(this.h, str)) {
            return;
        }
        this.h = str;
        G(4);
    }

    public kjy(yfo yfoVar, byte[] bArr) {
        this.c = yfoVar;
    }
}
