package defpackage;

import com.google.android.apps.play.movies.common.service.bitmap.VideosGlideModule;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class hus {
    public static VideosGlideModule a(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                b(cls, e);
            } catch (InstantiationException e2) {
                b(cls, e2);
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
            } catch (InvocationTargetException e4) {
                b(cls, e4);
            }
            if (objNewInstance instanceof VideosGlideModule) {
                return (VideosGlideModule) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(objNewInstance))));
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void b(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(cls))), exc);
    }
}
