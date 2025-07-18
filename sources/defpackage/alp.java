package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alp extends ajh implements agi {
    public static final Parcelable.Creator CREATOR = new akz(2);
    final int a;
    public int b;
    public Intent c;

    public alp(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.a);
        qq.m(parcel, 2, this.b);
        qq.t(parcel, 3, this.c, i);
        qq.j(parcel, iH);
    }

    public alp() {
        this(2, 0, null);
    }
}
