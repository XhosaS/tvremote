package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhk extends zgv {
    public static final Set a;
    public static final zge b;
    public static final zhi c;
    private final String d;
    private final zfr e;
    private final Level f;
    private final Set g;
    private final zge h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(zed.a, zfi.a, zfj.a)));
        a = setUnmodifiableSet;
        zgb zgbVar = new zgb(zgh.a(setUnmodifiableSet));
        b = zgbVar;
        c = new zhi("", true, zfs.NO_OP, Level.ALL, false, setUnmodifiableSet, zgbVar);
    }

    public zhk(String str, String str2, boolean z, zfr zfrVar, Level level, Set set, zge zgeVar) {
        super(str2);
        this.d = zhd.a(str, str2, z);
        this.e = zfrVar;
        this.f = level;
        this.g = set;
        this.h = zgeVar;
    }

    public static void e(zfp zfpVar, String str, zfr zfrVar, Level level, Set set, zge zgeVar) {
        String string;
        Boolean bool = (Boolean) zfpVar.c().c(zfj.a);
        if (bool == null || !bool.booleanValue()) {
            zgo zgoVarG = zgo.g(zgr.f(), zfpVar.c());
            boolean z = zfpVar.g().intValue() < level.intValue();
            if (!zfrVar.equals(zfs.NO_OP) || z || zgt.b(zfpVar, zgoVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (zfrVar.a(zfpVar.b(), sb)) {
                    sb.append(" ");
                }
                if (!z || zfpVar.d() == null) {
                    zfk.c(zfpVar, sb);
                    zgt.c(zgoVarG, zgeVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(zfpVar.d().b);
                }
                string = sb.toString();
            } else {
                string = zgt.a(zfpVar);
            }
            Throwable th = (Throwable) zfpVar.c().c(zed.a);
            int iB = zhd.b(zfpVar.g());
            if (iB == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iB == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iB == 4) {
                Log.i(str, string, th);
            } else if (iB != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.zft
    public final void b(zfp zfpVar) {
        e(zfpVar, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.zft
    public final boolean c(Level level) {
        String str = this.d;
        int iB = zhd.b(level);
        return Log.isLoggable(str, iB) || Log.isLoggable("all", iB);
    }
}
