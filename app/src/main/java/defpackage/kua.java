package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.ConsentParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kua implements Parcelable.Creator {
    public static void a(ConsentParcel consentParcel, Parcel parcel) {
        int iA = kkx.a(parcel, 20293);
        kkx.i(parcel, 1, consentParcel.a);
        kkx.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Bundle bundleF = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                bundleF = kkw.f(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ConsentParcel(bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentParcel[i];
    }
}
