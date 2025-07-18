package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxk implements oxh {
    private final Map a = new ConcurrentHashMap();

    @Override // defpackage.oxh
    public final void a(oxj oxjVar) {
        oxi oxiVar = oxjVar.b;
        if (oxiVar == oxi.CANCELED || oxiVar == oxi.COMPLETED) {
            this.a.remove(oxjVar.a);
        }
    }

    public final oxj b(owj owjVar, Function function) {
        String string = UUID.randomUUID().toString();
        oxj oxjVar = new oxj(string, owjVar, function);
        oxjVar.b(this);
        this.a.put(string, oxjVar);
        return oxjVar;
    }
}
