package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vor {
    public final vpi a;
    private final wmy b;

    public vor(wmy wmyVar, vpi vpiVar) {
        this.b = wmyVar;
        this.a = vpiVar;
    }

    final yyk a(final yzq yzqVar, final yzq yzqVar2) {
        boolean z = true;
        if ((yzqVar != null || yzqVar2 == null) && (yzqVar == null || yzqVar2 != null)) {
            z = false;
        }
        yqw.A(z);
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        zdl it = this.b.a().iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles = new File((File) it.next(), "accounts").listFiles(new FilenameFilter() { // from class: voq
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) throws NumberFormatException {
                    File file2 = new File(file, str);
                    try {
                        Integer numValueOf = Integer.valueOf(str);
                        if (numValueOf.intValue() < 0) {
                            return false;
                        }
                        yzq yzqVar3 = yzqVar2;
                        if (yzqVar3 != null && yzqVar3.contains(numValueOf)) {
                            return false;
                        }
                        yzq yzqVar4 = yzqVar;
                        if ((yzqVar4 == null || yzqVar4.contains(numValueOf)) && file2.isDirectory()) {
                            return file2.canWrite();
                        }
                        return false;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            if (fileArrListFiles != null) {
                yyfVar.a(fileArrListFiles, fileArrListFiles.length);
            }
        }
        return yyfVar.f();
    }
}
