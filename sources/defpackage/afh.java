package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afh extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(0);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final Context g;

    public afh(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        ajy ajwVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            ajwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ajwVar = iInterfaceQueryLocalInterface instanceof ajy ? (ajy) iInterfaceQueryLocalInterface : new ajw(iBinder);
        }
        this.g = (Context) ajx.b(ajwVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iH = qq.h(parcel);
        qq.u(parcel, 1, str);
        qq.k(parcel, 2, this.b);
        qq.k(parcel, 3, this.c);
        qq.r(parcel, 4, new ajx(this.g));
        qq.k(parcel, 5, this.d);
        qq.k(parcel, 6, this.e);
        qq.k(parcel, 8, this.f);
        qq.j(parcel, iH);
    }
}
