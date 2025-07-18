package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggd {
    public static final agfx a;

    static {
        aggz aggzVar = aggb.a;
        try {
            agfx agfxVar = aggc.a;
            if (agfxVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = agfxVar;
        } catch (Throwable th) {
            throw agnx.a(th);
        }
    }
}
