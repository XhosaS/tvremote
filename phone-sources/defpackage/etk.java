package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etk extends ehv implements Handler.Callback {
    private final eti f;
    private final etj g;
    private final Handler h;
    private final ffq i;
    private ffp j;
    private boolean k;
    private boolean l;
    private long m;
    private ead n;
    private long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etk(etj etjVar, Looper looper) {
        Handler handler;
        super(5);
        eti etiVar = eti.a;
        etjVar.getClass();
        this.g = etjVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = edt.a;
            handler = new Handler(looper, this);
        }
        this.h = handler;
        this.f = etiVar;
        this.i = new ffq();
        this.o = -9223372036854775807L;
    }

    private final long W(long j) {
        a.ab(j != -9223372036854775807L);
        a.ab(this.o != -9223372036854775807L);
        return j - this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void X(defpackage.ead r7, java.util.List r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            int r1 = r7.a()
            if (r0 >= r1) goto L4f
            eac r1 = r7.b(r0)
            dze r1 = r1.a()
            if (r1 == 0) goto L45
            eti r2 = r6.f
            boolean r3 = r2.b(r1)
            if (r3 == 0) goto L45
            ffp r1 = r2.a(r1)
            eac r2 = r7.b(r0)
            byte[] r2 = r2.c()
            defpackage.a.aq(r2)
            ffq r3 = r6.i
            r3.clear()
            int r4 = r2.length
            r3.a(r4)
            java.nio.ByteBuffer r4 = r3.c
            java.lang.String r5 = defpackage.edt.a
            r4.put(r2)
            r3.b()
            ead r1 = r1.a(r3)
            if (r1 == 0) goto L4c
            r6.X(r1, r8)
            goto L4c
        L45:
            eac r1 = r7.b(r0)
            r8.add(r1)
        L4c:
            int r0 = r0 + 1
            goto L1
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etk.X(ead, java.util.List):void");
    }

    private final void Y(ead eadVar) {
        this.g.cN(eadVar);
    }

    @Override // defpackage.ehv
    protected final void D(dze[] dzeVarArr, long j, long j2, evz evzVar) {
        this.j = this.f.a(dzeVarArr[0]);
        ead eadVar = this.n;
        if (eadVar != null) {
            long j3 = this.o;
            long j4 = eadVar.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                eadVar = new ead(j5, eadVar.a);
            }
            this.n = eadVar;
        }
        this.o = j2;
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "MetadataRenderer";
    }

    @Override // defpackage.ekc
    public final void V(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.k && this.n == null) {
                ffq ffqVar = this.i;
                ffqVar.clear();
                hig higVarT = T();
                int iS = S(higVarT, ffqVar, 0);
                if (iS == -4) {
                    if (ffqVar.isEndOfStream()) {
                        this.k = true;
                    } else if (ffqVar.e >= this.c) {
                        ffqVar.g = this.m;
                        ffqVar.b();
                        ffp ffpVar = this.j;
                        String str = edt.a;
                        ead eadVarA = ffpVar.a(ffqVar);
                        if (eadVarA != null) {
                            List arrayList = new ArrayList(eadVarA.a());
                            X(eadVarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.n = new ead(W(ffqVar.e), (eac[]) arrayList.toArray(new eac[0]));
                            }
                        }
                    }
                } else if (iS == -5) {
                    Object obj = higVarT.a;
                    obj.getClass();
                    this.m = ((dze) obj).ad;
                }
            }
            ead eadVar = this.n;
            if (eadVar != null) {
                if (eadVar.b <= W(j)) {
                    ead eadVar2 = this.n;
                    Handler handler = this.h;
                    if (handler != null) {
                        handler.obtainMessage(1, eadVar2).sendToTarget();
                    } else {
                        Y(eadVar2);
                    }
                    this.n = null;
                    z = true;
                }
            }
            if (this.k && this.n == null) {
                this.l = true;
            }
        } while (z);
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return this.l;
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        return true;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        if (this.f.b(dzeVar)) {
            return clw.F(dzeVar.az == 0 ? 4 : 2);
        }
        return clw.F(0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        Y((ead) message.obj);
        return true;
    }

    @Override // defpackage.ehv
    protected final void v() {
        this.n = null;
        this.j = null;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.ehv
    protected final void x(long j, boolean z) {
        this.n = null;
        this.k = false;
        this.l = false;
    }
}
