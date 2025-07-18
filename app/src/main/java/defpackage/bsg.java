package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsg implements brr {
    public final Context a;
    public final String b;
    public final brn c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final agpc g = new agpn(new agum() { // from class: bsa
        @Override // defpackage.agum
        public final Object a() {
            bsf bsfVar;
            bsg bsgVar = this.a;
            String str = bsgVar.b;
            if (str == null || !bsgVar.d) {
                bsfVar = new bsf(bsgVar.a, str, new bsb(), bsgVar.c, bsgVar.e);
            } else {
                Context context = bsgVar.a;
                File noBackupFilesDir = context.getNoBackupFilesDir();
                noBackupFilesDir.getClass();
                bsfVar = new bsf(context, new File(noBackupFilesDir, str).getAbsolutePath(), new bsb(), bsgVar.c, bsgVar.e);
            }
            bsfVar.setWriteAheadLoggingEnabled(bsgVar.f);
            return bsfVar;
        }
    });

    public bsg(Context context, String str, brn brnVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = brnVar;
        this.d = z;
        this.e = z2;
    }

    private final bsf a() {
        return (bsf) this.g.a();
    }

    @Override // defpackage.brr
    public final brm b() {
        return a().b();
    }

    @Override // defpackage.brr
    public final String c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }

    @Override // defpackage.brr
    public final void d(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}
