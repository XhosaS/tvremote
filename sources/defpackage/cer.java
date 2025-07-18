package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cer extends cee {
    public static final Set a;
    public static final cdo b;
    public static final cep c;
    private final String d;
    private final Level e;
    private final Set f;
    private final cdo g;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(cbx.a, ccv.a, ccw.a)));
        a = setUnmodifiableSet;
        cdo cdoVarA = cdr.a(setUnmodifiableSet);
        b = cdoVarA;
        c = new cep(Level.ALL, setUnmodifiableSet, cdoVarA);
    }

    public cer(String str, Level level, Set set, cdo cdoVar) {
        super(str);
        this.d = ces.d("", str, true);
        this.e = level;
        this.f = set;
        this.g = cdoVar;
    }

    public static void d(cdb cdbVar, String str, Level level, Set set, cdo cdoVar) {
        String string;
        Boolean bool = (Boolean) cdbVar.k().d(ccw.a);
        if (bool == null || !bool.booleanValue()) {
            cdy cdyVarG = cdy.g(ceb.f(), cdbVar.k());
            boolean z = cdbVar.n().intValue() < level.intValue();
            if (z || cec.b(cdbVar, cdyVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (ces.g(2, cdbVar.f(), sb)) {
                    sb.append(" ");
                }
                if (!z || cdbVar.l() == null) {
                    cfg.e(cdbVar, sb);
                    cec.c(cdyVarG, cdoVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(cdbVar.l().b);
                }
                string = sb.toString();
            } else {
                string = cec.a(cdbVar);
            }
            Throwable th = (Throwable) cdbVar.k().d(cbx.a);
            int iF = ces.f(cdbVar.n());
            if (iF == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iF == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iF == 4) {
                Log.i(str, string, th);
            } else if (iF != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.cdd
    public final void b(cdb cdbVar) {
        d(cdbVar, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        String str = this.d;
        int iF = ces.f(level);
        return Log.isLoggable(str, iF) || Log.isLoggable("all", iF);
    }
}
