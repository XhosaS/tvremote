package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erh implements Comparator {
    final /* synthetic */ eqp a;
    final /* synthetic */ epp b;

    public erh(eqp eqpVar, epp eppVar) {
        this.a = eqpVar;
        this.b = eppVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        eqw eqwVar = (eqw) obj;
        eqw eqwVar2 = (eqw) obj2;
        if (eqwVar instanceof erb) {
            return !(eqwVar2 instanceof erb) ? 1 : 0;
        }
        if (eqwVar2 instanceof erb) {
            return -1;
        }
        eqp eqpVar = this.a;
        return eqpVar == null ? eqwVar.i().compareTo(eqwVar2.i()) : (int) epq.a(eqpVar.a(this.b, Arrays.asList(eqwVar, eqwVar2)).h().doubleValue());
    }
}
