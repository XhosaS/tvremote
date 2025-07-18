package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kue {
    final /* synthetic */ kug a;
    private final String b;
    private long c;

    public kue(kug kugVar, String str) {
        this.a = kugVar;
        kkk.h(str);
        this.b = str;
        this.c = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.a.e().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.b, String.valueOf(this.c)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.c) {
                            this.c = j;
                        }
                        try {
                            lkw lkwVar = lkw.a;
                            lkv lkvVar = (lkv) lik.o(new lkv(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            if ((lkvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkvVar.y();
                            }
                            lkw lkwVar2 = (lkw) lkvVar.b;
                            lkwVar2.b = 1 | lkwVar2.b;
                            lkwVar2.d = string;
                            long j3 = cursorQuery.getLong(2);
                            if ((Integer.MIN_VALUE & lkvVar.b.memoizedSerializedSize) == 0) {
                                lkvVar.y();
                            }
                            lkw lkwVar3 = (lkw) lkvVar.b;
                            lkwVar3.b = 2 | lkwVar3.b;
                            lkwVar3.e = j3;
                            arrayList.add(new kud(j, j2, z, (lkw) lkvVar.v()));
                        } catch (IOException e) {
                            lbk lbkVar = this.a.y;
                            lab labVar = lbkVar.f;
                            lbkVar.o(labVar);
                            labVar.c.c("Data loss. Failed to merge raw event. appId", lab.b(this.b), e);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                lbk lbkVar2 = this.a.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.c("Data loss. Error querying raw events batch. appId", lab.b(this.b), e2);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public kue(kug kugVar, String str, long j) {
        this.a = kugVar;
        kkk.h(str);
        this.b = str;
        this.c = kugVar.d("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }
}
