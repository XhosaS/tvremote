package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.res.Resources;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class lji {
    public static final tui l = tui.l("com/google/android/apps/play/movies/common/service/pinning/Downloader");
    public static final idy m = new lyl("Error while fetching file size", 4);
    public final lys A;
    public final lsc B;
    protected final lyz C;
    private final mfm a;
    private long b;
    private final ljw c;
    public final idf n;
    protected final lfn o;
    protected final kuh p;
    protected final kug q;
    public final lzh r;
    public final idf s;
    final File t;
    protected final boolean u;
    protected final Resources v;
    final ContentResolver w;
    public final idf x;
    public Integer y;
    public final man z;

    public lji(ljw ljwVar, kuh kuhVar, kug kugVar, File file, mfm mfmVar, lsc lscVar, lys lysVar, lfn lfnVar, idf idfVar, man manVar, lyz lyzVar, SharedPreferences sharedPreferences, ContentResolver contentResolver, Resources resources, idf idfVar2, lzh lzhVar, idf idfVar3) {
        this.B = lscVar;
        this.A = lysVar;
        this.o = lfnVar;
        this.n = idfVar;
        this.c = ljwVar;
        this.p = kuhVar;
        this.q = kugVar;
        this.t = file;
        this.a = mfmVar;
        this.z = manVar;
        this.C = lyzVar;
        this.u = sharedPreferences.getBoolean(krh.ENABLE_SURROUND_SOUND, true);
        this.w = contentResolver;
        this.v = resources;
        this.s = idfVar2;
        this.r = lzhVar;
        this.x = idfVar3;
    }

    protected static final void g(String str, String str2) {
        ((tug) ((tug) l.b()).j("com/google/android/apps/play/movies/common/service/pinning/Downloader", "debug", 420, "Downloader.java")).v("Message: %s", str2 + " [" + Thread.currentThread().getName() + "] " + str);
    }

    protected abstract void b(List list);

    final void d(long j, long j2, boolean z) {
        if (j - this.b > j2 || z) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("download_bytes_downloaded", Long.valueOf(j));
            ktw.u(this.C, this.p, contentValues);
            this.b = j;
            e();
        }
    }

    final void e() {
        ljw ljwVar = this.c;
        if (ljwVar.a()) {
            return;
        }
        ljwVar.i.c(2, ljwVar);
    }

    protected final boolean f() {
        return mfm.b(this.a);
    }
}
