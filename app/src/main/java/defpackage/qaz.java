package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qaz implements uef {
    private final Uri a;

    public qaz(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws IOException {
        ueg uegVar = ueeVar.a;
        try {
            uhi uhiVar = new uhi();
            uhiVar.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(uhiVar.a(ueeVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return null;
                    }
                    String name = nextEntry.getName();
                    if (name.contains("..")) {
                        for (File file = new File(name); file != null; file = file.getParentFile()) {
                            if (file.getName().equals("..")) {
                                throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                            }
                        }
                    }
                    Uri uriBuild = this.a.buildUpon().appendPath(name).build();
                    if (nextEntry.isDirectory()) {
                        uegVar.d(uriBuild);
                    } else {
                        OutputStream outputStream = (OutputStream) uegVar.c(uriBuild, new uhn());
                        try {
                            zkn.a(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            uegVar.j(this.a);
            throw e;
        }
    }
}
