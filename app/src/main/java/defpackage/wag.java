package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wag {
    public static final waf a = new waf();
    public final MessageLite b;
    public final boolean c;
    public final int d;
    private final agum e;

    public wag(agum agumVar, int i, MessageLite messageLite, boolean z) {
        this.e = agumVar;
        this.d = i;
        this.b = messageLite;
        this.c = z;
    }

    public final long a() {
        Object objA = this.e.a();
        objA.getClass();
        return ((Long) objA).longValue();
    }

    public final MessageLite b() {
        Object objA = this.e.a();
        objA.getClass();
        return (MessageLite) objA;
    }

    public final String c() {
        Object objA = this.e.a();
        objA.getClass();
        return (String) objA;
    }

    public final boolean d() {
        Object objA = this.e.a();
        objA.getClass();
        return ((Boolean) objA).booleanValue();
    }

    public final void e() {
        Object objA = this.e.a();
        objA.getClass();
        ((Double) objA).doubleValue();
    }

    public /* synthetic */ wag(agum agumVar, int i, boolean z, int i2) {
        this(agumVar, i, (MessageLite) null, z);
    }
}
