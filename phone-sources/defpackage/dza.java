package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dza implements Comparator<dyz>, Parcelable {
    public static final Parcelable.Creator<dza> CREATOR = new dyy(1);
    public final dyz[] a;
    public final String b;
    public final int c;
    private int d;

    public dza(Parcel parcel) {
        this.b = parcel.readString();
        dyz[] dyzVarArr = (dyz[]) parcel.createTypedArray(dyz.CREATOR);
        String str = edt.a;
        this.a = dyzVarArr;
        this.c = dyzVarArr.length;
    }

    public final dyz a(int i) {
        return this.a[i];
    }

    public final dza b(String str) {
        return Objects.equals(this.b, str) ? this : new dza(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dyz dyzVar, dyz dyzVar2) {
        dyz dyzVar3 = dyzVar2;
        UUID uuid = dys.a;
        UUID uuid2 = dyzVar.a;
        return uuid.equals(uuid2) ? !uuid.equals(dyzVar3.a) ? 1 : 0 : uuid2.compareTo(dyzVar3.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dza dzaVar = (dza) obj;
            if (Objects.equals(this.b, dzaVar.b) && Arrays.equals(this.a, dzaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        String str = this.b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedArray(this.a, 0);
    }

    public dza(String str, List list) {
        this(str, false, (dyz[]) list.toArray(new dyz[0]));
    }

    public dza(String str, boolean z, dyz... dyzVarArr) {
        this.b = str;
        dyzVarArr = z ? (dyz[]) dyzVarArr.clone() : dyzVarArr;
        this.a = dyzVarArr;
        this.c = dyzVarArr.length;
        Arrays.sort(dyzVarArr, this);
    }

    public dza(String str, dyz... dyzVarArr) {
        this(str, true, dyzVarArr);
    }

    public dza(dyz... dyzVarArr) {
        this((String) null, dyzVarArr);
    }
}
