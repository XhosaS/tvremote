package defpackage;

import android.net.Uri;
import android.os.Process;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhm implements uef {
    public ufd[] a;
    private final MessageLite b;

    public uhm(MessageLite messageLite) {
        this.b = messageLite;
    }

    @Override // defpackage.uef
    public final /* synthetic */ Object a(uee ueeVar) throws IOException {
        AtomicLong atomicLong = uhl.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + uhl.a.getAndIncrement();
        Uri uri = ueeVar.f;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        uhp uhpVar = ueeVar.b;
        List listA = ueeVar.a(uhpVar.f(uriBuild));
        ufd[] ufdVarArr = this.a;
        if (ufdVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                ufdVarArr[i].a(listA);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) listA.get(0);
            try {
                this.b.e(outputStream);
                ufd[] ufdVarArr2 = this.a;
                if (ufdVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        ufdVarArr2[i2].b();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                uhpVar.l(uriBuild, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                ueeVar.b.k(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
