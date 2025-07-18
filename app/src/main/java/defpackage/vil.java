package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vil extends vhj {
    public final AccountId a;
    private final vhg b;

    public vil(AccountId accountId, vhg vhgVar) {
        if (accountId == null) {
            throw new NullPointerException("Null id");
        }
        this.a = accountId;
        this.b = vhgVar;
    }

    @Override // defpackage.vhj
    public final AccountId a() {
        return this.a;
    }

    @Override // defpackage.vhj
    public final vhg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vhj) {
            vhj vhjVar = (vhj) obj;
            if (this.a.equals(vhjVar.a())) {
                vhg vhgVar = this.b;
                vhg vhgVarB = vhjVar.b();
                if (vhgVar != vhgVarB) {
                    if (vhgVar.getClass() == vhgVarB.getClass()) {
                        if (abza.a.a(vhgVar.getClass()).k(vhgVar, vhgVarB)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = this.a.hashCode() ^ 1000003;
        vhg vhgVar = this.b;
        if ((vhgVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(vhgVar.getClass()).b(vhgVar);
        } else {
            int iB2 = vhgVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(vhgVar.getClass()).b(vhgVar);
                vhgVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (iHashCode * 1000003) ^ iB;
    }

    public final String toString() {
        vhg vhgVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + vhgVar.toString() + "}";
    }
}
