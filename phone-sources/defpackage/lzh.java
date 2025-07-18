package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzh {
    private static final idf b = new lxq(9);
    public final lev a;
    private final idf c = new lzg(this);
    private final idf d;

    public lzh(lev levVar, idf idfVar) {
        this.a = levVar;
        this.d = idfVar;
    }

    public static final void g(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void h(File... fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    h(file.listFiles());
                }
                file.delete();
            }
        }
    }

    private static final void i(OutputStream outputStream) throws IOException {
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    private static final void j(FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException unused) {
            } finally {
                i(fileOutputStream);
            }
        }
    }

    public final ieg a(Object obj) {
        obj.getClass();
        return ((ieg) this.d.b(obj)).c(this.c);
    }

    public final ieg b(Object obj) {
        return ((ieg) this.d.b(obj)).e(b);
    }

    public final ieg c(Object obj, Object obj2) {
        obj.getClass();
        ieg iegVar = (ieg) this.d.b(obj);
        if (!iegVar.m()) {
            iegVar.p();
            return iegVar;
        }
        File file = (File) iegVar.g();
        File parentFile = file.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return ieg.b(new IOException("unable to create parent directory: ".concat(String.valueOf(String.valueOf(parentFile)))));
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    this.a.b(obj2, fileOutputStream2);
                    j(fileOutputStream2);
                    return kvk.b;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    krd.g("Error creating file.", e);
                    ieg iegVarB = ieg.b(e);
                    j(fileOutputStream);
                    return iegVarB;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    j(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public final ieg d(Object obj) {
        ieg iegVar = (ieg) this.d.b(obj);
        if (iegVar.m()) {
            ((File) iegVar.g()).delete();
            return kvk.b;
        }
        iegVar.p();
        return iegVar;
    }

    public final ieg e(Object obj) {
        ieg iegVar = (ieg) this.d.b(obj);
        if (!iegVar.m()) {
            iegVar.p();
            return iegVar;
        }
        File file = (File) iegVar.g();
        String name = file.getName();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            h(parentFile.listFiles(new lzf(name, 0)));
        }
        return kvk.b;
    }

    public final ieg f(Object obj) {
        ieg iegVar = (ieg) this.d.b(obj);
        if (iegVar.m()) {
            ((File) iegVar.g()).setLastModified(System.currentTimeMillis());
            return kvk.b;
        }
        iegVar.p();
        return iegVar;
    }
}
