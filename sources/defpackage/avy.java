package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avy {
    static final awn c = new awn((char[]) null);
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);

    avy() {
    }

    public static avy a(bzs bzsVar) {
        avy avyVar;
        int i = 0;
        do {
            if (i >= ((cax) bzsVar).c) {
                break;
            }
            bxe bxeVar = (bxe) bzsVar.get(i);
            Object objD = bxeVar.d(c);
            bxc bxcVarA = objD == null ? bxeVar.c.containsKey(bxe.e) ? bxc.a(2) : bxc.a(3) : new bxc(1, objD);
            avyVar = bxcVarA.b == 1 ? (avy) bxcVarA.a : null;
            i++;
        } while (avyVar == null);
        return avyVar;
    }
}
