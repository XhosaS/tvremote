package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.slice.Slice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class brd extends ContentProvider implements aaz {
    private List d;
    private Context b = null;
    private final Object c = new Object();
    private final String[] a = new String[0];

    @Override // defpackage.aaz
    public final Object a() {
        return new bre(this, this.a);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        super.attachInfo(context, providerInfo);
        if (this.b == null) {
            this.b = context;
            if (providerInfo == null || (str = providerInfo.authority) == null || str.indexOf(59) == -1) {
                return;
            }
            str.split(";");
        }
    }

    public abstract Slice b(Uri uri);

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public Collection c(Uri uri) {
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri canonicalize(Uri uri) {
        return null;
    }

    public final List d() {
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new ArrayList(new brc(getContext()).a.getPinnedSlices());
            }
        }
        return this.d;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public void e(Uri uri) {
        throw null;
    }

    public void f(Uri uri) {
        throw null;
    }

    public abstract void g();

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "vnd.android.slice";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        g();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return null;
    }
}
