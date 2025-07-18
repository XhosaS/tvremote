package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bbw implements bcl {
    public final String a;
    public final String b;
    public final bco c;

    public bbw(String str, String str2, bco bcoVar) {
        this.a = str;
        this.b = str2;
        this.c = bcoVar;
    }

    @Override // defpackage.bcl, defpackage.byo
    public final Object aL() {
        Object obj = bav.a;
        bax.b = true;
        if (bax.c == null) {
            bax.c = new baw();
        }
        Context context = bav.b;
        if (context == null) {
            bax.a();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        Object objF = f(bav.a(context));
        objF.getClass();
        return objF;
    }

    @Override // defpackage.bcl
    public final Object aM(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objF = f(bav.a(applicationContext));
        objF.getClass();
        return objF;
    }

    protected final Object aN(String str) {
        try {
            return c(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }

    protected abstract Object b(Object obj);

    protected abstract Object c(String str);

    protected Object e() {
        return null;
    }

    protected abstract Object f(bav bavVar);
}
