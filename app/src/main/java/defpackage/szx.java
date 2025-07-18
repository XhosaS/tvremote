package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szx {
    public static final String a(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        sb.append('@');
        String string = Integer.toString(System.identityHashCode(obj), 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(defpackage.rvw r5) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szx.b(rvw):java.lang.String");
    }

    public static final String c(rvw rvwVar) {
        int i = rvwVar.b;
        return rvu.a(i) == rvu.AUDIOROUTE_NOT_SET ? "N/A" : rvu.a(i).name();
    }

    public static final String d(sgo sgoVar) {
        int i = sgoVar.b;
        if (sgn.b(i) == 1) {
            return "N/A";
        }
        int iB = sgn.b(i);
        if (iB != 0) {
            return sgn.a(iB);
        }
        throw null;
    }
}
