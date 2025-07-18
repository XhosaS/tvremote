package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sms {
    private static final zdy b = zdy.h("com/google/android/libraries/search/audio/listener/reporter/MicUpdateReporter");
    public final Executor a;
    private final Set c;
    private final Map d = new HashMap();

    public sms(Set set, Executor executor) {
        this.c = set;
        this.a = executor;
    }

    private final synchronized zwv b(smm smmVar) {
        Map map;
        map = this.d;
        if (!map.containsKey(smmVar)) {
            map.put(smmVar, new zwv());
        }
        return (zwv) map.get(smmVar);
    }

    public final synchronized void a() {
        ((zdv) ((zdv) b.b()).q("com/google/android/libraries/search/audio/listener/reporter/MicUpdateReporter", "reportMicUpdate", 132, "MicUpdateReporter.java")).u("#audio# reportMicUpdate");
        zdm zdmVarListIterator = ((yxy) this.c).f().listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            final smm smmVar = (smm) zdmVarListIterator.next();
            vqi.d("com/google/android/libraries/search/audio/listener/reporter/MicUpdateReporter", "reportMicUpdate", 135, b(smmVar).a(wyo.i(new Callable() { // from class: smn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    smmVar.a();
                    return true;
                }
            }), this.a), "Failed to notify MicUpdateListener.", new Object[0]);
        }
    }
}
