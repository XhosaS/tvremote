package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erq extends erd {
    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        if (str == null || str.isEmpty() || !eppVar.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        eqw eqwVarC = eppVar.c(str);
        if (eqwVarC instanceof eqp) {
            return ((eqp) eqwVarC).a(eppVar, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
