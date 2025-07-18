package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onl extends ocg {
    public static final Parcelable.Creator<onl> CREATOR = new omd(8);
    final int a;
    public final nve b;
    public final obz c;

    public onl(int i, nve nveVar, obz obzVar) {
        this.a = i;
        this.b = nveVar;
        this.c = obzVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.N(parcel, 3, this.c, i);
        ocv.x(parcel, iV);
    }
}
