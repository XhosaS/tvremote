package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class tyu implements tza {
    public void a(char c) {
        throw null;
    }

    @Override // defpackage.tza
    public void c(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.tza
    public final void d(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
    }

    @Override // defpackage.tza
    public final void e(byte[] bArr) {
        c(bArr, bArr.length);
    }
}
