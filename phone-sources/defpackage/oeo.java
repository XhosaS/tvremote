package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeo extends ocg {
    public static final Parcelable.Creator<oeo> CREATOR = new obd(12);
    public GoogleHelp a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;

    public oeo(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        obd.c(this, parcel, i);
    }
}
