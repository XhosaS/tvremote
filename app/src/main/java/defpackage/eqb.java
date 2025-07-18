package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqb extends eqp {
    private final Callable a;

    public eqb(Callable callable) {
        super("internal.appMetadata");
        this.a = callable;
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        try {
            return epr.b(this.a.call());
        } catch (Exception unused) {
            return eqw.f;
        }
    }
}
