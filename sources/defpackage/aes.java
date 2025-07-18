package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aes extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(1);
    public final String a;

    @Deprecated
    public final int b;
    private final long c;

    public aes(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aes) {
            aes aesVar = (aes) obj;
            String str = this.a;
            if (((str != null && str.equals(aesVar.a)) || (str == null && aesVar.a == null)) && a() == aesVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qp.s("name", this.a, arrayList);
        qp.s("version", Long.valueOf(a()), arrayList);
        return qp.r(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iH = qq.h(parcel);
        qq.u(parcel, 1, str);
        qq.m(parcel, 2, this.b);
        qq.n(parcel, 3, a());
        qq.j(parcel, iH);
    }

    public aes(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
