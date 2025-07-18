package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class now extends ocg {
    public static final Parcelable.Creator<now> CREATOR;
    public final String a;
    public final String b;
    public final npk c;
    public final boolean d;
    public final boolean e;
    private final noz f;

    static {
        new nsf("CastMediaOptions");
        CREATOR = new nld(14);
    }

    public now(String str, String str2, IBinder iBinder, npk npkVar, boolean z, boolean z2) {
        noz noxVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            noxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            noxVar = iInterfaceQueryLocalInterface instanceof noz ? (noz) iInterfaceQueryLocalInterface : new nox(iBinder);
        }
        this.f = noxVar;
        this.c = npkVar;
        this.d = z;
        this.e = z2;
    }

    public final npd a() {
        noz nozVar = this.f;
        if (nozVar == null) {
            return null;
        }
        try {
            return (npd) odc.a(nozVar.a());
        } catch (RemoteException unused) {
            nsf.e();
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.O(parcel, 3, this.b);
        noz nozVar = this.f;
        ocv.H(parcel, 4, nozVar == null ? null : nozVar.asBinder());
        ocv.N(parcel, 5, this.c, i);
        ocv.y(parcel, 6, this.d);
        ocv.y(parcel, 7, this.e);
        ocv.x(parcel, iV);
    }
}
