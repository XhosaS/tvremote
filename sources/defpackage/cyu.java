package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyu extends dab implements daj {
    final char[] a;

    public cyu(char[] cArr) {
        this.a = cArr;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        int length = this.a.length;
        return czz.b(z, length + length);
    }

    @Override // defpackage.daj
    public final String b() {
        return new String(this.a);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 30);
        char[] cArr = this.a;
        int length = cArr.length;
        czzVar.h(length + length);
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
            czzVar.g(bArr, 0, 8);
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
                czzVar.g(bArr, 0, i6);
                return;
            }
            i = i7;
        }
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (dabVar instanceof cyu) {
            return Arrays.equals(this.a, ((cyu) dabVar).a);
        }
        return false;
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    @Override // defpackage.czr
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
