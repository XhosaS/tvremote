package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eba {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public final int c;
    public final String d;
    public final int e;
    private final dze[] f;
    private int g;

    public eba(String str, dze... dzeVarArr) {
        int length = dzeVarArr.length;
        int i = 1;
        a.H(length > 0);
        this.d = str;
        this.f = dzeVarArr;
        this.c = length;
        int iB = eae.b(dzeVarArr[0].Y);
        this.e = iB == -1 ? eae.b(dzeVarArr[0].X) : iB;
        String strF = f(dzeVarArr[0].N);
        int iE = e(dzeVarArr[0].P);
        while (true) {
            dze[] dzeVarArr2 = this.f;
            if (i >= dzeVarArr2.length) {
                return;
            }
            if (!strF.equals(f(dzeVarArr2[i].N))) {
                dze[] dzeVarArr3 = this.f;
                g("languages", dzeVarArr3[0].N, dzeVarArr3[i].N, i);
                return;
            } else {
                dze[] dzeVarArr4 = this.f;
                if (iE != e(dzeVarArr4[i].P)) {
                    g("role flags", Integer.toBinaryString(dzeVarArr4[0].P), Integer.toBinaryString(this.f[i].P), i);
                    return;
                }
                i++;
            }
        }
    }

    private static int e(int i) {
        return i | 16384;
    }

    private static String f(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void g(String str, String str2, String str3, int i) {
        edb.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final int a(dze dzeVar) {
        int i = 0;
        while (true) {
            dze[] dzeVarArr = this.f;
            if (i >= dzeVarArr.length) {
                return -1;
            }
            if (dzeVar == dzeVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        dze[] dzeVarArr = this.f;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(dzeVarArr.length);
        for (dze dzeVar : dzeVarArr) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(dze.b, dzeVar.K);
            bundle2.putString(dze.c, dzeVar.L);
            bundle2.putParcelableArrayList(dze.F, ecm.b(dzeVar.M, new dzc(1)));
            bundle2.putString(dze.d, dzeVar.N);
            bundle2.putInt(dze.e, dzeVar.O);
            bundle2.putInt(dze.f, dzeVar.P);
            int i = dzeVar.Q;
            if (i != dze.a.Q) {
                bundle2.putInt(dze.G, i);
            }
            bundle2.putInt(dze.g, dzeVar.R);
            bundle2.putInt(dze.h, dzeVar.S);
            bundle2.putString(dze.i, dzeVar.U);
            bundle2.putString(dze.j, dzeVar.X);
            bundle2.putString(dze.k, dzeVar.Y);
            bundle2.putInt(dze.l, dzeVar.Z);
            int i2 = 0;
            while (true) {
                List list = dzeVar.ab;
                if (i2 >= list.size()) {
                    break;
                }
                bundle2.putByteArray(dze.e(i2), (byte[]) list.get(i2));
                i2++;
            }
            bundle2.putParcelable(dze.m, dzeVar.ac);
            bundle2.putLong(dze.n, dzeVar.ad);
            bundle2.putInt(dze.o, dzeVar.af);
            bundle2.putInt(dze.p, dzeVar.ag);
            bundle2.putInt(dze.I, dzeVar.ah);
            bundle2.putInt(dze.J, dzeVar.ai);
            bundle2.putFloat(dze.q, dzeVar.aj);
            bundle2.putInt(dze.r, dzeVar.ak);
            bundle2.putFloat(dze.s, dzeVar.al);
            bundle2.putByteArray(dze.t, dzeVar.am);
            bundle2.putInt(dze.u, dzeVar.an);
            dyt dytVar = dzeVar.ao;
            if (dytVar != null) {
                String str = dze.v;
                Bundle bundle3 = new Bundle();
                bundle3.putInt(dyt.b, dytVar.h);
                bundle3.putInt(dyt.c, dytVar.i);
                bundle3.putInt(dyt.d, dytVar.j);
                bundle3.putByteArray(dyt.e, dytVar.k);
                bundle3.putInt(dyt.f, dytVar.l);
                bundle3.putInt(dyt.g, dytVar.m);
                bundle2.putBundle(str, bundle3);
            }
            bundle2.putInt(dze.H, dzeVar.ap);
            bundle2.putInt(dze.w, dzeVar.aq);
            bundle2.putInt(dze.x, dzeVar.ar);
            bundle2.putInt(dze.y, dzeVar.as);
            bundle2.putInt(dze.z, dzeVar.at);
            bundle2.putInt(dze.A, dzeVar.au);
            bundle2.putInt(dze.B, dzeVar.av);
            bundle2.putInt(dze.D, dzeVar.ax);
            bundle2.putInt(dze.E, dzeVar.ay);
            bundle2.putInt(dze.C, dzeVar.az);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(a, arrayList);
        bundle.putString(b, this.d);
        return bundle;
    }

    public final dze c(int i) {
        return this.f[i];
    }

    public final eba d(String str) {
        return new eba(str, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eba ebaVar = (eba) obj;
            if (this.d.equals(ebaVar.d) && Arrays.equals(this.f, ebaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.d.hashCode() + 527) * 31) + Arrays.hashCode(this.f);
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.d + ": " + Arrays.toString(this.f);
    }

    public eba(dze... dzeVarArr) {
        this("", dzeVarArr);
    }
}
