package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urs implements uqq {
    public static final uiv a = new uiv();
    private final urx b;

    public urs(urx urxVar) {
        this.b = urxVar;
    }

    @Override // defpackage.uqq
    public final urz a(String str, xsq xsqVar, uqx uqxVar) {
        Object obj;
        Object obj2 = urx.d;
        String str2 = str + "_" + xsqVar.b;
        upo upoVar = new upo(xsqVar.d, (byte[]) null);
        upo upoVar2 = new upo(xsqVar.e, (byte[]) null);
        if (uqxVar != null) {
            sij.o(!uqxVar.toString().equals("NO_ACCOUNT 181682244"), "Cannot use account with NO_ACCOUNT toString");
            obj = uqxVar;
        } else {
            obj = obj2;
        }
        return new ury(new urr(str2, this.b, upoVar, upoVar2, obj));
    }
}
