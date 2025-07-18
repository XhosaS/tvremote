package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajb extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(12);
    final int a;
    final IBinder b;
    public final aeq c;
    public final boolean d;
    public final boolean e;

    public ajb(int i, IBinder iBinder, aeq aeqVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = aeqVar;
        this.d = z;
        this.e = z2;
    }

    public final aip a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof aip ? (aip) iInterfaceQueryLocalInterface : new aip(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajb)) {
            return false;
        }
        ajb ajbVar = (ajb) obj;
        return this.c.equals(ajbVar.c) && ii.X(a(), ajbVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.a);
        qq.r(parcel, 2, this.b);
        qq.t(parcel, 3, this.c, i);
        qq.k(parcel, 4, this.d);
        qq.k(parcel, 5, this.e);
        qq.j(parcel, iH);
    }
}
