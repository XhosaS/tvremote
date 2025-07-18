package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhs extends zhn {
    public zhs(zfp zfpVar, zfx zfxVar) {
        super(zfpVar, zfxVar);
        setThrown((Throwable) this.a.b(zed.a));
        getMessage();
    }

    public zhs(RuntimeException runtimeException, zfp zfpVar, zfx zfxVar) {
        super(zfpVar, zfxVar);
        setLevel(zfpVar.g().intValue() < Level.WARNING.intValue() ? Level.WARNING : zfpVar.g());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        zhn.a(zfpVar, sb);
        setMessage(sb.toString());
    }
}
