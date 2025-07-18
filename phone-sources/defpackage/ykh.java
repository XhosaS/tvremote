package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ykh implements Serializable, ykp {
    protected final Object a;
    private final Class b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final int g;

    public ykh(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i2 & 1);
        this.f = i;
        this.g = i2 >> 1;
    }

    @Override // defpackage.ykp
    public final int ca() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykh)) {
            return false;
        }
        ykh ykhVar = (ykh) obj;
        return this.e == ykhVar.e && this.f == ykhVar.f && this.g == ykhVar.g && yks.e(this.a, ykhVar.a) && yks.e(this.b, ykhVar.b) && this.c.equals(ykhVar.c) && this.d.equals(ykhVar.d);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        int i = ylg.a;
        return ykr.a(this);
    }
}
