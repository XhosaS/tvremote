package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nms extends ifk implements nmt {
    public nms() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            odd oddVarA = a();
            parcel2.writeNoException();
            ifl.e(parcel2, oddVarA);
        } else if (i == 2) {
            c();
            parcel2.writeNoException();
        } else if (i == 3) {
            b();
            parcel2.writeNoException();
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(252505000);
        }
        return true;
    }
}
