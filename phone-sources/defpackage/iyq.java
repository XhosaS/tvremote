package defpackage;

import android.view.View;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyq extends scf {
    public iyk a;
    public giy b;
    public boolean c;
    public boolean d;
    public int e;
    private final int f;

    public iyq(int i) {
        this.f = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.f;
    }

    public final void b(boolean z) {
        if (yks.e(Boolean.valueOf(this.d), Boolean.valueOf(z))) {
            return;
        }
        this.d = z;
        G(3);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        iyq iyqVar = (iyq) scfVar;
        long j = true != yks.e(this.a, iyqVar.a) ? 1L : 0L;
        if (!yks.e(this.b, iyqVar.b)) {
            j |= 2;
        }
        if (!yks.e(Boolean.valueOf(this.c), Boolean.valueOf(iyqVar.c))) {
            j |= 4;
        }
        if (!yks.e(Boolean.valueOf(this.d), Boolean.valueOf(iyqVar.d))) {
            j |= 8;
        }
        return !a.r(this.e, iyqVar.e) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new iyp();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.framework.streampage.StreamPageViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        iyp iypVar = (iyp) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                iypVar.u(R.id.stream_view, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.framework.streampage.StreamPageViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            giy giyVar = this.b;
            giyVar.getClass();
            iypVar.a().a = giyVar;
        }
        if (j == 0 || (4 & j) != 0) {
            iypVar.a().setEnabled(this.c);
        }
        if (j == 0 || (8 & j) != 0) {
            iypVar.a().d(this.d);
        }
        if (j == 0 || (j & 16) != 0) {
            iypVar.a = this.e;
        }
        int paddingBottom = iypVar.a;
        if (paddingBottom <= 0) {
            paddingBottom = iypVar.b().getPaddingBottom();
        }
        ModelAwareRecyclerView modelAwareRecyclerViewB = iypVar.b();
        modelAwareRecyclerViewB.setPadding(modelAwareRecyclerViewB.getPaddingLeft(), modelAwareRecyclerViewB.getPaddingTop(), modelAwareRecyclerViewB.getPaddingRight(), paddingBottom);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("StreamPageViewModel{stream=%s, swipeToRefreshListener=%s, enableSwipeToRefresh=%s, isRefreshing=%s, mediaDeviceComponentsHeight=%s}", this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
