package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scw extends scf implements scl {
    private final int a;
    private int b = 0;
    private final Set c = new HashSet();

    public scw(int i) {
        this.a = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.b;
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
        return new scv();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.libraries.play.movies.symbian.recyclerview.PagingIndicatorBindable";
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.b = i;
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
        this.c.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.c.remove(sddVar);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
    }
}
