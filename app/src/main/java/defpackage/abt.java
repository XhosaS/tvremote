package defpackage;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abt {
    public final String a;
    public final HashMap b = new HashMap();

    public abt(String str) {
        this.a = str;
    }

    public final File a(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Unable to find path from root: ".concat(String.valueOf(uri)));
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.b.get(strDecode);
        if (file == null) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (b(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            file2.toString();
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    public final boolean b(String str, String str2) {
        return FileProvider.a(str).startsWith(FileProvider.a(str2) + '/');
    }
}
