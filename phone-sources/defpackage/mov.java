package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mov extends scf implements scl {
    public scg a;
    public sck b;
    public Uri c;
    public sco d;
    public sco e;
    public View.OnClickListener f;
    public int g;
    private final int h;
    private final Set i;

    public mov(int i) {
        sco scoVar = sco.a;
        this.d = scoVar;
        this.e = scoVar;
        this.g = 0;
        this.i = new HashSet();
        this.h = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.h;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.g;
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
        mov movVar = (mov) scfVar;
        long j = true != yks.e(this.c, movVar.c) ? 1L : 0L;
        if (!yks.e(this.d, movVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, movVar.e)) {
            j |= 4;
        }
        return !yks.e(this.f, movVar.f) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mou();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mou mouVar = (mou) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                mouVar.y(this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                mouVar.w(R.id.title, this.d.a(mouVar.o()), 8);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                mouVar.w(R.id.subtitle, this.e.a(mouVar.o()), 8);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowBindable"));
            }
        }
        if (j == 0 || (j & 8) != 0) {
            try {
                mouVar.r(R.id.card, this.f);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "card", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f);
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
        this.g = i;
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
        this.i.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.i.remove(sddVar);
    }

    public final String toString() {
        return String.format("ShowModel{thumbnailImage=%s, title=%s, subtitle=%s, clickListener=%s}", this.c, this.d, this.e, this.f);
    }
}
