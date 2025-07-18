package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvb extends IOException {
    public final juz a;

    public jvb(juz juzVar) {
        this.a = juzVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        juz juzVar = this.a;
        return super.getMessage() + "; " + String.valueOf(juzVar);
    }

    public jvb(juz juzVar, Throwable th) {
        super(th);
        this.a = juzVar;
    }

    public jvb() {
        super("UrlRequest cancelled");
        juy juyVarE = juz.e();
        ((jsw) juyVarE).a = "UrlRequest cancelled";
        this.a = juyVarE.a();
    }
}
