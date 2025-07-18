package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lvr;
import defpackage.lvs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    /* compiled from: PG */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new lvr();
        public final String a;
        public final byte[] b;
        public final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return kki.a(this.a, accountConsentInformation.a) && kki.a(this.b, accountConsentInformation.b) && kki.a(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int iA = kkx.a(parcel, 20293);
            kkx.r(parcel, 1, str);
            kkx.j(parcel, 2, this.b);
            kkx.n(parcel, 3, new ArrayList(this.c));
            kkx.b(parcel, iA);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new lvs();
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return kki.a(this.c, consentInformation.c) && kki.a(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.v(parcel, 1, new ArrayList(this.c));
        kkx.c(parcel, 2, this.a);
        kkx.c(parcel, 3, this.b);
        kkx.b(parcel, iA);
    }
}
