package com.google.android.apps.tvsearch.providers.launcher;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.katniss.R;
import defpackage.aehg;
import defpackage.agvy;
import defpackage.ahbt;
import defpackage.ahkr;
import defpackage.gph;
import defpackage.gtu;
import defpackage.hcf;
import defpackage.hcg;
import defpackage.hch;
import defpackage.icg;
import defpackage.icj;
import defpackage.iye;
import defpackage.men;
import defpackage.zyd;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WidgetInfoProvider extends ContentProvider {
    private static final UriMatcher c;
    public ContentResolver a;
    public gtu b;
    private Supplier d;
    private ahbt e;
    private gph f;
    private icj g;
    private iye h;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.katniss.search.WidgetInfoProvider", "state", 1);
        uriMatcher.addURI("com.google.android.katniss.search.WidgetInfoProvider", "suggestions", 2);
        c = uriMatcher;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objA = aehg.a(context.getApplicationContext(), hcf.class);
        objA.getClass();
        hcf hcfVar = (hcf) objA;
        this.d = hcfVar.gJ();
        this.a = hcfVar.i();
        this.e = hcfVar.gX();
        this.f = hcfVar.bj();
        this.b = hcfVar.bu();
        this.g = hcfVar.bY();
        this.h = hcfVar.hs();
        gph gphVar = this.f;
        gtu gtuVar = null;
        if (gphVar == null) {
            agvy.b("experience");
            gphVar = null;
        }
        if (gphVar != gph.b) {
            gph gphVar2 = this.f;
            if (gphVar2 == null) {
                agvy.b("experience");
                gphVar2 = null;
            }
            if (gphVar2 != gph.c) {
                return true;
            }
        }
        gtu gtuVar2 = this.b;
        if (gtuVar2 == null) {
            agvy.b("katnissAccountManager");
        } else {
            gtuVar = gtuVar2;
        }
        gtuVar.q(new hcg(this));
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        uri.getClass();
        int iMatch = c.match(uri);
        ContentResolver contentResolver = null;
        if (iMatch != 1) {
            if (iMatch != 2) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"suggestion"});
            iye iyeVar = this.h;
            if (iyeVar == null) {
                agvy.b("launcherSuggestionsDataManager");
                iyeVar = null;
            }
            String languageTag = Locale.getDefault().toLanguageTag();
            languageTag.getClass();
            synchronized (iyeVar.e) {
                String[] strArr4 = iyeVar.c;
                if (strArr4 == null || strArr4.length == 0 || !iyeVar.d.equals(languageTag)) {
                    iyeVar.c = iyeVar.a.getResources().getStringArray(R.array.search_query_hints);
                }
                strArr3 = iyeVar.c;
            }
            for (String str3 : strArr3) {
                matrixCursor.addRow(new String[]{str3});
            }
            ContentResolver contentResolver2 = this.a;
            if (contentResolver2 == null) {
                agvy.b("contentResolver");
            } else {
                contentResolver = contentResolver2;
            }
            matrixCursor.setNotificationUri(contentResolver, uri);
            return matrixCursor;
        }
        ahbt ahbtVar = this.e;
        if (ahbtVar == null) {
            agvy.b("coroutineScope");
            ahbtVar = null;
        }
        zyd zydVarC = ahkr.c(ahbtVar, 0, new hch(this, null), 3);
        men.a();
        String str4 = (String) zydVarC.get();
        icj icjVar = this.g;
        if (icjVar == null) {
            agvy.b("katnissSettingReader");
            icjVar = null;
        }
        boolean zContains = icjVar.c(icg.m).contains(str4);
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"assistant_icon"});
        if (zContains) {
            Context context = getContext();
            if (context == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Resources resources = context.getResources();
            Supplier supplier = this.d;
            if (supplier == null) {
                agvy.b("assistantSupported");
                supplier = null;
            }
            matrixCursor2.addRow(new String[]{resources.getResourceEntryName(true != ((Boolean) supplier.get()).booleanValue() ? R.drawable.ic_mic : R.drawable.opa_logo)});
        }
        ContentResolver contentResolver3 = this.a;
        if (contentResolver3 == null) {
            agvy.b("contentResolver");
        } else {
            contentResolver = contentResolver3;
        }
        matrixCursor2.setNotificationUri(contentResolver, uri);
        return matrixCursor2;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }
}
