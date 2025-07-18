package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lzg implements idf {
    final /* synthetic */ lzh a;

    public lzg(lzh lzhVar) {
        this.a = lzhVar;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0023: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:36), block:B:10:0x0023 */
    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        InputStream inputStream;
        File file = (File) obj;
        if (!file.exists()) {
            return ieg.a;
        }
        InputStream inputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th) {
                th = th;
                lzh.g(inputStream2);
                throw th;
            }
            try {
                ieg iegVarF = ieg.f(this.a.a.a(fileInputStream, file.length()));
                lzh.g(fileInputStream);
                return iegVarF;
            } catch (Exception e3) {
                e = e3;
                krd.f(a.cw(file, "Error opening cache file (maybe removed). [file=", "]"));
                file.delete();
                ieg iegVarB = ieg.b(e);
                lzh.g(fileInputStream);
                return iegVarB;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            lzh.g(inputStream2);
            throw th;
        }
    }
}
