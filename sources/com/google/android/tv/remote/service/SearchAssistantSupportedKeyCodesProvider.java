package com.google.android.tv.remote.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import defpackage.bnf;
import defpackage.btp;
import defpackage.cbj;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchAssistantSupportedKeyCodesProvider extends ContentProvider {
    static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.google.android.tv.remote.service.SearchAssistantSupportedKeyCodesProvider", "keycodes", 1);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
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
        String callingPackage = getCallingPackage();
        if (!Objects.equals(callingPackage, "com.google.android.katniss") && !getContext().getPackageName().equals(callingPackage)) {
            throw new SecurityException("App does not have permission to use this authority: ".concat(String.valueOf(uri.getAuthority())));
        }
        if (strArr == null || !btp.a.containsAll(Arrays.asList(strArr))) {
            throw new IllegalArgumentException("Invalid or null projection: ".concat(String.valueOf(String.valueOf(uri))));
        }
        if (a.match(uri) != 1) {
            throw new IllegalArgumentException("Unknown query uri: ".concat(String.valueOf(String.valueOf(uri))));
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        cbj cbjVarListIterator = bnf.a.listIterator();
        int i = 1;
        while (cbjVarListIterator.hasNext()) {
            Integer num = (Integer) cbjVarListIterator.next();
            num.intValue();
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), num});
            i++;
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
