package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zlg extends zjm {
    private byte[] c;

    public zlg(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.c = bArr;
    }

    private final synchronized void r() {
        if (this.c != null) {
            zis zisVar = new zis(this.c, (byte[]) null);
            try {
                zii ziiVarC = zisVar.c();
                zisVar.close();
                this.a = ziiVarC.d();
                this.c = null;
            } catch (IOException e) {
                throw new zjg("malformed ASN.1: ".concat(e.toString()), e);
            }
        }
    }

    private final synchronized byte[] x() {
        return this.c;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        byte[] bArrX = x();
        return bArrX != null ? zjf.b(z, bArrX.length) : super.l().a(z);
    }

    @Override // defpackage.zjm
    public final int b() {
        r();
        return super.b();
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        byte[] bArrX = x();
        if (bArrX != null) {
            zjfVar.j(z, 48, bArrX);
        } else {
            super.l().c(zjfVar, z);
        }
    }

    @Override // defpackage.zjm
    public final Enumeration f() {
        byte[] bArrX = x();
        return bArrX != null ? new zlf(bArrX) : new zjl(this);
    }

    @Override // defpackage.zjm
    public final zic g() {
        return ((zjm) l()).g();
    }

    @Override // defpackage.zjm
    public final zih h(int i) {
        r();
        return super.h(i);
    }

    @Override // defpackage.zjm, defpackage.zix
    public final int hashCode() {
        r();
        return super.hashCode();
    }

    @Override // defpackage.zjm
    public final zjd i() {
        return ((zjm) l()).i();
    }

    @Override // defpackage.zjm, java.lang.Iterable
    public final Iterator<zih> iterator() {
        r();
        return super.iterator();
    }

    @Override // defpackage.zjm, defpackage.zjh
    public final zjh k() {
        r();
        return super.k();
    }

    @Override // defpackage.zjm, defpackage.zjh
    public final zjh l() {
        r();
        return super.l();
    }

    @Override // defpackage.zjm
    public final zjo n() {
        return ((zjm) l()).n();
    }
}
