package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ley implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ley(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [els, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int length;
        long j;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                String str = edt.a;
                ((dwi) this.b).a.c(this.a);
                return;
            }
            lmi lmiVar = ((lmv) this.b).a;
            if (lmiVar.C) {
                lnr lnrVar = lmiVar.h;
                a.ab(lnrVar.q);
                lnrVar.O();
                Iterator it = lnrVar.o.iterator();
                while (it.hasNext()) {
                    ((lnn) it.next()).t(this.a);
                }
                return;
            }
            return;
        }
        a.aD(true, "limit may not be <= 0");
        Object obj = this.b;
        String str2 = (String) obj;
        krf.c(str2);
        File file = new File(str2);
        a.aD(file.isDirectory(), String.valueOf(obj).concat(" is not a directory"));
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: lez
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return !file2.isDirectory() && file2.getName().endsWith(".cache");
            }
        });
        if (fileArrListFiles != null) {
            int length2 = 0;
            int i2 = 0;
            while (true) {
                length = fileArrListFiles.length;
                j = length2;
                if (i2 >= length) {
                    break;
                }
                length2 = (int) (j + fileArrListFiles[i2].length());
                i2++;
            }
            long j2 = this.a;
            if (j < j2) {
                krd.b("Cache is below limit, no need to shrink: [size=" + length2 + ", limit=" + j2 + "]");
                return;
            }
            HashMap map = new HashMap(length);
            for (File file2 : fileArrListFiles) {
                map.put(file2, Long.valueOf(file2.lastModified()));
            }
            Arrays.sort(fileArrListFiles, new acs(map, 12, null));
            int i3 = 0;
            int i4 = length2;
            for (File file3 : fileArrListFiles) {
                long j3 = i4;
                if (j3 < j2) {
                    krd.b("Cache shrunk: [deleted=" + i3 + ", newSize=" + i4 + ", previousSize=" + length2 + ", limit=" + j2 + "]");
                    return;
                }
                long length3 = file3.length();
                if (file3.delete()) {
                    i4 = (int) (j3 - length3);
                    i3++;
                }
            }
        }
    }
}
