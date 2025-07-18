package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfg implements bem {
    public dcq[] a;
    private final cmz b;

    public bfg(cmz cmzVar) {
        this.b = cmzVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [bfi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [bfi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [bfi, java.lang.Object] */
    @Override // defpackage.bem
    public final /* synthetic */ Object a(cmt cmtVar) throws IOException {
        AtomicLong atomicLong = bff.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + bff.a.getAndIncrement();
        Uri uri = (Uri) cmtVar.d;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        List listC = cmtVar.c(cmtVar.c.j(uriBuild));
        dcq[] dcqVarArr = this.a;
        if (dcqVarArr != null) {
            dcqVarArr[0].a(listC);
        }
        try {
            OutputStream outputStream = (OutputStream) listC.get(0);
            try {
                this.b.f(outputStream);
                dcq[] dcqVarArr2 = this.a;
                if (dcqVarArr2 != null) {
                    dcqVarArr2[0].b();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                cmtVar.c.g(uriBuild, (Uri) cmtVar.d);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                cmtVar.c.k(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
