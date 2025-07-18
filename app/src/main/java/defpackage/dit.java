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
final class dit implements daw {
    private static final String[] a = {"_data"};
    private final Context b;
    private final dhe c;
    private final dhe d;
    private final Uri e;
    private final int f;
    private final int g;
    private final dan h;
    private final Class i;
    private volatile boolean j;
    private volatile daw k;

    public dit(Context context, dhe dheVar, dhe dheVar2, Uri uri, int i, int i2, dan danVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = dheVar;
        this.d = dheVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = danVar;
        this.i = cls;
    }

    @Override // defpackage.daw
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.daw
    public final void cz() {
        this.j = true;
        daw dawVar = this.k;
        if (dawVar != null) {
            dawVar.cz();
        }
    }

    @Override // defpackage.daw
    public final void d() {
        daw dawVar = this.k;
        if (dawVar != null) {
            dawVar.d();
        }
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) throws Throwable {
        dhd dhdVarA;
        Throwable th;
        try {
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                dhe dheVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(a.p(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                dhdVarA = dheVar.a(file, this.f, this.g, this.h);
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
                    throw new FileNotFoundException(a.p(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri requireOriginal = this.e;
                if (dbn.a(requireOriginal) && requireOriginal.getPathSegments().contains("picker")) {
                    dhdVarA = this.d.a(requireOriginal, this.f, this.g, this.h);
                } else {
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    dhdVarA = this.d.a(requireOriginal, this.f, this.g, this.h);
                }
            }
            daw dawVar = dhdVarA != null ? dhdVarA.c : null;
            if (dawVar == null) {
                davVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = dawVar;
            if (this.j) {
                cz();
            } else {
                dawVar.f(cynVar, davVar);
            }
        } catch (FileNotFoundException e) {
            davVar.e(e);
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }
}
