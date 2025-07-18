package defpackage;

import android.view.View;
import com.google.android.videos.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkz extends scf implements scl {
    private int a = 0;
    private final Set b = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.preorder_section_heading;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.a;
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
        return 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mky();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.components.base.StaticViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.a = i;
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
        this.b.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.b.remove(sddVar);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
