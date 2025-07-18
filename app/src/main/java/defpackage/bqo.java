package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqo {
    public final bqv a;
    private bqj b;

    public bqo(bqv bqvVar) {
        this.a = bqvVar;
    }

    public final void a(String str, bqn bqnVar) {
        bqnVar.getClass();
        bqv bqvVar = this.a;
        synchronized (bqvVar.a) {
            Map map = bqvVar.b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            map.put(str, bqnVar);
        }
    }

    public final void b(Class cls) throws NoSuchMethodException, SecurityException {
        if (!this.a.d) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        bqj bqjVar = this.b;
        if (bqjVar == null) {
            bqjVar = new bqj(this);
        }
        this.b = bqjVar;
        try {
            cls.getDeclaredConstructor(null);
            bqj bqjVar2 = this.b;
            if (bqjVar2 != null) {
                String name = cls.getName();
                name.getClass();
                bqjVar2.a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final bqn c() {
        bqn bqnVar;
        bqv bqvVar = this.a;
        synchronized (bqvVar.a) {
            Iterator it = bqvVar.b.entrySet().iterator();
            do {
                bqnVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                bqn bqnVar2 = (bqn) entry.getValue();
                if (true == agvy.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    bqnVar = bqnVar2;
                }
            } while (bqnVar == null);
        }
        return bqnVar;
    }
}
