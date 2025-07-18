package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvv extends ocg {
    public static final Parcelable.Creator<nvv> CREATOR = new nub(9);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final Context g;

    public nvv(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        odd odbVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            odbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            odbVar = iInterfaceQueryLocalInterface instanceof odd ? (odd) iInterfaceQueryLocalInterface : new odb(iBinder);
        }
        this.g = (Context) odc.a(odbVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.y(parcel, 2, this.b);
        ocv.y(parcel, 3, this.c);
        ocv.H(parcel, 4, new odc(this.g));
        ocv.y(parcel, 5, this.d);
        ocv.y(parcel, 6, this.e);
        ocv.y(parcel, 8, this.f);
        ocv.x(parcel, iV);
    }
}
