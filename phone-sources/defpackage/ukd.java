package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukd extends ocg {
    public static final Parcelable.Creator<ukd> CREATOR = new sct(10);
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final uju e;
    public final String f;
    public final String g;

    public ukd(int i, Thing[] thingArr, String[] strArr, String[] strArr2, uju ujuVar, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = ujuVar;
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.R(parcel, 2, this.b, i);
        ocv.P(parcel, 3, this.c);
        ocv.P(parcel, 5, this.d);
        ocv.N(parcel, 6, this.e, i);
        ocv.O(parcel, 7, this.f);
        ocv.O(parcel, 8, this.g);
        ocv.x(parcel, iV);
    }
}
