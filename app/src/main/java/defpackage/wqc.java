package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqc {
    public final wsm a;
    public final wnt b;
    public final AccountId c;

    public wqc(wsm wsmVar) {
        this.a = wsmVar;
        wsk wskVar = wsmVar.c;
        this.b = new wnt(wskVar == null ? wsk.a : wskVar);
        this.c = (wsmVar.b & 2) != 0 ? AccountId.b(wsmVar.d) : null;
    }

    final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wqc) {
            wqc wqcVar = (wqc) obj;
            if (this.b.equals(wqcVar.b)) {
                AccountId accountId = this.c;
                AccountId accountId2 = wqcVar.c;
                if (accountId == null) {
                    if (accountId2 == null) {
                        return true;
                    }
                } else if (accountId.equals(accountId2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
