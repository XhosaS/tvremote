package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npc extends ocg {
    public static final Parcelable.Creator<npc> CREATOR = new nld(15);
    public final int a;
    public final int b;
    public final int c;

    public npc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, i2);
        ocv.B(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
