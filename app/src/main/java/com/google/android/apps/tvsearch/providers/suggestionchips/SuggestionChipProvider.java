package com.google.android.apps.tvsearch.providers.suggestionchips;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.tvsearch.providers.suggestionchips.SuggestionChipProvider;
import defpackage.aehg;
import defpackage.hei;
import defpackage.iyh;
import defpackage.iyj;
import defpackage.iyu;
import defpackage.izq;
import defpackage.zyu;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuggestionChipProvider extends ContentProvider {
    private static final UriMatcher e;
    public iyh a;
    public iyj b;
    public iyu c;
    public izq d;
    private Handler f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.google.android.apps.tvsearch.providers.suggestionchips.SuggestionChipProvider", "suggestion_chip", 1);
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
        hei heiVar = (hei) aehg.a(getContext().getApplicationContext(), hei.class);
        this.a = heiVar.cl();
        this.b = heiVar.cm();
        this.c = heiVar.ht();
        this.d = heiVar.hL();
        this.f = new Handler(Looper.getMainLooper());
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (e.match(uri) != 1) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"suggestion_chip"});
        final String queryParameter = uri.getQueryParameter("mid");
        if (!TextUtils.isEmpty(queryParameter)) {
            final zyu zyuVar = new zyu();
            this.f.post(new Runnable() { // from class: heh
                @Override // java.lang.Runnable
                public final void run() {
                    SuggestionChipProvider suggestionChipProvider = this.a;
                    heg hegVar = new heg(suggestionChipProvider, zyuVar);
                    String str3 = queryParameter;
                    suggestionChipProvider.a.c(hegVar, str3);
                    iyj iyjVar = suggestionChipProvider.b;
                    izq izqVar = suggestionChipProvider.d;
                    iyu iyuVar = suggestionChipProvider.c;
                    xds xdsVar = xds.a;
                    xdq xdqVar = new xdq();
                    abmr abmrVar = abmr.a;
                    abmo abmoVar = new abmo();
                    abmf abmfVar = abmf.a;
                    abmd abmdVar = new abmd();
                    if ((abmdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        abmdVar.y();
                    }
                    abmf abmfVar2 = (abmf) abmdVar.b;
                    abmfVar2.b |= 1;
                    abmfVar2.c = "com.google.android.apps.tv.launcherx";
                    if ((abmoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        abmoVar.y();
                    }
                    abmr abmrVar2 = (abmr) abmoVar.b;
                    abmf abmfVar3 = (abmf) abmdVar.v();
                    abmfVar3.getClass();
                    abmrVar2.e = abmfVar3;
                    abmrVar2.b |= 16;
                    abmt abmtVar = abmt.a;
                    abms abmsVar = new abms();
                    if ((abmsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        abmsVar.y();
                    }
                    abmt abmtVar2 = (abmt) abmsVar.b;
                    str3.getClass();
                    abmtVar2.b |= 1;
                    abmtVar2.c = str3;
                    if ((abmoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        abmoVar.y();
                    }
                    abmr abmrVar3 = (abmr) abmoVar.b;
                    abmt abmtVar3 = (abmt) abmsVar.v();
                    abmtVar3.getClass();
                    abxs abxsVar = abmrVar3.f;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        abmrVar3.f = abxsVar.d(size + size);
                    }
                    abmrVar3.f.add(abmtVar3);
                    if ((xdqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xdqVar.y();
                    }
                    xds xdsVar2 = (xds) xdqVar.b;
                    abmr abmrVar4 = (abmr) abmoVar.v();
                    abmrVar4.getClass();
                    xdsVar2.c = abmrVar4;
                    xdsVar2.b |= 1;
                    Optional optionalOf = Optional.of((xds) xdqVar.v());
                    xtv xtvVar = xtv.OPA_TV_PERSON_ENTITY_SUGGESTIONS;
                    Duration duration = iro.a;
                    iyjVar.c(izqVar, iyuVar, null, optionalOf, xtvVar, iro.a);
                }
            });
            try {
                for (String str3 : (String[]) zyuVar.t(2L, TimeUnit.SECONDS)) {
                    matrixCursor.addRow(new Object[]{str3});
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return null;
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
