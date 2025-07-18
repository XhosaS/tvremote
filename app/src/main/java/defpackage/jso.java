package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jso extends jtf {
    private boolean a;
    private yzo b;
    private yzq c;
    private byte d;

    @Override // defpackage.jtf
    public final jth a() {
        yzo yzoVar = this.b;
        if (yzoVar != null) {
            this.c = yzoVar.f();
        } else if (this.c == null) {
            this.c = zcp.b;
        }
        if (this.d == 1) {
            return new jsp(this.a, this.c);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    @Override // defpackage.jtf
    public final yzo b() {
        if (this.b == null) {
            if (this.c == null) {
                this.b = new yzo();
            } else {
                yzo yzoVar = new yzo();
                this.b = yzoVar;
                yzoVar.i(this.c);
                this.c = null;
            }
        }
        return this.b;
    }

    @Override // defpackage.jtf
    public final void c(boolean z) {
        this.a = z;
        this.d = (byte) 1;
    }

    @Override // defpackage.jtf
    public final void d(Set set) {
        if (this.b != null) {
            throw new IllegalStateException("Cannot set requiredNetworkTypes after calling requiredNetworkTypesBuilder()");
        }
        this.c = yzq.o(set);
    }
}
