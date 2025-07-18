package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obz extends ocg {
    public static final Parcelable.Creator<obz> CREATOR = new obd(4);
    final int a;
    final IBinder b;
    public final nve c;
    public final boolean d;
    public final boolean e;

    public obz(int i, IBinder iBinder, nve nveVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = nveVar;
        this.d = z;
        this.e = z2;
    }

    public final obm a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof obm ? (obm) iInterfaceQueryLocalInterface : new obm(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obz)) {
            return false;
        }
        obz obzVar = (obz) obj;
        return this.c.equals(obzVar.c) && a.Q(a(), obzVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.H(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.y(parcel, 4, this.d);
        ocv.y(parcel, 5, this.e);
        ocv.x(parcel, iV);
    }
}
