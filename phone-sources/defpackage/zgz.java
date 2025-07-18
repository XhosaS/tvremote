package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zgz extends zgr {
    @Override // defpackage.zgr
    public final zhm a(zhe zheVar) {
        return zhb.b(zheVar.b(), false);
    }

    @Override // defpackage.zgr
    public final List b(zhe zheVar) throws IOException {
        File fileB = zheVar.b();
        String[] list = fileB.list();
        if (list == null) {
            if (fileB.exists()) {
                Objects.toString(zheVar);
                throw new IOException("failed to list ".concat(zheVar.toString()));
            }
            Objects.toString(zheVar);
            throw new FileNotFoundException("no such file: ".concat(zheVar.toString()));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(zheVar.g(str));
        }
        yfm.B(arrayList);
        return arrayList;
    }

    @Override // defpackage.zgr
    public final zgp c(zhe zheVar) {
        return new zgp(new RandomAccessFile(zheVar.b(), "r"));
    }

    @Override // defpackage.zgr
    public zgq e(zhe zheVar) {
        File fileB = zheVar.b();
        boolean zIsFile = fileB.isFile();
        boolean zIsDirectory = fileB.isDirectory();
        long jLastModified = fileB.lastModified();
        long length = fileB.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0) {
            if (length != 0) {
                jLastModified = 0;
            } else {
                if (!fileB.exists()) {
                    return null;
                }
                jLastModified = 0;
                length = 0;
            }
        }
        return new zgq(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // defpackage.zgr
    public final zho f(zhe zheVar) {
        File fileB = zheVar.b();
        Logger logger = zhb.a;
        return new zgy(new FileInputStream(fileB), zhq.j);
    }

    @Override // defpackage.zgr
    public void g(zhe zheVar, zhe zheVar2) throws IOException {
        if (!zheVar.b().renameTo(zheVar2.b())) {
            throw new IOException(a.ck(zheVar2, zheVar, "failed to move ", " to "));
        }
    }

    @Override // defpackage.zgr
    public final zhm j(zhe zheVar) {
        return zhb.b(zheVar.b(), true);
    }

    @Override // defpackage.zgr
    public final void k(zhe zheVar) throws IOException {
        if (zheVar.b().mkdir()) {
            return;
        }
        zgq zgqVarE = e(zheVar);
        if (zgqVarE == null || !zgqVarE.b) {
            Objects.toString(zheVar);
            throw new IOException("failed to create directory: ".concat(zheVar.toString()));
        }
    }

    @Override // defpackage.zgr
    public final void l(zhe zheVar) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileB = zheVar.b();
        if (fileB.delete() || !fileB.exists()) {
            return;
        }
        Objects.toString(zheVar);
        throw new IOException("failed to delete ".concat(zheVar.toString()));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
