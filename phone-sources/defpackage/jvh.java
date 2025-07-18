package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvh extends scf {
    public scg a;
    public sck b;
    private final int c;

    public jvh(int i) {
        this.c = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        return 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jvg();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.spacer.SpacerViewBindable";
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

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }
}
