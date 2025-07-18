package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qei {
    public final String a;
    public final String b;
    public final qej c;
    public final String d;
    public final long e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    private final String m;

    public qei() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        qej qejVar;
        String str2;
        String str3;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qei) {
            qei qeiVar = (qei) obj;
            if (this.a.equals(qeiVar.a) && ((str = this.b) != null ? str.equals(qeiVar.b) : qeiVar.b == null)) {
                int i = this.l;
                int i2 = qeiVar.l;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((qejVar = this.c) != null ? qejVar.equals(qeiVar.c) : qeiVar.c == null) && this.d.equals(qeiVar.d) && this.e == qeiVar.e && ((str2 = this.m) != null ? str2.equals(qeiVar.m) : qeiVar.m == null) && ((str3 = this.f) != null ? str3.equals(qeiVar.f) : qeiVar.f == null) && ((num = this.g) != null ? num.equals(qeiVar.g) : qeiVar.g == null) && this.h == qeiVar.h && this.i == qeiVar.i && this.j == qeiVar.j && this.k == qeiVar.k) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i = this.l;
        a.bl(i);
        int i2 = (iHashCode2 ^ i) * 1000003;
        qej qejVar = this.c;
        int iHashCode3 = (((((i2 ^ (qejVar == null ? 0 : qejVar.hashCode())) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ ((int) this.e)) * 1000003;
        String str2 = this.m;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num = this.g;
        return ((((((((((((((((iHashCode5 ^ (num != null ? num.hashCode() : 0)) * (-721379959)) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.h ? 1237 : 1231)) * (-721379959)) ^ 1237) * 1000003) ^ this.i) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "GnpConfig{clientId=" + this.a + ", selectionTokens=null, gcmSenderProjectId=" + this.b + ", defaultEnvironment=" + osk.ah(this.l) + ", systemTrayNotificationConfig=" + String.valueOf(this.c) + ", inAppNotificationConfig=null, deviceName=" + this.d + ", registrationStalenessTimeMs=" + this.e + ", scheduledTaskService=" + this.m + ", apiKey=" + this.f + ", jobSchedulerAllowedIDsRange=" + this.g + ", firebaseOptions=null, disableEntrypoints=false, useDefaultFirebaseApp=false, useFirebaseReceiver=" + this.h + ", timeToLiveDays=null, enableEndToEndEncryption=false, periodRegistrationIntervalDays=" + this.i + ", enableGrowthKitIfExists=" + this.j + ", enableInAppPushFlow=" + this.k + ", allowedFromEmbargoedCountries=false}";
    }

    public qei(String str, String str2, int i, qej qejVar, String str3, long j, String str4, String str5, Integer num, boolean z, int i2, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.l = i;
        this.c = qejVar;
        this.d = str3;
        this.e = j;
        this.m = str4;
        this.f = str5;
        this.g = num;
        this.h = z;
        this.i = i2;
        this.j = z2;
        this.k = z3;
    }
}
