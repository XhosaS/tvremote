package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class als extends ajh implements agi {
    public static final Parcelable.Creator CREATOR = new akz(3);
    public final List a;
    public final String b;

    public als(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iH = qq.h(parcel);
        qq.w(parcel, 1, list);
        qq.u(parcel, 2, this.b);
        qq.j(parcel, iH);
    }
}
