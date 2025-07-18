package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.googletv.app.presentation.views.verticalgridrecyclerview.VerticalGridRecyclerView;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jor extends scf {
    public scg a;
    public sck b;
    public iyk c;
    public giy d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    private final int i;
    private int j;

    public jor(int i) {
        this.i = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.i;
    }

    public final void b(int i) {
        if (a.r(this.j, i)) {
            return;
        }
        this.j = i;
        G(5);
    }

    public final void c(boolean z) {
        if (yks.e(Boolean.valueOf(this.f), Boolean.valueOf(z))) {
            return;
        }
        this.f = z;
        G(3);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jor jorVar = (jor) scfVar;
        long j = true != yks.e(this.c, jorVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jorVar.d)) {
            j |= 2;
        }
        if (!yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jorVar.e))) {
            j |= 4;
        }
        if (!yks.e(Boolean.valueOf(this.f), Boolean.valueOf(jorVar.f))) {
            j |= 8;
        }
        if (!yks.e(false, false)) {
            j |= 16;
        }
        if (!a.r(this.j, jorVar.j)) {
            j |= 32;
        }
        if (!a.r(this.g, jorVar.g)) {
            j |= 64;
        }
        return !a.r(this.h, jorVar.h) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new joq();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.genericstreampage.GenericStreamPageViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        joq joqVar = (joq) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                joqVar.u(R.id.stream_view, this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.presentation.components.genericstreampage.GenericStreamPageViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            giy giyVar = this.d;
            giyVar.getClass();
            joqVar.a().a = giyVar;
        }
        if (j == 0 || (4 & j) != 0) {
            joqVar.a().setEnabled(this.e);
        }
        if (j == 0 || (8 & j) != 0) {
            joqVar.a().d(this.f);
        }
        if (j == 0 || (16 & j) != 0) {
            ViewGroup.LayoutParams layoutParams = joqVar.b().getLayoutParams();
            cqx cqxVar = layoutParams instanceof cqx ? (cqx) layoutParams : null;
            if (cqxVar != null) {
                cqxVar.b(null);
            }
        }
        if (j == 0 || (32 & j) != 0) {
            int i = this.j;
            ModelAwareRecyclerView modelAwareRecyclerViewB = joqVar.b();
            VerticalGridRecyclerView verticalGridRecyclerView = modelAwareRecyclerViewB instanceof VerticalGridRecyclerView ? (VerticalGridRecyclerView) modelAwareRecyclerViewB : null;
            if (verticalGridRecyclerView != null) {
                verticalGridRecyclerView.b(joqVar.q().getResources().getInteger(i));
            }
        }
        if (j == 0 || (64 & j) != 0) {
            int i2 = this.g;
            ModelAwareRecyclerView modelAwareRecyclerViewB2 = joqVar.b();
            modelAwareRecyclerViewB2.setPadding(modelAwareRecyclerViewB2.getPaddingLeft(), joqVar.q().getResources().getDimensionPixelOffset(i2), modelAwareRecyclerViewB2.getPaddingRight(), modelAwareRecyclerViewB2.getPaddingBottom());
        }
        if (j == 0 || (j & 128) != 0) {
            joqVar.a = this.h;
        }
        int paddingBottom = joqVar.a;
        if (paddingBottom <= 0) {
            paddingBottom = joqVar.b().getPaddingBottom();
        }
        ModelAwareRecyclerView modelAwareRecyclerViewB3 = joqVar.b();
        modelAwareRecyclerViewB3.setPadding(modelAwareRecyclerViewB3.getPaddingLeft(), modelAwareRecyclerViewB3.getPaddingTop(), modelAwareRecyclerViewB3.getPaddingRight(), paddingBottom);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), false, Integer.valueOf(this.j), Integer.valueOf(this.g), Integer.valueOf(this.h));
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
        return String.format("GenericStreamPageViewModel{stream=%s, swipeToRefreshListener=%s, enableSwipeToRefresh=%s, isRefreshing=%s, enableAppBarScrollBehavior=%s, gridColumnCount=%s, topPadding=%s, mediaDeviceComponentsHeight=%s}", this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), false, Integer.valueOf(this.j), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }
}
