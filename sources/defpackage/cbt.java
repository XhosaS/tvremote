package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbt extends cbl {
    private static final ccg b = new ccg(null);

    public cbt(cdd cddVar) {
        super(cddVar);
    }

    @Deprecated
    public static cbt k(String str) {
        ces.j(!str.isEmpty(), "injected class name is empty");
        return new cbt(ceb.d(str.replace('/', '.')));
    }

    @Override // defpackage.cbl
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final cbs a(Level level) {
        cdd cddVar = this.a;
        boolean zI = i(level);
        ceb.n(cddVar.e(), level, zI);
        return !zI ? b : new cbr(this, level);
    }
}
