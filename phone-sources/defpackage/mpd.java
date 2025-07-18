package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpd extends scf {
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
        mpd mpdVar = (mpd) scfVar;
        long j = true != yks.e(Boolean.valueOf(this.a), Boolean.valueOf(mpdVar.a)) ? 1L : 0L;
        if (!yks.e(this.b, mpdVar.b)) {
            j |= 2;
        }
        if (!a.r(this.c, mpdVar.c)) {
            j |= 4;
        }
        return !yks.e(Boolean.valueOf(this.d), Boolean.valueOf(mpdVar.d)) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mpc();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowsPageBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mpc mpcVar = (mpc) scaVar;
        View view = null;
        if (j == 0 || (1 & j) != 0) {
            boolean z = this.a;
            View view2 = mpcVar.b;
            if (view2 == null) {
                yks.c("spinner");
                view2 = null;
            }
            view2.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                mpcVar.v(R.id.list, this.b, 0);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "list", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.ShowsPageBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            mpcVar.a = this.c;
        }
        if (j == 0 || (j & 8) != 0) {
            boolean z2 = this.d;
            View view3 = mpcVar.d;
            if (view3 == null) {
                yks.c("separator");
            } else {
                view = view3;
            }
            view.setVisibility(true == z2 ? 0 : 8);
        }
        int paddingBottom = mpcVar.a;
        if (paddingBottom <= 0) {
            paddingBottom = mpcVar.a().getPaddingBottom();
        }
        RecyclerView recyclerViewA = mpcVar.a();
        recyclerViewA.setPadding(recyclerViewA.getPaddingLeft(), recyclerViewA.getPaddingTop(), recyclerViewA.getPaddingRight(), paddingBottom);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ShowsPageModel{isSpinnerVisible=%s, items=%s, mediaDeviceComponentsHeight=%s, separatorLineVisibility=%s}", Boolean.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
