package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqx extends oqk {
    public oqx() {
        super(ngl.FILE_DELETION, 10L);
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

    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        if (!tstVar.g() || ((ngy) tstVar.c()).b != 1) {
            throw new IllegalArgumentException();
        }
        Context context = oqpVar.b;
        ngy ngyVar = (ngy) tstVar.c();
        ngq ngqVar = ngyVar.b == 1 ? (ngq) ngyVar.c : ngq.a;
        int iAQ = a.aQ(ngqVar.b);
        if (iAQ == 0) {
            iAQ = 1;
        }
        int i = iAQ - 2;
        if (i == 1) {
            vun vunVar = ngqVar.c;
            File dataDir = context.getDataDir();
            if (dataDir == null) {
                throw new IllegalStateException("Context missing dataDir");
            }
            c(dataDir, new oqw(dataDir, vunVar));
            return oqpVar;
        }
        if (i != 2) {
            if (i != 3) {
                throw new UnsupportedOperationException("This storage type does not supported");
            }
            vun vunVar2 = ngqVar.c;
            File externalFilesDir = context.getExternalFilesDir(null);
            c(externalFilesDir, new oqw(externalFilesDir, vunVar2));
            return oqpVar;
        }
        vun vunVar3 = ngqVar.c;
        File dataDir2 = context.createDeviceProtectedStorageContext().getDataDir();
        if (dataDir2 == null) {
            throw new IllegalStateException("Context missing dataDir");
        }
        c(dataDir2, new oqw(dataDir2, vunVar3));
        return oqpVar;
    }

    @Override // defpackage.oqk
    public final String b() {
        return "FILE_DELETION";
    }
}
