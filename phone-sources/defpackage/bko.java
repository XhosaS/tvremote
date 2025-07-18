package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bko implements bxv {
    public boolean A;
    private yow a;
    private boolean b;
    private boolean c;
    public int r;
    public bko t;
    public bko u;
    public bzu v;
    public bzq w;
    public boolean x;
    public boolean y;
    public yjk z;
    public bko q = this;
    public int s = -1;

    @Override // defpackage.bxv
    public final bko E() {
        return this.q;
    }

    public final yow F() {
        yow yowVar = this.a;
        if (yowVar != null) {
            return yowVar;
        }
        yow yowVarL = yoz.l(((cbc) fh.K(this)).h.plus(new yqg((yqe) ((cbc) fh.K(this)).h.get(yqe.c))));
        this.a = yowVarL;
        return yowVarL;
    }

    public void G() {
        if (this.A) {
            bty.c("node attached multiple times");
        }
        if (this.w == null) {
            bty.c("attach invoked on a node without a coordinator");
        }
        this.A = true;
        this.b = true;
    }

    public void H() {
        if (!this.A) {
            bty.c("Cannot detach a node that is not attached");
        }
        if (this.b) {
            bty.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.c) {
            bty.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.A = false;
        yow yowVar = this.a;
        if (yowVar != null) {
            yoz.n(yowVar, new bkq());
            this.a = null;
        }
    }

    public void I() {
        if (!this.A) {
            bty.c("reset() called on an unattached node");
        }
        bS();
    }

    public void J() {
        if (!this.A) {
            bty.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.b) {
            bty.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.b = false;
        cd();
        this.c = true;
    }

    public void K() {
        if (!this.A) {
            bty.c("node detached multiple times");
        }
        if (this.w == null) {
            bty.c("detach invoked on a node without a coordinator");
        }
        if (!this.c) {
            bty.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.c = false;
        yjk yjkVar = this.z;
        if (yjkVar != null) {
            yjkVar.a();
        }
        ch();
    }

    public void L(bko bkoVar) {
        this.q = bkoVar;
    }

    public void M(bzq bzqVar) {
        this.w = bzqVar;
    }

    public boolean ce() {
        return true;
    }

    public /* synthetic */ void bP() {
    }

    public void bS() {
    }

    public void cd() {
    }

    public /* synthetic */ void cg() {
    }

    public void ch() {
    }
}
