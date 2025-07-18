package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgm implements daw {
    private final File a;
    private final dgn b;
    private Object c;

    public dgm(File file, dgn dgnVar) {
        this.a = file;
        this.b = dgnVar;
    }

    @Override // defpackage.daw
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.daw
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        try {
            Object objB = this.b.b(this.a);
            this.c = objB;
            davVar.b(objB);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e);
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
