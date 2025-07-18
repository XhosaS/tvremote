package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swp {
    public final rua a;

    public swp() {
        this(rua.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swp) && agvy.c(this.a, ((swp) obj).a);
    }

    public final int hashCode() {
        rua ruaVar = this.a;
        if ((ruaVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return abza.a.a(ruaVar.getClass()).b(ruaVar);
        }
        int i = ruaVar.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iB = abza.a.a(ruaVar.getClass()).b(ruaVar);
        ruaVar.memoizedHashCode = iB;
        return iB;
    }

    public final String toString() {
        return "AudioFocusPolicyParams(audioFocusRequestParams=" + this.a + ")";
    }

    public swp(rua ruaVar) {
        ruaVar.getClass();
        this.a = ruaVar;
    }
}
