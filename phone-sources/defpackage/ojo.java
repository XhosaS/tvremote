package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojo extends ocg {
    public static final Parcelable.Creator<ojo> CREATOR = new oee(1);
    public final String a;
    public final String b;
    private final ojm c;
    private final ojn d;

    public ojo(String str, String str2, int i, int i2) {
        ojm ojmVar;
        this.a = str;
        this.b = str2;
        ojn ojnVar = null;
        switch (i) {
            case 0:
                ojmVar = ojm.UNKNOWN;
                break;
            case 1:
                ojmVar = ojm.NULL_ACCOUNT;
                break;
            case 2:
                ojmVar = ojm.GOOGLE;
                break;
            case 3:
                ojmVar = ojm.DEVICE;
                break;
            case 4:
                ojmVar = ojm.SIM;
                break;
            case 5:
                ojmVar = ojm.EXCHANGE;
                break;
            case 6:
                ojmVar = ojm.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                ojmVar = ojm.THIRD_PARTY_READONLY;
                break;
            case 8:
                ojmVar = ojm.SIM_SDN;
                break;
            case 9:
                ojmVar = ojm.PRELOAD_SDN;
                break;
            default:
                ojmVar = null;
                break;
        }
        this.c = ojmVar == null ? ojm.UNKNOWN : ojmVar;
        if (i2 == 0) {
            ojnVar = ojn.UNKNOWN;
        } else if (i2 == 1) {
            ojnVar = ojn.NONE;
        } else if (i2 == 2) {
            ojnVar = ojn.EXACT;
        } else if (i2 == 3) {
            ojnVar = ojn.SUBSTRING;
        } else if (i2 == 4) {
            ojnVar = ojn.HEURISTIC;
        } else if (i2 == 5) {
            ojnVar = ojn.SHEEPDOG_ELIGIBLE;
        }
        this.d = ojnVar == null ? ojn.UNKNOWN : ojnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ojo ojoVar = (ojo) obj;
            if (a.Q(this.a, ojoVar.a) && a.Q(this.b, ojoVar.b) && this.c == ojoVar.c && this.d == ojoVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("accountType", this.a);
        tssVarH.b("dataSet", this.b);
        tssVarH.b("category", this.c);
        tssVarH.b("matchTag", this.d);
        return tssVarH.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.O(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c.k);
        ocv.B(parcel, 4, this.d.g);
        ocv.x(parcel, iV);
    }
}
