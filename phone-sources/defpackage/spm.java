package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spm implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public spm(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new spn(parcel, null);
            case 1:
                return new soa(parcel, null);
            case 2:
                return new sqa(parcel, (ClassLoader) null);
            case 3:
                return new sqn(parcel, null);
            case 4:
                return new stz(parcel, null);
            case 5:
                return new sun(parcel, null);
            case 6:
                return new swi(parcel, null);
            case 7:
                return new tbf(parcel, null);
            default:
                return new tdb(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new spn[i];
            case 1:
                return new soa[i];
            case 2:
                return new sqa[i];
            case 3:
                return new sqn[i];
            case 4:
                return new stz[i];
            case 5:
                return new sun[i];
            case 6:
                return new swi[i];
            case 7:
                return new tbf[i];
            default:
                return new tdb[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new spn(parcel, classLoader);
            case 1:
                return new soa(parcel, classLoader);
            case 2:
                return new sqa(parcel, classLoader);
            case 3:
                return new sqn(parcel, classLoader);
            case 4:
                return new stz(parcel, classLoader);
            case 5:
                return new sun(parcel, classLoader);
            case 6:
                return new swi(parcel, classLoader);
            case 7:
                return new tbf(parcel, classLoader);
            default:
                return new tdb(parcel, classLoader);
        }
    }
}
