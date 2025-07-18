package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import defpackage.dvc;
import defpackage.dvg;
import defpackage.dvh;
import defpackage.dvy;
import defpackage.dwa;
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
            Class.forName("androidx.startup.InitializationProvider");
            Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            Class<?> cls = Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            cls.getMethod("create", Context.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), getContext());
        } catch (ClassNotFoundException | Exception unused) {
            Context context = getContext();
            if (!dvh.a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new dvg());
            }
            Context context2 = getContext();
            dwa dwaVar = dwa.a;
            dwaVar.e = new Handler();
            dwaVar.f.e(dvc.ON_CREATE);
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new dvy(dwaVar));
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
