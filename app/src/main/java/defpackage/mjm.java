package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mjm {
    public final Map a = new HashMap();

    public final synchronized void a(String str, nzx nzxVar) {
        synchronized (this) {
            mjr mjrVar = (mjr) this.a.get(str);
            if (mjrVar == null) {
                return;
            }
            mjrVar.a(nzxVar);
        }
    }

    public final synchronized void b(String str) {
        synchronized (this) {
            mjr mjrVar = (mjr) this.a.get(str);
            if (mjrVar == null) {
                return;
            }
            mjrVar.b();
        }
    }
}
