package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dbi implements daw {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public dbi(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.daw
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        try {
            Object objB = b(this.a, this.b);
            this.c = objB;
            davVar.b(objB);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            davVar.e(e);
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void cz() {
    }
}
