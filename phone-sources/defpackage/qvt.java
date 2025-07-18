package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvt {
    public final qtr a;
    public final qth b;
    public final qvh c;
    public final ril d;
    public final tst e;
    private final tst f;

    public qvt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvt) {
            qvt qvtVar = (qvt) obj;
            if (this.a.equals(qvtVar.a) && this.b.equals(qvtVar.b) && this.c.equals(qvtVar.c) && this.d.equals(qvtVar.d) && this.e.equals(qvtVar.e) && this.f.equals(qvtVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.f;
        tst tstVar2 = this.e;
        ril rilVar = this.d;
        qvh qvhVar = this.c;
        qth qthVar = this.b;
        return "AccountManagementSpec{avatarImageLoader=" + String.valueOf(this.a) + ", accountConverter=" + String.valueOf(qthVar) + ", accountsModel=" + String.valueOf(qvhVar) + ", accountClass=null, oneGoogleEventLogger=" + String.valueOf(rilVar) + ", deactivatedAccountsFeature=" + String.valueOf(tstVar2) + ", launcherAppDialogTracker=" + String.valueOf(tstVar) + "}";
    }

    public qvt(qtr qtrVar, qth qthVar, qvh qvhVar, ril rilVar, tst tstVar, tst tstVar2) {
        this.a = qtrVar;
        this.b = qthVar;
        this.c = qvhVar;
        this.d = rilVar;
        this.e = tstVar;
        this.f = tstVar2;
    }
}
