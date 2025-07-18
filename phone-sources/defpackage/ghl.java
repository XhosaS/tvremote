package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghl {
    public final int a;
    public final /* synthetic */ ged b;

    public ghl(int i) {
        this.a = i;
    }

    public static final void a(String str) {
        if (ylh.y(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int iA = yks.a(str.charAt(true != z ? i : length), 32);
            if (z) {
                if (iA > 0) {
                    break;
                } else {
                    length--;
                }
            } else if (iA > 0) {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x005f A[EDGE_INSN: B:115:0x005f->B:25:0x005f BREAK  A[LOOP:4: B:9:0x001d->B:119:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ghk r13, int r14, int r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghl.b(ghk, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ghl(ged gedVar, int i) {
        this(i);
        this.b = gedVar;
    }
}
