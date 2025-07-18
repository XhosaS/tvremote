package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hmg implements hlu {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public hmg(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.hlu
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        try {
            Object objB = b(this.a, this.b);
            this.c = objB;
            hltVar.b(objB);
        } catch (FileNotFoundException e) {
            hltVar.e(e);
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 1;
    }

    @Override // defpackage.hlu
    public final void dL() {
    }
}
