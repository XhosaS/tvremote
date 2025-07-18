package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhq extends ocg {
    public static final Parcelable.Creator<nhq> CREATOR = new mur(19);
    public final nhs a;
    public final nhr b;

    public nhq(nhs nhsVar, nhr nhrVar) {
        this.a = nhsVar;
        this.b = nhrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nhs nhsVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, nhsVar, i);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }
}
