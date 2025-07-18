package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zys {
    public final Object a;

    public zys(Object obj) {
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
            if (!(obj instanceof vsz)) {
                throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(obj.getClass().getName())));
            }
            i2 = 5;
        }
        if (i == i2) {
            return;
        }
        throw new IllegalStateException("Attempted to access flag value as " + vxr.aL(i) + ", but actual type is " + vxr.aL(i2));
    }

    public final String toString() {
        return this.a.toString();
    }

    public zys(float f) {
        this.a = Float.valueOf(f);
    }

    public zys(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public zys(long j) {
        this.a = Long.valueOf(j);
    }
}
