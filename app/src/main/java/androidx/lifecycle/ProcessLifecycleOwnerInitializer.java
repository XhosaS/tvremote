package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import defpackage.bce;
import defpackage.bch;
import defpackage.bci;
import defpackage.bdc;
import defpackage.bde;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("bst");
            Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            try {
                Class<?> cls = Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
                cls.getMethod("create", Context.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), getContext());
            } catch (Exception unused) {
                Log.d("ProcessLifecycleG3", "androidx.startup is not available, initializing using ProcessLifecycleOwnerInitializer instead.");
                Context context = getContext();
                if (!bci.a.getAndSet(true)) {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new bch());
                }
                Context context2 = getContext();
                bde bdeVar = bde.a;
                bdeVar.e = new Handler();
                bdeVar.f.e(bce.ON_CREATE);
                ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new bdc(bdeVar));
                return true;
            }
        } catch (ClassNotFoundException unused2) {
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
