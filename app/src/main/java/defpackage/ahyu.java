package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyu {
    public final Object a;

    public ahyu(Object obj) {
        this.a = obj;
    }

    public final boolean a() {
        b(1);
        return ((Boolean) this.a).booleanValue();
    }

    public final void b(int i) {
        int i2;
        Object obj = this.a;
        if (obj instanceof Boolean) {
            i2 = 1;
        } else if (obj instanceof Long) {
            i2 = 2;
        } else if (obj instanceof Float) {
            i2 = 3;
        } else if (obj instanceof String) {
            i2 = 4;
        } else {
            if (!(obj instanceof abvo)) {
                throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(obj.getClass().getName())));
            }
            i2 = 5;
        }
        if (i == i2) {
            return;
        }
        throw new IllegalStateException("Attempted to access flag value as " + ahyt.a(i) + ", but actual type is " + ahyt.a(i2));
    }

    public final String toString() {
        return this.a.toString();
    }

    public ahyu(float f) {
        this.a = Float.valueOf(f);
    }

    public ahyu(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public ahyu(long j) {
        this.a = Long.valueOf(j);
    }
}
