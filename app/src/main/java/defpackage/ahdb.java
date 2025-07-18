package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahdb extends ahbm implements Closeable, AutoCloseable {
    static {
        new agsr(ahbm.c, new agux() { // from class: ahda
            @Override // defpackage.agux
            public final Object a(Object obj) {
                agtc agtcVar = (agtc) obj;
                if (agtcVar instanceof ahdb) {
                    return (ahdb) agtcVar;
                }
                return null;
            }
        });
    }

    public abstract Executor e();
}
