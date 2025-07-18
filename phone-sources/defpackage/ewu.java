package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewu {
    public final int a;
    public final edi b;
    public ewt c;
    public ewt d;
    public ewt e;
    public long f;
    public final ezp g;

    public ewu(ezp ezpVar) {
        this.g = ezpVar;
        int i = ezpVar.a;
        this.a = i;
        this.b = new edi(32);
        ewt ewtVar = new ewt(0L, i);
        this.c = ewtVar;
        this.d = ewtVar;
        this.e = ewtVar;
    }

    public static ewt e(ewt ewtVar, ehk ehkVar, fat fatVar, edi ediVar) {
        if (ehkVar.c()) {
            long j = fatVar.b;
            int iN = 1;
            ediVar.G(1);
            ewt ewtVarH = h(ewtVar, j, ediVar.a, 1);
            long j2 = j + 1;
            byte b = ediVar.a[0];
            int i = b & 128;
            int i2 = b & Byte.MAX_VALUE;
            ehg ehgVar = ehkVar.b;
            byte[] bArr = ehgVar.a;
            if (bArr == null) {
                ehgVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            ewtVar = h(ewtVarH, j2, ehgVar.a, i2);
            long j3 = j2 + i2;
            if (z) {
                ediVar.G(2);
                ewtVar = h(ewtVar, j3, ediVar.a, 2);
                j3 += 2;
                iN = ediVar.n();
            }
            int[] iArr = ehgVar.d;
            if (iArr == null || iArr.length < iN) {
                iArr = new int[iN];
            }
            int[] iArr2 = ehgVar.e;
            if (iArr2 == null || iArr2.length < iN) {
                iArr2 = new int[iN];
            }
            if (z) {
                int i3 = iN * 6;
                ediVar.G(i3);
                ewtVar = h(ewtVar, j3, ediVar.a, i3);
                j3 += i3;
                ediVar.K(0);
                for (int i4 = 0; i4 < iN; i4++) {
                    iArr[i4] = ediVar.n();
                    iArr2[i4] = ediVar.m();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = fatVar.a - ((int) (j3 - fatVar.b));
            }
            Object obj = fatVar.c;
            String str = edt.a;
            fek fekVar = (fek) obj;
            byte[] bArr2 = fekVar.b;
            byte[] bArr3 = ehgVar.a;
            int i5 = fekVar.a;
            int i6 = fekVar.c;
            int i7 = fekVar.d;
            ehgVar.f = iN;
            ehgVar.d = iArr;
            ehgVar.e = iArr2;
            ehgVar.b = bArr2;
            ehgVar.c = i5;
            ehgVar.g = i6;
            ehgVar.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = ehgVar.i;
            cryptoInfo.numSubSamples = iN;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            dwi dwiVar = ehgVar.j;
            Object obj2 = dwiVar.a;
            a$$ExternalSyntheticApiModelOutline0.m(obj2).set(i6, i7);
            ((MediaCodec.CryptoInfo) dwiVar.b).setPattern(a$$ExternalSyntheticApiModelOutline0.m(obj2));
            long j4 = fatVar.b;
            int i8 = (int) (j3 - j4);
            fatVar.b = j4 + i8;
            fatVar.a -= i8;
        }
        if (!ehkVar.hasSupplementalData()) {
            ehkVar.a(fatVar.a);
            return g(ewtVar, fatVar.b, ehkVar.c, fatVar.a);
        }
        ediVar.G(4);
        ewt ewtVarH2 = h(ewtVar, fatVar.b, ediVar.a, 4);
        int iM = ediVar.m();
        fatVar.b += 4;
        fatVar.a -= 4;
        ehkVar.a(iM);
        ewt ewtVarG = g(ewtVarH2, fatVar.b, ehkVar.c, iM);
        fatVar.b += iM;
        int i9 = fatVar.a - iM;
        fatVar.a = i9;
        ByteBuffer byteBuffer = ehkVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            ehkVar.f = ByteBuffer.allocate(i9);
        } else {
            ehkVar.f.clear();
        }
        return g(ewtVarG, fatVar.b, ehkVar.f, fatVar.a);
    }

    private static ewt f(ewt ewtVar, long j) {
        while (j >= ewtVar.b) {
            ewtVar = ewtVar.c;
        }
        return ewtVar;
    }

    private static ewt g(ewt ewtVar, long j, ByteBuffer byteBuffer, int i) {
        ewt ewtVarF = f(ewtVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (ewtVarF.b - j));
            byteBuffer.put((byte[]) ewtVarF.d.b, ewtVarF.a(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == ewtVarF.b) {
                ewtVarF = ewtVarF.c;
            }
        }
        return ewtVarF;
    }

    private static ewt h(ewt ewtVar, long j, byte[] bArr, int i) {
        ewt ewtVarF = f(ewtVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (ewtVarF.b - j));
            System.arraycopy(ewtVarF.d.b, ewtVarF.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == ewtVarF.b) {
                ewtVarF = ewtVarF.c;
            }
        }
        return ewtVarF;
    }

    public final int a(int i) {
        ewt ewtVar = this.e;
        if (ewtVar.d == null) {
            zuw zuwVarF = this.g.f();
            ewt ewtVar2 = new ewt(this.e.b, this.a);
            ewtVar.d = zuwVarF;
            ewtVar.c = ewtVar2;
        }
        return Math.min(i, (int) (this.e.b - this.f));
    }

    public final void b(ewt ewtVar) {
        if (ewtVar.d == null) {
            return;
        }
        this.g.e(ewtVar);
        ewtVar.b();
    }

    public final void c(long j) {
        ewt ewtVar;
        if (j != -1) {
            while (true) {
                ewtVar = this.c;
                if (j < ewtVar.b) {
                    break;
                }
                this.g.g(ewtVar.d);
                this.c = this.c.b();
            }
            if (this.d.a < ewtVar.a) {
                this.d = ewtVar;
            }
        }
    }

    public final void d(int i) {
        long j = this.f + i;
        this.f = j;
        ewt ewtVar = this.e;
        if (j == ewtVar.b) {
            this.e = ewtVar.c;
        }
    }
}
