package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bee extends beh {
    public static bee a;
    public static final bes b = new bed();
    private final Application d;

    public bee() {
        throw null;
    }

    private final beb d(Class cls, Application application) {
        if (!bbq.class.isAssignableFrom(cls)) {
            return bex.a.a(cls);
        }
        try {
            beb bebVar = (beb) cls.getConstructor(Application.class).newInstance(application);
            bebVar.getClass();
            return bebVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.beh, defpackage.beg
    public final beb a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.beh, defpackage.beg
    public final beb b(Class cls, bet betVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) betVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (bbq.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return bex.a.a(cls);
    }

    public bee(Application application) {
        this.d = application;
    }
}
