package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqe implements ggh {
    private final /* synthetic */ int a;

    public gqe(int i) {
        this.a = i;
    }

    @Override // defpackage.ggh
    public final void a(ghk ghkVar) throws SQLException {
        int i = this.a;
        if (i == 0) {
            ghkVar.f("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
            return;
        }
        if (i != 1) {
            ghkVar.f("UPDATE gnp_accounts SET account_type = 1");
            return;
        }
        ghkVar.f("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i2 = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        Object[] objArr2 = new Object[size];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(ghu.a[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < size; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        gib gibVarJ = ((ghu) ghkVar).j(sb.toString());
        gez.s(gibVarJ, objArr2);
        gibVarJ.a.executeUpdateDelete();
    }
}
