package com.google.android.apps.googletv.app.device.virtualremote.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import defpackage.ith;
import defpackage.itk;
import defpackage.iua;
import defpackage.iwu;
import defpackage.tug;
import defpackage.tui;
import defpackage.wae;
import defpackage.xce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VirtualRemoteCapableDeviceProvider extends ContentProvider {
    private static final tui b = tui.l("com/google/android/apps/googletv/app/device/virtualremote/contentprovider/VirtualRemoteCapableDeviceProvider");
    public itk a;

    private final synchronized itk a() {
        if (this.a == null) {
            Context context = getContext();
            if ((context != null ? context.getApplicationContext() : null) instanceof xce) {
                wae.A(this);
            }
        }
        return this.a;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
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
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ith ithVarE;
        uri.getClass();
        itk itkVarA = a();
        if (itkVarA == null) {
            ((tug) b.g().j("com/google/android/apps/googletv/app/device/virtualremote/contentprovider/VirtualRemoteCapableDeviceProvider", "query", 66, "VirtualRemoteCapableDeviceProvider.kt")).s("No MediaDeviceController injected.");
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"VIRTUAL_REMOTE_CAPABLE_DEVICE_CONNECTED_COLUMN_NAME"});
        iwu iwuVar = null;
        if (itkVarA != null && (ithVarE = itkVarA.e()) != null) {
            iwuVar = ((iua) ithVarE).j;
        }
        matrixCursor.addRow(new Integer[]{Integer.valueOf(iwuVar != null ? 1 : 0)});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }
}
