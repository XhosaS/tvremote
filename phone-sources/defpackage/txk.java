package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txk extends twx {
    public static final Set a;
    public static final twh b;
    public static final txi c;
    private final String d;
    private final Level e;
    private final Set f;
    private final twh g;
    private final int h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(tul.a, tvo.a, tvp.a)));
        a = setUnmodifiableSet;
        twh twhVarA = twk.a(setUnmodifiableSet);
        b = twhVarA;
        c = new txi(2, Level.ALL, false, setUnmodifiableSet, twhVarA);
    }

    public txk(String str, int i, Level level, Set set, twh twhVar) {
        super(str);
        this.d = txu.h(str);
        this.h = i;
        this.e = level;
        this.f = set;
        this.g = twhVar;
    }

    public static void e(tvu tvuVar, String str, int i, Level level, Set set, twh twhVar) {
        String string;
        Boolean bool = (Boolean) tvuVar.l().d(tvp.a);
        if (bool == null || !bool.booleanValue()) {
            twr twrVarG = twr.g(twu.f(), tvuVar.l());
            boolean z = tvuVar.p().intValue() < level.intValue();
            if (i != 2 || z || twv.b(tvuVar, twrVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (txu.i(i, tvuVar.f(), sb)) {
                    sb.append(" ");
                }
                if (!z || tvuVar.m() == null) {
                    tyi.e(tvuVar, sb);
                    twv.c(twrVarG, twhVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(tvuVar.m().b);
                }
                string = sb.toString();
            } else {
                string = twv.a(tvuVar);
            }
            Throwable th = (Throwable) tvuVar.l().d(tul.a);
            int iG = txu.g(tvuVar.p());
            if (iG == 2 || iG == 3 || iG == 4) {
                return;
            }
            if (iG != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.tvw
    public final void c(tvu tvuVar) {
        e(tvuVar, this.d, this.h, this.e, this.f, this.g);
    }

    @Override // defpackage.tvw
    public final boolean d(Level level) {
        String str = this.d;
        int iG = txu.g(level);
        return Log.isLoggable(str, iG) || Log.isLoggable("all", iG);
    }
}
