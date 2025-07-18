package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agvo implements Serializable, agxc {
    public static final Object b = agvn.a;
    private transient agxc a;
    protected final Object c;
    public final String d;
    public final String e;
    private final Class f;
    private final boolean g;

    protected agvo(Object obj, Class cls, String str, String str2, boolean z) {
        this.c = obj;
        this.f = cls;
        this.d = str;
        this.e = str2;
        this.g = z;
    }

    public final agxc b() {
        agxc agxcVar = this.a;
        if (agxcVar != null) {
            return agxcVar;
        }
        e();
        this.a = this;
        return this;
    }

    public final agxe c() {
        Class cls = this.f;
        if (cls == null) {
            return null;
        }
        if (this.g) {
            agwj agwjVar = agwi.a;
            return new agwa(cls);
        }
        agwj agwjVar2 = agwi.a;
        return new agvq(cls);
    }

    @Override // defpackage.agxc
    public final Object d() {
        throw null;
    }

    protected abstract void e();
}
