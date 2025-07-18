package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvn extends tvl {
    public tvn(tvw tvwVar) {
        super(tvwVar);
    }

    public static tvn n(String str) {
        return new tvn(twu.d(str));
    }

    @Override // defpackage.ttz
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final tvk a(Level level) {
        boolean zJ = j(level);
        twu.n(h(), level, zJ);
        return !zJ ? b : new tvm(this, level);
    }
}
