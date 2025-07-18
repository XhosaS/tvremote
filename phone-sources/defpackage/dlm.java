package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlm {
    public static final /* synthetic */ ymp[] a;

    static {
        ykz ykzVar = new ykz(dlm.class);
        int i = ylg.a;
        a = new ymp[]{ykzVar};
    }

    public final dde a(String str) {
        return new dde("provider:".concat(String.valueOf(str)));
    }

    public final String b(dlj dljVar) {
        String canonicalName = dljVar.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        throw new IllegalArgumentException("no provider name");
    }

    public final String c(dlv dlvVar) {
        String canonicalName = dlvVar.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        throw new IllegalArgumentException("no receiver name");
    }
}
