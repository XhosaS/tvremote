package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zji extends zjh implements zjp {
    final byte[] a;

    public zji(byte[] bArr) {
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
        zjfVar.j(z, 19, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zji) {
            return Arrays.equals(this.a, ((zji) zjhVar).a);
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

    public final String toString() {
        return b();
    }

    public zji(String str) {
        this.a = zxr.d(str);
    }
}
