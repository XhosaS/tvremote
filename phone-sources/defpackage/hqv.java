package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqv implements hlu {
    private static final String[] a = {"_data"};
    private final Context b;
    private final hqf c;
    private final hqf d;
    private final Uri e;
    private final int f;
    private final int g;
    private final hll h;
    private final Class i;
    private volatile boolean j;
    private volatile hlu k;

    public hqv(Context context, hqf hqfVar, hqf hqfVar2, Uri uri, int i, int i2, hll hllVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = hqfVar;
        this.d = hqfVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = hllVar;
        this.i = cls;
    }

    @Override // defpackage.hlu
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.hlu
    public final void d() {
        hlu hluVar = this.k;
        if (hluVar != null) {
            hluVar.d();
        }
    }

    @Override // defpackage.hlu
    public final void dL() {
        this.j = true;
        hlu hluVar = this.k;
        if (hluVar != null) {
            hluVar.dL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hlu] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) throws Throwable {
        cvi cviVarE;
        Throwable th;
        try {
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                hqf hqfVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(a.ct(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                cviVarE = hqfVar.e(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(a.ct(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri requireOriginal = this.e;
                if (hjs.b(requireOriginal) && requireOriginal.getPathSegments().contains("picker")) {
                    cviVarE = this.d.e(requireOriginal, this.f, this.g, this.h);
                } else {
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    cviVarE = this.d.e(requireOriginal, this.f, this.g, this.h);
                }
            }
            ?? r2 = cviVarE != null ? cviVarE.a : 0;
            if (r2 == 0) {
                hltVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r2;
            if (this.j) {
                dL();
            } else {
                r2.f(hjwVar, hltVar);
            }
        } catch (FileNotFoundException e) {
            hltVar.e(e);
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 1;
    }
}
