package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oet extends ifk implements IInterface {
    public oet() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public void a(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                GoogleHelp googleHelp = (GoogleHelp) ifl.a(parcel, GoogleHelp.CREATOR);
                ifl.b(parcel);
                a(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                throw new UnsupportedOperationException();
            case 8:
                throw new UnsupportedOperationException();
            case 9:
                parcel.readInt();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case 12:
                throw new UnsupportedOperationException();
            case 13:
                parcel.createByteArray();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 14:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
