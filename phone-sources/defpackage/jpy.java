package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpy extends ixi {
    public static final Handler d;
    public final jqd e;
    public final kuw f;
    private final gag g;

    static {
        Handler handlerK = crh.k(Looper.getMainLooper());
        handlerK.getClass();
        d = handlerK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, yfo] */
    public jpy(gag gagVar, kuw kuwVar, wkx wkxVar) {
        vvd vvdVar = wsw.e;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.g = gagVar;
        this.f = kuwVar;
        wod wodVar = ((wsw) this.b).c;
        wod wodVar2 = wodVar == null ? wod.a : wodVar;
        String str = ((wsw) this.b).d;
        jzs jzsVar = (jzs) gagVar.e.b();
        jzsVar.getClass();
        irc ircVar = (irc) gagVar.c.b();
        ircVar.getClass();
        kw kwVar = (kw) gagVar.b.b();
        kwVar.getClass();
        isf isfVar = (isf) gagVar.d.b();
        isfVar.getClass();
        ino inoVar = (ino) gagVar.a.b();
        inoVar.getClass();
        wodVar2.getClass();
        str.getClass();
        this.e = new jqd(jzsVar, ircVar, kwVar, isfVar, inoVar, wodVar2, str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ixi, defpackage.sbt
    protected final void e() {
        lim limVar = lim.LIBRARY_LOAD;
        limVar.getClass();
        rmp rmpVarC = rmp.c(limVar);
        ?? r1 = this.f.a;
        if (!r1.containsKey(rmpVarC)) {
            r1.put(rmpVarC, rmr.a().b());
        }
        ykr.q(yoz.m(), null, 0, new jbb(this, (yih) null, 11), 3);
        x(this.e.f(), true, new ajh(this, (yih) null, 4));
    }
}
