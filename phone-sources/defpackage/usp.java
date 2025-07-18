package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usp implements Parcelable {
    public static final Parcelable.Creator<usp> CREATOR = new sct(16);
    public final List a;
    public final String b;

    public usp(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.a = arrayList;
        this.b = parcel.readString();
    }

    public final String a() {
        String str = this.b;
        return str.length() > 31 ? str.substring(0, 31) : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeString(this.b);
    }

    public usp(uqs uqsVar) {
        this.a = uqsVar.d();
        String str = uqsVar.a().a;
        int iLastIndexOf = str.lastIndexOf(46);
        boolean z = false;
        if (iLastIndexOf != -1 && iLastIndexOf < str.length() - 1) {
            z = true;
        }
        sij.z(z, "Expected service name %s to have the form path.to.ServiceName", str);
        this.b = str.substring(iLastIndexOf + 1);
    }
}
