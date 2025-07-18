package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zia extends zjh implements zjp {
    final char[] a;

    public zia(char[] cArr) {
        this.a = cArr;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        int length = this.a.length;
        return zjf.b(z, length + length);
    }

    @Override // defpackage.zjp
    public final String b() {
        return new String(this.a);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 30);
        char[] cArr = this.a;
        int length = cArr.length;
        zjfVar.h(length + length);
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < (length & (-4))) {
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            int i5 = i + 4;
            char c = cArr[i];
            char c2 = cArr[i2];
            char c3 = cArr[i3];
            char c4 = cArr[i4];
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            zjfVar.g(bArr, 0, 8);
            i = i5;
        }
        if (i >= length) {
            return;
        }
        int i6 = 0;
        while (true) {
            int i7 = i + 1;
            int i8 = i6 + 1;
            char c5 = cArr[i];
            bArr[i6] = (byte) (c5 >> '\b');
            i6 += 2;
            bArr[i8] = (byte) c5;
            if (i7 >= length) {
                zjfVar.g(bArr, 0, i6);
                return;
            }
            i = i7;
        }
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zia) {
            return Arrays.equals(this.a, ((zia) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        char[] cArr = this.a;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return b();
    }
}
