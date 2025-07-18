package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntk extends ocg {
    public static final Parcelable.Creator<ntk> CREATOR = new nld(20);
    private static final String[] m = new String[0];
    public final nuk a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final oly[] g;
    public final boolean h;
    public nuj i;
    public final int j;
    public final nua k;
    public final whm l;
    private final String[] n;

    public ntk(nuk nukVar, whm whmVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, oly[] olyVarArr, String[] strArr2, int i) {
        this.a = nukVar;
        this.l = whmVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = olyVarArr;
        this.h = true;
        this.n = strArr2;
        this.j = i;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ntk) {
            ntk ntkVar = (ntk) obj;
            if (a.Q(this.a, ntkVar.a) && Arrays.equals(this.b, ntkVar.b) && Arrays.equals(this.c, ntkVar.c) && Arrays.equals(this.d, ntkVar.d) && a.Q(this.l, ntkVar.l) && Arrays.equals(this.e, ntkVar.e) && Arrays.deepEquals(this.f, ntkVar.f) && Arrays.equals(this.g, ntkVar.g) && Arrays.equals(this.n, ntkVar.n) && this.h == ntkVar.h && a.Q(this.i, ntkVar.i) && this.j == ntkVar.j && a.Q(this.k, ntkVar.k)) {
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
        nuj nujVar = this.i;
        sb.append(nujVar != null ? nujVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.a, i);
        ocv.F(parcel, 3, this.b);
        ocv.I(parcel, 4, this.c);
        ocv.P(parcel, 5, this.d);
        ocv.I(parcel, 6, this.e);
        ocv.G(parcel, 7, this.f);
        ocv.y(parcel, 8, this.h);
        ocv.R(parcel, 9, this.g, i);
        ocv.N(parcel, 11, this.i, i);
        String[] strArr = this.n;
        if (strArr == null) {
            strArr = m;
        }
        ocv.P(parcel, 12, strArr);
        ocv.B(parcel, 13, this.j);
        ocv.N(parcel, 14, this.k, i);
        ocv.x(parcel, iV);
    }

    public ntk(nuk nukVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, oly[] olyVarArr, nuj nujVar, String[] strArr2, int i, nua nuaVar) {
        this.a = nukVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = olyVarArr;
        this.i = nujVar;
        this.n = strArr2;
        this.j = i;
        this.l = null;
        this.k = nuaVar;
    }
}
