package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yqd implements yqx {
    protected yqd() {
    }

    @Override // defpackage.yqx
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public final int c(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }
}
