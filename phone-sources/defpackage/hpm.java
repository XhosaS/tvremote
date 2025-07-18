package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpm implements hlu {
    private final String a;
    private Object b;

    public hpm(String str) {
        this.a = str;
    }

    @Override // defpackage.hlu
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.hlu
    public final void d() throws IOException {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            hltVar.b(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            hltVar.e(e);
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 1;
    }

    @Override // defpackage.hlu
    public final void dL() {
    }
}
