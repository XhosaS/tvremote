package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class clr extends clt implements cna {
    public clk d = clk.a;

    public final clk h() {
        clk clkVar = this.d;
        if (clkVar.c) {
            this.d = clkVar.clone();
        }
        return this.d;
    }

    public final void i(cmt cmtVar) {
        if (cmtVar.c != ((clt) a(6, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
