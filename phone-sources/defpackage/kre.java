package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kre {
    private final File a;
    private final String b = "log_";
    private int c;
    private File d;
    private OutputStream e;

    public kre(File file) throws IOException {
        this.a = file;
        long jLastModified = 0;
        int i = 0;
        int i2 = -1;
        while (true) {
            File fileC = c(i);
            if (!fileC.exists()) {
                break;
            }
            if (i >= 10) {
                fileC.delete();
            } else if (fileC.lastModified() > jLastModified) {
                jLastModified = fileC.lastModified();
                i2 = i;
            }
            i++;
        }
        d(i2 != -1 ? i2 : 0, true);
    }

    private final File c(int i) {
        return new File(this.a, this.b + i);
    }

    private final void d(int i, boolean z) throws IOException {
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            outputStream.close();
            long jLastModified = this.d.lastModified();
            if (jLastModified > 0) {
                this.d.setLastModified(jLastModified - 1);
            }
        }
        this.c = i;
        this.d = c(i);
        this.e = new FileOutputStream(this.d, z);
    }

    public final synchronized void a(String str) {
        byte[] bytes = str.getBytes(ksg.a);
        int length = bytes.length;
        if (length > 5000) {
            return;
        }
        if (this.d.length() + length > 5000) {
            d((this.c + 1) % 10, false);
        }
        this.e.write(bytes);
        this.e.flush();
    }

    public final synchronized void b(Writer writer) {
        char[] cArr = new char[1024];
        for (int i = 1; i <= 10; i++) {
            File fileC = c((this.c + i) % 10);
            if (fileC.exists()) {
                FileReader fileReader = new FileReader(fileC);
                while (true) {
                    try {
                        int i2 = fileReader.read(cArr, 0, 1024);
                        if (i2 == -1) {
                            break;
                        } else {
                            writer.write(cArr, 0, i2);
                        }
                    } finally {
                    }
                }
                fileReader.close();
            }
        }
    }
}
