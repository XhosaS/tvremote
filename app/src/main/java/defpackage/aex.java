package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class aex implements aez {
    static final aex a = new aex();

    private aex() {
    }

    @Override // defpackage.aez
    public final int a(CharSequence charSequence, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        return z ? 1 : 2;
    }
}
