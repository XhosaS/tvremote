package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogx implements skt {
    public final ttm a;
    private final ska b;

    public ogx(Context context) {
        ska skaVar = new ska();
        Context applicationContext = context.getApplicationContext();
        jzs jzsVar = ohb.a;
        this.a = new ttp(new nwq(applicationContext, ohb.a, nwi.q, nwp.a));
        this.b = skaVar;
    }

    private final ParcelFileDescriptor i(final Uri uri, final int i) {
        return (ParcelFileDescriptor) j("open file", new Callable() { // from class: ogu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                nwq nwqVar = (nwq) ((ttp) this.a.a).a;
                Uri uri2 = uri;
                int i2 = i;
                ohf ohfVar = new ohf(uri2, i2);
                oaf oafVar = new oaf();
                oafVar.a = new nig(ohfVar, 15);
                oafVar.b = i2 == 1 ? new nvg[]{oex.c} : null;
                oafVar.c = 7801;
                return ((ohg) osk.s(nwqVar.r(oafVar.a()))).a;
            }
        });
    }

    private static final Object j(String str, Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof nwk) {
                nwk nwkVar = (nwk) cause;
                String str2 = nwkVar.a.g;
                if (nwkVar.a() == 33500) {
                    throw new FileNotFoundException(a.cz(str2, str, "Unable to ", " because "));
                }
                if (nwkVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException(a.cz(str2, str, "Unable to ", " because "));
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.skt
    public final ska a() {
        return this.b;
    }

    @Override // defpackage.skt
    public final /* synthetic */ File b(Uri uri) throws ske {
        throw new ske("Cannot convert uri to file android ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.skt
    public final InputStream c(Uri uri) {
        return new ogv(i(uri, 0));
    }

    @Override // defpackage.skt
    public final OutputStream d(Uri uri) {
        return new ogw(i(uri, 1));
    }

    @Override // defpackage.skt
    public final String e() {
        return "android";
    }

    @Override // defpackage.skt
    public final void f(Uri uri) throws IOException {
        j("delete file", new grz(this, uri, 3));
    }

    @Override // defpackage.skt
    public final void g(Uri uri, Uri uri2) throws IOException {
        j("rename file", new hbn(this, uri, uri2, 5, (char[]) null));
    }

    @Override // defpackage.skt
    public final boolean h(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorI = i(uri, 0);
            if (parcelFileDescriptorI == null) {
                return true;
            }
            parcelFileDescriptorI.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }
}
