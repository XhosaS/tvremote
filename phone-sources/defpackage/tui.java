package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tui extends ttz {
    private static final tuu b = new tuu();

    public tui(tvw tvwVar) {
        super(tvwVar);
    }

    @Deprecated
    public static tui l(String str) {
        a.aD(!str.isEmpty(), "injected class name is empty");
        return new tui(twu.d(str.replace('/', '.')));
    }

    @Override // defpackage.ttz
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final tug a(Level level) {
        boolean zJ = j(level);
        twu.n(h(), level, zJ);
        return !zJ ? b : new tuh(this, level);
    }
}
