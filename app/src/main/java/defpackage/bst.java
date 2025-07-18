package defpackage;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.katniss.R;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bst extends ContentProvider {
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
            throw new bsv();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (bss.a == null) {
            synchronized (bss.b) {
                if (bss.a == null) {
                    bss.a = new bss(context);
                }
            }
        }
        Class<?> cls = getClass();
        bss bssVar = bss.a;
        try {
            try {
                btt.b("Startup");
                Context context2 = bssVar.e;
                Bundle bundle = context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData;
                String string = context2.getString(R.string.androidx_startup);
                if (bundle != null) {
                    try {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls2 = Class.forName(str);
                                if (bsu.class.isAssignableFrom(cls2)) {
                                    bssVar.d.add(cls2);
                                }
                            }
                        }
                        Iterator it = bssVar.d.iterator();
                        while (it.hasNext()) {
                            bssVar.a((Class) it.next(), hashSet);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new bsv(e);
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new bsv(e2);
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
