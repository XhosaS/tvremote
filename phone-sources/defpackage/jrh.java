package defpackage;

import android.view.View;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrh extends scf {
    public scg a;
    public sck b;
    public iyk c;
    public int d;
    public boolean e;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.library_page_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jrh jrhVar = (jrh) scfVar;
        long j = true != yks.e(this.c, jrhVar.c) ? 1L : 0L;
        if (!a.r(this.d, jrhVar.d)) {
            j |= 2;
        }
        return !yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jrhVar.e)) ? j | 4 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jrg();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.librarypage.LibraryPageViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jrg jrgVar = (jrg) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jrgVar.u(R.id.stream_view, this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.presentation.components.librarypage.LibraryPageViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            jrgVar.a = this.d;
        }
        if ((j == 0 || (j & 4) != 0) && this.e) {
            ModelAwareRecyclerView modelAwareRecyclerViewA = jrgVar.a();
            modelAwareRecyclerViewA.setPadding(modelAwareRecyclerViewA.getPaddingLeft(), modelAwareRecyclerViewA.getContext().getResources().getDimensionPixelSize(R.dimen.top_padding_toolbar), modelAwareRecyclerViewA.getPaddingRight(), modelAwareRecyclerViewA.getPaddingBottom());
        }
        int i = jrgVar.a;
        int i2 = i > 0 ? i : 0;
        ModelAwareRecyclerView modelAwareRecyclerViewA2 = jrgVar.a();
        modelAwareRecyclerViewA2.setPadding(modelAwareRecyclerViewA2.getPaddingLeft(), modelAwareRecyclerViewA2.getPaddingTop(), modelAwareRecyclerViewA2.getPaddingRight(), i2);
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
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
        return String.format("LibraryPageViewModel{stream=%s, mediaDeviceComponentsHeight=%s, toolbarPadding=%s}", this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
