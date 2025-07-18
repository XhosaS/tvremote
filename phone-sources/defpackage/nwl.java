package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwl extends ocg {
    public static final Parcelable.Creator<nwl> CREATOR = nub.a;
    public static final nwl a = ocv.aN(null, false);
    public final nwn b;
    public boolean c;

    static {
        ocv.aN(null, true);
    }

    public nwl(nwn nwnVar) {
        this.b = nwnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nwl)) {
            return false;
        }
        nwl nwlVar = (nwl) obj;
        return a.Q(this.b, nwlVar.b) && this.c == nwlVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
        } else {
            parcel.writeInt(-204102970);
            int iV = ocv.v(parcel);
            ocv.N(parcel, 1, this.b, i);
            ocv.x(parcel, iV);
        }
    }
}
