package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.support.v7.appcompat.R;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class njr extends ifk implements IInterface {
    public njr() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                a(status);
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                b(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
