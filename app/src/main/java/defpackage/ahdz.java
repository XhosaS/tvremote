package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahdz extends ahbm {
    protected final String e() {
        ahdz ahdzVarH;
        ahbm ahbmVar = ahcl.a;
        ahdz ahdzVar = ahlz.a;
        if (this == ahdzVar) {
            return "Dispatchers.Main";
        }
        try {
            ahdzVarH = ahdzVar.h();
        } catch (UnsupportedOperationException unused) {
            ahdzVarH = null;
        }
        if (this == ahdzVarH) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract ahdz h();

    @Override // defpackage.ahbm
    public String toString() {
        String strE = e();
        if (strE != null) {
            return strE;
        }
        return getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(this));
    }
}
