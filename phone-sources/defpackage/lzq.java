package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzq {
    private static final tui c = tui.l("com/google/android/apps/play/movies/common/store/pinning/unpinning/UnpinContentCleanerImpl");
    public final lyz a;
    public final isy b;
    private final Context d;
    private volatile boolean e;
    private final hfx f;

    public lzq(Context context, lyz lyzVar, isy isyVar, hfx hfxVar) {
        this.d = context;
        this.a = lyzVar;
        this.b = isyVar;
        this.f = hfxVar;
    }

    static /* bridge */ /* synthetic */ boolean b(lzq lzqVar, File file, int i) {
        String strN = kfw.N(file.getAbsolutePath());
        isy isyVar = lzqVar.b;
        SQLiteDatabase sQLiteDatabaseF = isyVar.f();
        try {
            if (isyVar.k(strN, i)) {
                String name = file.getName();
                int iL = TextUtils.isEmpty(name) ? -1 : kfw.L(name);
                if (iL >= 0 && name.startsWith("1", iL + 1)) {
                    return false;
                }
            }
            return c(file);
        } finally {
            lzqVar.b.g(sQLiteDatabaseF, false);
        }
    }

    public static final boolean c(File file) {
        boolean zDelete = file.delete();
        if (zDelete) {
            krd.f("Succeeded to delete delete file ".concat(String.valueOf(file.getAbsolutePath())));
            return zDelete;
        }
        krd.c("Failed to delete delete file ".concat(String.valueOf(file.getAbsolutePath())));
        return zDelete;
    }

    public final void a(int i) {
        boolean z;
        int i2;
        synchronized (this) {
            if (this.e) {
                z = false;
            } else {
                this.e = true;
                z = true;
            }
        }
        if (!z) {
            krd.e("Rescheduling cleanup task because cleanup is in progress.");
            this.f.s(i);
            return;
        }
        tui tuiVar = c;
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/common/store/pinning/unpinning/UnpinContentCleanerImpl", "cleanUp", 76, "UnpinContentCleanerImpl.java")).t("Start clean up task with reason %d", i);
        krd.f("Start cleanup unpinned content");
        isy isyVar = this.b;
        isyVar.i();
        File[] fileArrP = kfw.P(this.d);
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < fileArrP.length; i3++) {
            File file = fileArrP[i3];
            if (file != null) {
                sparseArray.put(i3, file);
            }
        }
        if (sparseArray.size() > 0) {
            i2 = 0;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                File file2 = (File) sparseArray.get(sparseArray.keyAt(i4));
                lzo lzoVar = new lzo(this, file2, i4);
                kfw.O(file2, lzoVar, 0);
                i2 += lzoVar.a;
            }
            lyz lyzVar = this.a;
            SQLiteDatabase sQLiteDatabaseB = lyzVar.b();
            if (sQLiteDatabaseB == null) {
                ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/common/store/pinning/unpinning/UnpinContentCleanerImpl", "cleanUpDbValuesForUnpinnedContent", 226, "UnpinContentCleanerImpl.java")).s("Failed to clean up db values for unpinned content: database is null");
            } else {
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = sQLiteDatabaseB.query("purchased_assets", lzp.a, "NOT (pinned IS NOT NULL AND pinned > 0) AND (have_subtitles OR download_bytes_downloaded IS NOT NULL)", null, null, null, null);
                    } catch (RuntimeException e) {
                        ((tug) ((tug) ((tug) c.g()).i(e)).j("com/google/android/apps/play/movies/common/store/pinning/unpinning/UnpinContentCleanerImpl", "cleanUpDbValuesForUnpinnedContent", ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "UnpinContentCleanerImpl.java")).s("Failed to clean up db values for unpinned content.");
                        if (0 != 0) {
                        }
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            kuh kuhVar = new kuh(ksn.b(cursorQuery.getString(0)), cursorQuery.getString(1));
                            SQLiteDatabase sQLiteDatabaseF = isyVar.f();
                            try {
                                if (!isyVar.j(kuhVar)) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.putNull("download_bytes_downloaded");
                                    contentValues.put("have_subtitles", (Boolean) false);
                                    ktw.u(lyzVar, kuhVar, contentValues);
                                }
                                isyVar.h(sQLiteDatabaseF, true, true);
                            } catch (Throwable th) {
                                this.b.h(sQLiteDatabaseF, true, true);
                                throw th;
                            }
                        }
                        cursorQuery.close();
                    } else {
                        ((tug) ((tug) c.g()).j("com/google/android/apps/play/movies/common/store/pinning/unpinning/UnpinContentCleanerImpl", "cleanUpDbValuesForUnpinnedContent", 240, "UnpinContentCleanerImpl.java")).s("Query returned a null cursor.");
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
        } else {
            i2 = 0;
        }
        krd.f(a.cd(i2, "Done cleanup unpinned content: removed ", " files"));
        synchronized (this) {
            this.e = false;
        }
    }
}
