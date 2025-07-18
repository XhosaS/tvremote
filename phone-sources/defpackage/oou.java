package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oou extends ocg {
    public static final Parcelable.Creator<oou> CREATOR = new omd(13);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public oou(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.y(parcel, 3, this.b);
        ocv.Q(parcel, 4, this.c);
        ocv.B(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.y(parcel, 7, this.f);
        ocv.x(parcel, iV);
    }
}
