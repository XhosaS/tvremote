package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zjw extends zjh implements zjp {
    final byte[] a;

    public zjw(byte[] bArr) {
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
        zjfVar.j(z, 21, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zjw) {
            return Arrays.equals(this.a, ((zjw) zjhVar).a);
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
