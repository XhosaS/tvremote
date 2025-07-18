package defpackage;

import java.lang.annotation.Annotation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehg {
    public static Object a(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof aeiy)) {
            if (obj instanceof aeiz) {
                return a(((aeiz) obj).dN(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), aeiy.class, aeiz.class));
        }
        if (obj instanceof aejc) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            aejb.a(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }
}
