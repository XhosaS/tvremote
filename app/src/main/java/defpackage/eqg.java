package defpackage;

import java.util.Collections;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqg {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final int a(epp eppVar, eqv eqvVar, eqw eqwVar) {
        eqw eqwVarA = eqvVar.a(eppVar, Collections.singletonList(eqwVar));
        if (eqwVarA instanceof eqo) {
            return epq.b(eqwVarA.h().doubleValue());
        }
        return -1;
    }
}
