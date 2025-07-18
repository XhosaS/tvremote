package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvv {
    public final qwn a;
    public final yrp b;
    public final Executor c;
    public final qux d;
    public final agow e;
    public final AtomicBoolean f = new AtomicBoolean(true);

    public qvv(qwn qwnVar, yrp yrpVar, Executor executor, aehf aehfVar, quy quyVar, agow agowVar) {
        this.a = qwnVar;
        this.b = yrpVar;
        this.c = executor;
        this.d = quyVar.a(executor, aehfVar, null);
        this.e = agowVar;
    }
}
