package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vtv {
    static vtp b(Class cls) {
        String str;
        ClassLoader classLoader = vtv.class.getClassLoader();
        if (cls.equals(vtp.class)) {
            str = "vso";
        } else {
            if (!cls.getPackage().equals(vtv.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (vtp) cls.cast(((vtv) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = Collections.singletonList(vwt.class.getDeclaredConstructor(null).newInstance(null)).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((vtp) cls.cast(((vtv) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(vtj.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (vtp) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (vtp) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    protected abstract vtp a();
}
