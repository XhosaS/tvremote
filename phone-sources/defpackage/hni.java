package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hni {
    private volatile hos a;
    private final hfx b;

    public hni(hfx hfxVar) {
        this.b = hfxVar;
    }

    public final hos a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.a;
                    File cacheDir = ((Context) ((kmf) obj).b).getCacheDir();
                    hou houVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, (String) ((kmf) obj).a);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        houVar = new hou(file);
                    }
                    this.a = houVar;
                }
                if (this.a == null) {
                    this.a = new hot();
                }
            }
        }
        return this.a;
    }
}
