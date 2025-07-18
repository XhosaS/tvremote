package defpackage;

import android.view.View;
import com.google.android.videos.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgj extends scf implements scl {
    public scg a;
    public sck b;
    private int c = 0;
    private final Set d = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.divider_layout;
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
        return 5;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        return 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jgi();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.divider.DividerViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
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
}
