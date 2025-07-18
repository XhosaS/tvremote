package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtx extends scf implements scl {
    public scg a;
    public sck b;
    public boolean c;
    public wls d;
    public wls e;
    public View.OnClickListener f;
    public View.OnClickListener g;
    private final yfo h;
    private int i;
    private int j = 0;
    private final Set k = new HashSet();

    public jtx(yfo yfoVar) {
        this.h = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.selection_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.j;
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
        jtx jtxVar = (jtx) scfVar;
        boolean zR = a.r(this.i, jtxVar.i);
        boolean zE = yks.e(Boolean.valueOf(this.c), Boolean.valueOf(jtxVar.c));
        long j = true != zR ? 1L : 0L;
        if (!zE) {
            j |= 2;
        }
        if (!yks.e(this.d, jtxVar.d)) {
            j |= 4;
        }
        if (!yks.e(this.e, jtxVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.f, jtxVar.f)) {
            j |= 16;
        }
        return !yks.e(this.g, jtxVar.g) ? 32 | j : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jtw();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.selectionitem.SelectionItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jtw jtwVar = (jtw) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jtwVar.a().a(this.i);
        }
        if (j == 0 || (2 & j) != 0) {
            boolean z = this.c;
            jtwVar.a().setEnabled(!z);
            if (z) {
                jtwVar.a().setButtonTintList(ColorStateList.valueOf(jtwVar.o().getResources().getColor(R.color.disabled_checkbox_color)));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jtwVar, this.d, R.id.selection_title, -1);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jtwVar, this.e, R.id.selection_subtitle, -1);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jtwVar.r(R.id.checkbox, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "checkbox", "com.google.android.apps.googletv.app.presentation.components.selectionitem.SelectionItemViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                jtwVar.r(R.id.selection_item_component, this.g);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selection_item_component", "com.google.android.apps.googletv.app.presentation.components.selectionitem.SelectionItemViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.i), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g);
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
        this.j = i;
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
        this.k.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.k.remove(sddVar);
    }

    public final void r(int i) {
        if (a.r(this.i, i)) {
            return;
        }
        this.i = i;
        G(0);
    }

    public final String toString() {
        return String.format("SelectionItemViewModel{checkboxCheckedState=%s, checkBoxDisabled=%s, title=%s, subtitle=%s, checkBoxClickListener=%s, viewClickListener=%s}", Integer.valueOf(this.i), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g);
    }
}
