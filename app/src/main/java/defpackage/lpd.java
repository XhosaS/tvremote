package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.ActionPreference;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.GroupContactOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        GroupContactOrder groupContactOrder = null;
        int iB = 0;
        ActionPreference actionPreference = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                groupContactOrder = (GroupContactOrder) kkw.h(parcel, i, GroupContactOrder.CREATOR);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                actionPreference = (ActionPreference) kkw.h(parcel, i, ActionPreference.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new CpgDocument(iB, groupContactOrder, actionPreference);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CpgDocument[i];
    }
}
