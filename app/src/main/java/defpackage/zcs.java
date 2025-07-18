package defpackage;

import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zcs {
    private final Field a;

    public zcs(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    final void a(Object obj, int i) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.a.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    final void b(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
