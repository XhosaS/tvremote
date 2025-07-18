package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shh implements Parcelable {
    public static final Parcelable.Creator<shh> CREATOR = new ous(20);
    public final sgn a;

    public shh() {
        this.a = new sgn();
    }

    public final void a(sgm sgmVar) {
        this.a.a(sgmVar);
    }

    public final void b(sgn sgnVar) {
        Iterator it = sgnVar.a.iterator();
        while (it.hasNext()) {
            this.a.a((sgm) it.next());
        }
    }

    public final void c(shh shhVar) {
        b(shhVar.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof shh)) {
            return false;
        }
        return this.a.equals(((shh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }

    public shh(Parcel parcel) {
        this.a = (sgn) parcel.readSerializable();
    }
}
