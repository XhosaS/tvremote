package defpackage;

import dalvik.system.PathClassLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class odg extends PathClassLoader {
    public odg(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
