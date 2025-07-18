package defpackage;

import android.database.sqlite.SQLiteQueryBuilder;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lza implements idf {
    private static final String[] a = {"asset_id"};
    private final ieh b;
    private final idf c;

    public lza(ieh iehVar, lyz lyzVar) {
        this.b = iehVar;
        this.c = hjt.b(lyzVar.a, new lbj(xay.EPISODE, 11));
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ksy ksyVar = (ksy) obj;
        ieg iegVarA = ((ldy) this.b).a();
        if (iegVarA.k()) {
            return Collections.EMPTY_LIST;
        }
        ies iesVar = new ies();
        iesVar.c(SQLiteQueryBuilder.buildQueryString(true, "purchased_assets", a, "account = ?  AND parent_asset_id = ? AND asset_type = 20", null, null, null, null));
        iesVar.b(((ksn) iegVarA.g()).a, ksyVar.b);
        return (List) ((ieo) this.c).b(iesVar.a()).h(Collections.EMPTY_LIST);
    }
}
