package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
class dgx implements daw {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public dgx(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.daw
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (TextUtils.isEmpty(string)) {
            davVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            davVar.b(new File(string));
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void cz() {
    }

    @Override // defpackage.daw
    public final void d() {
    }
}
