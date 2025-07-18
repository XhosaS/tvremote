package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cep implements ceg {
    public final String a;
    public final Set b;
    public final cdo c;
    public final int d;
    private final Level e;

    public cep(Level level, Set set, cdo cdoVar) {
        this.a = "";
        this.d = 2;
        this.e = level;
        this.b = set;
        this.c = cdoVar;
    }

    @Override // defpackage.ceg
    public final cdd a(String str) {
        return new cer(str, this.e, this.b, this.c);
    }

    private cep() {
        this(Level.ALL, cer.a, cer.b);
    }
}
