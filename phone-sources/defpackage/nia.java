package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nia extends ocg {
    public static final Parcelable.Creator<nia> CREATOR = new nhv(5);
    public final String a;
    public final String b;
    public final String c;

    public nia(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nia)) {
            return false;
        }
        nia niaVar = (nia) obj;
        return a.Q(this.a, niaVar.a) && a.Q(this.c, niaVar.c) && a.Q(this.b, niaVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    public final String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.O(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
