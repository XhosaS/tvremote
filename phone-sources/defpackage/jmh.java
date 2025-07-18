package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmh extends scf implements scl {
    public scg a;
    public sck b;
    public int c;
    public ImmutableList d;
    public boolean e = true;
    private int g = 0;
    public final Set f = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.user_feedback_view_layout;
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
        jmh jmhVar = (jmh) scfVar;
        boolean zR = a.r(this.c, jmhVar.c);
        boolean zE = yks.e(this.d, jmhVar.d);
        long j = true != zR ? 1L : 0L;
        return !zE ? j | 2 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jmg();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.userfeedback.UserFeedbackViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jmg jmgVar = (jmg) scaVar;
        if (j == 0 || (1 & j) != 0) {
            int i = this.c;
            ModelAwareRecyclerView modelAwareRecyclerView = jmgVar.a;
            if (modelAwareRecyclerView == null) {
                yks.c("userFeedbackView");
                modelAwareRecyclerView = null;
            }
            RecyclerView.LayoutManager layoutManager = modelAwareRecyclerView.getLayoutManager();
            layoutManager.getClass();
            ((GridLayoutManager) layoutManager).setSpanCount(i);
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                jmgVar.v(R.id.tvm_entity_user_feedback_component, this.d, 0);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_entity_user_feedback_component", "com.google.android.apps.googletv.app.presentation.components.entity.userfeedback.UserFeedbackViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.d);
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
        return this.e;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return true;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.f.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.f.remove(sddVar);
    }

    public final String toString() {
        return String.format("UserFeedbackViewModel{span=%s, userFeedbackItems=%s}", Integer.valueOf(this.c), this.d);
    }
}
