package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lzo implements idy {
    public int a = 0;
    final /* synthetic */ lzq b;
    private final String c;
    private final int d;

    public lzo(lzq lzqVar, File file, int i) throws IOException {
        String absolutePath;
        this.b = lzqVar;
        this.d = i;
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        this.c = absolutePath;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ef  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.idy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzo.c(java.lang.Object):void");
    }
}
