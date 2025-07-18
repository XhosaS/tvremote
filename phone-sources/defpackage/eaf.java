package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eaf extends IOException {
    public final boolean a;
    public final int b;

    public eaf(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        return (message != null ? message.concat(" ") : "") + "{contentIsMalformed=" + this.a + ", dataType=" + this.b + "}";
    }
}
