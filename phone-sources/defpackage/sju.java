package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sju implements skt {
    public final ska a;

    public sju(ska skaVar) {
        this.a = skaVar;
    }

    @Override // defpackage.skt
    public final ska a() {
        return this.a;
    }

    @Override // defpackage.skt
    public final File b(Uri uri) {
        return sij.d(uri);
    }

    @Override // defpackage.skt
    public final InputStream c(Uri uri) throws skb {
        File fileD = sij.d(uri);
        return new skf(new FileInputStream(fileD), fileD);
    }

    @Override // defpackage.skt
    public final OutputStream d(Uri uri) throws IOException {
        File fileD = sij.d(uri);
        tyq.c(fileD);
        return new skg(new FileOutputStream(fileD), fileD);
    }

    @Override // defpackage.skt
    public final String e() {
        return "file";
    }

    @Override // defpackage.skt
    public final void f(Uri uri) throws IOException {
        File fileD = sij.d(uri);
        if (fileD.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileD.delete()) {
            return;
        }
        if (!fileD.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.skt
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileD = sij.d(uri);
        File fileD2 = sij.d(uri2);
        tyq.c(fileD2);
        if (!fileD.renameTo(fileD2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.skt
    public final boolean h(Uri uri) {
        return sij.d(uri).exists();
    }

    public sju() {
        this(new ska());
    }
}
