package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.katniss.data.PermissionsText;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        while (parcel.dataAvail() > 0) {
            arrayList.add(new lxr(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString()));
        }
        return new PermissionsText(i, string, string2, string3, string4, string5, string6, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PermissionsText[i];
    }
}
