package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odc extends ifk implements odd {
    private final Object a;

    public odc() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object a(odd oddVar) {
        if (oddVar instanceof odc) {
            return ((odc) oddVar).a;
        }
        IBinder iBinderAsBinder = oddVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        ocv.aF(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public odc(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }
}
