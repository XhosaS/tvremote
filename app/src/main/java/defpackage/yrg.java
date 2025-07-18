package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yrg extends yrj {
    final /* synthetic */ yqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrg(yrl yrlVar, CharSequence charSequence, yqd yqdVar) {
        super(yrlVar, charSequence);
        this.b = yqdVar;
    }

    @Override // defpackage.yrj
    public final int b(int i) {
        return i + 1;
    }

    @Override // defpackage.yrj
    public final int c(int i) {
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        yqw.am(i, length);
        while (i < length) {
            if (this.b.b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
