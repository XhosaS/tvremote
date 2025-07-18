package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akt extends ajh {
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    public final byte[][] k;
    public static final byte[][] a = new byte[0][];
    public static final Parcelable.Creator CREATOR = new afi(18);

    public akt(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
        this.k = bArr7;
    }

    public static byte[][] a(List list, aks aksVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            akt aktVar = (akt) it.next();
            if (aktVar != null && (bArrA2 = aksVar.a(aktVar)) != null) {
                length += bArrA2.length;
            }
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            akt aktVar2 = (akt) it2.next();
            if (aktVar2 != null && (bArrA = aksVar.a(aktVar2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new aky(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.i;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetF = bjz.f(length);
        for (int i : iArr) {
            hashSetF.add(Integer.valueOf(i));
        }
        return hashSetF;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetF = bjz.f(length);
        for (byte[] bArr2 : bArr) {
            qp.p(bArr2);
            hashSetF.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetF;
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            qp.p(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akt) {
            akt aktVar = (akt) obj;
            if (ii.X(this.b, aktVar.b) && ii.X(c(), aktVar.c()) && ii.X(e(this.d), e(aktVar.d)) && ii.X(e(this.e), e(aktVar.e)) && ii.X(e(this.f), e(aktVar.f)) && ii.X(e(this.g), e(aktVar.g)) && ii.X(d(this.h), d(aktVar.h)) && ii.X(b(this.j), b(aktVar.j)) && ii.X(e(this.k), e(aktVar.k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.b;
        sb.append(str == null ? "null" : b.c(str, "'", "'"));
        byte[] bArr = this.c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.d);
        sb.append(", ");
        f(sb, "PSEUDO=", this.e);
        sb.append(", ");
        f(sb, "ALWAYS=", this.f);
        sb.append(", ");
        f(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        f(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(", ");
        f(sb, "external=", this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.u(parcel, 2, this.b);
        qq.p(parcel, 3, this.c);
        qq.q(parcel, 4, this.d);
        qq.q(parcel, 5, this.e);
        qq.q(parcel, 6, this.f);
        qq.q(parcel, 7, this.g);
        qq.s(parcel, 8, this.h);
        qq.q(parcel, 9, this.i);
        qq.s(parcel, 10, this.j);
        qq.q(parcel, 11, this.k);
        qq.j(parcel, iH);
    }
}
