package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btq extends bts {
    public btq(String str) {
        super(str, ces.d("", str, false));
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        return level.intValue() >= bts.b.intValue();
    }
}
