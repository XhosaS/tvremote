package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zgr implements Closeable {
    public static final zgr a;

    static {
        zgr zgzVar;
        try {
            Class.forName("java.nio.file.Files");
            zgzVar = new zha();
        } catch (ClassNotFoundException unused) {
            zgzVar = new zgz();
        }
        a = zgzVar;
        String str = zhe.a;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        wcq.az(property);
        ClassLoader classLoader = zhw.class.getClassLoader();
        classLoader.getClass();
        new zhw(classLoader, zgzVar);
    }

    public abstract zhm a(zhe zheVar);

    public abstract List b(zhe zheVar);

    public abstract zgp c(zhe zheVar);

    public final zgq d(zhe zheVar) throws FileNotFoundException {
        zheVar.getClass();
        zgq zgqVarE = e(zheVar);
        if (zgqVarE != null) {
            return zgqVarE;
        }
        Objects.toString(zheVar);
        throw new FileNotFoundException("no such file: ".concat(zheVar.toString()));
    }

    public abstract zgq e(zhe zheVar);

    public abstract zho f(zhe zheVar);

    public abstract void g(zhe zheVar, zhe zheVar2);

    public final void h(zhe zheVar) {
        zheVar.getClass();
        l(zheVar);
    }

    public final boolean i(zhe zheVar) {
        zheVar.getClass();
        return e(zheVar) != null;
    }

    public abstract zhm j(zhe zheVar);

    public abstract void k(zhe zheVar);

    public abstract void l(zhe zheVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
