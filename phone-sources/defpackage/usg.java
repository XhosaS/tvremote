package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usg extends ush {
    static final xsj a;
    private static volatile tpv d;
    public final String b;

    static {
        xse xseVar = xsm.c;
        int i = xsj.c;
        a = new xsd("X-Goog-Api-Key", xseVar);
        new xsd("X-Android-Package", xsm.c);
        new xsd("X-Android-Cert", xsm.c);
        d = null;
    }

    public usg(String str) {
        this.b = str;
    }

    @Override // defpackage.ush
    public final utj a() {
        return new usf(this);
    }
}
