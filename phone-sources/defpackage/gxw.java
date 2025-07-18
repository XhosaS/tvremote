package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxw extends gxu {
    private final File a;
    private boolean b;
    private final zgm c;
    private final fki d;

    public gxw(zgm zgmVar, File file, fki fkiVar) {
        this.a = file;
        this.d = fkiVar;
        this.c = zgmVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    @Override // defpackage.gxu
    public final synchronized zgm a() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        return this.c;
    }

    @Override // defpackage.gxu
    public final fki b() {
        return this.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b = true;
        Bitmap.Config config = hat.a;
        a.af(this.c);
    }
}
