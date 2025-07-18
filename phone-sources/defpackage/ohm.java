package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohm extends ocg {
    public static final Parcelable.Creator<ohm> CREATOR = new odt(6);
    public final String a;
    final byte[] b;
    public final int c;
    private final byte[] d;
    private final byte[] e;

    public ohm(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.a = str;
        this.d = bArr;
        this.e = bArr2;
        this.b = bArr3;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ohm) {
            ohm ohmVar = (ohm) obj;
            if (a.Q(this.a, ohmVar.a) && Arrays.equals(this.d, ohmVar.d) && Arrays.equals(this.e, ohmVar.e) && Arrays.equals(this.b, ohmVar.b) && this.c == ohmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        byte[] bArr = this.d;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.b;
        String string2 = bArr2 != null ? Arrays.toString(bArr2) : null;
        int i = this.c;
        return String.format("ConnectionsDevice:<endpointId: %s, endpointInfo: %s, connectivityBytes: %s, instanceType : %s>", str, string, string2, i != 0 ? i != 1 ? i != 2 ? "OTHER" : "Secondary" : "Main" : "UNKNOWN");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        byte[] bArr = this.d;
        ocv.F(parcel, 2, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.e;
        ocv.F(parcel, 3, bArr2 != null ? (byte[]) bArr2.clone() : null);
        ocv.F(parcel, 4, this.b);
        ocv.B(parcel, 5, this.c);
        ocv.x(parcel, iV);
    }
}
