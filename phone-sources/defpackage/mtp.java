package defpackage;

import android.accounts.OperationCanceledException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtp implements ldu, idy, iej {
    public final led a;
    public final ldv b;
    public boolean c;
    public boolean d;
    public ieg e = ieg.a;
    public Throwable f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public mtp(mbf mbfVar, led ledVar, ldv ldvVar, int i) {
        this.h = i;
        this.g = mbfVar;
        this.a = ledVar;
        this.b = ldvVar;
        ledVar.ea(this);
    }

    @Override // defpackage.ldu
    public final void G(ieg iegVar, String str) {
        if (this.h != 0) {
            b(iegVar, null, true);
        } else {
            b(iegVar, null, true);
        }
    }

    @Override // defpackage.ldu
    public final void H(ieg iegVar, Exception exc) {
        if (this.h != 0) {
            b(iegVar, exc, true);
        } else {
            b(iegVar, exc, true);
        }
    }

    @Override // defpackage.ldu
    public final void I(ieg iegVar) {
        if (this.h != 0) {
            b(iegVar, new OperationCanceledException(), true);
        } else {
            b(iegVar, new OperationCanceledException(), true);
        }
    }

    public final void a(ieg iegVar, Throwable th, boolean z) {
        if (this.h != 0) {
            int iIntValue = ((Integer) ((mbf) this.g).b.a()).intValue();
            if ((iIntValue != 0 && iIntValue != 8) || !z) {
                this.a.d(iegVar, th, this);
                return;
            }
            this.c = true;
            this.e = iegVar;
            this.f = th;
            return;
        }
        int iIntValue2 = ((Integer) ((mtr) this.g).b.a()).intValue();
        if ((iIntValue2 != 0 && iIntValue2 != 8) || !z) {
            this.a.d(iegVar, th, this);
            return;
        }
        this.c = true;
        this.e = iegVar;
        this.f = th;
    }

    public final void b(ieg iegVar, Throwable th, boolean z) {
        if (this.h == 0) {
            mtr mtrVar = (mtr) this.g;
            idr idrVar = mtrVar.b;
            int iIntValue = ((Integer) idrVar.a()).intValue();
            if (iegVar.l()) {
                return;
            }
            if ((iIntValue == 0 || iIntValue == 8) && z) {
                this.d = true;
                this.e = iegVar;
                this.f = th;
                return;
            } else {
                if (th != null) {
                    this.b.p((ksn) iegVar.g());
                    idrVar.c(4);
                    return;
                }
                this.b.p((ksn) iegVar.g());
                idrVar.c(3);
                mtrVar.c.a(iegVar);
                mtrVar.d.c((ksn) iegVar.g());
                return;
            }
        }
        mbf mbfVar = (mbf) this.g;
        idr idrVar2 = mbfVar.b;
        int iIntValue2 = ((Integer) idrVar2.a()).intValue();
        if (iegVar.l()) {
            return;
        }
        if ((iIntValue2 == 0 || iIntValue2 == 8) && z) {
            this.d = true;
            this.e = iegVar;
            this.f = th;
        } else {
            if (th != null) {
                this.b.p((ksn) iegVar.g());
                idrVar2.c(4);
                return;
            }
            this.b.p((ksn) iegVar.g());
            idrVar2.c(3);
            mbfVar.c.a(iegVar);
            ksn ksnVar = (ksn) iegVar.g();
            mbfVar.d.c(ksnVar);
            mbfVar.e.c(ksnVar);
        }
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        if (this.h != 0) {
            ieg iegVar = (ieg) obj;
            a(iegVar, iegVar.k() ? iegVar.i() : null, true);
        } else {
            ieg iegVar2 = (ieg) obj;
            a(iegVar2, iegVar2.k() ? iegVar2.i() : null, true);
        }
    }

    @Override // defpackage.iej
    public final void dM() {
        if (this.h != 0) {
            int iA = this.a.a();
            if (iA == 1) {
                ((mbf) this.g).b.c(1);
                return;
            }
            if (iA == 2) {
                ((mbf) this.g).b.c(2);
                return;
            } else if (iA == 4) {
                ((mbf) this.g).b.c(5);
                return;
            } else {
                if (iA != 5) {
                    return;
                }
                ((mbf) this.g).b.c(6);
                return;
            }
        }
        int iA2 = this.a.a();
        if (iA2 == 1) {
            ((mtr) this.g).b.c(1);
            return;
        }
        if (iA2 == 2) {
            ((mtr) this.g).b.c(2);
        } else if (iA2 == 4) {
            ((mtr) this.g).b.c(5);
        } else {
            if (iA2 != 5) {
                return;
            }
            ((mtr) this.g).b.c(6);
        }
    }

    public mtp(mtr mtrVar, led ledVar, ldv ldvVar, int i) {
        this.h = i;
        this.g = mtrVar;
        this.a = ledVar;
        ldvVar.getClass();
        this.b = ldvVar;
        ledVar.ea(this);
    }
}
