package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vle {
    public final ujk a;
    public final Executor b;
    public final mfw c;

    public vle(ujk ujkVar, Executor executor, mfw mfwVar) {
        this.a = ujkVar;
        this.b = executor;
        this.c = mfwVar;
    }

    final zyd a() {
        zyd zydVarC = this.a.c();
        return zydVarC.isDone() ? zydVarC : new vld(this, zydVarC);
    }

    final zyd b(yqi yqiVar, Executor executor) {
        return new vld(this, this.a.a(yqiVar, new vla(this, executor)));
    }
}
