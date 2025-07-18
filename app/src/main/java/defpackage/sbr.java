package defpackage;

import j$.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbr implements rsm {
    private final rsm a;
    private final Duration b;
    private final smv c;
    private final smw d;
    private int e;
    private int f;

    public sbr(rsm rsmVar, Duration duration, smv smvVar, smw smwVar) {
        this.a = rsmVar;
        this.b = duration;
        this.c = smvVar;
        this.d = smwVar;
    }

    @Override // defpackage.rsm
    public final Executor a() {
        return this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rsm, defpackage.sbo
    public final void b(rsu rsuVar) {
        int iD;
        rsuVar.getClass();
        if (rsuVar.c == 1) {
            abvo abvoVar = ((rss) rsuVar.d).c;
            abvoVar.getClass();
            this.e += abvoVar.d();
            int i = this.f;
            if ((abvoVar instanceof Collection) && ((Collection) abvoVar).isEmpty()) {
                iD = abvoVar.d();
                this.f = i + iD;
            } else {
                Iterator it = abvoVar.iterator();
                while (it.hasNext()) {
                    if (((Byte) it.next()).byteValue() != 0) {
                        iD = 0;
                        break;
                    }
                }
                iD = abvoVar.d();
                this.f = i + iD;
            }
        }
        if (rsuVar.c == 2) {
            this.d.k(this.e, this.f, this.c, this.b);
        }
        this.a.b(rsuVar);
    }
}
