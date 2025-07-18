package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txi implements twz {
    public final String a;
    public final Level b;
    public final boolean c;
    public final Set d;
    public final twh e;
    public final int f;
    private volatile txj g;

    public txi(int i, Level level, boolean z, Set set, twh twhVar) {
        this.a = "";
        this.f = i;
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = twhVar;
    }

    @Override // defpackage.twz
    public final tvw a(String str) {
        txj txjVar;
        if (!this.c || !str.contains(".")) {
            return new txk(str, this.f, this.b, this.d, this.e);
        }
        txj txjVar2 = this.g;
        if (txjVar2 != null) {
            return txjVar2;
        }
        synchronized (this) {
            txjVar = this.g;
            if (txjVar == null) {
                txj txjVar3 = new txj(null, this.f, this.b, false, this.d, this.e);
                this.g = txjVar3;
                txjVar = txjVar3;
            }
        }
        return txjVar;
    }

    private txi() {
        this(2, Level.ALL, false, txk.a, txk.b);
    }
}
