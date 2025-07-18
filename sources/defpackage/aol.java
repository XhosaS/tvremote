package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aol extends anx {
    public aol() {
        super(aco.FILE_DELETION, 10L);
    }

    private static void c(File file, FilenameFilter filenameFilter) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2, filenameFilter);
                } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                    Log.w("FILE_DELETION", "Unable to delete file: ".concat(String.valueOf(String.valueOf(file2))));
                }
            }
        }
    }

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        if (!bygVar.f() || ((adb) bygVar.b()).b != 1) {
            throw new IllegalArgumentException();
        }
        Context context = aodVar.b;
        adb adbVar = (adb) bygVar.b();
        act actVar = adbVar.b == 1 ? (act) adbVar.c : act.a;
        int i = actVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            cme cmeVar = actVar.c;
            File dataDir = context.getDataDir();
            if (dataDir == null) {
                throw new IllegalStateException("Context missing dataDir");
            }
            c(dataDir, new aok(dataDir, cmeVar));
            return aodVar;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new UnsupportedOperationException("This storage type does not supported");
            }
            cme cmeVar2 = actVar.c;
            File externalFilesDir = context.getExternalFilesDir(null);
            c(externalFilesDir, new aok(externalFilesDir, cmeVar2));
            return aodVar;
        }
        cme cmeVar3 = actVar.c;
        File dataDir2 = context.createDeviceProtectedStorageContext().getDataDir();
        if (dataDir2 == null) {
            throw new IllegalStateException("Context missing dataDir");
        }
        c(dataDir2, new aok(dataDir2, cmeVar3));
        return aodVar;
    }

    @Override // defpackage.anx
    public final String b() {
        return "FILE_DELETION";
    }
}
