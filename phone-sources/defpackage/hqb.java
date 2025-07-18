package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqb implements hlu {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public hqb(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.hlu
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (TextUtils.isEmpty(string)) {
            hltVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            hltVar.b(new File(string));
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 1;
    }

    @Override // defpackage.hlu
    public final void d() {
    }

    @Override // defpackage.hlu
    public final void dL() {
    }
}
