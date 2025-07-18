package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbd {
    public final String a;
    public final ImmutableList b;
    public final tst c;
    public final tst d;
    public final tst e;
    public final tst f;
    public final rzy g;

    public nbd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbd) {
            nbd nbdVar = (nbd) obj;
            if (this.a.equals(nbdVar.a) && this.b.equals(nbdVar.b) && this.c.equals(nbdVar.c) && this.d.equals(nbdVar.d) && this.e.equals(nbdVar.e) && this.f.equals(nbdVar.f) && this.g.equals(nbdVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        rzy rzyVar = this.g;
        tst tstVar = this.f;
        tst tstVar2 = this.e;
        tst tstVar3 = this.d;
        tst tstVar4 = this.c;
        return "ActorProfileViewModel{name=" + this.a + ", roles=" + String.valueOf(this.b) + ", age=" + String.valueOf(tstVar4) + ", lifespan=" + String.valueOf(tstVar3) + ", birthplace=" + String.valueOf(tstVar2) + ", imageUri=" + String.valueOf(tstVar) + ", closeUiNode=" + String.valueOf(rzyVar) + "}";
    }

    public nbd(String str, ImmutableList immutableList, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, rzy rzyVar) {
        this.a = str;
        this.b = immutableList;
        this.c = tstVar;
        this.d = tstVar2;
        this.e = tstVar3;
        this.f = tstVar4;
        this.g = rzyVar;
    }
}
