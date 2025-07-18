package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oif extends ocg {
    public static final Parcelable.Creator<oif> CREATOR = new odt(15);
    public byte[] a;
    public ParcelFileDescriptor b;
    public long c;
    public Uri d;

    public oif() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oif) {
            oif oifVar = (oif) obj;
            if (Arrays.equals(this.a, oifVar.a) && a.Q(this.b, oifVar.b) && a.Q(Long.valueOf(this.c), Long.valueOf(oifVar.c)) && a.Q(this.d, oifVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Long.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.F(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.C(parcel, 3, this.c);
        ocv.N(parcel, 4, this.d, i);
        ocv.x(parcel, iV);
    }

    public oif(byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
        this.a = bArr;
        this.b = parcelFileDescriptor;
        this.c = j;
        this.d = uri;
    }
}
