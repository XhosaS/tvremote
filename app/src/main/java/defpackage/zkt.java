package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkt {
    public static final zkr a = new Object() { // from class: zkr
    };

    public static /* synthetic */ Iterable a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            return DesugarCollections.unmodifiableList(Arrays.asList(fileArrListFiles));
        }
        int i = yyk.e;
        return zcg.b;
    }

    public static void b(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }
}
