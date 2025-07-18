package com.google.android.apps.play.movies.common.service.pinning;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import defpackage.jwq;
import defpackage.kgu;
import defpackage.lfn;
import defpackage.lie;
import defpackage.lix;
import defpackage.lyz;
import defpackage.wae;
import defpackage.xce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApiContentProvider extends ContentProvider {
    public lfn a;
    public lie b;
    public lyz c;
    private boolean d = false;

    private final synchronized boolean a() {
        if (this.d) {
            return true;
        }
        if (!(getContext().getApplicationContext() instanceof xce)) {
            return false;
        }
        wae.A(this);
        this.d = true;
        return true;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        PackageManager packageManager;
        String[] packagesForUid;
        String string;
        if (!a() || (packagesForUid = (packageManager = getContext().getPackageManager()).getPackagesForUid(Binder.getCallingUid())) == null) {
            return null;
        }
        String strX = "";
        for (String str3 : packagesForUid) {
            strX = kgu.x(str3, packageManager);
            if (!TextUtils.isEmpty(strX)) {
                break;
            }
        }
        this.b.w(strX);
        if (TextUtils.isEmpty(strX) || this.a.cW() || !"/movies/downloads".equals(uri.getEncodedPath())) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("authAccount");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        SQLiteDatabase sQLiteDatabaseB = this.c.b();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"eidr", "download_status", "title"});
        Object[] objArr = new Object[3];
        Cursor cursorQuery = sQLiteDatabaseB.query("purchased_assets, assets ON asset_type = 6 AND assets_type = 6 AND assets_id = asset_id", lix.a, "account = ? AND pinning_status NOT NULL AND title_eidr_id NOT NULL", new String[]{queryParameter}, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string2 = cursorQuery.getString(0);
                if (jwq.P(string2)) {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append((CharSequence) string2, 0, 2);
                    sb.append('.');
                    sb.append((CharSequence) string2, 2, 6);
                    sb.append('/');
                    for (int i = 0; i < 5; i++) {
                        int i2 = i * 4;
                        sb.append((CharSequence) string2, i2 + 6, i2 + 10);
                        sb.append('-');
                    }
                    sb.append((CharSequence) string2, 26, 27);
                    string = sb.toString();
                } else {
                    string = null;
                }
                objArr[0] = string;
                int i3 = cursorQuery.getInt(1);
                int i4 = 4;
                if (i3 != 1) {
                    i4 = i3 != 3 ? i3 != 4 ? 1 : 3 : 2;
                }
                objArr[1] = Integer.valueOf(i4);
                objArr[2] = cursorQuery.getString(2);
                matrixCursor.addRow(objArr);
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
