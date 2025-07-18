package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anm {
    public final yjk a;
    public final bdy b;
    public final bdl c;
    private final bcb d;
    private final bcb e;
    private final bcb f;

    public anm(Object obj, yjk yjkVar) {
        this.a = yjkVar;
        new AtomicReference(null);
        new yyk();
        bcz bczVar = bcz.c;
        this.d = new bci(obj, bczVar);
        ajm ajmVar = new ajm(this, 19);
        ivx ivxVar = bdt.a;
        new bbh(ajmVar, null);
        this.b = new bbh(new ajm(this, 20), null);
        this.c = new bce(Float.NaN);
        new bbh(new aoe(this, 1), bczVar);
        new bce(0.0f);
        this.e = new bci(null, bczVar);
        this.f = new bci(new aot(yhc.a), bczVar);
    }

    public final float a() {
        return this.c.e();
    }

    public final Object b() {
        return this.d.a();
    }

    public final Object c() {
        return this.e.a();
    }

    public final void d() {
    }
}
