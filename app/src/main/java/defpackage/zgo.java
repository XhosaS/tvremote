package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zgo {
    private static final zgo a = new zgi();

    public static zgo g(zfx zfxVar, zfx zfxVar2) {
        int iA = zfxVar2.a();
        return iA == 0 ? a : iA <= 28 ? new zgm(zfxVar, zfxVar2) : new zgn(zfxVar, zfxVar2);
    }

    public abstract int a();

    public abstract Object b(zer zerVar);

    public abstract Set c();

    public abstract void d(zge zgeVar, Object obj);
}
