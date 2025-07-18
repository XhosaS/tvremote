package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjw extends RuntimeException {
    private final List a;

    public bjw(List list) {
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        yhp yhpVar = new yhp((byte[]) null);
        List listH = yfm.H(this.a);
        if (((ygk) listH).a() > 0) {
            throw null;
        }
        List listH2 = yfm.H(yfm.o(yhpVar));
        int iA = ((ygk) listH2).a();
        for (int i = 0; i < iA; i++) {
            sb.append("\tat ".concat(String.valueOf((String) listH2.get(i))));
            sb.append('\n');
        }
        return sb.toString();
    }
}
