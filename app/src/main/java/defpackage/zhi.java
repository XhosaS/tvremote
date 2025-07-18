package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhi implements zgx {
    public final String a;
    public final boolean b;
    public final zfr c;
    public final Level d;
    public final boolean e;
    public final Set f;
    public final zge g;
    private volatile zhj h;

    public zhi(String str, boolean z, zfr zfrVar, Level level, boolean z2, Set set, zge zgeVar) {
        this.a = str;
        this.b = z;
        this.c = zfrVar;
        this.d = level;
        this.e = z2;
        this.f = set;
        this.g = zgeVar;
    }

    @Override // defpackage.zgx
    public final zft a(String str) {
        zhj zhjVar;
        if (!this.e || !str.contains(".")) {
            return new zhk(this.a, str, this.b, this.c, this.d, this.f, this.g);
        }
        zhj zhjVar2 = this.h;
        if (zhjVar2 != null) {
            return zhjVar2;
        }
        synchronized (this) {
            zhjVar = this.h;
            if (zhjVar == null) {
                zhj zhjVar3 = new zhj(this.a, null, this.b, this.c, this.d, false, this.f, this.g);
                this.h = zhjVar3;
                zhjVar = zhjVar3;
            }
        }
        return zhjVar;
    }

    private zhi() {
        this("", true, zfs.NO_OP, Level.ALL, false, zhk.a, zhk.b);
    }
}
