package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujt extends ocg {
    public static final Parcelable.Creator<ujt> CREATOR = new sct(9);
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    public ujt(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.a);
        sb.append("' } { uploadable: '");
        sb.append(this.b);
        sb.append("' } ");
        String str = this.c;
        if (str != null) {
            sb.append("{ completionToken: '");
            sb.append(str);
            sb.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb.append("{ accountName: '");
            sb.append(str2);
            sb.append("' } ");
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            sb.append("{ ssbContext: [ ");
            for (byte b : bArr) {
                sb.append("0x");
                sb.append(Integer.toHexString(b));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        sb.append(this.f);
        sb.append("' } }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.y(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.O(parcel, 4, this.d);
        ocv.F(parcel, 5, this.e);
        ocv.y(parcel, 6, this.f);
        ocv.x(parcel, iV);
    }
}
