package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzw {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/store/purchase/LocalUserLibraryImpl");
    public final lyz b;
    public final mes c;

    public lzw(lyz lyzVar, mes mesVar) {
        this.b = lyzVar;
        this.c = mesVar;
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, ksn ksnVar, ImmutableList immutableList) {
        int i;
        if (immutableList.isEmpty()) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("purchase_status", (Integer) (-1));
        Iterator it = Lists.partition(immutableList, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION).iterator();
        int iUpdate = 0;
        while (true) {
            if (!it.hasNext()) {
                return iUpdate != 0;
            }
            List<ksy> list = (List) it.next();
            int size = list.size() - 1;
            String str = " OR (asset_id=? AND asset_type=?)";
            if (size <= 1) {
                sij.q(size >= 0, "invalid count: %s", size);
                if (size == 0) {
                    str = "";
                }
            } else {
                long j = size * 33;
                int i2 = (int) j;
                if (i2 != j) {
                    throw new ArrayIndexOutOfBoundsException(a.cs(j, "Required array size too large: "));
                }
                char[] cArr = new char[i2];
                int i3 = 33;
                " OR (asset_id=? AND asset_type=?)".getChars(0, 33, cArr, 0);
                while (true) {
                    i = i2 - i3;
                    if (i3 >= i) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 += i3;
                }
                System.arraycopy(cArr, 0, cArr, i3, i);
                str = new String(cArr);
            }
            String str2 = ksnVar.a;
            String strCg = a.cg(str, "account=? AND ((asset_id=? AND asset_type=?)", ")");
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.add((ImmutableList.Builder) str2);
            for (ksy ksyVar : list) {
                builder.add((ImmutableList.Builder) ksyVar.b);
                builder.add((ImmutableList.Builder) Integer.toString(ksyVar.a));
            }
            iUpdate += sQLiteDatabase.update("purchased_assets", contentValues, strCg, (String[]) builder.build().toArray(new String[0]));
        }
    }

    public final void a(ksn ksnVar, ImmutableMap immutableMap) {
        String str;
        String[] strArr;
        SQLiteDatabase sQLiteDatabaseA = this.b.a();
        try {
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ksy ksyVar = (ksy) entry.getKey();
                kvx kvxVar = (kvx) entry.getValue();
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_playback_is_dirty", (Integer) 0);
                contentValues.put("resume_timestamp", Long.valueOf(vxd.b(kvxVar.a)));
                tst tstVar = kvxVar.c;
                if (tstVar.g()) {
                    long jB = vxf.b((vwe) tstVar.c());
                    contentValues.put("last_watched_timestamp", Long.valueOf(jB));
                    tst tstVar2 = kvxVar.b;
                    contentValues.put("last_playback_start_timestamp", Long.valueOf(tstVar2.g() ? vxf.b((vwe) tstVar2.c()) : jB));
                    str = "account = ? AND asset_type = ? AND asset_id = ? AND (last_watched_timestamp IS NULL OR last_watched_timestamp < ?)";
                    strArr = new String[]{ksnVar.a, Integer.toString(ksyVar.a), ksyVar.b, Long.toString(jB)};
                } else {
                    str = "account = ? AND asset_type = ? AND asset_id = ? AND (last_playback_is_dirty IS NULL OR NOT last_playback_is_dirty)";
                    strArr = new String[]{ksnVar.a, Integer.toString(ksyVar.a), ksyVar.b};
                }
                sQLiteDatabaseA.update("purchased_assets", contentValues, str, strArr);
            }
            this.b.f(sQLiteDatabaseA, true, 0);
        } catch (Throwable th) {
            this.b.f(sQLiteDatabaseA, false, 0);
            throw th;
        }
    }
}
