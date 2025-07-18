package defpackage;

import com.google.android.gms.auth.aang.GetAccountsRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jxb extends jxd {
    public String a;
    public List b;
    public byte c;

    @Override // defpackage.jxd
    public final GetAccountsRequest a() {
        String str;
        if (this.c == 1 && (str = this.a) != null) {
            return new GetAccountsRequest(str, null, this.b, false);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" accountType");
        }
        if (this.c == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
