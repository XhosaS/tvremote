package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehx implements beg {
    public static final bes a = new aeht();
    private final Map b;
    private final beg c;
    private final beg d;

    public aehx(Map map, beg begVar, euq euqVar) {
        this.b = map;
        this.c = begVar;
        this.d = new aehv(euqVar);
    }

    @Override // defpackage.beg
    public final beb a(Class cls) {
        return this.b.containsKey(cls) ? bfa.a.a() : this.c.a(cls);
    }

    @Override // defpackage.beg
    public final beb b(Class cls, bet betVar) {
        return this.b.containsKey(cls) ? this.d.b(cls, betVar) : this.c.b(cls, betVar);
    }

    @Override // defpackage.beg
    public final /* synthetic */ beb c(agxd agxdVar, bet betVar) {
        return bef.a(this, agxdVar, betVar);
    }
}
