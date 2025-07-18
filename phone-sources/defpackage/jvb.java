package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvb extends scf implements scl {
    public scg a;
    public sck b;
    public View.OnClickListener d;
    public sco c = sco.a;
    private int e = 0;
    private final Set f = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.sort_selection_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.e;
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
        jvb jvbVar = (jvb) scfVar;
        long j = true != yks.e(this.c, jvbVar.c) ? 1L : 0L;
        return !yks.e(this.d, jvbVar.d) ? j | 2 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jva();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.sortselection.SortSelectionViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jva jvaVar = (jva) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jvaVar.w(R.id.sort_option, this.c.a(jvaVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.googletv.app.presentation.components.sortselection.SortSelectionViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                jvaVar.r(R.id.sort_option, this.d);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.googletv.app.presentation.components.sortselection.SortSelectionViewBindable"));
            }
        }
        cww.p(jvaVar.a(), new juz(jvaVar));
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d);
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
        this.e = i;
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
        this.f.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.f.remove(sddVar);
    }

    public final String toString() {
        return String.format("SortSelectionViewModel{sortOption=%s, sortOptionClickListener=%s}", this.c, this.d);
    }
}
