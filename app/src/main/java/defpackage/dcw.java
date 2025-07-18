package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dcw {
    private volatile dep a;
    private final deu b;

    public dcw(deu deuVar) {
        this.b = deuVar;
    }

    public final dep a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    dew dewVar = this.b.a;
                    File cacheDir = dewVar.a.getCacheDir();
                    dev devVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, dewVar.b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        devVar = new dev(file);
                    }
                    this.a = devVar;
                }
                if (this.a == null) {
                    this.a = new deq();
                }
            }
        }
        return this.a;
    }
}
