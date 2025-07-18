package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvv {
    public static AccountId a(Set set) {
        Iterator it = set.iterator();
        Integer numValueOf = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("account_id_")) {
                yqw.M(numValueOf == null, "Account ID already found. This work is tagged for two accounts.");
                numValueOf = Integer.valueOf(Integer.parseInt(str.replace("account_id_", "")));
            }
        }
        if (numValueOf == null || numValueOf.intValue() == -1) {
            throw new IllegalArgumentException("Input set had no valid account in it.");
        }
        return AccountId.b(numValueOf.intValue());
    }

    static String b(AccountId accountId) {
        yqw.A(accountId.a() != -1);
        return "account_id_" + accountId.a();
    }
}
