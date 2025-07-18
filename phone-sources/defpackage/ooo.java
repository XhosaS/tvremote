package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooo extends ocg {
    public static final Parcelable.Creator<ooo> CREATOR = new omd(12);
    public final boolean a;
    public final boolean b;
    public final int c;

    public ooo(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.y(parcel, 2, this.a);
        ocv.y(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
