package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdh implements box {
    @Override // defpackage.box
    public final void a(brm brmVar) throws SQLException {
        ((brz) brmVar).f.execSQL("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
