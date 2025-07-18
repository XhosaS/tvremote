package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdg implements box {
    @Override // defpackage.box
    public final void a(brm brmVar) throws SQLException {
        brz brzVar = (brz) brmVar;
        brzVar.f.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        Object[] objArr2 = new Object[size];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(brz.b[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < size; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        bsj bsjVarB = brzVar.b(sb.toString());
        brl.a.a(bsjVarB, objArr2);
        bsjVarB.b.executeUpdateDelete();
    }
}
