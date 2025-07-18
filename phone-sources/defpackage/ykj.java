package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ykj implements Serializable, ymg {
    public static final Object d = yki.a;
    private transient ymg a;
    private final Class b;
    private final boolean c;
    protected final Object e;
    public final String f;
    public final String g;

    protected ykj(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.b = cls;
        this.f = str;
        this.g = str2;
        this.c = z;
    }

    @Override // defpackage.ymg
    public final String c() {
        return this.f;
    }

    public final ymg d() {
        ymg ymgVar = this.a;
        if (ymgVar != null) {
            return ymgVar;
        }
        g();
        this.a = this;
        return this;
    }

    public final ymi e() {
        Class cls = this.b;
        if (cls == null) {
            return null;
        }
        if (this.c) {
            int i = ylg.a;
            return new ykw(cls);
        }
        int i2 = ylg.a;
        return new ykl(cls);
    }

    @Override // defpackage.ymg
    public final Object f() {
        throw null;
    }

    protected abstract void g();
}
