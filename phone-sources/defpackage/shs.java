package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shs implements Parcelable {
    public static final Parcelable.Creator<shs> CREATOR = new sct(2);
    private final boolean A;
    private final String B;
    private final List C;
    private final boolean D;
    private final boolean E;
    private final boolean F;
    private final String G;
    private final boolean H;
    private final boolean I;
    private final boolean J;
    private final boolean K;
    private final boolean L;
    private final boolean M;
    private final boolean N;
    private final boolean O;
    private final boolean P;
    private final boolean Q;
    private final boolean R;
    private final boolean S;
    private final boolean T;
    private final boolean U;
    private final String V;
    private final String W;
    private final int X;
    private final boolean Y;
    private final List Z;
    public final String a;
    public final shh b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    private final String g;
    private final String h;
    private final Boolean i;
    private final String j;
    private final String k;
    private final int l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    public shs(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.e = sik.a(parcel.readInt());
        this.f = sil.a(parcel.readInt());
        this.b = (shh) parcel.readParcelable(shh.class.getClassLoader());
        if (parcel.readInt() != 0) {
            this.h = parcel.readString();
        } else {
            this.h = null;
        }
        this.i = Boolean.valueOf(parcel.readInt() != 0);
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt() != 0;
        this.r = parcel.readInt() != 0;
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt() != 0;
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.C = arrayList;
        parcel.readList(arrayList, sii.class.getClassLoader());
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readInt() != 0;
        this.G = parcel.readString();
        this.H = parcel.readInt() != 0;
        this.I = parcel.readInt() != 0;
        this.J = parcel.readInt() != 0;
        this.K = parcel.readInt() != 0;
        this.L = parcel.readInt() != 0;
        this.M = parcel.readInt() != 0;
        this.N = parcel.readInt() != 0;
        this.O = parcel.readInt() != 0;
        this.P = parcel.readInt() != 0;
        this.Q = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.R = parcel.readInt() != 0;
        this.S = parcel.readInt() != 0;
        this.T = parcel.readInt() != 0;
        this.U = parcel.readInt() != 0;
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = parcel.readInt();
        this.c = parcel.readString();
        ArrayList arrayList2 = new ArrayList();
        this.Z = arrayList2;
        parcel.readList(arrayList2, sig.class.getClassLoader());
        this.Y = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        int i2 = this.e;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        int i3 = this.f;
        if (i3 == 0) {
            throw null;
        }
        parcel.writeInt(i3 - 1);
        parcel.writeParcelable(this.b, 0);
        String str = this.h;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        parcel.writeInt(!zIsEmpty ? 1 : 0);
        if (!zIsEmpty) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.i.booleanValue() ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B);
        parcel.writeList(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeString(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeInt(this.N ? 1 : 0);
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.S ? 1 : 0);
        parcel.writeInt(this.T ? 1 : 0);
        parcel.writeInt(this.U ? 1 : 0);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeInt(this.X);
        parcel.writeString(this.c);
        parcel.writeList(this.Z);
        parcel.writeInt(this.Y ? 1 : 0);
    }

    public shs(shr shrVar) {
        this.a = shrVar.a;
        this.g = null;
        this.e = shrVar.g;
        this.f = shrVar.h;
        shh shhVar = shrVar.b;
        if (shhVar == null) {
            this.b = new shh();
        } else {
            this.b = shhVar;
        }
        this.h = null;
        this.i = true;
        this.j = null;
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = shrVar.d;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = true;
        this.B = null;
        this.C = shrVar.e;
        this.D = true;
        this.E = false;
        this.G = null;
        this.H = false;
        this.I = false;
        this.F = false;
        this.J = false;
        this.L = false;
        this.K = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.d = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = true;
        this.V = null;
        this.W = null;
        this.X = 0;
        String str = shrVar.c;
        this.c = str == null ? "" : str;
        this.Z = shrVar.f;
        this.Y = false;
    }
}
