package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oni extends ocg implements nxc {
    public static final Parcelable.Creator<oni> CREATOR = new omd(6);
    public final List a;
    public final String b;

    public oni(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iV = ocv.v(parcel);
        ocv.Q(parcel, 1, list);
        ocv.O(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
