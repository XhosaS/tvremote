package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mca implements idf {
    private static final String[] a = {"user_sentiment_type", "user_sentiment_id", "user_sentiment_value", "user_sentiment_timestamp", "user_sentiment_uploading"};
    private final boolean b;
    private final lyz c;

    public mca(lyz lyzVar, boolean z) {
        this.c = lyzVar;
        this.b = z;
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map b(ksn ksnVar) {
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseA = this.c.a();
        try {
            Cursor cursorQuery = sQLiteDatabaseA.query(false, "user_sentiments", a, "user_sentiment_account = ? AND user_sentiment_uploading = ?", new String[]{ksnVar.a, this.b ? "1" : "0"}, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    long j = cursorQuery.getLong(3);
                    boolean z = cursorQuery.getInt(4) == 1;
                    ksy ksyVarC = ksy.c(i, string);
                    try {
                        byte[] blob = cursorQuery.getBlob(2);
                        vuc vucVarP = vuc.p(xbj.a, blob, 0, blob.length, vtp.a());
                        vuc.B(vucVarP);
                        xbj xbjVar = (xbj) vucVarP;
                        int iBm = a.bm(xbjVar.e);
                        if (iBm != 0 && iBm == 2) {
                            int iBm2 = a.bm(xbjVar.d);
                            if (iBm2 == 0) {
                                iBm2 = 1;
                            }
                            int i2 = iBm2 - 1;
                            int i3 = i2 != 1 ? i2 != 2 ? 3 : 2 : 1;
                            map.put(ksyVarC, new kxe(ksyVarC, i3, j, z));
                        } else {
                            map.put(ksyVarC, new kxe(ksyVarC, i3, j, z));
                        }
                    } catch (vuq unused) {
                        krd.c(hhh.c(ksyVarC, "Failed to parse user sentiment for "));
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return map;
        } finally {
            this.c.d(sQLiteDatabaseA);
        }
    }
}
