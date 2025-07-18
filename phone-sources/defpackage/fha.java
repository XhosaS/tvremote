package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fha {
    public byte[] P;
    public fem V;
    public boolean W;
    public fel Z;
    public boolean a;
    public int aa;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public byte[] j;
    public fek k;
    public byte[] l;
    public dza m;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = 0;
    public int t = -1;
    public float u = 0.0f;
    public float v = 0.0f;
    public float w = 0.0f;
    public byte[] x = null;
    public int y = -1;
    public boolean z = false;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = 200;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = 8000;
    public long T = 0;
    public long U = 0;
    public boolean X = true;
    public String Y = "eng";

    public static Pair a(edi ediVar) {
        try {
            ediVar.L(16);
            long jP = ediVar.p();
            if (jP == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jP == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jP != 826496599) {
                edb.e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int i = ediVar.b + 20;
            byte[] bArr = ediVar.a;
            while (true) {
                int length = bArr.length;
                if (i >= length - 4) {
                    throw new eaf("Failed to find FourCC VC1 initialization data", null, true, 1);
                }
                int i2 = i + 1;
                if (bArr[i] == 0 && bArr[i2] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                }
                i = i2;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eaf("Error parsing FourCC private data", null, true, 1);
        }
    }

    public static List b(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw new eaf("Error parsing vorbis codec private", null, true, 1);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw new eaf("Error parsing vorbis codec private", null, true, 1);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw new eaf("Error parsing vorbis codec private", null, true, 1);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw new eaf("Error parsing vorbis codec private", null, true, 1);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eaf("Error parsing vorbis codec private", null, true, 1);
        }
    }

    public static boolean d(edi ediVar) throws eaf {
        try {
            int iH = ediVar.h();
            if (iH == 1) {
                return true;
            }
            if (iH == 65534) {
                ediVar.K(24);
                long jQ = ediVar.q();
                UUID uuid = fhb.b;
                if (jQ == uuid.getMostSignificantBits()) {
                    if (ediVar.q() == uuid.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eaf("Error parsing MS/ACM codec private", null, true, 1);
        }
    }

    public final void c() {
        this.Z.getClass();
    }

    public final byte[] e(String str) throws eaf {
        byte[] bArr = this.l;
        if (bArr != null) {
            return bArr;
        }
        throw new eaf("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null, true, 1);
    }
}
