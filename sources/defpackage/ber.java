package defpackage;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ber implements bfi {
    public ber(byte[] bArr) {
    }

    @Override // defpackage.bfi
    public final File c(Uri uri) {
        return tk.g(uri);
    }

    @Override // defpackage.bfi
    public final InputStream d(Uri uri) throws beu {
        File fileG = tk.g(uri);
        return new bex(new FileInputStream(fileG), fileG);
    }

    @Override // defpackage.bfi
    public final String e() {
        return "file";
    }

    @Override // defpackage.bfi
    public final boolean f(Uri uri) {
        return tk.g(uri).exists();
    }

    @Override // defpackage.bfi
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileG = tk.g(uri);
        File fileG2 = tk.g(uri2);
        ces.h(fileG2);
        if (!fileG.renameTo(fileG2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.bfi
    public final OutputStream j(Uri uri) throws IOException {
        File fileG = tk.g(uri);
        ces.h(fileG);
        return new bey(new FileOutputStream(fileG), fileG);
    }

    @Override // defpackage.bfi
    public final void k(Uri uri) throws IOException {
        File fileG = tk.g(uri);
        if (fileG.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileG.delete()) {
            return;
        }
        if (!fileG.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    public ber() {
        new ConcurrentHashMap();
    }
}
