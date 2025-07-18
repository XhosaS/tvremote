package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.videos.R;
import defpackage.gij;
import defpackage.gik;
import defpackage.gil;
import defpackage.gli;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new gil();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (gij.a == null) {
            synchronized (gij.b) {
                if (gij.a == null) {
                    gij.a = new gij(context);
                }
            }
        }
        Class<?> cls = getClass();
        gij gijVar = gij.a;
        try {
            try {
                gli.n("Startup");
                Context context2 = gijVar.e;
                Bundle bundle = context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData;
                String string = context2.getString(R.string.androidx_startup);
                if (bundle != null) {
                    try {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls2 = Class.forName(str);
                                if (gik.class.isAssignableFrom(cls2)) {
                                    gijVar.d.add(cls2);
                                }
                            }
                        }
                        Iterator it = gijVar.d.iterator();
                        while (it.hasNext()) {
                            gijVar.a((Class) it.next(), hashSet);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new gil(e);
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new gil(e2);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
