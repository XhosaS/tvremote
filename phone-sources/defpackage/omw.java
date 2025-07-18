package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omw extends ocg {
    public static final Parcelable.Creator<omw> CREATOR = new omd(4);
    private final String a;
    private final String b;

    public omw(Parcel parcel) {
        this.a = parcel.readString();
        String string = parcel.readString();
        ocv.aF(string);
        this.b = string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof omw)) {
            return false;
        }
        omw omwVar = (omw) obj;
        return a.Q(this.a, omwVar.a) && a.Q(this.b, omwVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
