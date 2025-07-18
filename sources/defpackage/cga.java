package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cga {
    public static final cga a;
    final cfx b;
    final Character c;

    static {
        new cfz("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        a = new cfz("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new cga("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new cga("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        int i = cfy.a;
        cfx cfxVar = new cfx("base16()", "0123456789ABCDEF".toCharArray());
        new cga(cfxVar, null);
        char[] cArr = new char[512];
        bdq.e(cfxVar.a.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            cArr[i2] = cfxVar.a(i2 >>> 4);
            cArr[i2 | 256] = cfxVar.a(i2 & 15);
        }
    }

    public cga() {
        throw null;
    }

    public void a(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        bdq.i(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.e;
            c(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    public final String b(byte[] bArr) {
        int length = bArr.length;
        bdq.i(0, length, length);
        cfx cfxVar = this.b;
        StringBuilder sb = new StringBuilder(cfxVar.d * qm.W(length, cfxVar.e, RoundingMode.CEILING));
        try {
            a(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void c(Appendable appendable, byte[] bArr, int i, int i2) {
        bdq.i(i, i + i2, bArr.length);
        cfx cfxVar = this.b;
        int i3 = cfxVar.e;
        int i4 = 0;
        bdq.e(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        while (i4 < i2 * 8) {
            int i7 = cfxVar.c;
            appendable.append(cfxVar.a(cfxVar.b & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += cfxVar.c;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cga) {
            cga cgaVar = (cga) obj;
            if (this.b.equals(cgaVar.b) && Objects.equals(this.c, cgaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        cfx cfxVar = this.b;
        sb.append(cfxVar);
        if (8 % cfxVar.c != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public cga(cfx cfxVar, Character ch) {
        this.b = cfxVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (cfxVar.f[61] != -1) {
                z = false;
            }
        }
        bdq.h(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    public cga(String str, String str2, Character ch) {
        this(new cfx(str, str2.toCharArray()), ch);
    }
}
