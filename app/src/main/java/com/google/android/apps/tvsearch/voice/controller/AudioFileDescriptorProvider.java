package com.google.android.apps.tvsearch.voice.controller;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.aehg;
import defpackage.agow;
import defpackage.agvy;
import defpackage.jbt;
import defpackage.jnr;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AudioFileDescriptorProvider extends ContentProvider {
    private agow a;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return "audio";
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
            throw new IllegalStateException("AudioFileDescriptorProvider is not attached to a context");
        }
        Object objA = aehg.a(context.getApplicationContext(), jbt.class);
        objA.getClass();
        this.a = ((jbt) objA).gV();
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        uri.getClass();
        str.getClass();
        if (!agvy.c(str, "r")) {
            throw new FileNotFoundException("Only READ mode supported");
        }
        agow agowVar = this.a;
        if (agowVar == null) {
            agvy.b("speechRecognitionServiceHandler");
            agowVar = null;
        }
        ParcelFileDescriptor parcelFileDescriptorB = ((jnr) agowVar.a()).b(uri);
        if (parcelFileDescriptorB != null) {
            return parcelFileDescriptorB;
        }
        throw new FileNotFoundException("File not found for the given URI");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }
}
