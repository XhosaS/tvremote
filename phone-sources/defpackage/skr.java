package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skr implements sjp {
    public uri[] a;
    private final vvj b;

    public skr(vvj vvjVar) {
        this.b = vvjVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, skt] */
    @Override // defpackage.sjp
    public final /* synthetic */ Object a(unc uncVar) throws IOException {
        AtomicLong atomicLong = skq.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + skq.a.getAndIncrement();
        Uri uri = (Uri) uncVar.c;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        ?? r2 = uncVar.a;
        List listD = uncVar.d(r2.d(uriBuild));
        uri[] uriVarArr = this.a;
        if (uriVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                uriVarArr[i].c(listD);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) listD.get(0);
            try {
                this.b.g(outputStream);
                uri[] uriVarArr2 = this.a;
                if (uriVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        uriVarArr2[i2].d();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                r2.g(uriBuild, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                uncVar.a.f(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
