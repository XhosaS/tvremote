package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nsb extends ifk implements nsc {
    public nsb() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                ifl.b(parcel);
                i(i2);
                return true;
            case 2:
                njz njzVar = (njz) ifl.a(parcel, njz.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean zF = ifl.f(parcel);
                ifl.b(parcel);
                a(njzVar, string, string2, zF);
                return true;
            case 3:
                int i3 = parcel.readInt();
                ifl.b(parcel);
                b(i3);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                ifl.f(parcel);
                ifl.b(parcel);
                o();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ifl.b(parcel);
                l(string3, string4);
                return true;
            case 6:
                parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ifl.b(parcel);
                p(bArrCreateByteArray);
                return true;
            case 7:
                int i4 = parcel.readInt();
                ifl.b(parcel);
                d(i4);
                return true;
            case 8:
                int i5 = parcel.readInt();
                ifl.b(parcel);
                f(i5);
                return true;
            case 9:
                int i6 = parcel.readInt();
                ifl.b(parcel);
                c(i6);
                return true;
            case 10:
                parcel.readString();
                long j = parcel.readLong();
                int i7 = parcel.readInt();
                ifl.b(parcel);
                n(j, i7);
                return true;
            case 11:
                parcel.readString();
                long j2 = parcel.readLong();
                ifl.b(parcel);
                m(j2);
                return true;
            case 12:
                nrh nrhVar = (nrh) ifl.a(parcel, nrh.CREATOR);
                ifl.b(parcel);
                e(nrhVar);
                return true;
            case 13:
                nrw nrwVar = (nrw) ifl.a(parcel, nrw.CREATOR);
                ifl.b(parcel);
                h(nrwVar);
                return true;
            case 14:
                int i8 = parcel.readInt();
                ifl.b(parcel);
                g(i8);
                return true;
            case 15:
                int i9 = parcel.readInt();
                ifl.b(parcel);
                j(i9);
                return true;
            default:
                return false;
        }
    }
}
