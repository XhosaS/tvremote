package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdy extends zdo {
    public static final zdx b = new zdx();

    public zdy(zft zftVar) {
        super(zftVar);
    }

    @Deprecated
    public static zdy h(String str) {
        ziu.a(!str.isEmpty(), "injected class name is empty");
        return new zdy(zgr.d(str.replace('/', '.')));
    }

    @Override // defpackage.zdo
    /* renamed from: g */
    public final zdv a(Level level) {
        zft zftVar = this.a;
        boolean zF = f(level);
        zgr.n(zftVar.d(), level, zF);
        return !zF ? b : new zdw(this, level);
    }
}
