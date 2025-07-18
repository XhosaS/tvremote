package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bex extends bez implements bes {
    private final FileInputStream a;
    private final File b;

    public bex(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.bes
    public final File a() {
        return this.b;
    }
}
