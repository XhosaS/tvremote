package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ict extends ert implements icv {
    public ict(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.tvsearch.settings.mirror.SearchSettingsReader");
    }

    @Override // defpackage.icv
    public final int c(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(2, parcelA);
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }

    @Override // defpackage.icv
    public final String d(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(3, parcelA);
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // defpackage.icv
    public final List e(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(4, parcelA);
        ArrayList<String> arrayListCreateStringArrayList = parcelB.createStringArrayList();
        parcelB.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // defpackage.icv
    public final boolean f(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(1, parcelA);
        boolean zD = erv.d(parcelB);
        parcelB.recycle();
        return zD;
    }
}
