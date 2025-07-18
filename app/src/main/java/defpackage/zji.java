package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zji implements zjo {
    public void a(char c) {
        throw null;
    }

    public void d(byte[] bArr, int i) {
        throw null;
    }

    public void e(byte[] bArr) {
        d(bArr, bArr.length);
    }

    @Override // defpackage.zjo
    public zjo f(CharSequence charSequence, Charset charset) {
        e(charSequence.toString().getBytes(charset));
        return this;
    }

    @Override // defpackage.zjo
    public final void g(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
    }
}
