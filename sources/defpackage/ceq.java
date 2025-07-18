package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ceq extends cee {
    private final String a;
    private final Level b;
    private final Set c;
    private final cdo d;

    public ceq(String str, Level level, Set set, cdo cdoVar) {
        super(str);
        this.a = "";
        this.b = level;
        this.c = set;
        this.d = cdoVar;
    }

    @Override // defpackage.cdd
    public final void b(cdb cdbVar) {
        String strB = (String) cdbVar.k().d(ccv.a);
        if (strB == null) {
            strB = e();
        }
        if (strB == null) {
            strB = cdbVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        cer.d(cdbVar, ces.d(this.a, strB, true), this.b, this.c, this.d);
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        return true;
    }
}
