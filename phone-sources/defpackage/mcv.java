package defpackage;

import android.database.sqlite.SQLiteQueryBuilder;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcv implements mct {
    private final idf a;

    public mcv(lyz lyzVar) {
        lyzVar.getClass();
        this.a = hjt.b(lyzVar.a, new lxq(13));
    }

    @Override // defpackage.mct
    public final List a(ksn ksnVar) {
        ies iesVar = new ies();
        iesVar.c(SQLiteQueryBuilder.buildQueryString(false, "wishlist", mcu.a, "wishlist_account = ? AND wishlist_item_state != 3 AND wishlist_item_type IN (6,18,5000,2)", null, null, "wishlist_item_order", null));
        iesVar.b(ksnVar.a);
        return (List) ((ieo) this.a).b(iesVar.a()).h(Collections.EMPTY_LIST);
    }
}
