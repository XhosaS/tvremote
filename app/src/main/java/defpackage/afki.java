package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afki extends afej {
    public static final Logger a = Logger.getLogger(afki.class.getName());
    public static final afkg b;
    private static final Class h;
    private static final Class i;
    public final boolean c;
    public final yox d;
    public afih e;
    public Map f;
    public final boolean g;

    static {
        afkg afkgVar;
        Class clsAsSubclass;
        ClassLoader classLoader = afki.class.getClassLoader();
        Class<?> cls = null;
        try {
            try {
                afkgVar = new afkg(Class.forName("ypl", false, classLoader), classLoader);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", e);
                afkgVar = null;
                b = afkgVar;
                clsAsSubclass = Class.forName("ypb").asSubclass(yox.class);
                h = clsAsSubclass;
                cls = Class.forName("com.google.auth.appengine.AppEngineCredentials");
                i = cls;
            }
        } catch (ClassNotFoundException unused) {
        }
        b = afkgVar;
        try {
            clsAsSubclass = Class.forName("ypb").asSubclass(yox.class);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (Throwable) e2);
            clsAsSubclass = null;
        }
        h = clsAsSubclass;
        try {
            cls = Class.forName("com.google.auth.appengine.AppEngineCredentials");
        } catch (ClassNotFoundException e3) {
            a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", (Throwable) e3);
        }
        i = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public afki(defpackage.yox r11, defpackage.afkg r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            r10.<init>()
            java.lang.Class r0 = defpackage.afki.h
            r1 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.isInstance(r11)
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r12 == 0) goto L83
            java.lang.Class r0 = r12.a
            boolean r0 = r0.isInstance(r11)
            if (r0 != 0) goto L1b
            goto L83
        L1b:
            java.lang.Class r0 = r12.a     // Catch: java.lang.reflect.InvocationTargetException -> L6c java.lang.IllegalAccessException -> L70
            java.lang.Object r0 = r0.cast(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L6c java.lang.IllegalAccessException -> L70
            r3 = r0
            yox r3 = (defpackage.yox) r3     // Catch: java.lang.reflect.InvocationTargetException -> L6c java.lang.IllegalAccessException -> L70
            java.lang.reflect.Method r11 = r12.d     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            r0 = 0
            java.lang.Object r11 = r11.invoke(r3, r0)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            int r11 = r11.size()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            if (r11 != 0) goto L68
            java.lang.reflect.Method r11 = r12.b     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.lang.Object r11 = r11.invoke(r0, r0)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.util.List r4 = r12.e     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
        L3f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r4.next()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            afkh r5 = (defpackage.afkh) r5     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.lang.reflect.Method r6 = r5.b     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.lang.reflect.Method r5 = r5.a     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.lang.Object r5 = r5.invoke(r3, r0)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            r7[r1] = r5     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            r6.invoke(r11, r7)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            goto L3f
        L5c:
            r0 = move-exception
        L5d:
            r11 = r0
            goto L74
        L5f:
            java.lang.reflect.Method r12 = r12.c     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            java.lang.Object r11 = r12.invoke(r11, r0)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            yox r11 = (defpackage.yox) r11     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L6a
            goto L83
        L68:
            r11 = r3
            goto L83
        L6a:
            r0 = move-exception
            goto L5d
        L6c:
            r0 = move-exception
            r12 = r0
            r9 = r12
            goto L76
        L70:
            r0 = move-exception
            r12 = r0
            r3 = r11
            r11 = r12
        L74:
            r9 = r11
            r11 = r3
        L76:
            java.util.logging.Logger r4 = defpackage.afki.a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.String r7 = "tryServiceAccountToJwt"
            java.lang.String r8 = "Failed converting service account credential to JWT. This is unexpected"
            java.lang.String r6 = "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper"
            r4.logp(r5, r6, r7, r8, r9)
        L83:
            r10.c = r2
            r10.d = r11
            java.lang.Class r12 = defpackage.afki.i
            if (r12 != 0) goto L8e
            r10.g = r1
            return
        L8e:
            boolean r11 = r12.isInstance(r11)
            r10.g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afki.<init>(yox, afkg):void");
    }

    public static void a(String str, afil afilVar) throws StatusException {
        try {
            URI uri = new URI("https", str, "/".concat(String.valueOf(afilVar.c)), null, null);
            if (uri.getPort() == 443) {
                b(uri);
            }
        } catch (URISyntaxException e) {
            throw Status.g.withDescription("Unable to construct service URI for auth").c(e).asException();
        }
    }

    private static void b(URI uri) throws StatusException {
        try {
            new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.g.withDescription("Unable to construct service URI after removing port").c(e).asException();
        }
    }
}
