package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxf {
    public final ClassLoader a;

    public bxf(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public static final Class b(bxf bxfVar) throws ClassNotFoundException {
        Class<?> clsLoadClass = bxfVar.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class a() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.WindowExtensions");
        clsLoadClass.getClass();
        return clsLoadClass;
    }
}
