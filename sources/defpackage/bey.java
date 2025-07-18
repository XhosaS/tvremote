package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bey extends bfa implements bes {
    public final FileOutputStream a;
    private final File b;

    public bey(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.bes
    public final File a() {
        return this.b;
    }
}
