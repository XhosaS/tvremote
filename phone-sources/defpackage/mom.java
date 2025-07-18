package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mom extends scf {
    public boolean a;
    public ImmutableList b;
    public int c;
    public boolean d;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.library_page;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        mom momVar = (mom) scfVar;
        long j = true != yks.e(Boolean.valueOf(this.a), Boolean.valueOf(momVar.a)) ? 1L : 0L;
        if (!yks.e(this.b, momVar.b)) {
            j |= 2;
        }
        if (!a.r(this.c, momVar.c)) {
            j |= 4;
        }
        return !yks.e(Boolean.valueOf(this.d), Boolean.valueOf(momVar.d)) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mol();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MoviesPageBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mol molVar = (mol) scaVar;
        RecyclerView recyclerView = null;
        if (j == 0 || (1 & j) != 0) {
            boolean z = this.a;
            View view = molVar.b;
            if (view == null) {
                yks.c("spinner");
                view = null;
            }
            view.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                molVar.v(R.id.list, this.b, 0);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "list", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MoviesPageBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            molVar.a = this.c;
        }
        if (j == 0 || (j & 8) != 0) {
            boolean z2 = this.d;
            View view2 = molVar.d;
            if (view2 == null) {
                yks.c("separator");
                view2 = null;
            }
            view2.setVisibility(true == z2 ? 0 : 8);
        }
        int i = molVar.a;
        int i2 = i > 0 ? i : 0;
        RecyclerView recyclerView2 = molVar.c;
        if (recyclerView2 == null) {
            yks.c("rv");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i2);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("MoviesPageModel{isSpinnerVisible=%s, items=%s, mediaDeviceComponentsHeight=%s, separatorLineVisibility=%s}", Boolean.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
