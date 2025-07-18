package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qap implements qaj {
    public static final tvn a = tvn.n("GnpSdk");
    public final ChimePerAccountRoomDatabase b;
    private final yil c;

    public qap(ChimePerAccountRoomDatabase chimePerAccountRoomDatabase, yil yilVar) {
        this.b = chimePerAccountRoomDatabase;
        this.c = yilVar;
    }

    @Override // defpackage.qaj
    public final Object a(long j, yih yihVar) throws Throwable {
        Object objL = ykr.l(this.c, new ud(this, j, (yih) null, 2), yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    @Override // defpackage.qaj
    public final List b(String... strArr) {
        strArr.getClass();
        try {
            qay qayVarY = this.b.y();
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM chime_thread_states WHERE thread_id IN (");
            gez.G(sb, strArr2.length);
            sb.append(")");
            return (List) gez.j(((qbc) qayVarY).a, true, false, new qaz(sb.toString(), strArr2, 2, null));
        } catch (SQLiteException e) {
            ((tvk) ((tvk) a.g()).i(e)).s("Failed to get thread states by id");
            return yhb.a;
        }
    }

    @Override // defpackage.qaj
    public final void c(qax qaxVar) {
        try {
        } catch (SQLiteException e) {
            ((tvk) ((tvk) a.g()).i(e)).s("Failed to insert thread state");
        }
    }
}
