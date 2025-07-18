package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oed extends ocg {
    public static final oee CREATOR = new oee(0);
    public final oef a;
    public final byte[] b;

    public oed(oef oefVar, byte[] bArr) {
        oefVar.getClass();
        this.a = oefVar;
        bArr.getClass();
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oed oedVar = (oed) obj;
            if (this.a.equals(oedVar.a) && Arrays.equals(this.b, oedVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String string = this.a.toString();
        String string2 = Arrays.toString(bArr);
        if (string2.length() > 20) {
            string2 = String.valueOf(string2.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + string + ", dumpOutput=\"" + String.format(string2, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.a, i);
        ocv.F(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
