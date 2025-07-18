package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxt extends gxu {
    public final String a;
    private final zhe b;
    private final zgr c;
    private final Closeable d;
    private boolean e;
    private zgm f;

    public gxt(zhe zheVar, zgr zgrVar, String str, Closeable closeable) {
        this.b = zheVar;
        this.c = zgrVar;
        this.a = str;
        this.d = closeable;
    }

    @Override // defpackage.gxu
    public final synchronized zgm a() {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        zgm zgmVar = this.f;
        if (zgmVar != null) {
            return zgmVar;
        }
        zhi zhiVar = new zhi(this.c.f(this.b));
        this.f = zhiVar;
        return zhiVar;
    }

    @Override // defpackage.gxu
    public final fki b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        zgm zgmVar = this.f;
        if (zgmVar != null) {
            Bitmap.Config config = hat.a;
            a.af(zgmVar);
        }
        Closeable closeable = this.d;
        if (closeable != null) {
            Bitmap.Config config2 = hat.a;
            a.af(closeable);
        }
    }
}
