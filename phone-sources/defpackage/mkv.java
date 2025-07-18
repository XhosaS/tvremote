package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkv extends scf implements scl {
    public View.OnClickListener a;
    private final int b;
    private int c = 0;
    private final Set d = new HashSet();

    public mkv(int i) {
        this.b = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.c;
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
        long j = true != yks.e(this.a, ((mkv) scfVar).a) ? 1L : 0L;
        return !yks.e(null, null) ? j | 2 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mku();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.components.base.ClickableViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mku mkuVar = (mku) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                mkuVar.r(R.id.button, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.play.movies.mobile.usecase.components.base.ClickableViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                mkuVar.t(R.id.button, null);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.play.movies.mobile.usecase.components.base.ClickableViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.c = i;
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
        this.d.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.d.remove(sddVar);
    }

    public final String toString() {
        return String.format("ClickableViewModel{clickListener=%s, longClickListener=%s}", this.a, null);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
