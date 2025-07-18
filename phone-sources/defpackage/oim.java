package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oim extends ocg {
    public static final Parcelable.Creator<oim> CREATOR = new odt(20);
    public final int a;

    @Deprecated
    public final ClientAppContext b;
    public final int c;

    public oim(int i, ClientAppContext clientAppContext, int i2) {
        this.a = i;
        this.b = clientAppContext;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.B(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
