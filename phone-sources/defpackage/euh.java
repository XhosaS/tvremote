package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euh implements Parcelable {
    public static final Parcelable.Creator<euh> CREATOR = new dyy(3);
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;
    public final euf h;
    public final eug i;

    public euh(Parcel parcel) {
        String string = parcel.readString();
        String str = edt.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((eas) parcel.readParcelable(eas.class.getClassLoader()));
        }
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
        this.h = (euf) parcel.readParcelable(euf.class.getClassLoader());
        this.i = (eug) parcel.readParcelable(eug.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof euh)) {
            return false;
        }
        euh euhVar = (euh) obj;
        return this.a.equals(euhVar.a) && this.b.equals(euhVar.b) && Objects.equals(this.c, euhVar.c) && this.d.equals(euhVar.d) && Arrays.equals(this.e, euhVar.e) && Objects.equals(this.f, euhVar.f) && Arrays.equals(this.g, euhVar.g) && Objects.equals(this.h, euhVar.h) && Objects.equals(this.i, euhVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 961) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = (((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e);
        String str2 = this.f;
        int iHashCode3 = ((((iHashCode2 * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.g)) * 31;
        euf eufVar = this.h;
        int iHashCode4 = (iHashCode3 + (eufVar != null ? eufVar.hashCode() : 0)) * 31;
        eug eugVar = this.i;
        return iHashCode4 + (eugVar != null ? eugVar.hashCode() : 0);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
    }

    public euh(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, euf eufVar, eug eugVar) {
        int iQ = edt.q(uri, str2);
        if (iQ != 0 && iQ != 2 && iQ != 1) {
            this.h = eufVar;
            this.i = null;
        } else {
            eci.a(str3 == null, a.cf(iQ, "customCacheKey must be null for type: "));
            this.h = null;
            this.i = eugVar;
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f = str3;
        this.g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : edt.b;
    }
}
