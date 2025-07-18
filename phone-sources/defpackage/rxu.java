package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rxu<T> implements ryn<T> {
    public final String a;
    public final String b;
    public final ryq c;

    public rxu(String str, String str2, ryq ryqVar) {
        this.a = str;
        this.b = str2;
        this.c = ryqVar;
    }

    protected abstract Object a(Object obj);

    protected abstract Object b(String str);

    protected Object d() {
        return null;
    }

    protected abstract Object e(rwv rwvVar);

    @Override // defpackage.ryn
    public final Object et(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objE = e(rwv.a(applicationContext));
        objE.getClass();
        return objE;
    }

    protected final Object eu(String str) {
        try {
            return b(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }

    protected boolean g() {
        return false;
    }

    @Override // defpackage.ryn, defpackage.ttm
    public final T get() {
        Context context = rwv.a;
        rwx.b = true;
        if (rwx.c == null) {
            rwx.c = new rww();
        }
        Context context2 = rwv.a;
        if (context2 == null) {
            rwx.a();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        T t = (T) e(rwv.a(context2));
        t.getClass();
        return t;
    }
}
