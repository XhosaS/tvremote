package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvn extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    private final int d;
    private final yfo e;
    private int f = 0;
    private final Set g = new HashSet();

    public jvn(yfo yfoVar, int i) {
        this.e = yfoVar;
        this.d = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.d;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.f;
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
        return !yks.e(this.c, ((jvn) scfVar).c) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jvm();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.spanningtext.SpanningTextViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jvm jvmVar = (jvm) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(jvmVar, this.c, R.id.spanning_text_component, -1);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c);
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
        this.f = i;
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
        return true;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.g.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.g.remove(sddVar);
    }

    public final String toString() {
        return String.format("SpanningTextViewModel{text=%s}", this.c);
    }
}
