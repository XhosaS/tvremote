package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nln extends ocg {
    public static final Parcelable.Creator<nln> CREATOR;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    long h;
    double i;
    boolean j;
    public long[] k;
    public int l;
    int m;
    String n;
    JSONObject o;
    public int p;
    final List q;
    public boolean r;
    njy s;
    nmd t;
    public nlg u;
    nlk v;
    boolean w;
    private final SparseArray x;

    static {
        new nsf("MediaStatus");
        CREATOR = new nlo();
    }

    public nln(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, njy njyVar, nmd nmdVar, nlg nlgVar, nlk nlkVar) {
        this.q = new ArrayList();
        this.x = new SparseArray();
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.j = z;
        this.k = jArr;
        this.l = i4;
        this.m = i5;
        this.n = str;
        if (str != null) {
            try {
                this.o = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i6;
        if (list != null && !list.isEmpty()) {
            g(list);
        }
        this.r = z2;
        this.s = njyVar;
        this.t = nmdVar;
        this.u = nlgVar;
        this.v = nlkVar;
        boolean z3 = false;
        if (nlkVar != null && nlkVar.j) {
            z3 = true;
        }
        this.w = z3;
    }

    public static final boolean f(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    private final void g(List list) {
        List list2 = this.q;
        list2.clear();
        SparseArray sparseArray = this.x;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            nll nllVar = (nll) list.get(i);
            list2.add(nllVar);
            sparseArray.put(nllVar.b, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7 A[EDGE_INSN: B:109:0x01a7->B:110:0x01ab BREAK  A[LOOP:0: B:102:0x0193->B:106:0x01a0]] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03f3 A[Catch: JSONException -> 0x0409, TRY_ENTER, TryCatch #3 {JSONException -> 0x0409, blocks: (B:213:0x03ad, B:236:0x03f7, B:235:0x03f3), top: B:362:0x03ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(org.json.JSONObject r31, int r32) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nln.a(org.json.JSONObject, int):int");
    }

    public final int b() {
        return this.q.size();
    }

    public final nll c(int i) {
        Integer num = (Integer) this.x.get(i);
        if (num == null) {
            return null;
        }
        return (nll) this.q.get(num.intValue());
    }

    public final Integer d(int i) {
        return (Integer) this.x.get(i);
    }

    public final boolean e(long j) {
        return (j & this.h) != 0;
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nln)) {
            return false;
        }
        nln nlnVar = (nln) obj;
        return (this.o == null) == (nlnVar.o == null) && this.b == nlnVar.b && this.c == nlnVar.c && this.d == nlnVar.d && this.e == nlnVar.e && this.f == nlnVar.f && this.g == nlnVar.g && this.i == nlnVar.i && this.j == nlnVar.j && this.l == nlnVar.l && this.m == nlnVar.m && this.p == nlnVar.p && Arrays.equals(this.k, nlnVar.k) && nrv.i(Long.valueOf(this.h), Long.valueOf(nlnVar.h)) && nrv.i(this.q, nlnVar.q) && nrv.i(this.a, nlnVar.a) && ((jSONObject = this.o) == null || (jSONObject2 = nlnVar.o) == null || oct.a(jSONObject, jSONObject2)) && this.r == nlnVar.r && nrv.i(this.s, nlnVar.s) && nrv.i(this.t, nlnVar.t) && nrv.i(this.u, nlnVar.u) && a.Q(this.v, nlnVar.v) && this.w == nlnVar.w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.a, i);
        ocv.C(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.z(parcel, 5, this.d);
        ocv.B(parcel, 6, this.e);
        ocv.B(parcel, 7, this.f);
        ocv.C(parcel, 8, this.g);
        ocv.C(parcel, 9, this.h);
        ocv.z(parcel, 10, this.i);
        ocv.y(parcel, 11, this.j);
        ocv.K(parcel, 12, this.k);
        ocv.B(parcel, 13, this.l);
        ocv.B(parcel, 14, this.m);
        ocv.O(parcel, 15, this.n);
        ocv.B(parcel, 16, this.p);
        ocv.S(parcel, 17, this.q);
        ocv.y(parcel, 18, this.r);
        ocv.N(parcel, 19, this.s, i);
        ocv.N(parcel, 20, this.t, i);
        ocv.N(parcel, 21, this.u, i);
        ocv.N(parcel, 22, this.v, i);
        ocv.x(parcel, iV);
    }

    public nln(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        a(jSONObject, 0);
    }
}
