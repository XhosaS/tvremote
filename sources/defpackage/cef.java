package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cef implements ceg {
    private final /* synthetic */ int a;

    public cef(int i) {
        this.a = i;
    }

    @Override // defpackage.ceg
    public final cdd a(String str) {
        if (this.a == 0) {
            return new ceq(str, Level.ALL, cer.a, cer.b);
        }
        Level level = bts.a;
        return str.startsWith("com.google.android.tv.remote") ? new btr(str) : new btq(str);
    }
}
