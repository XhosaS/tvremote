package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class afa implements aew {
    private final aez a;

    public afa(aez aezVar) {
        this.a = aezVar;
    }

    @Override // defpackage.aew
    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        aez aezVar = this.a;
        if (aezVar == null) {
            return b();
        }
        int iA = aezVar.a(charSequence, i);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return b();
        }
        return false;
    }

    protected abstract boolean b();
}
