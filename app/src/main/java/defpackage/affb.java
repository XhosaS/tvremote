package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affb {
    public static final affb a = new affb(new afex(), afey.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    public affb(affa... affaVarArr) {
        for (int i = 0; i < 2; i++) {
            affa affaVar = affaVarArr[i];
            this.b.put(affaVar.c(), affaVar);
        }
    }
}
