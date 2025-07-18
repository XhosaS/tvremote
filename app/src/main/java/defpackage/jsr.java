package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsr extends jtl {
    public URI a;
    public yzb b;
    public yze c;
    public jth d;
    public jti e;
    public int f;
    public byte g;

    @Override // defpackage.jtl
    public final void a(jth jthVar) {
        if (jthVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.d = jthVar;
    }

    @Override // defpackage.jtl
    public final void b(int i) {
        this.f = i;
        this.g = (byte) 1;
    }
}
