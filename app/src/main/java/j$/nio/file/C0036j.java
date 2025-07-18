package j$.nio.file;

import java.security.PrivilegedAction;

/* renamed from: j$.nio.file.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0036j implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                j$.nio.file.spi.c cVar = j$.adapter.b.a;
                String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
                if (property != null) {
                    for (String str : property.split(",")) {
                        try {
                            cVar = (j$.nio.file.spi.c) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.c.class).newInstance(cVar);
                            if (!cVar.l().equals("file")) {
                                throw new Error("Default provider must use scheme 'file'");
                            }
                        } catch (Exception e) {
                            throw new Error(e);
                        }
                    }
                }
                return cVar;
            case 1:
                String property2 = System.getProperty("file.encoding");
                if (property2 == null) {
                    return null;
                }
                return property2;
            case 2:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 3:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
