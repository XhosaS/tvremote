package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufc implements uhp {
    public final uft a;

    public ufc(uft uftVar) {
        this.a = uftVar;
    }

    @Override // defpackage.uhp
    public final long a(Uri uri) throws ufu {
        File fileA = ufa.a.a(uri);
        if (fileA.isDirectory()) {
            return 0L;
        }
        return fileA.length();
    }

    @Override // defpackage.uhp
    public final uft b() {
        return this.a;
    }

    @Override // defpackage.uhp
    public final File c(Uri uri) {
        return ufa.a.a(uri);
    }

    @Override // defpackage.uhp
    public final InputStream d(Uri uri) throws ufu {
        File fileA = ufa.a.a(uri);
        return new ufy(new FileInputStream(fileA), fileA);
    }

    @Override // defpackage.uhp
    public final OutputStream e(Uri uri) throws IOException {
        File fileA = ufa.a.a(uri);
        zkt.b(fileA);
        return new ufz(new FileOutputStream(fileA, true), fileA);
    }

    @Override // defpackage.uhp
    public final OutputStream f(Uri uri) throws IOException {
        File fileA = ufa.a.a(uri);
        zkt.b(fileA);
        return new ufz(new FileOutputStream(fileA), fileA);
    }

    @Override // defpackage.uhp
    public final Iterable g(Uri uri) throws IOException {
        File fileA = ufa.a.a(uri);
        if (!fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] fileArrListFiles = fileA.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
            int i = yyk.e;
            yyf yyfVar = new yyf(4);
            builderPath.path(absolutePath);
            arrayList.add(uez.a(builderPath, yyfVar));
        }
        return arrayList;
    }

    @Override // defpackage.uhp
    public final String h() {
        return "file";
    }

    @Override // defpackage.uhp
    public final void i(Uri uri) throws IOException {
        if (!ufa.a.a(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.uhp
    public final void j(Uri uri) throws IOException {
        File fileA = ufa.a.a(uri);
        if (!fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!fileA.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.uhp
    public final void k(Uri uri) throws IOException {
        File fileA = ufa.a.a(uri);
        if (fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileA.delete()) {
            return;
        }
        if (!fileA.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.uhp
    public final void l(Uri uri, Uri uri2) throws IOException {
        ufa ufaVar = ufa.a;
        File fileA = ufaVar.a(uri);
        File fileA2 = ufaVar.a(uri2);
        zkt.b(fileA2);
        if (!fileA.renameTo(fileA2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.uhp
    public final boolean m(Uri uri) {
        return ufa.a.a(uri).exists();
    }

    @Override // defpackage.uhp
    public final boolean n(Uri uri) {
        return ufa.a.a(uri).isDirectory();
    }

    public ufc() {
        this.a = new uft();
    }
}
