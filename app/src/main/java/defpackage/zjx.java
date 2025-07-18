package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjx extends zji {
    private int a;
    private long b;
    private int c;
    private int d = 0;
    private boolean e = false;

    public zjx(int i) {
        this.a = i;
    }

    @Override // defpackage.zji
    public final void a(char c) {
        c(2, c);
    }

    public final void c(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = zjy.e(this.a, zjy.f((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.zji
    public final void d(byte[] bArr, int i) {
        int i2 = 0;
        yqw.K(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            c(4, zjy.d(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            c(1, bArr[i2] & 255);
            i2++;
        }
    }

    @Override // defpackage.zji, defpackage.zjo
    public final zjo f(CharSequence charSequence, Charset charset) {
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return super.f(charSequence, charset);
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence.charAt(i + 1);
            char cCharAt3 = charSequence.charAt(i + 2);
            char cCharAt4 = charSequence.charAt(i + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            c(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
            i = i2;
        }
        while (i < length) {
            char cCharAt5 = charSequence.charAt(i);
            if (cCharAt5 < 128) {
                c(1, cCharAt5);
            } else if (cCharAt5 < 2048) {
                c(2, zjy.h(cCharAt5));
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                c(3, zjy.g(cCharAt5));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                if (iCodePointAt == cCharAt5) {
                    byte[] bytes = charSequence.subSequence(i, length).toString().getBytes(charset);
                    d(bytes, bytes.length);
                    return this;
                }
                c(4, zjy.i(iCodePointAt));
                i++;
            }
            i++;
        }
        return this;
    }

    @Override // defpackage.zjo
    public final zjm n() {
        yqw.L(!this.e);
        this.e = true;
        int iF = this.a ^ zjy.f((int) this.b);
        this.a = iF;
        return zjy.j(iF, this.d);
    }
}
