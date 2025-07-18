package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zip extends zjh implements zjp {
    final byte[] a;

    public zip(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.a = bArr;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    @Override // defpackage.zjp
    public final String b() {
        return zxr.a(this.a);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 25, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zip) {
            return Arrays.equals(this.a, ((zip) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.a);
    }
}
