package com.google.android.apps.googletv.app.image;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.iyz;
import defpackage.tug;
import defpackage.tui;
import defpackage.wae;
import defpackage.xce;
import defpackage.yfm;
import defpackage.yhp;
import defpackage.yks;
import defpackage.ylh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PosterSharingContentProvider extends ContentProvider {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/image/PosterSharingContentProvider");
    private static final String[] c = {"_display_name", "_size"};
    public iyz b;

    private final synchronized iyz a() {
        if (this.b == null) {
            Context context = getContext();
            if ((context != null ? context.getApplicationContext() : null) instanceof xce) {
                wae.A(this);
            }
        }
        return this.b;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return "image/*";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        uri.getClass();
        str.getClass();
        if (ParcelFileDescriptor.parseMode(str) != 268435456) {
            ((tug) a.f().j("com/google/android/apps/googletv/app/image/PosterSharingContentProvider", "openFile", 67, "PosterSharingContentProvider.kt")).B("Attempt to open a file in a mode other than read mode. uri=%s, mode=%s", uri, str);
            throw new SecurityException("Only Read access granted in this content provider.");
        }
        iyz iyzVarA = a();
        if (iyzVarA == null) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        File fileB = encodedPath != null ? iyzVarA.b(encodedPath) : null;
        if (fileB != null) {
            return ParcelFileDescriptor.open(fileB, 268435456);
        }
        Objects.toString(uri);
        throw new FileNotFoundException("No data found associated with ".concat(uri.toString()));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        iyz iyzVarA;
        uri.getClass();
        String encodedPath = uri.getEncodedPath();
        String strF = encodedPath != null ? ylh.F(encodedPath, "/") : null;
        File fileB = (strF == null || (iyzVarA = a()) == null) ? null : iyzVarA.b(strF);
        if (strArr == null) {
            strArr = c;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str3 : strArr) {
            if (yfm.bd(c, str3)) {
                arrayList.add(str3);
            }
        }
        yhp yhpVar = new yhp((byte[]) null);
        for (String str4 : arrayList) {
            if (yks.e(str4, "_display_name")) {
                yhpVar.add(strF == null ? "" : strF);
            } else if (yks.e(str4, "_size")) {
                yhpVar.add(Long.valueOf(fileB != null ? fileB.length() : -1L));
            }
        }
        List listO = yfm.o(yhpVar);
        MatrixCursor matrixCursor = new MatrixCursor((String[]) arrayList.toArray(new String[0]), 1);
        matrixCursor.addRow(listO);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }
}
