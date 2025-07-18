package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohy extends ocg {
    public static final Parcelable.Creator<ohy> CREATOR = new odt(11);
    public String a;
    public int b;
    public ohn c;
    public final int d;
    public ohm e;
    public oho f;

    private ohy() {
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ohy) {
            ohy ohyVar = (ohy) obj;
            if (a.Q(this.a, ohyVar.a) && a.Q(Integer.valueOf(this.b), Integer.valueOf(ohyVar.b)) && a.Q(this.c, ohyVar.c) && a.Q(Integer.valueOf(this.d), Integer.valueOf(ohyVar.d)) && a.Q(this.e, ohyVar.e) && a.Q(this.f, ohyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.B(parcel, 4, this.d);
        ocv.N(parcel, 5, this.e, i);
        ocv.N(parcel, 6, this.f, i);
        ocv.x(parcel, iV);
    }

    public ohy(String str, int i, ohn ohnVar, int i2, ohm ohmVar, oho ohoVar) {
        this.a = str;
        this.b = i;
        this.c = ohnVar;
        this.d = i2;
        this.e = ohmVar;
        this.f = ohoVar;
    }
}
