package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlp extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public wls e;
    public wls f;
    public wls g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public View.OnClickListener o;
    public View.OnClickListener p;
    private final yfo s;
    public boolean q = true;
    private int t = 0;
    public final Set r = new HashSet();

    public jlp(yfo yfoVar) {
        this.s = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.synopsis_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.t;
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
        jlp jlpVar = (jlp) scfVar;
        long j = true != yks.e(this.c, jlpVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jlpVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jlpVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jlpVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jlpVar.g)) {
            j |= 16;
        }
        if (!yks.e(Boolean.valueOf(this.h), Boolean.valueOf(jlpVar.h))) {
            j |= 32;
        }
        if (!yks.e(Boolean.valueOf(this.i), Boolean.valueOf(jlpVar.i))) {
            j |= 64;
        }
        if (!a.r(this.j, jlpVar.j)) {
            j |= 128;
        }
        if (!a.r(0, 0)) {
            j |= 256;
        }
        if (!yks.e(Boolean.valueOf(this.k), Boolean.valueOf(jlpVar.k))) {
            j |= 512;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(jlpVar.l))) {
            j |= 1024;
        }
        if (!yks.e(Boolean.valueOf(this.m), Boolean.valueOf(jlpVar.m))) {
            j |= 2048;
        }
        if (!yks.e(Boolean.valueOf(this.n), Boolean.valueOf(jlpVar.n))) {
            j |= 4096;
        }
        if (!yks.e(this.o, jlpVar.o)) {
            j |= 8192;
        }
        return !yks.e(this.p, jlpVar.p) ? j | 16384 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jlo();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jlo jloVar = (jlo) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jloVar, this.c, R.id.synopsis_text, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jloVar, this.d, R.id.actors_text, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jloVar, this.e, R.id.directors_text, 8);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jloVar, this.f, R.id.writers_text, 8);
        }
        if (j == 0 || (16 & j) != 0) {
            jwq.j(jloVar, this.g, R.id.producers_text, 8);
        }
        TextView textView = null;
        if (j == 0 || (32 & j) != 0) {
            boolean z = this.h;
            View view = jloVar.a;
            if (view == null) {
                yks.c("readMore");
                view = null;
            }
            view.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (64 & j) != 0) {
            boolean z2 = this.i;
            View view2 = jloVar.b;
            if (view2 == null) {
                yks.c("readLess");
                view2 = null;
            }
            view2.setVisibility(true != z2 ? 8 : 0);
        }
        if (j == 0 || (128 & j) != 0) {
            int i = this.j;
            TextView textView2 = jloVar.c;
            if (textView2 == null) {
                yks.c("synopsisText");
            } else {
                textView = textView2;
            }
            textView.setMaxLines(i);
        }
        if (j == 0 || (512 & j) != 0) {
            boolean z3 = this.k;
            if (jloVar.a().getText().toString().length() != 0) {
                jloVar.a().setVisibility(true != z3 ? 8 : 0);
            }
        }
        if (j == 0 || (1024 & j) != 0) {
            boolean z4 = this.l;
            if (jloVar.b().getText().toString().length() != 0) {
                jloVar.b().setVisibility(true != z4 ? 8 : 0);
            }
        }
        if (j == 0 || (2048 & j) != 0) {
            boolean z5 = this.m;
            if (jloVar.e().getText().toString().length() != 0) {
                jloVar.e().setVisibility(true != z5 ? 8 : 0);
            }
        }
        if (j == 0 || (4096 & j) != 0) {
            boolean z6 = this.n;
            if (jloVar.d().getText().toString().length() != 0) {
                jloVar.d().setVisibility(true == z6 ? 0 : 8);
            }
        }
        if (j == 0 || (8192 & j) != 0) {
            try {
                jloVar.r(R.id.read_more, this.o);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "read_more", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
            }
        }
        if (j == 0 || (j & 16384) != 0) {
            try {
                jloVar.r(R.id.read_less, this.p);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "read_less", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Integer.valueOf(this.j), 0, Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), this.o, this.p);
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
        this.t = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.q;
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
        this.r.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.r.remove(sddVar);
    }

    public final String toString() {
        return String.format("SynopsisViewModel{synopsisText=%s, actorsText=%s, directorsText=%s, writesText=%s, producersText=%s, isReadMoreVisible=%s, isReadLessVisible=%s, synopsisTextMaxLines=%s, synopsisComponentWidth=%s, isActorsTextVisible=%s, isDirectorsTextVisible=%s, isWritersTextVisible=%s, isProducersTextVisible=%s, readMoreClickListener=%s, readLessClickListener=%s}", this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Integer.valueOf(this.j), 0, Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), this.o, this.p);
    }
}
