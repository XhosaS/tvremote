package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafg implements aaff {
    public final aaff a;

    private aafg(aaff aaffVar) {
        this.a = aaffVar;
    }

    static aafg b(aaff aaffVar) {
        if (aaffVar instanceof aafc) {
            return ((aafc) aaffVar).a;
        }
        if (aaffVar instanceof aafg) {
            return (aafg) aaffVar;
        }
        if (aaffVar == null) {
            return null;
        }
        return new aafg(aaffVar);
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        return this.a.c(aafbVar, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aafg) {
            return this.a.equals(((aafg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
