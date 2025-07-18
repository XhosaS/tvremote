package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
class x implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
