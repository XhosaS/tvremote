package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbm {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public qbm() {
        throw null;
    }

    public final vgv a() {
        vgu vguVar;
        vtw vtwVarM = vgv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        String str = this.a;
        vuc vucVar = vtwVarM.b;
        vgv vgvVar = (vgv) vucVar;
        str.getClass();
        vgvVar.b |= 1;
        vgvVar.c = str;
        int i = this.d;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                vguVar = vgu.IMPORTANCE_DEFAULT;
                break;
            case 2:
                vguVar = vgu.IMPORTANCE_HIGH;
                break;
            case 3:
                vguVar = vgu.IMPORTANCE_LOW;
                break;
            case 4:
                vguVar = vgu.IMPORTANCE_MIN;
                break;
            case 5:
                vguVar = vgu.IMPORTANCE_MAX;
                break;
            case 6:
                vguVar = vgu.IMPORTANCE_NONE;
                break;
            default:
                vguVar = vgu.IMPORTANCE_UNSPECIFIED;
                break;
        }
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        vgv vgvVar2 = (vgv) vucVar2;
        vgvVar2.e = vguVar.h;
        vgvVar2.b |= 4;
        vgt vgtVar = this.c ? vgt.TRUE : vgt.FALSE;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vgv vgvVar3 = (vgv) vtwVarM.b;
        vgvVar3.f = vgtVar.d;
        vgvVar3.b |= 8;
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vgv vgvVar4 = (vgv) vtwVarM.b;
            str2.getClass();
            vgvVar4.b |= 2;
            vgvVar4.d = str2;
        }
        return (vgv) vtwVarM.r();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qbm) {
            qbm qbmVar = (qbm) obj;
            if (this.a.equals(qbmVar.a) && this.b.equals(qbmVar.b)) {
                int i = this.d;
                int i2 = qbmVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c == qbmVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        a.bl(i);
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str;
        switch (this.d) {
            case 1:
                str = "IMPORTANCE_UNSPECIFIED";
                break;
            case 2:
                str = "IMPORTANCE_DEFAULT";
                break;
            case 3:
                str = "IMPORTANCE_HIGH";
                break;
            case 4:
                str = "IMPORTANCE_LOW";
                break;
            case 5:
                str = "IMPORTANCE_MIN";
                break;
            case 6:
                str = "IMPORTANCE_MAX";
                break;
            case 7:
                str = "IMPORTANCE_NONE";
                break;
            default:
                str = "null";
                break;
        }
        String str2 = this.b;
        return "ChimeNotificationChannel{id=" + this.a + ", group=" + str2 + ", importance=" + str + ", canShowBadge=" + this.c + "}";
    }

    public qbm(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.c = z;
    }
}
