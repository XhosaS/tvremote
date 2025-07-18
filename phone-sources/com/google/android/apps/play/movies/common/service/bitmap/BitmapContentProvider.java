package com.google.android.apps.play.movies.common.service.bitmap;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.icy;
import defpackage.idf;
import defpackage.idy;
import defpackage.ieg;
import defpackage.krd;
import defpackage.lbj;
import defpackage.lyl;
import defpackage.wae;
import defpackage.xce;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BitmapContentProvider extends ContentProvider {
    private static final UriMatcher g;
    private static final idy h = new lyl("Exception getting icon bytes for ", 4);
    public ExecutorService a;
    public idf b;
    public idf c;
    public idf d;
    public idf e;
    public idf f;
    private idf i;
    private boolean j = false;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        g = uriMatcher;
        uriMatcher.addURI("com.google.android.videos.bitmap", "poster", 0);
        uriMatcher.addURI("com.google.android.videos.bitmap", "showposter", 1);
        uriMatcher.addURI("com.google.android.videos.bitmap", "showbanner", 2);
        uriMatcher.addURI("com.google.android.videos.bitmap", "screenshot", 3);
    }

    private final synchronized boolean a() {
        if (this.j) {
            return true;
        }
        if (!(getContext().getApplicationContext() instanceof xce)) {
            return false;
        }
        wae.A(this);
        this.i = new lbj(this.a, 17);
        this.j = true;
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
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (!a()) {
            return null;
        }
        int iMatch = g.match(uri);
        if (iMatch >= 0) {
            idf icyVar = iMatch != 0 ? iMatch != 1 ? iMatch != 2 ? iMatch != 3 ? new icy(ieg.a) : this.f : this.e : this.d : this.c;
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter != null) {
                ieg iegVarC = ((ieg) icyVar.b(queryParameter)).c(this.i);
                if (iegVarC.m()) {
                    return (ParcelFileDescriptor) iegVarC.g();
                }
                String queryParameter2 = uri.getQueryParameter("uri");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    ieg iegVarC2 = ((ieg) this.b.b(Uri.parse(queryParameter2))).c(this.i);
                    iegVarC2.n(h);
                    return (ParcelFileDescriptor) iegVarC2.c;
                }
            }
        }
        krd.f("Exception getting icon bytes for ".concat(String.valueOf(String.valueOf(uri))));
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
