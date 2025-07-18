package defpackage;

import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class icu extends eru implements icv {
    public icu() {
        super("com.google.android.apps.tvsearch.settings.mirror.SearchSettingsReader");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            O(parcel);
            boolean zF = f(string);
            parcel2.writeNoException();
            ClassLoader classLoader = erv.a;
            parcel2.writeInt(zF ? 1 : 0);
        } else if (i == 2) {
            String string2 = parcel.readString();
            O(parcel);
            int iC = c(string2);
            parcel2.writeNoException();
            parcel2.writeInt(iC);
        } else if (i == 3) {
            String string3 = parcel.readString();
            O(parcel);
            String strD = d(string3);
            parcel2.writeNoException();
            parcel2.writeString(strD);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            O(parcel);
            List<String> listE = e(string4);
            parcel2.writeNoException();
            parcel2.writeStringList(listE);
        }
        return true;
    }
}
