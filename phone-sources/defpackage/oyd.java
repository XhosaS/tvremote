package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyd implements Parcelable {
    public final String b;
    public final uwi c;
    public final long d;
    public final ImmutableMap e;
    public final vko f;
    public final String g;
    public static final tvn a = tvn.n("GnpSdk");
    public static final Parcelable.Creator<oyd> CREATOR = new omd(16);

    public oyd() {
        throw null;
    }

    public static oyc a() {
        oyc oycVar = new oyc();
        oycVar.b(ImmutableMap.of());
        return oycVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        vko vkoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oyd) {
            oyd oydVar = (oyd) obj;
            String str = this.b;
            if (str != null ? str.equals(oydVar.b) : oydVar.b == null) {
                if (this.c.equals(oydVar.c) && this.d == oydVar.d && this.e.equals(oydVar.e) && ((vkoVar = this.f) != null ? vkoVar.equals(oydVar.f) : oydVar.f == null)) {
                    String str2 = this.g;
                    String str3 = oydVar.g;
                    if (str2 != null ? str2.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        uwi uwiVar = this.c;
        if (uwiVar.A()) {
            iJ = uwiVar.j();
        } else {
            int iJ3 = uwiVar.M;
            if (iJ3 == 0) {
                iJ3 = uwiVar.j();
                uwiVar.M = iJ3;
            }
            iJ = iJ3;
        }
        long j = this.d;
        int iHashCode2 = ((((((iHashCode ^ 1000003) * 1000003) ^ iJ) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
        vko vkoVar = this.f;
        if (vkoVar == null) {
            iJ2 = 0;
        } else if (vkoVar.A()) {
            iJ2 = vkoVar.j();
        } else {
            int iJ4 = vkoVar.M;
            if (iJ4 == 0) {
                iJ4 = vkoVar.j();
                vkoVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        int i = ((iHashCode2 * 1000003) ^ iJ2) * 1000003;
        String str2 = this.g;
        return i ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        vko vkoVar = this.f;
        ImmutableMap immutableMap = this.e;
        return "PromoContext{accountName=" + this.b + ", promotion=" + String.valueOf(this.c) + ", triggeringEventTimeMs=" + this.d + ", actionTypeIntentMap=" + String.valueOf(immutableMap) + ", versionedIdentifier=" + String.valueOf(vkoVar) + ", representativeTargetId=" + this.g + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        vxr.k(parcel, this.c);
        parcel.writeLong(this.d);
        ImmutableMap immutableMap = this.e;
        parcel.writeInt(immutableMap.size());
        Iterator it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            parcel.writeInt(((uxv) entry.getKey()).f);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeString(this.g);
        vko vkoVar = this.f;
        parcel.writeInt(vkoVar != null ? 1 : 0);
        if (vkoVar != null) {
            vxr.k(parcel, vkoVar);
        }
    }

    public oyd(String str, uwi uwiVar, long j, ImmutableMap immutableMap, vko vkoVar, String str2) {
        this.b = str;
        this.c = uwiVar;
        this.d = j;
        this.e = immutableMap;
        this.f = vkoVar;
        this.g = str2;
    }
}
