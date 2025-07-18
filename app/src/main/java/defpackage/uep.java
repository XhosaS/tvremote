package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uep implements uhp {
    private final AssetManager a;

    public uep(ueo ueoVar) {
        this.a = ueoVar.a.getAssets();
    }

    private final String o(Uri uri) {
        yqw.B("asset".equals(uri.getScheme()), "scheme must be 'asset'");
        return uri.getPath().substring(1);
    }

    @Override // defpackage.uhp
    public final long a(Uri uri) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = this.a.openFd(o(uri));
        try {
            long length = assetFileDescriptorOpenFd.getLength();
            if (assetFileDescriptorOpenFd != null) {
                assetFileDescriptorOpenFd.close();
            }
            return length;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.uhp
    public final /* synthetic */ uft b() {
        return uho.a(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ File c(Uri uri) {
        return uho.b(this, uri);
    }

    @Override // defpackage.uhp
    public final InputStream d(Uri uri) {
        return this.a.open(o(uri));
    }

    @Override // defpackage.uhp
    public final /* synthetic */ OutputStream e(Uri uri) {
        return uho.g(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ OutputStream f(Uri uri) throws ufx {
        throw new ufx("openForWrite not supported by asset");
    }

    @Override // defpackage.uhp
    public final /* synthetic */ Iterable g(Uri uri) {
        return uho.c(this);
    }

    @Override // defpackage.uhp
    public final String h() {
        return "asset";
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void i(Uri uri) {
        uho.d(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void j(Uri uri) {
        uho.e(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void k(Uri uri) throws ufx {
        throw new ufx("deleteFile not supported by asset");
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void l(Uri uri, Uri uri2) {
        uho.h(this);
    }

    @Override // defpackage.uhp
    public final boolean m(Uri uri) throws IOException {
        try {
            InputStream inputStreamD = d(uri);
            if (inputStreamD == null) {
                return true;
            }
            inputStreamD.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.uhp
    public final boolean n(Uri uri) {
        return false;
    }
}
