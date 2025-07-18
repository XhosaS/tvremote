package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqp extends scf {
    public scg a;
    public sck b;
    public mom c;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.legacy_library_movies_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        return !yks.e(this.c, ((jqp) scfVar).c) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jqo();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.legacylibrarymovies.LegacyLibraryMoviesViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jqo jqoVar = (jqo) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jqoVar.u(R.id.library_page, this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "library_page", "com.google.android.apps.googletv.app.presentation.components.legacylibrarymovies.LegacyLibraryMoviesViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c);
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

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("LegacyLibraryMoviesViewModel{pageModel=%s}", this.c);
    }
}
