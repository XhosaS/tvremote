package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npk extends ocg {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final npb G;
    public final boolean H;
    public final boolean I;
    private final int[] J;
    public final List c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;
    public static final ImmutableList a = ImmutableList.of(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    public static final int[] b = {0, 1};
    public static final Parcelable.Creator<npk> CREATOR = new npl();

    public npk(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        npb npaVar;
        this.c = new ArrayList(list);
        this.J = Arrays.copyOf(iArr, iArr.length);
        this.d = j;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        this.H = z;
        this.I = z2;
        if (iBinder == null) {
            npaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            npaVar = iInterfaceQueryLocalInterface instanceof npb ? (npb) iInterfaceQueryLocalInterface : new npa(iBinder);
        }
        this.G = npaVar;
    }

    public final int[] a() {
        int[] iArr = this.J;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.c;
        int iV = ocv.v(parcel);
        ocv.Q(parcel, 2, list);
        ocv.I(parcel, 3, a());
        ocv.C(parcel, 4, this.d);
        ocv.O(parcel, 5, this.e);
        ocv.B(parcel, 6, this.f);
        ocv.B(parcel, 7, this.g);
        ocv.B(parcel, 8, this.h);
        ocv.B(parcel, 9, this.i);
        ocv.B(parcel, 10, this.j);
        ocv.B(parcel, 11, this.k);
        ocv.B(parcel, 12, this.l);
        ocv.B(parcel, 13, this.m);
        ocv.B(parcel, 14, this.n);
        ocv.B(parcel, 15, this.o);
        ocv.B(parcel, 16, this.p);
        ocv.B(parcel, 17, this.q);
        ocv.B(parcel, 18, this.r);
        ocv.B(parcel, 19, this.s);
        ocv.B(parcel, 20, this.t);
        ocv.B(parcel, 21, this.u);
        ocv.B(parcel, 22, this.v);
        ocv.B(parcel, 23, this.w);
        ocv.B(parcel, 24, this.x);
        ocv.B(parcel, 25, this.y);
        ocv.B(parcel, 26, this.z);
        ocv.B(parcel, 27, this.A);
        ocv.B(parcel, 28, this.B);
        ocv.B(parcel, 29, this.C);
        ocv.B(parcel, 30, this.D);
        ocv.B(parcel, 31, this.E);
        ocv.B(parcel, 32, this.F);
        npb npbVar = this.G;
        ocv.H(parcel, 33, npbVar == null ? null : npbVar.asBinder());
        ocv.y(parcel, 34, this.H);
        ocv.y(parcel, 35, this.I);
        ocv.x(parcel, iV);
    }
}
