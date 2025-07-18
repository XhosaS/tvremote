package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwv {
    public final String a;
    public final tst b;
    public final lio c;
    public final boolean d;
    public final tst e;
    public final tst f;
    public final tst g;
    public final tst h;
    public final int i;
    private final tst j;

    public mwv() {
        throw null;
    }

    public static nhx a() {
        nhx nhxVar = new nhx(null, null);
        nhxVar.g("");
        trk trkVar = trk.a;
        nhxVar.j = trkVar;
        nhxVar.c = (byte) (nhxVar.c | 1);
        nhxVar.e(lic.a);
        nhxVar.d = trkVar;
        nhxVar.e = trkVar;
        nhxVar.g = trkVar;
        nhxVar.a = 1;
        nhxVar.i = trkVar;
        nhxVar.h = trkVar;
        nhxVar.f(false);
        return nhxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwv) {
            mwv mwvVar = (mwv) obj;
            if (this.a.equals(mwvVar.a) && this.b.equals(mwvVar.b) && this.c.equals(mwvVar.c) && this.d == mwvVar.d) {
                int i = this.i;
                int i2 = mwvVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.j.equals(mwvVar.j) && this.e.equals(mwvVar.e) && this.f.equals(mwvVar.f) && this.g.equals(mwvVar.g) && this.h.equals(mwvVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode();
        int i = this.i;
        a.bl(i);
        return (((((((((((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.i;
        lio lioVar = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(lioVar);
        switch (i) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "WATCH_ON_DISTRIBUTOR";
                break;
            case 3:
                str = "WATCH_ON_PLAY";
                break;
            case 4:
                str = "BUY";
                break;
            case 5:
                str = "RENT";
                break;
            case 6:
                str = "PREORDER";
                break;
            case 7:
                str = "CANCEL_PREORDER";
                break;
            case 8:
                str = "APP_INSTALL";
                break;
            case 9:
                str = "ADD_TO_WATCHLIST";
                break;
            case 10:
                str = "REMOVE_FROM_WATCHLIST";
                break;
            default:
                str = "null";
                break;
        }
        boolean z = this.d;
        String str2 = this.a;
        tst tstVar = this.j;
        tst tstVar2 = this.e;
        tst tstVar3 = this.f;
        tst tstVar4 = this.g;
        tst tstVar5 = this.h;
        return "ActionViewModel{text=" + str2 + ", contentDescription=" + strValueOf + ", actionNode=" + strValueOf2 + ", isRestricted=false, providerIsEntitled=" + z + ", actionType=" + str + ", appIdForInstall=" + String.valueOf(tstVar) + ", watchActionForDistributor=" + String.valueOf(tstVar2) + ", episodeForShow=" + String.valueOf(tstVar3) + ", iconRes=" + String.valueOf(tstVar4) + ", discountAnnotationViewModel=" + String.valueOf(tstVar5) + "}";
    }

    public mwv(String str, tst tstVar, lio lioVar, boolean z, int i, tst tstVar2, tst tstVar3, tst tstVar4, tst tstVar5, tst tstVar6) {
        this.a = str;
        this.b = tstVar;
        this.c = lioVar;
        this.d = z;
        this.i = i;
        this.j = tstVar2;
        this.e = tstVar3;
        this.f = tstVar4;
        this.g = tstVar5;
        this.h = tstVar6;
    }
}
