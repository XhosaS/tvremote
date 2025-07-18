package defpackage;

import android.os.Build;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btr extends bts {
    public btr(String str) {
        super(str, ces.d("AtvRemote.", str, false));
    }

    @Override // defpackage.bts, defpackage.cdd
    public final void b(cdb cdbVar) {
        String strConcat;
        cdh cdhVarK = cdbVar.k();
        Boolean bool = (Boolean) cdhVarK.d(btt.a);
        if (bool == null || (bts.c && bool.booleanValue())) {
            boolean zEquals = Boolean.TRUE.equals(bool);
            String str = (String) cdhVarK.d(ccv.a);
            if (str != null) {
                strConcat = ces.d("AtvRemote.", str.concat(true != zEquals ? "" : "[v]"), false);
            } else if (zEquals) {
                String strValueOf = String.valueOf(this.d);
                int i = Build.VERSION.SDK_INT;
                strConcat = strValueOf.concat("[v]");
                if (i < 26) {
                    strConcat = ces.e(strConcat);
                }
            } else {
                strConcat = this.d;
            }
            d(strConcat, cdbVar);
        }
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        return level.intValue() >= bts.a.intValue();
    }
}
