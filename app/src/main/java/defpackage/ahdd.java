package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahdd {
    public static final ahbm a(Executor executor) {
        ahck ahckVar = executor instanceof ahck ? (ahck) executor : null;
        return ahckVar != null ? ahckVar.a : new ahdc(executor);
    }
}
