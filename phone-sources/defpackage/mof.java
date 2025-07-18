package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mof extends scf implements scl {
    public scg a;
    public sck b;
    public Uri c;
    public sco d;
    public sco e;
    public CharSequence f;
    public View.OnClickListener g;
    public View.OnClickListener h;
    public View.OnClickListener i;
    public String j;
    public kuj k;
    public boolean l;
    public CharSequence m;
    public int n;
    private final int o;
    private final Set p;

    public mof(int i) {
        sco scoVar = sco.a;
        this.d = scoVar;
        this.e = scoVar;
        this.n = 0;
        this.p = new HashSet();
        this.o = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.o;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.n;
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
        mof mofVar = (mof) scfVar;
        long j = true != yks.e(this.c, mofVar.c) ? 1L : 0L;
        if (!yks.e(this.d, mofVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, mofVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, mofVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, mofVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, mofVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, mofVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, mofVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, mofVar.k)) {
            j |= 256;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(mofVar.l))) {
            j |= 512;
        }
        return !yks.e(this.m, mofVar.m) ? j | 1024 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new moe();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        moe moeVar = (moe) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                moeVar.y(this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                moeVar.w(R.id.title, this.d.a(moeVar.o()), 8);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                moeVar.w(R.id.subtitle, this.e.a(moeVar.o()), 8);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 8) != 0) {
            try {
                moeVar.s(R.id.subtitle, this.f);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 16) != 0) {
            try {
                moeVar.r(R.id.card, this.g);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "card", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                moeVar.r(R.id.play_button, this.h);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_button", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 64) != 0) {
            try {
                moeVar.r(R.id.download_icon, this.i);
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
        if (j == 0 || (j & 128) != 0) {
            String str = this.j;
            str.getClass();
            moeVar.a().a = str;
        }
        if (j == 0 || (j & 256) != 0) {
            kuj kujVar = this.k;
            kujVar.getClass();
            moeVar.a().c(kujVar);
        }
        if (j == 0 || (j & 512) != 0) {
            boolean z = this.l;
            View view = moeVar.a;
            View view2 = null;
            if (view == null) {
                yks.c("playButton");
                view = null;
            }
            int i = true == z ? 0 : 8;
            view.setVisibility(i);
            View view3 = moeVar.b;
            if (view3 == null) {
                yks.c("downloadButton");
            } else {
                view2 = view3;
            }
            view2.setVisibility(i);
        }
        if (j == 0 || (j & 1024) != 0) {
            try {
                moeVar.s(R.id.play_button, this.m);
            } catch (scr unused8) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_button", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), this.m);
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
        this.n = i;
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
        this.p.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.p.remove(sddVar);
    }

    public final String toString() {
        return String.format("MovieModel{thumbnailImage=%s, title=%s, subtitle=%s, subtitleDescription=%s, clickListener=%s, playClickListener=%s, downloadClickListener=%s, downloadTitle=%s, downloadStatus=%s, isPlayable=%s, playButtonDescription=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), this.m);
    }
}
