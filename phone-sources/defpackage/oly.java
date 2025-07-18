package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.common.collect.Sets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oly extends ocg {
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
    public static final Parcelable.Creator<oly> CREATOR = new oeg(19);

    public oly(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
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

    public static void a(byte[][] bArr, DataOutputStream dataOutputStream) throws IOException {
        if (bArr == null) {
            dataOutputStream.writeInt(0);
            return;
        }
        dataOutputStream.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            b(bArr2, dataOutputStream);
        }
    }

    public static void b(byte[] bArr, DataOutputStream dataOutputStream) throws IOException {
        if (bArr == null) {
            dataOutputStream.writeInt(0);
            return;
        }
        int length = bArr.length;
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bArr, 0, length);
    }

    public static void c(int[] iArr, DataOutputStream dataOutputStream) throws IOException {
        if (iArr == null) {
            dataOutputStream.writeInt(0);
            return;
        }
        dataOutputStream.writeInt(iArr.length);
        for (int i : iArr) {
            dataOutputStream.writeInt(i);
        }
    }

    public static byte[] d(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i == 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    public static int[] e(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i == 0) {
            return null;
        }
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = dataInputStream.readInt();
        }
        return iArr;
    }

    public static byte[][] f(List list, olx olxVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            oly olyVar = (oly) it.next();
            if (olyVar != null && (bArrA2 = olxVar.a(olyVar)) != null) {
                length += bArrA2.length;
            }
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            oly olyVar2 = (oly) it2.next();
            if (olyVar2 != null && (bArrA = olxVar.a(olyVar2)) != null) {
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

    public static byte[][] g(DataInputStream dataInputStream, int i) {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = d(dataInputStream);
        }
        return bArr;
    }

    public static byte[][] h(DataInputStream dataInputStream) {
        return g(dataInputStream, dataInputStream.readInt());
    }

    private static List i(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new ome(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set j() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.i;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return l((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set k(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(length);
        for (int i : iArr) {
            hashSetNewHashSetWithExpectedSize.add(Integer.valueOf(i));
        }
        return hashSetNewHashSetWithExpectedSize;
    }

    private static Set l(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(length);
        for (byte[] bArr2 : bArr) {
            ocv.aF(bArr2);
            hashSetNewHashSetWithExpectedSize.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetNewHashSetWithExpectedSize;
    }

    private static void m(StringBuilder sb, String str, byte[][] bArr) {
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
            ocv.aF(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oly) {
            oly olyVar = (oly) obj;
            if (a.Q(this.b, olyVar.b) && a.Q(j(), olyVar.j()) && a.Q(l(this.d), l(olyVar.d)) && a.Q(l(this.e), l(olyVar.e)) && a.Q(l(this.f), l(olyVar.f)) && a.Q(l(this.g), l(olyVar.g)) && a.Q(k(this.h), k(olyVar.h)) && a.Q(i(this.j), i(olyVar.j)) && a.Q(l(this.k), l(olyVar.k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.b;
        sb.append(str == null ? "null" : a.cg(str, "'", "'"));
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
        m(sb, "GAIA=", this.d);
        sb.append(", ");
        m(sb, "PSEUDO=", this.e);
        sb.append(", ");
        m(sb, "ALWAYS=", this.f);
        sb.append(", ");
        m(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        m(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(i(this.j).toArray()));
        sb.append(", ");
        m(sb, "external=", this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.b);
        ocv.F(parcel, 3, this.c);
        ocv.G(parcel, 4, this.d);
        ocv.G(parcel, 5, this.e);
        ocv.G(parcel, 6, this.f);
        ocv.G(parcel, 7, this.g);
        ocv.I(parcel, 8, this.h);
        ocv.G(parcel, 9, this.i);
        ocv.I(parcel, 10, this.j);
        ocv.G(parcel, 11, this.k);
        ocv.x(parcel, iV);
    }
}
