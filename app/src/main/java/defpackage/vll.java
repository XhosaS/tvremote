package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vll {
    public final vle a;
    public final zyg b;

    public vll(vle vleVar, zyg zygVar) {
        this.a = vleVar;
        this.b = zygVar;
    }

    public static vha a(von vonVar) {
        AccountId accountIdB = AccountId.b(vonVar.c);
        vhg vhgVar = vonVar.d;
        if (vhgVar == null) {
            vhgVar = vhg.a;
        }
        int iA = vig.a(vonVar.e);
        if (iA == 0) {
            iA = 1;
        }
        return new vik(accountIdB, vhgVar, iA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static von b(voi voiVar, AccountId accountId) {
        try {
            int iA = accountId.a();
            abyl abylVar = voiVar.d;
            Integer numValueOf = Integer.valueOf(iA);
            if (abylVar.containsKey(numValueOf)) {
                return (von) abylVar.get(numValueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new vio(e);
        }
    }
}
