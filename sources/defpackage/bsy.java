package defpackage;

import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsy {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/emote/ConnectedClient");
    public final bug b;
    public final bzs d;
    public int f;
    public int g;
    public final bsi i;
    public final int j;
    public clo k;
    public final long c = SystemClock.uptimeMillis();
    public int h = 1;
    private int l = 1;
    public int e = -1;

    public bsy(bsi bsiVar, bug bugVar, Collection collection) {
        this.i = bsiVar;
        this.b = bugVar;
        int iE = bugVar.e();
        this.j = iE;
        clo cloVarC = bsiVar.c(301);
        clo cloVarO = bsh.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bsh bshVar = (bsh) cloVarO.b;
        bshVar.d = iE - 1;
        bshVar.b |= 2;
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar = (bse) cloVarC.b;
        bsh bshVar2 = (bsh) cloVarO.i();
        bse bseVar2 = bse.a;
        bshVar2.getClass();
        bseVar.e = bshVar2;
        bseVar.b |= 8;
        bsiVar.b(cloVarC);
        bzo bzoVarJ = bzs.j(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            btc btcVarB = ((bta) it.next()).b(bugVar);
            if (btcVarB != null) {
                bzoVarJ.g(btcVarB);
            }
        }
        this.d = bzoVarJ.f();
    }

    public final void a() {
        int i = 0;
        while (true) {
            bzs bzsVar = this.d;
            if (i >= ((cax) bzsVar).c) {
                break;
            }
            ((btc) bzsVar.get(i)).b(this.g);
            i++;
        }
        bsi bsiVar = this.i;
        long j = this.c;
        int i2 = this.j;
        int i3 = this.l;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        clo cloVarO = bsh.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bsh bshVar = (bsh) cloVarO.b;
        bshVar.d = i2 - 1;
        bshVar.b |= 2;
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        bsh bshVar2 = (bsh) cltVar;
        bshVar2.b |= 1;
        bshVar2.c = jUptimeMillis;
        if (i4 != 0) {
            if (!cltVar.A()) {
                cloVarO.l();
            }
            bsh bshVar3 = (bsh) cloVarO.b;
            bshVar3.b |= 4;
            bshVar3.e = i4;
        }
        clo cloVarC = bsiVar.c(302);
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar = (bse) cloVarC.b;
        bsh bshVar4 = (bsh) cloVarO.i();
        bse bseVar2 = bse.a;
        bshVar4.getClass();
        bseVar.e = bshVar4;
        bseVar.b |= 8;
        bsiVar.b(cloVarC);
    }

    public final void b(int i, bux buxVar) {
        clo cloVarO = bvt.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        bvt bvtVar = (bvt) cltVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bvtVar.c = i2;
        bvtVar.b |= 1;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        bvt bvtVar2 = (bvt) cloVarO.b;
        bvtVar2.d = buxVar;
        bvtVar2.b |= 2;
        this.l = i;
        bug bugVar = this.b;
        clo cloVarO2 = bvw.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvw bvwVar = (bvw) cloVarO2.b;
        bvt bvtVar3 = (bvt) cloVarO.i();
        bvtVar3.getClass();
        bvwVar.c = bvtVar3;
        bvwVar.b = 3;
        bugVar.d((bvw) cloVarO2.i());
        bugVar.b();
    }
}
