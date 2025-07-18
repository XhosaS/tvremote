package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dca extends dag {
    private byte[] c;

    public dca(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.c = bArr;
    }

    private final synchronized void r() {
        if (this.c != null) {
            czm czmVar = new czm(this.c, (byte[]) null);
            try {
                czc czcVarC = czmVar.c();
                czmVar.close();
                this.a = czcVarC.d();
                this.c = null;
            } catch (IOException e) {
                throw new daa("malformed ASN.1: ".concat(e.toString()), e);
            }
        }
    }

    private final synchronized byte[] x() {
        return this.c;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        byte[] bArrX = x();
        return bArrX != null ? czz.b(z, bArrX.length) : super.l().a(z);
    }

    @Override // defpackage.dag
    public final int b() {
        r();
        return super.b();
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        byte[] bArrX = x();
        if (bArrX != null) {
            czzVar.j(z, 48, bArrX);
        } else {
            super.l().c(czzVar, z);
        }
    }

    @Override // defpackage.dag
    public final Enumeration f() {
        byte[] bArrX = x();
        return bArrX != null ? new dbz(bArrX) : new daf(this);
    }

    @Override // defpackage.dag
    public final cyw g() {
        return ((dag) l()).g();
    }

    @Override // defpackage.dag
    public final czb h(int i) {
        r();
        return super.h(i);
    }

    @Override // defpackage.dag, defpackage.czr
    public final int hashCode() {
        r();
        return super.hashCode();
    }

    @Override // defpackage.dag
    public final czx i() {
        return ((dag) l()).i();
    }

    @Override // defpackage.dag, java.lang.Iterable
    public final Iterator iterator() {
        r();
        return super.iterator();
    }

    @Override // defpackage.dag, defpackage.dab
    public final dab k() {
        r();
        return super.k();
    }

    @Override // defpackage.dag, defpackage.dab
    public final dab l() {
        r();
        return super.l();
    }

    @Override // defpackage.dag
    public final dai n() {
        return ((dag) l()).n();
    }
}
