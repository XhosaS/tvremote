package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpn extends scf {
    public scg a;
    public sck b;
    public sco c = sco.a;
    public CharSequence d;
    public View.OnClickListener e;
    public String f;
    public int g;
    public View.OnClickListener h;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.sort_section_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        mpn mpnVar = (mpn) scfVar;
        long j = true != yks.e(this.c, mpnVar.c) ? 1L : 0L;
        if (!yks.e(this.d, mpnVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, mpnVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, mpnVar.f)) {
            j |= 8;
        }
        if (!a.r(this.g, mpnVar.g)) {
            j |= 16;
        }
        return !yks.e(this.h, mpnVar.h) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mpm();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mpm mpmVar = (mpm) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                mpmVar.w(R.id.sort_option, this.c.a(mpmVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                mpmVar.s(R.id.sort_option, this.d);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                mpmVar.r(R.id.sort_option, this.e);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            String str = this.f;
            View view = mpmVar.b;
            if (view == null) {
                yks.c("viewModeButton");
                view = null;
            }
            cww.p(view, new mpl(str));
        }
        if (j == 0 || (16 & j) != 0) {
            int i = this.g;
            try {
                ImageView imageView = (ImageView) mpmVar.p(R.id.view_mode);
                if (i != 0) {
                    imageView.setImageResource(i);
                }
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "view_mode", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                mpmVar.r(R.id.view_mode, this.h);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "view_mode", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
            }
        }
        cww.p(mpmVar.a(), new mpk(mpmVar));
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h);
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
        return String.format("SortSectionModel{sortOption=%s, sortOptionDescription=%s, sortOptionClickListener=%s, viewModeClickDescription=%s, viewModeImage=%s, viewModeClickListener=%s}", this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h);
    }
}
