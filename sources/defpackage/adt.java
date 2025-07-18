package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adt extends ajh {
    public static final Parcelable.Creator CREATOR = new e(14);
    private static final String[] m = new String[0];
    public final aeo a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final akt[] g;
    public final boolean h;
    public aen i;
    public final int j;
    public final aef k;
    public final cor l;
    private final String[] n;

    public adt(aeo aeoVar, cor corVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, akt[] aktVarArr, String[] strArr2, int i) {
        this.a = aeoVar;
        this.l = corVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = aktVarArr;
        this.h = true;
        this.n = strArr2;
        this.j = i;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adt) {
            adt adtVar = (adt) obj;
            if (ii.X(this.a, adtVar.a) && Arrays.equals(this.b, adtVar.b) && Arrays.equals(this.c, adtVar.c) && Arrays.equals(this.d, adtVar.d) && ii.X(this.l, adtVar.l) && Arrays.equals(this.e, adtVar.e) && Arrays.deepEquals(this.f, adtVar.f) && Arrays.equals(this.g, adtVar.g) && Arrays.equals(this.n, adtVar.n) && this.h == adtVar.h && ii.X(this.i, adtVar.i) && this.j == adtVar.j && ii.X(this.k, adtVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, Boolean.valueOf(this.h), this.n, this.i, Integer.valueOf(this.j), this.k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.l);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.n));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        aen aenVar = this.i;
        sb.append(aenVar != null ? aenVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.t(parcel, 2, this.a, i);
        qq.p(parcel, 3, this.b);
        qq.s(parcel, 4, this.c);
        qq.v(parcel, 5, this.d);
        qq.s(parcel, 6, this.e);
        qq.q(parcel, 7, this.f);
        qq.k(parcel, 8, this.h);
        qq.x(parcel, 9, this.g, i);
        qq.t(parcel, 11, this.i, i);
        String[] strArr = this.n;
        if (strArr == null) {
            strArr = m;
        }
        qq.v(parcel, 12, strArr);
        qq.m(parcel, 13, this.j);
        qq.t(parcel, 14, this.k, i);
        qq.j(parcel, iH);
    }

    public adt(aeo aeoVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, akt[] aktVarArr, aen aenVar, String[] strArr2, int i, aef aefVar) {
        this.a = aeoVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = aktVarArr;
        this.i = aenVar;
        this.n = strArr2;
        this.j = i;
        this.l = null;
        this.k = aefVar;
    }
}
