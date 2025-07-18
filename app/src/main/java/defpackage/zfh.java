package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfh extends zff {
    public zfh(zft zftVar) {
        super(zftVar);
    }

    public static zfh h(String str) {
        return new zfh(zgr.d(str));
    }

    public static zfh i() {
        return new zfh(zgr.d(zgr.g().b(zfh.class)));
    }

    @Override // defpackage.zdo
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final zfd a(Level level) {
        zft zftVar = this.a;
        boolean zF = f(level);
        zgr.n(zftVar.d(), level, zF);
        return !zF ? b : new zfg(this, level);
    }
}
